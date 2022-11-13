package com.example.java1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // test_btnInsert切換畫面到kotlin insert food Activity
        Button test_btnInsert=(Button) findViewById(R.id.test_btnInsert);
        test_btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 切換 Activity
                Intent intent_insert=new Intent(MainActivity.this,InsertActivity.class);
                startActivity(intent_insert);
            }
        });
    }
}