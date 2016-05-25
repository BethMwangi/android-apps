package com.example.beth.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by beth on 5/24/16.
 */
public class DiamondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond);
        addButtonClickListener();
    }

    private void addButtonClickListener() {
        Button button;
        button = (Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(DiamondActivity.this, HomeActivity.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}
