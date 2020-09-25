package com.example.rep_5_servicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent inServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inServicio = new Intent(this, MyService.class);
        BroadcastReceiver breceiver = new MiBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("MI SERVICIO");
        registerReceiver(breceiver, intentFilter);
    }

    public void iniciar(View v) {
        inServicio .putExtra("DATO", "Dato de la actividad");
        startService(inServicio);
    }
    public void detener(View view) {
        stopService(inServicio);
    }

    class MiBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {

            Log.wtf("MI MENSAJE", "THREAD");
        }
    }

}