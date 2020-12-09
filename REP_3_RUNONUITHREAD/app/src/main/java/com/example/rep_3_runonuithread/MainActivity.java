package com.example.rep_3_runonuithread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtVwDatos;
Runnable runnable = new Runnable() {
    @Override
    public void run() {
txtVwDatos.append("Hola");

    }
};

Thread thread = new Thread(){
    @Override
    public void run() {
        super.run();
        int i = 0;
        while(i>10)


    }
};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwDatos.findViewById(R.id.txtVwDatos);
        thread.start();
    }
}