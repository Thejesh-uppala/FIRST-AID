package com.example.firstaidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class login extends AppCompatActivity {
    EditText edName1, edPass1;
    Button btnLogin,btnSignup;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edName1= findViewById(R.id.edUsername);
        edPass1= findViewById(R.id.edPassword);
        btnLogin= findViewById(R.id.btnLogin);
        btnSignup=findViewById(R.id.btnSignup);
        Bundle bundle= getIntent().getExtras();
        String registeredName= bundle.getString("N");
        String registeredPassword= bundle.getString("P");
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,signup.class));
            }
        });
        btnLogin.setOnClickListener(view ->
        {
            String name1 = edName1.getText().toString();
            String password1 = edPass1.getText().toString();
            if ((name1.equals(registeredName)) && (password1.equals(registeredPassword))) {
                Intent intent = new Intent(login.this, Success.class);
                startActivity(intent);
            } else if (counter < 2) {
                counter++;
                Toast.makeText(login.this, "Login Failed!!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(login.this, "Invalid credential!!! Failed Login Attempts!!",
                        Toast.LENGTH_LONG).show();
                btnLogin.setEnabled(false);
            }
        });
    }
}
