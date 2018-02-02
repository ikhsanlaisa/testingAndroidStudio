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

        Intent intent = getIntent();

        String restaurant = intent.getStringExtra("restaurant");
        String makanan = intent.getStringExtra("makanan");
        String porsi = intent.getStringExtra("porsi");
        int porsi1 = Integer.parseInt(porsi);
        String uangku = intent.getStringExtra("mymoneys");
        int mymoney = Integer.parseInt(uangku);

        if (restaurant.equalsIgnoreCase("Eatbus")) {
            int nasiuduk = 50000;
            int total = nasiuduk * porsi1;
            if (mymoney >= total) {
                TextView textView = findViewById(R.id.makanan);
                textView.setText(makanan);

                TextView textView1 = findViewById(R.id.porsi1);
                textView1.setText(porsi);

                String bayaran = String.valueOf(total);
                TextView textView2 = findViewById(R.id.price);
                textView2.setText(bayaran);

                TextView textView3 = findViewById(R.id.txt2);
                textView3.setText(restaurant);

                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
            } else {
                TextView textView = findViewById(R.id.makanan);
                textView.setText(makanan);

                TextView textView1 = findViewById(R.id.porsi1);
                textView1.setText(porsi);

                String bayaran = String.valueOf(total);
                TextView textView2 = findViewById(R.id.price);
                textView2.setText(bayaran);

                TextView textView3 = findViewById(R.id.txt2);
                textView3.setText(restaurant);

                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup!", Toast.LENGTH_LONG).show();
            }
        } else {
            int nasiuduk = 30000;

            int total = nasiuduk * porsi1;
            if (mymoney >= total) {
                TextView textView = findViewById(R.id.makanan);
                textView.setText(makanan);

                TextView textView1 = findViewById(R.id.porsi1);
                textView1.setText(porsi);

                String bayaran = String.valueOf(total);
                TextView textView2 = findViewById(R.id.price);
                textView2.setText(bayaran);

                TextView textView3 = findViewById(R.id.txt2);
                textView3.setText(restaurant);

                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
            } else {
                TextView textView = findViewById(R.id.makanan);
                textView.setText(makanan);

                TextView textView1 = findViewById(R.id.porsi1);
                textView1.setText(porsi);

                String bayaran = String.valueOf(total);
                TextView textView2 = findViewById(R.id.price);
                textView2.setText(bayaran);

                TextView textView3 = findViewById(R.id.txt2);
                textView3.setText(restaurant);

                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup!", Toast.LENGTH_LONG).show();
            }
        }
    }
}
