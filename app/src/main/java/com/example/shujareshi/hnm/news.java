package com.example.shujareshi.hnm;
// Important: Don't forget to include the call to System.loadLibrary
// as shown at the bottom of this code sample.

        import android.app.Activity;
        import com.chilkatsoft.*;
        import com.chilkatsoft.CkSpider;
        import com.chilkatsoft.CkStringArray;

        import android.util.Log;
        import android.widget.TextView;
        import android.os.Bundle;

public class news extends Activity {

    private static final String TAG = "Chilkat";

    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CkSpider spider = new CkSpider();

        CkStringArray seenDomains = new CkStringArray();
        CkStringArray seedUrls = new CkStringArray();

        seenDomains.put_Unique(true);
        seedUrls.put_Unique(true);

        //  You will need to change the start URL to something else...
        seedUrls.Append("http://www.youtube.com/");

        //  Set outbound URL exclude patterns
        //  URLs matching any of these patterns will not be added to the
        //  collection of outbound links.
        spider.AddAvoidOutboundLinkPattern("*?id=*");
        spider.AddAvoidOutboundLinkPattern("*.mypages.*");
        spider.AddAvoidOutboundLinkPattern("*.personal.*");
        spider.AddAvoidOutboundLinkPattern("*.comcast.*");
        spider.AddAvoidOutboundLinkPattern("*.aol.*");
        spider.AddAvoidOutboundLinkPattern("*~*");

        //  Use a cache so we don't have to re-fetch URLs previously fetched.
        spider.put_CacheDir("c:/spiderCache/");
        spider.put_FetchFromCache(true);
        spider.put_UpdateCache(true);

        while (seedUrls.get_Count() > 0) {

            String url = seedUrls.pop();
            spider.Initialize(url);

            //  Spider 5 URLs of this domain.
            //  but first, save the base domain in seenDomains
            String domain = spider.getUrlDomain(url);
            seenDomains.Append(spider.getBaseDomain(domain));

            int i;
            boolean success;
            for (i = 0; i <= 4; i++) {
                success = spider.CrawlNext();
                if (success == true) {

                    //  Display the URL we just crawled.
                    Log.i(TAG, spider.lastUrl());

                    //  If the last URL was retrieved from cache,
                    //  we won't wait.  Otherwise we'll wait 1 second
                    //  before fetching the next URL.
                    if (spider.get_LastFromCache() != true) {
                        spider.SleepMs(1000);
                    }

                }
                else {
                    //  cause the loop to exit..
                    i = 999;
                }

            }

            //  Add the outbound links to seedUrls, except
            //  for the domains we've already seen.
            for (i = 0; i <= spider.get_NumOutboundLinks() - 1; i++) {

                url = spider.getOutboundLink(i);
                 domain = spider.getUrlDomain(url);
                String baseDomain = spider.getBaseDomain(domain);
                if (seenDomains.Contains(baseDomain) == false) {
                    //  Don't let our list of seedUrls grow too large.
                    if (seedUrls.get_Count() < 1000) {
                        seedUrls.Append(url);
                    }

                }

            }

        }


    }

    static {
        // Important: Make sure the name passed to loadLibrary matches the shared library
        // found in your project's libs/armeabi directory.
        //  for "libchilkat.so", pass "chilkat" to loadLibrary
        //  for "libchilkatemail.so", pass "chilkatemail" to loadLibrary
        //  etc.
        //
        System.loadLibrary("chilkat");

        // Note: If the incorrect library name is passed to System.loadLibrary,
        // then you will see the following error message at application startup:
        //"The application <your-application-name> has stopped unexpectedly. Please try again."
    }
}



