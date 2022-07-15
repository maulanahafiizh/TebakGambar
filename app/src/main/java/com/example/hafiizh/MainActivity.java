package com.example.hafiizh;

import android.media.Image;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_yuta, imageView_gojo, imageView_inumaki,imageView_yuji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {

        imageView_yuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("nama_karakter","Yuta");
                startActivity(a);
            }
        });

        imageView_gojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this,TebakActivity.class);
                b.putExtra("nama_karakter","Gojo");
                startActivity(b);
            }
        });

        imageView_inumaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("nama_karakter","Inumaki");
                startActivity(c);
            }
        });

        imageView_yuji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama_karakter","Yuji");
                startActivity(d);
            }
        });

    }

    private void setInisialisasi() {
        imageView_yuta = (ImageView)findViewById(R.id.Yuta);
        imageView_gojo = (ImageView)findViewById(R.id.Gojo);
        imageView_inumaki = (ImageView)findViewById(R.id.Inumaki);
        imageView_yuji = (ImageView)findViewById(R.id.Yuji);
    }
}
