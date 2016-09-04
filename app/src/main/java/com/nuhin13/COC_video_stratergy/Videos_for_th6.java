package com.nuhin13.COC_video_stratergy;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by nuhin13 on 1/25/2016.
 */
public class Videos_for_th6 extends AppCompatActivity {


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
        setContentView(R.layout.videos_for_th6);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Attack List of Town Hall 6");

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
                        Intent intent1 = new Intent(Videos_for_th6.this, Strategical_video_1st.class);
                        startActivity(intent1);
                      //  Toast.makeText(getApplicationContext(), "Stared Selected", Toast.LENGTH_SHORT).show();
                        Videos_for_th6.this.finish();
                        return true;

                    // For rest of the options we just show a toast on click

                    case R.id.starred:
                        Intent intent2 = new Intent(Videos_for_th6.this, FarmingBase_1st.class);
                        startActivity(intent2);
                        Videos_for_th6.this.finish();
                        return true;
                    case R.id.sent_mail:
                        Intent intent3 = new Intent(Videos_for_th6.this, WarBase_1st.class);
                        startActivity(intent3);
                        Videos_for_th6.this.finish();
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

        initAd();

        AdView ad;

        ad = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        ad.loadAd(adRequest);
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



    int count = 1;



    InterstitialAd mInterstitialAd;

    @Override
    public void onResume() {
        super.onResume(); // Always call the superclass method first

        if (mInterstitialAd.isLoaded() == false) {
            LoadAdd();
        }
        // Get the Camera instance as the activity achieves full user focu
        if (count ==1) {
            // Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT)
            // .show();
            displayAd();

        }
    }

    private void initAd() {
        // Create the InterstitialAd and set the adUnitId.
        mInterstitialAd = new InterstitialAd(Videos_for_th6.this);
        // Defined in values/strings.xml
        mInterstitialAd.setAdUnitId("ca-app-pub-9971154848057782/1986029758");
    }

    private void displayAd() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            // Toast.makeText(MainActivity.this, "Ad did not load",
            // Toast.LENGTH_SHORT).show();
            // LoadAdd();
			/*
			 * if (!mInterstitialAd.isLoaded()) {
			 * Toast.makeText(MainActivity.this, "not load",
			 * Toast.LENGTH_SHORT).show(); } else {
			 * Toast.makeText(MainActivity.this, "  not ", Toast.LENGTH_SHORT)
			 * .show(); }
			 */
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
    public void loon(View v) {

        /*Intent intent = new Intent(Videos_for_th6.this, Y_videos_for_loon_atck_th6.class);
        startActivity(intent);*/
        final ProgressDialog ringProgressDialog = ProgressDialog.show(Videos_for_th6.this, "Working", "Please Wait",
                true, false);
        ringProgressDialog.setIndeterminate(true);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3500);

                    Intent startNewActivityOpen = new Intent(Videos_for_th6.this, Y_videos_for_loon_atck_th6.class);
                    startNewActivityOpen.setFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
                    startActivity(startNewActivityOpen);
                    //GlobalVars.navigateFromScreen = true;




                    if (ringProgressDialog != null && ringProgressDialog.isShowing()) {
                        ringProgressDialog.dismiss();
                    }

                    // Videos_for_th7.this.finish();


                } catch (Exception e) {

                }

            }

        }).start();

    }
    public void giant_healer(View v) {

        /*Intent intent = new Intent(Videos_for_th6.this, Y_videos_for_giant_healer_atck_th6.class);
        startActivity(intent);*/

        final ProgressDialog ringProgressDialog = ProgressDialog.show(Videos_for_th6.this, "Working", "Please Wait",
                true, false);
        ringProgressDialog.setIndeterminate(true);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3000);

                    Intent startNewActivityOpen = new Intent(Videos_for_th6.this, Y_videos_for_giant_healer_atck_th6.class);
                    startNewActivityOpen.setFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
                    startActivity(startNewActivityOpen);
                    //GlobalVars.navigateFromScreen = true;

                    if (ringProgressDialog != null && ringProgressDialog.isShowing()) {
                        ringProgressDialog.dismiss();
                    }

                    // Videos_for_th7.this.finish();


                } catch (Exception e) {

                }

            }

        }).start();

    }
}