package com.rezakurnia.entrynilaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String nama = getIntent().getExtras().getString("nama");
        result = findViewById(R.id.txt_result);
        result.setText(nama);

        btn1 = (Button) findViewById(R.id.btnentrynilai);
        btn2 = (Button) findViewById(R.id.btnmenu);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Entrynilai.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Mluasvolume.class);
                startActivity(intent2);
            }
        });
    }
}
