package com.rezakurnia.entrynilaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mluasvolume extends AppCompatActivity {

Button btnvolume, btnluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mluasvolume);

        btnvolume = (Button) findViewById(R.id.volumebalok);
        btnvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mluasvolume.this, Volumebalok.class);
                startActivity(intent);
            }
        });

        btnluas = (Button)findViewById(R.id.luasbalok);
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new  Intent(Mluasvolume.this, Luasbalok.class);
                startActivity(intent2);
            }
        });

    }
}
