package com.munez.alfonso;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itb", "onCreate(): Successfully Executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itb", "onStart(): Successfully Executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itb", "onResume(): Successfully Executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itb", "onPause(): Successfully Executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itb", "onStop(): Successfully Executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itb", "onRestart(): Successfully Executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itb", "onDestroy(): Successfully Executed");
    }


    public void show(View v)
    {
        Toast.makeText(this,"THIS IS TOAST", Toast.LENGTH_LONG).show();
    }

    public void showsnack(View view){
        Snackbar.make(view,"This is a Snackbar",Snackbar.LENGTH_INDEFINITE).show();
    }
}
