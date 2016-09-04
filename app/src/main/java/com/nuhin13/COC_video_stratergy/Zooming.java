package com.nuhin13.COC_video_stratergy;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Zooming extends AppCompatActivity {
    private String imgId;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zooming);
        Bundle extraData;
         extraData = getIntent().getExtras();
        if (extraData != null) {
            this.imgId = extraData.getString("imgKey");
            TouchImageView img = new TouchImageView(this);
            img.setImageResource(getResources().getIdentifier(this.imgId, "drawable", getPackageName()));
            img.setMaxZoom(4.0f);
            setContentView((View) img);
            //getSupportActionBar().setTitle((Charequence) "Zoom It");
            getWindow().getDecorView().setBackgroundColor(Color.rgb(27, 24, 13));
        }
    }


}
