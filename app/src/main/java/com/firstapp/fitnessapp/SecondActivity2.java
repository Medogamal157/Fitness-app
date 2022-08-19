package com.firstapp.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SecondActivity2 extends AppCompatActivity {


    public int[] newArray = new int[]{R.id.mountain_pose,R.id.crunches_pose,R.id.bench_pose,
            R.id.bicrunches_pose,R.id.leg_pose,
            R.id.heel_pose,R.id.legup_pose,R.id.situp_pose,
            R.id.vups_pose,R.id.rotation_pose,R.id.plankleg_pose,
            R.id.twist_pose,R.id.bridge_pose, R.id.legcrunches_pose,
            R.id.windmill_pose};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

    }


    public void imageButtonClicked(View view) {

        for (int i=0;i < newArray.length;i++) {

            if(view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("Second", String.valueOf(value));
                Intent intent = new Intent(this, ThirdActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }



        }
    }
}