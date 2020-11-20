package com.rizkaha.coba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int jumlahKlik = 0;
    Button button2;
    TextView textJumlahKlik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button);
        textJumlahKlik = findViewById(R.id.jumlahKlik);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d ("MAIN","tombol ini");
                tombolini();
            }

        });
    }
    private void tombolini(){
        jumlahKlik++;
        textJumlahKlik.setText(String.valueOf(jumlahKlik));

    };
}