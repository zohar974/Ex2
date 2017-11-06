package com.example.madaim.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int cnt;
    public void bottonClicked(View v){
        EditText edName = (EditText) findViewById(R.id.Enter);
            if (edName.getText().length()==0){
                Toast.makeText(this, "please enter name, field is empty", Toast.LENGTH_LONG).show();
            }
            else {
                cnt++;
                Toast.makeText(this, edName.getText() +", the botton was clicked "+cnt+" times", Toast.LENGTH_LONG).show();
            }
    }

    final String MY_TAG="Ex2.MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, "onCreateEvent");
        Toast.makeText(this,"Welcome Zohar, this is your first java coding experience in Android. Congratulations!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "onStartEvent");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "onResumeEvent");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "onPauseEvent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "onDestroyEvent");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "onStopEvent");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("cnt",cnt);
        Log.i(MY_TAG, "onSaveInstanceStateEvent");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null){
            this.cnt=savedInstanceState.getInt("cnt");
        }
        Log.i(MY_TAG, "onRestoreInstanceStateEvent");
    }
}
