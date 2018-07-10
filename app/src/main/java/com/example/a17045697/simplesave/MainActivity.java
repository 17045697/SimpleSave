package com.example.a17045697.simplesave;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This is a new line

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor preEdit  = prefs.edit();
        preEdit.putString("greeting","Hello!");
        preEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //String msg = "No greeting";
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String msg = prefs.getString("greeting","No greeting");
        Toast toast = Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
