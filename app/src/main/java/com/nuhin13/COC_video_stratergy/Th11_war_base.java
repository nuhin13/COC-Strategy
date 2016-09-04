package com.nuhin13.COC_video_stratergy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by nuhin13 on 1/29/2016.
 */
public class Th11_war_base extends AppCompatActivity {
    private Toolbar toolbar;

    private GoogleApiClient client;

    private AdView ad;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.th11);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Town Hall 11 War Base");

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
        ImageView iv4 = (ImageView) findViewById(R.id.imageView4);
        ImageView iv5 = (ImageView) findViewById(R.id.imageView5);
        ImageView iv6 = (ImageView) findViewById(R.id.imageView6);
        ImageView iv7 = (ImageView) findViewById(R.id.imageView7);






        iv.setImageResource(R.drawable.th11_war1);
        iv1.setImageResource(R.drawable.th11_war2);
        iv2.setImageResource(R.drawable.th11_war3);
        iv3.setImageResource(R.drawable.th11_war4);
        iv4.setImageResource(R.drawable.th11_war5);
        iv5.setImageResource(R.drawable.th11_war6);
        iv6.setImageResource(R.drawable.th11_war7);
      //  iv7.setImageResource(R.drawable.th11_war8);
        //iv8.setImageResource(R.drawable.th6_warbase2);
        //iv9.setImageResource(R.drawable.th6_warbase2);

        ad = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        ad.loadAd(adRequest);
    }

    public void th6war1(View v){
        //  Toast.makeText(getApplicationContext(), "toast", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war1");
        Th11_war_base.this.startActivity(intent);
    }
    public void th6_war2(View v){

        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war2");
        Th11_war_base.this.startActivity(intent);

    }
    public void th6_war3(View v){
        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war3");
        Th11_war_base.this.startActivity(intent);
    }
    public void th6_war4(View v){
        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war4");
        Th11_war_base.this.startActivity(intent);
    }
    public void th6_war5(View v){
        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war5");
        Th11_war_base.this.startActivity(intent);
    } public void th6_war6(View v){
        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war6");
        Th11_war_base.this.startActivity(intent);
    } public void th6_war7(View v){
        Intent intent = new Intent(Th11_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th11_war7");
        Th11_war_base.this.startActivity(intent);
    }


}