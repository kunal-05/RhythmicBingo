package com.example.kmand.rhythmicbingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText b = (EditText) findViewById(R.id.password);
                String pass = b.getText().toString();
                String password = "Kunal";
                if (pass.equals(password)) {
                    startActivity(new Intent(Login.this, Screen_1.class));
                    finish();
                }               else
                    Toast.makeText(Login.this, "Incorrect password",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
