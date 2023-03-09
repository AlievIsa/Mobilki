package com.example.project1;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.project1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showStage("onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        showStage("onStart");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        showStage("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showStage("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showStage("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showStage("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showStage("onDestroy");
    }

    public void showStage(String message) {
        Toast.makeText(this, message, message.length()).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void showVersion(View view){
        String text = getString(R.string.toast_text).toString() + " " +
                Build.VERSION.RELEASE.toString() + " (" + Build.VERSION.SDK_INT + ")";
        Toast.makeText(this,
                text,
                Toast.LENGTH_LONG).show();
    }
}