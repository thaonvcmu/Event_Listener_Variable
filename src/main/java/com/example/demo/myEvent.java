package com.example.demo;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class myEvent implements View.OnClickListener {
    private  Activity activity;
    public myEvent(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_5){
            Toast.makeText(activity, "Button dạng 5 onClick ..", Toast.LENGTH_LONG).show();
        }
    }
}
