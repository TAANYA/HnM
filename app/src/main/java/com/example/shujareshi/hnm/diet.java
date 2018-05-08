package com.example.shujareshi.hnm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class diet extends AppCompatActivity {

    public EditText weight , height;
    private RadioGroup radioSexGroup;
    private TextView tv;
    private RadioButton radioSexButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        weight=(EditText)findViewById(R.id.weight);
        tv=(TextView)findViewById(R.id.bmi);
        height=(EditText)findViewById(R.id.height);
        btnDisplay=(Button)findViewById(R.id.button);
        //radioSexGroup=(RadioGroup)findViewById(R.id.radiogroup);
        //int selectedId=radioSexGroup.getCheckedRadioButtonId();
        //radioSexButton=(RadioButton)findViewById(selectedId);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float h=Float.valueOf(height.getText().toString());
                float w=Float.valueOf(weight.getText().toString());
                //String s = radioSexButton.getText().toString();
                float bmi=calc(w,h);
               // tv.setText(String.valueOf(bmi));

                /*
                try  {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {

                }

               if(bmi<18.5){
                    Intent i = new Intent(diet.this, bmi1.class);

                    startActivity(i);

                }
                else if (bmi <24.9 && bmi >18.5){
                    Intent i = new Intent(diet.this, bmi2.class);

                    startActivity(i);

                }

                else if(bmi>25 && bmi <29.9){

                    Intent i = new Intent(diet.this, bmi3.class);

                    startActivity(i);

                }

                else
                {

                    Intent i = new Intent(diet.this, bmi4.class);

                    startActivity(i);

                }*/




            }
        });

    }

    public float calc(float w, float h)
    {
        float j;
        h=h/100;
        float k=(h*h);
        j=w/k;
        tv.setText(String.valueOf(j));
        if(j<18.5){
            Intent i = new Intent(diet.this, bmi1.class);
            startActivity(i);

        }
        else if (j <24.9 && j >18.5){
            Intent i = new Intent(diet.this, bmi2.class);

            startActivity(i);

        }

        else if(j>25 && j <29.9){

            Intent i = new Intent(diet.this, bmi3.class);

            startActivity(i);

        }

        else {

            Intent i = new Intent(diet.this, bmi4.class);

            startActivity(i);
        }

        return j;


    }
}
