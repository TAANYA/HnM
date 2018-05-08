package com.example.shujareshi.hnm;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import static android.R.attr.password;
import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, View.OnClickListener {
    private Button btnregister;
    private EditText etemail, etpassword,name;
    private TextView tvsignin;

    @Override
    protected void onStart() {
        super.onStart();
        firebaseauth.addAuthStateListener(mAuthStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mAuthStateListener !=null)
            firebaseauth.removeAuthStateListener(mAuthStateListener);

    }



    private ProgressDialog progressdailog;

    private FirebaseAuth firebaseauth;
    private SignInButton google;
    private FirebaseAuth.AuthStateListener mAuthStateListener ;
    public static final int RC_SIGN_IN =0;
    private static final String TAG="MAIN_ACTIVITY";
    private GoogleApiClient mGoogleApiClient;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firebaseauth = FirebaseAuth.getInstance();
        mAuthStateListener= new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user =firebaseAuth.getCurrentUser();
                if(user!=null)
                {
                    startActivity(new Intent(getApplicationContext(), front.class));
                }
            }
        };

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient= new  GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(Auth.GOOGLE_SIGN_IN_API,gso).build();

        //findViewById(R.id.google).setOnClickListener(this);


        if(firebaseauth.getCurrentUser() !=null)
        {
            //start profile activity
            startActivity(new Intent(getApplicationContext(), front.class));
        }

        progressdailog = new ProgressDialog(this);
        // google=(SignInButton)findViewById(R.id.google);
        btnregister=(Button)findViewById(R.id.btnregister);
        etemail=(EditText)findViewById(R.id.editTextemail);
        etpassword=(EditText)findViewById(R.id.editTextpassword);
        tvsignin=(TextView)findViewById(R.id.tvsignin);
        name=(EditText)findViewById(R.id.name);

        btnregister.setOnClickListener(this);
        tvsignin.setOnClickListener(this);


    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Invalid Credential..!!", Toast.LENGTH_LONG).show();
    }

    private void registeruser() {
        String email = etemail.getText().toString().trim();
        String password = etpassword.getText().toString().trim();
        String n = name.getText().toString().trim();


        if (!validate()) {
            onSignupFailed();
        } else {

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(this, "Enter your Email", Toast.LENGTH_SHORT).show();
                return;
                //email is empty

            }
            if (TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Enter your Password", Toast.LENGTH_SHORT).show();

                return;
                //password is empty
            }
            //progressbar
            progressdailog.setMessage("Registering User..");
            progressdailog.show();
            firebaseauth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Registered", Toast.LENGTH_SHORT).show();
                                finish();
                                Intent i = new Intent(MainActivity.this, front.class);
                                startActivity(i);
                                //startActivity(new Intent(getApplicationContext(),front.class));
                            } else {
                                progressdailog.dismiss();
                                Toast.makeText(MainActivity.this, "Failed. Try again!", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
        }
    }


    public boolean validate() {
        boolean valid = true;

        String n = name.getText().toString();
        String email = etemail.getText().toString();
        String password = etpassword.getText().toString();

        if (n.isEmpty() || name.length() < 3) {
            name.setError("at least 3 characters");
            valid = false;
        } else {
            name.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etemail.setError("enter a valid email address");
            valid = false;
        } else {
            etemail.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            etpassword.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            etpassword.setError(null);
        }

        return valid;
    }
    @Override
    public void onClick(View view) {

        if(view==btnregister)
        {registeruser();}
        else if(view==tvsignin)
        {
            //startActivity(new Intent(this, LoginActivity.class));
        }
/*        else if(view.getId()==R.id.google)
        {
            signIn();

        }*/
        //login activity

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RC_SIGN_IN)
        {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if(result.isSuccess())
            {
                GoogleSignInAccount account = result.getSignInAccount();
                firebaseAuthWithGoogle(account);
            }
            else
            {
                Log.d(TAG,"google login failed");
            }
        }

    }
    private void firebaseAuthWithGoogle(GoogleSignInAccount account)
    {
        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
        firebaseauth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                Toast.makeText(MainActivity.this, "ho gaya!", Toast.LENGTH_SHORT).show();
                Log.d("AUTH","Sign in with credential:on complete: "+task.isSuccessful());
                finish();
                startActivity(new Intent(getApplicationContext(), front.class));

            }
        });
    }

    private void signIn() {
        Intent signinintent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signinintent , RC_SIGN_IN);

    }

/*    @Override
    public void onBackPressed() {
        // disable going back to the MainActivity
        moveTaskToBack(true);
    }*/

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

        Log.d(TAG,"connection failed");
    }
}
