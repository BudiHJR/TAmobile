package com.example.hikineet.mp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TebakSuara2Activity extends AppCompatActivity {

    private static final String isPlaying = "Media is Playing";

    private MediaPlayer player;
    Intent intent = getIntent();
    String data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_suara2);
        setTitle("Tebak Nama Hewan");

        findViewById(R.id.hewan1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(TebakSuara2Activity.this)
                        .setTitle("Salah")
                        .setIcon(R.drawable.ic_highlight_off_black_24dp)
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .show();
            }
        });

        findViewById(R.id.hewan2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(TebakSuara2Activity.this)
                        .setTitle("Benar")
                        .setIcon(R.drawable.benar)
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                        .show();
            }
        });

        findViewById(R.id.hewan3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(TebakSuara2Activity.this)
                        .setTitle("Salah")
                        .setIcon(R.drawable.ic_highlight_off_black_24dp)
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .show();
            }
        });

        findViewById(R.id.hewan4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(TebakSuara2Activity.this)
                        .setTitle("Salah")
                        .setIcon(R.drawable.ic_highlight_off_black_24dp)
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .show();
            }
        });

        findViewById(R.id.suara).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(1);
            }
        });

    }


    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){
        }
    }
    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
        }
        if (arg == 1){
            player = MediaPlayer.create(this, R.raw.suara_kuda_fix);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}
