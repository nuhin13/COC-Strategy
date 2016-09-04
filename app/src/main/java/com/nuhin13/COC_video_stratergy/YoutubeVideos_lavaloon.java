package com.nuhin13.COC_video_stratergy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.Toast;

/**
 * Created by nuhin13 on 1/13/2016.
 */
public class YoutubeVideos_lavaloon extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attack_list_for_lavaloon);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        //to use RecycleView, you need a layout manager. default is LinearLayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        AdapterFor_lavaloon adapter = new AdapterFor_lavaloon(YoutubeVideos_lavaloon.this);
        recyclerView.setAdapter(adapter);

       /* ConnectivityManager connec = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);

        if(connec.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || connec.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTING  ) {
          //  text.setText("hey your online!!!")
            Toast.makeText(getApplicationContext(),"online",Toast.LENGTH_LONG).show();
            //Do something in here when we are connected
        } else if(connec.getNetworkInfo(0).getState() == NetworkInfo.State.DISCONNECTED ||  connec.getNetworkInfo(1).getState() == NetworkInfo.State.DISCONNECTED   ) {
           // text.setText("Look your not online");
            Toast.makeText(getApplicationContext(),"Not online",Toast.LENGTH_LONG).show();
        }*/


        Boolean bl = haveNetworkConnection();
        if(bl==true){
            //Toast.makeText(getApplicationContext(),"online", Toast.LENGTH_LONG).show();
        }
       else{
            Toast.makeText(getApplicationContext(),"Please Check Your Internet Connection....!!!! ", Toast.LENGTH_LONG).show();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private boolean haveNetworkConnection()
    {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo)
        {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }
}
