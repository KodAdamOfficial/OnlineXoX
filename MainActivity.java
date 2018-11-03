package com.example.cengizhank.xox_derleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTek,btnCift,btnOnline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTek = findViewById(R.id.btnTO);
        btnTek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,tekouyncuekrani.class);
                startActivity(myIntent);
            }
        });

        btnCift = findViewById(R.id.btnCO);
        btnCift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent2 = new Intent(MainActivity.this,ciftkisilik.class);
                startActivity(myIntent2);
            }
        });

        btnOnline = findViewById(R.id.btnO);
        btnOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent3 = new Intent(MainActivity.this,odabul.class);
                startActivity(myIntent3);
            }
        });
    }
}
