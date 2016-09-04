package com.nuhin13.COC_video_stratergy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by nuhin13 on 1/12/2016.
 */
public class WarBase_1st extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stratigical_video_1st);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("War Base");
        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.inbox:
                        Intent intent3 = new Intent(WarBase_1st.this, Strategical_video_1st.class);
                        startActivity(intent3);
                        WarBase_1st.this.finish();
                        return true;

                    case R.id.starred:

                        return true;

                    case R.id.sent_mail:
                        Intent intent4 = new Intent(WarBase_1st.this, FarmingBase_1st.class);
                        startActivity(intent4);
                        WarBase_1st.this.finish();

                        return true;
                    case R.id.rate:
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.nuhin13.COC_video_stratergy"));
                        startActivity(intent);

                        return true;
                    case R.id.more:
                        Intent intentMore = new Intent(Intent.ACTION_VIEW);
                        intentMore.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Droid+Builder"));
                        startActivity(intentMore);

                        return true;

                    case R.id.like:
                        Facebook fb = new Facebook();
                        Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                        String facebookUrl = fb.getFacebookPageURL(WarBase_1st.this);
                        facebookIntent.setData(Uri.parse(facebookUrl));
                        startActivity(facebookIntent);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });


        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();


        AdView ad;

        ad = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        ad.loadAd(adRequest);

        initAd();

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    int count = -1;

    int addCounter = 2;

    InterstitialAd mInterstitialAd;

    @Override
    public void onResume() {
        super.onResume(); // Always call the superclass method first

        if (mInterstitialAd.isLoaded() == false) {
            LoadAdd();
        }
        // Get the Camera instance as the activity achieves full user focus
        count = count + 1;
        if (count % addCounter == 0) {
            //	Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT)
            //		.show();
            displayAd();
            Log.d("cnt", "" + count);

            if(count == 2 ){
                addCounter++;
            }
        }

    }

    private void initAd() {
        // Create the InterstitialAd and set the adUnitId.
        mInterstitialAd = new InterstitialAd(WarBase_1st.this);
        // Defined in values/strings.xml
        mInterstitialAd.setAdUnitId("ca-app-pub-9971154848057782/1986029758");
    }

    private void displayAd() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            // Toast.makeText(MainActivity.this, "Ad did not load",

        }
    }
    private void LoadAdd() {
        // Hide the retry button, load the ad, and start the timer.

        // initAd();
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        // Toast.makeText(MainActivity.this, "loading",
        // Toast.LENGTH_SHORT).show();
    }

   /* public void th11_war(View v) {
        Toast.makeText(getBaseContext(), "paewrtgwegwe4gargrgegi", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(WarBase_1st.this, Lavaloon_war_base.class);
        startActivity(intent);

    }
*/
   public void back(View v) {

       WarBase_1st.this.finish();

   }
    public void th7(View v) {
        Intent intent = new Intent(WarBase_1st.this, Th7_war_base.class);
        startActivity(intent);

    }
    public void th8(View v) {

        Intent intent = new Intent(WarBase_1st.this, Th8_war_base.class);
        startActivity(intent);

    }
    public void th_9(View v) {

        Intent intent = new Intent(WarBase_1st.this, Th9_war_base.class);
        startActivity(intent);

    }

    public void th10(View v) {

        Intent intent = new Intent(WarBase_1st.this, Th10_war_base.class);
        startActivity(intent);

    }
    public void th11(View v) {

        Intent intent = new Intent(WarBase_1st.this, Th11_war_base.class);
        startActivity(intent);

    }
}

