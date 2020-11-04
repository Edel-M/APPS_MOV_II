package com.example.eva2_11_resource_files;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    TextView txtVwA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwA = findViewById(R.id.txtVwA);

    }

    @Override
    protected void onStart() {
        super.onStart();
        //abrir archivo
        //leer en bytes
        //convertir a caracteres
        InputStream inputStream = getResources().openRawResource(R.raw.lorem);
        InputStreamReader isReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(isReader);
        String sCade;
        try {
            while ((sCade = bufferedReader.readLine()) != null) {
                txtVwA.append(sCade);
                txtVwA.append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}