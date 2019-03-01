package com.example.customlauncherdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showApps(View view) {
        Intent i = new Intent(this, AppsListActivity.class);
        startActivity(i);
    }

    public void showTime(View view) {
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(currentDateTimeString);
        dlgAlert.setTitle("Time");
        dlgAlert.setCancelable(true);

        dlgAlert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dlgAlert.create().show();
    }
}
