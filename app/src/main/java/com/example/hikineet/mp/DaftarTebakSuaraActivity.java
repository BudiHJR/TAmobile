package com.example.hikineet.mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DaftarTebakSuaraActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Kuis Tebak Suara Hewan");
        setContentView(R.layout.activity_daftar_tebak_suara);

        findViewById(R.id.kucing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent = new Intent(DaftarTebakSuaraActivity.this,TebakSuara1Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.kuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ntent = new Intent(DaftarTebakSuaraActivity.this,TebakSuara2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.monyet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent = new Intent(DaftarTebakSuaraActivity.this,TebakSuara3Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.sapi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent = new Intent(DaftarTebakSuaraActivity.this,TebakSuara4Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.serigala).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent = new Intent(DaftarTebakSuaraActivity.this,TebakSuara5Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.harimau).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent = new Intent(DaftarTebakSuaraActivity.this,TebakSuara6Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.kembali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
