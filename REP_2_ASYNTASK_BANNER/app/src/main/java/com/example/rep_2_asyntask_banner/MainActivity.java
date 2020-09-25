package com.example.rep_2_asyntask_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        MyClass miClase = new MyClass();
        miClase.execute(2500);


    }

    class MyClass extends AsyncTask<Integer, Integer, Void> {

        @Override
        protected Void doInBackground(Integer... integers) {
            int i = 0;
            while (i <= 2) {
                try {
                    Thread.sleep(integers[i]);
                    publishProgress();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;

            }
            return null;

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            img1.setImageResource(values[0]);

        }
    }
}