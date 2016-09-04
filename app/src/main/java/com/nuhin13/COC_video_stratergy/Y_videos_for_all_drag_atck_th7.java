package com.nuhin13.COC_video_stratergy;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

/**
 * Created by nuhin13 on 1/26/2016.
 */
public class Y_videos_for_all_drag_atck_th7 extends AppCompatActivity {

    ProgressDialog mProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attack_list_for_lavaloon);



        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);



        /*ProgressDialog dialog = ProgressDialog.show(Y_videos_for_all_drag_atck_th7.this, "",
                "Loading. Please wait...", true);
*/


        //to use RecycleView, you need a layout manager. default is LinearLayoutManager
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        Adapter_for_all_drag_atck_th7 adapter=new Adapter_for_all_drag_atck_th7(Y_videos_for_all_drag_atck_th7.this);
        recyclerView.setAdapter(adapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
