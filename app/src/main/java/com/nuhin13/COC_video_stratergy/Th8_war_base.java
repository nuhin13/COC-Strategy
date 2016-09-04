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
 * Created by nuhin13 on 1/28/2016.
 */
public class Th8_war_base extends AppCompatActivity {
    private Toolbar toolbar;

    private GoogleApiClient client;

    private AdView ad;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.th6_war_base);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Town Hall 8 War Base");

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
        ImageView iv4 = (ImageView) findViewById(R.id.imageView4);
        ImageView iv5 = (ImageView) findViewById(R.id.imageView5);
        ImageView iv6 = (ImageView) findViewById(R.id.imageView6);
        ImageView iv7 = (ImageView) findViewById(R.id.imageView7);
        ImageView iv8 = (ImageView) findViewById(R.id.imageView8);
        ImageView iv9 = (ImageView) findViewById(R.id.imageView9);




        iv.setImageResource(R.drawable.th8_war1);
        iv1.setImageResource(R.drawable.th8_war2);
        iv2.setImageResource(R.drawable.th8_war3);
        iv3.setImageResource(R.drawable.th8_war4);
        iv4.setImageResource(R.drawable.th8_war5);
        iv5.setImageResource(R.drawable.th8_war6);
        iv6.setImageResource(R.drawable.th8_war7);
        iv7.setImageResource(R.drawable.th8_war8);
        iv8.setImageResource(R.drawable.th8_war9);
        iv9.setImageResource(R.drawable.th8_war10);

        ad = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        ad.loadAd(adRequest);
    }

    public void th6war1(View v){
        //  Toast.makeText(getApplicationContext(), "toast", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war1");
        Th8_war_base.this.startActivity(intent);
    }
    public void th6_war2(View v){

        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war2");
        Th8_war_base.this.startActivity(intent);

    }
    public void th6_war3(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war3");
        Th8_war_base.this.startActivity(intent);
    }
    public void th6_war4(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war4");
        Th8_war_base.this.startActivity(intent);
    }
    public void th6_war5(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war5");
        Th8_war_base.this.startActivity(intent);
    } public void th6_war6(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war6");
        Th8_war_base.this.startActivity(intent);
    } public void th6_war7(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war7");
        Th8_war_base.this.startActivity(intent);
    }
    public void th6_war8(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war8");
        Th8_war_base.this.startActivity(intent);
    }
    public void th6_war9(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war1");
        Th8_war_base.this.startActivity(intent);
    }
    public void th6_war10(View v){
        Intent intent = new Intent(Th8_war_base.this, Zooming.class);
        intent.putExtra("imgKey", "th8_war1");
        Th8_war_base.this.startActivity(intent);
    }

}