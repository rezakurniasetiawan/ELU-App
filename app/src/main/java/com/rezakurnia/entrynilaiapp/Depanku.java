package com.rezakurnia.entrynilaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class Depanku extends AppCompatActivity {

    EditText nama;
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depanku);

        nama = findViewById(R.id.edtnama);
        kirim = findViewById(R.id.btnkirim);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(nama.getText())){
                    nama.setError("Enter Value");
                    nama.requestFocus();
                }
                else {
                    Intent i = new Intent(Depanku.this,MainActivity.class);
                    i.putExtra("nama",nama.getText().toString());
                    startActivity(i);
                }
            }
        });

    }
}
