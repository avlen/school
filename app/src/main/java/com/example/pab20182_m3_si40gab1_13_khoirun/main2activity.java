package com.example.pab20182_m3_si40gab1_13_khoirun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main2activity extends AppCompatActivity {
    Button btn_logout;
    Button btn_beatles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2activity);

//        Intent in = getIntent();
//        String s = in.getStringExtra("username");
//        TextView txt = (TextView) findViewById(R.id.username);
//        txt.setText(s);
//
//        btn_logout = (Button) findViewById(R.id.btn_logout);
//        btn_logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
        btn_beatles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main2activity.this, Main3Activity.class);
                main2activity.this.startActivity(intent);

            }
        });
    }
}
