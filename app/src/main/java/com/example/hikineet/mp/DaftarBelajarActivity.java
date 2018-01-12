package com.example.hikineet.mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DaftarBelajarActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_belajar);
        setTitle("Pilih Hewan");

        findViewById(R.id.kembali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        findViewById(R.id.kambing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Kambing");
                intent.putExtra("gambar",R.drawable.kambing);
                intent.putExtra("soundA", R.raw.kambing);
                intent.putExtra("soundB", R.raw.suara_kambing_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.ayam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Ayam");
                intent.putExtra("gambar",R.drawable.ayam);
                intent.putExtra("soundA", R.raw.ayam);
                intent.putExtra("soundB", R.raw.suara_ayam_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.anjing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Anjing");
                intent.putExtra("gambar",R.drawable.anjing);
                intent.putExtra("soundA", R.raw.anjing);
                intent.putExtra("soundB", R.raw.suara_anjing_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.burung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Burung");
                intent.putExtra("gambar",R.drawable.burung);
                intent.putExtra("soundA", R.raw.burung);
                intent.putExtra("soundB", R.raw.suara_burung_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.kucing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Kucing");
                intent.putExtra("gambar",R.drawable.kucing);
                intent.putExtra("soundA", R.raw.kucing);
                intent.putExtra("soundB", R.raw.suara_kucing_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.kuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Kuda");
                intent.putExtra("gambar",R.drawable.kuda);
                intent.putExtra("soundA", R.raw.kuda);
                intent.putExtra("soundB", R.raw.suara_kuda_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.monyet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Monyet");
                intent.putExtra("gambar",R.drawable.monyet);
                intent.putExtra("soundA", R.raw.monyet);
                intent.putExtra("soundB", R.raw.suara_monyet_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.sapi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Sapi");
                intent.putExtra("gambar",R.drawable.sapi);
                intent.putExtra("soundA", R.raw.sapi);
                intent.putExtra("soundB", R.raw.suara_sapi_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.serigala).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Serigala");
                intent.putExtra("gambar",R.drawable.serigala);
                intent.putExtra("soundA", R.raw.serigala);
                intent.putExtra("soundB", R.raw.suara_srigala_fix);
                startActivity(intent);
            }
        });

        findViewById(R.id.harimau).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DaftarBelajarActivity.this, Belajar1Activity.class);
                intent.putExtra("judul","Harimau");
                intent.putExtra("gambar",R.drawable.harimau);
                intent.putExtra("soundA", R.raw.harimau);
                intent.putExtra("soundB", R.raw.suara_harimau_fix);
                startActivity(intent);
            }
        });
    }

}
