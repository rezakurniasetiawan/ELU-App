package com.rezakurnia.entrynilaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Volumebalok extends AppCompatActivity {

    EditText edPanjang, edLebar, edTinggi;
    Button btnHitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumebalok);

        edPanjang = findViewById(R.id.edpanjang);
        edLebar = findViewById(R.id.edlebar);
        edTinggi = findViewById(R.id.edtinggi);
        btnHitung = findViewById(R.id.btnhitungg);
        tvHasil = findViewById(R.id.tvhasil);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edPanjang.getText())){
                    edPanjang.setError("Enter Value");
                    edPanjang.requestFocus();
                }
                else if (TextUtils.isEmpty(edLebar.getText())){
                    edLebar.setError("Enter Value");
                    edLebar.requestFocus();
                }
                else if (TextUtils.isEmpty(edTinggi.getText())){
                    edTinggi.setError("Enter Value");
                    edTinggi.requestFocus();
                }
                else {
                    int p,l,t,h;

                    p = Integer.parseInt(edPanjang.getText().toString());
                    l = Integer.parseInt(edLebar.getText().toString());
                    t = Integer.parseInt(edTinggi.getText().toString());

                    h = p*l*t;

                    tvHasil.setText(String.valueOf(h));
                }
            }
        });

    }
}
