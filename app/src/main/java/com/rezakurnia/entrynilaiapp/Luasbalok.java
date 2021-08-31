package com.rezakurnia.entrynilaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Luasbalok extends AppCompatActivity {

    EditText etPanjang, etLebar, etTinggi;
    Button btnhasil;
    TextView viewhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luasbalok);

        etPanjang = findViewById(R.id.etpanjang);
        etLebar = findViewById(R.id.etlebar);
        etTinggi = findViewById(R.id.ettinggi);
        btnhasil = findViewById(R.id.btnhitungluas);
        viewhasil = findViewById(R.id.texthasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etPanjang.getText())){
                    etPanjang.setError("Enter Value");
                    etPanjang.requestFocus();
                }
                else if (TextUtils.isEmpty(etLebar.getText())){
                    etLebar.setError("Enter Value");
                    etLebar.requestFocus();
                }
                else if (TextUtils.isEmpty(etTinggi.getText())){
                    etTinggi.setError("Enter Value");
                    etTinggi.requestFocus();
                }
                else {
                    int p,l,t,h;

                    p = Integer.parseInt(etPanjang.getText().toString());
                    l = Integer.parseInt(etLebar.getText().toString());
                    t = Integer.parseInt(etTinggi.getText().toString());

                    h = 2 * (p*l + p*t + l*t);

                    viewhasil.setText(String.valueOf(h));

                }
            }
        });

    }
}
