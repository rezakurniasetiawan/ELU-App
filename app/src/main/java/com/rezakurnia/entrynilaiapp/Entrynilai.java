package com.rezakurnia.entrynilaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class Entrynilai extends AppCompatActivity {

    private EditText edtugas,edpresensi,eduts,eduas;
    private Button btnProses;
    private Button btnHapus;
    private TextView textakhir;
    private TextView texthuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrynilai);

        edpresensi = (EditText) findViewById(R.id.nilaipresensi);
        edtugas = (EditText) findViewById(R.id.nilaitugas);
        eduts = (EditText) findViewById(R.id.nilaiuts);
        eduas = (EditText) findViewById(R.id.nilaiuas);
        btnProses = (Button) findViewById(R.id.Tombol);
        btnHapus = (Button) findViewById(R.id.Hapus);
        textakhir = (TextView) findViewById(R.id.nilaiakhir);
        texthuruf = (TextView) findViewById(R.id.nilaihuruf);


        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtugas.getText())){
                    edtugas.setError("Enter Value");
                    edtugas.requestFocus();
                }
                else if (TextUtils.isEmpty(edpresensi.getText())) {
                    edpresensi.setError("Enter Value");
                    edpresensi.requestFocus();
                }
                    else if (TextUtils.isEmpty(eduts.getText())) {
                    eduts.setError("Enter Value");
                    eduts.requestFocus();
                }
                        else if (TextUtils.isEmpty(eduas.getText())) {
                    eduas.setError("Enter Value");
                    eduas.requestFocus();
                }
                else {
                    String presensi = edpresensi.getText().toString().trim();
                    String tugas = edtugas.getText().toString().trim();
                    String uts = eduts.getText().toString().trim();
                    String uas = eduas.getText().toString().trim();

                    double k = Double.parseDouble(presensi);
                    double t = Double.parseDouble(tugas);
                    double ut = Double.parseDouble(uts);
                    double ua = Double.parseDouble(uas);

                    double nilai = (2 * k + 3 * t + 2 * ut + 3 * ua) / 10;
                    textakhir.setText("Nilai Akhir : " + nilai);

                    if (nilai >=85){
                        texthuruf.setText("Grade A");
                    }
                    else if (nilai >=80){
                        texthuruf.setText("Grade A-");
                    }
                    else if (nilai >=75){
                        texthuruf.setText("Grade B+");
                    }
                    else if (nilai >=70){
                        texthuruf.setText("Grade B");
                    }
                    else if (nilai >=65){
                        texthuruf.setText("Grade B-");
                    }
                    else if (nilai >=60){
                        texthuruf.setText("Grade C+");
                    }
                    else if (nilai >=55){
                        texthuruf.setText("Grade C");
                    }
                    else if (nilai >=40){
                        texthuruf.setText("Grade D");
                    }
                    else{
                        texthuruf.setText("Grade E");
                    }
                }


            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edpresensi.setText("");
                edtugas.setText("");
                eduts.setText("");
                eduas.setText("");
            }
        });

    }



}
