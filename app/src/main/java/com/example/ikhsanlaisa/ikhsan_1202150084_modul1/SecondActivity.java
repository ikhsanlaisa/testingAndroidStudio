package com.example.ikhsanlaisa.ikhsan_1202150084_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int nasiuduk = 50000;

        Intent intent = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();

        String makanan = intent.getStringExtra("makanan");
        String porsi = intent2.getStringExtra("porsi");
        int porsi1 = Integer.parseInt(porsi);
        String uangku = intent3.getStringExtra("mymoneys");
        int mymoney = Integer.parseInt(uangku);

        int total = nasiuduk * porsi1;
        if (mymoney >= total) {
            TextView textView = findViewById(R.id.makanan);
            textView.setText(makanan);

            TextView textView1 = findViewById(R.id.porsi1);
            textView1.setText(porsi);

            String bayaran = String.valueOf(total);
            TextView textView2 = findViewById(R.id.price);
            textView2.setText(bayaran);

            Toast.makeText(this, "Selamat menikmati makan malamnya", Toast.LENGTH_LONG).show();
        } else {
            TextView textView = findViewById(R.id.makanan);
            textView.setText(makanan);

            TextView textView1 = findViewById(R.id.porsi1);
            textView1.setText(porsi);

            String bayaran = String.valueOf(total);
            TextView textView2 = findViewById(R.id.price);
            textView2.setText(bayaran);
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup!", Toast.LENGTH_LONG).show();
        }

    }
}
