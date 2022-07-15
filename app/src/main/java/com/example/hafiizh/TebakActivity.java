package com.example.hafiizh;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {
    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;

    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInitalisasi();
        cekIntent();
        onClickJos();
    }
        private void onClickJos() {
            button_cek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (editText_jawabb.getText().toString().equals(jawaban)){
                        Toast.makeText(TebakActivity.this,"Yee Benar!",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(TebakActivity.this,"oo Salah!",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        private void cekIntent() {
            Intent cek = getIntent();
            String nama_karakter = cek.getStringExtra("nama_karakter");

            if (nama_karakter.equals("Yuji")){
                imageView_tebak.setImageResource(R.drawable.img_3);
                jawaban = "Yuji";

            } else if (nama_karakter.equals("Yuta")){
                imageView_tebak.setImageResource(R.drawable.img);
                jawaban = "Yuta";
            } else if (nama_karakter.equals("Gojo")){
                imageView_tebak.setImageResource(R.drawable.img_1);
                jawaban = "Gojo";
            } else {
                imageView_tebak.setImageResource(R.drawable.img_2);
                jawaban = "Inumaki";
            }

        }

        private void setInitalisasi() {
            imageView_tebak = (ImageView)findViewById(R.id.Tebak);
            editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
            button_cek = (Button)findViewById(R.id.buttonCek);
        }
    }