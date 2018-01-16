package com.example.hikineet.mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DaftarTebakKataActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tebak_kata);
        setTitle("Kuis Tebak Nama Hewan");

        findViewById(R.id.kembali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        findViewById(R.id.kambing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarTebakKataActivity.this, TebakKata1Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ayam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarTebakKataActivity.this, TebakKata2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.anjing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarTebakKataActivity.this,TebakKata3Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.burung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarTebakKataActivity.this,TebakKata4Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.kucing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarTebakKataActivity.this,TebakKata5Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.kuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarTebakKataActivity.this,TebakKata6Activity.class);
                startActivity(intent);
            }
        });
    }
}
