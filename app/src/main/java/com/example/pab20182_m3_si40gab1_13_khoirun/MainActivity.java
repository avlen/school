package com.example.pab20182_m3_si40gab1_13_khoirun;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password ;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123") ||
                        (usernameKey.equals("1202144203") && passwordKey.equals("123"))) {

                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses !", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent( MainActivity.this, main2activity.class);
                    intent.putExtra("username", username.getText().toString());
                    MainActivity.this.startActivity(intent);

                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("username atau password anda salah.. !").setNegativeButton(
                            "Retry..", null).create().show();

                }

            }
        });
    }
}
