package com.example.pab20182_m3_si40gab1_13_khoirun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private Spinner spNamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        spNamen = (Spinner) findViewById(R.id.kelas);

        Button btSpinner = (Button) findViewById(R.id.pilih);
        btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main4Activity.this, "Selected" + spNamen.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
