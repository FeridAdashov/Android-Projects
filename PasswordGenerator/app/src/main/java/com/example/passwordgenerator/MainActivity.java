package com.example.passwordgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button userBtn, adminBtn, foreverBtn, deleteData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userBtn = findViewById(R.id.userBtn);
        adminBtn = findViewById(R.id.adminBtn);
        foreverBtn = findViewById(R.id.foreverBtn);
        deleteData = findViewById(R.id.deleteData);

        userBtn.setOnClickListener(this);
        adminBtn.setOnClickListener(this);
        foreverBtn.setOnClickListener(this);
        deleteData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.userBtn)
        {
            final int min = 1000;
            final int max = 4999;
            final int random = new Random().nextInt((max - min) + 1) + min;
            userBtn.setText(passwordGenerator(random));
        }

        if(v.getId() == R.id.adminBtn)
        {
            final int min = 9001;
            final int max = 9999;
            final int random = new Random().nextInt((max - min) + 1) + min;
            adminBtn.setText(passwordGenerator(random));
        }

        if(v.getId() == R.id.foreverBtn)
        {
            final int min = 5000;
            final int max = 8999;
            final int random = new Random().nextInt((max - min) + 1) + min;
            foreverBtn.setText(passwordGenerator(random));
        }

        if(v.getId() == R.id.deleteData)
        {
            userBtn.setText("User Password");
            adminBtn.setText("Admin Password");
            foreverBtn.setText("Birdəfəlik Admin Password");
        }
    }

    public String passwordGenerator(int key)
    {
        int one = key / 1000;
        int two = (key % 1000) / 100;
        int three = (key % 100) / 10;
        int four = key % 10;

        one = (one * 5 + 9) % 10;
        two = (two * 6 + 7) % 10;
        three = (three * 7 + 5) % 10;
        four = (four * 8 + 3) % 10;

        return  String.valueOf(key) + String.valueOf(one) + String.valueOf(two) + String.valueOf(three) + String.valueOf(four);
    }
}
