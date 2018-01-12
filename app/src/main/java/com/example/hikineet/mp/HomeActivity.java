package com.example.hikineet.mp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class HomeActivity extends Activity {

    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);

        findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                //pesan keluar
                builder.setMessage("Keluar dari Aplikasi ?")
                        .setCancelable(false)
                        //Button Keluar
                        .setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                moveTaskToBack(true);
                                System.exit(0);
                            }
                        })
                        //Button Batal
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    public void onBackPressed()
    {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
        {
            super.onBackPressed();
            return;
        }
        else { Toast.makeText(getBaseContext(), "Tekan Kembali Sekali lagi untuk Keluar", Toast.LENGTH_SHORT).show(); }

        mBackPressed = System.currentTimeMillis();
    }

    public void mulaiPembelajaran(View view){
        intent = new Intent(this,DaftarBelajarActivity.class);
        startActivity(intent);
    }
    public void tebaknamahewan(View view){
        intent = new Intent(this,DaftarTebakKataActivity.class);
        startActivity(intent);
    }

    public void tebaksuarahewan(View view){
        intent = new Intent(this,DaftarTebakSuaraActivity.class);
        startActivity(intent);
    }
}
