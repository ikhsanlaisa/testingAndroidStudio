package com.example.ikhsanlaisa.ikhsan_1202150084_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editMakanan;
    private EditText editPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMakanan = findViewById(R.id.edittxt1);
        editPorsi = findViewById(R.id.edittxt2);
    }

    public void lauchEatbus(View view) {


        Intent intent = new Intent(this, SecondActivity.class);

        int mymoney = 65500;
        String mymoneys = String.valueOf(mymoney);

        intent.putExtra("mymoneys", mymoneys);

        String makanan = editMakanan.getText().toString();
        intent.putExtra("makanan", makanan);

        String porsi = editPorsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }

    public void lauchAbnormal(View view) {

        Intent intent = new Intent(this, ThirdActivity.class);

        int mymoney = 65500;
        String mymoneys = String.valueOf(mymoney);

        intent.putExtra("mymoneys", mymoneys);

        String makanan = editMakanan.getText().toString();
        intent.putExtra("makanan", makanan);

        String porsi = editPorsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }

}
