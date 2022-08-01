package com.example.firstaidapp;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;
public class signup extends AppCompatActivity {
    EditText edname, edPass;
    Button btnSignup;
    Pattern lowerCase = Pattern.compile("^.*[a-z].*$");
    Pattern upperCase = Pattern.compile("^.*[A-Z].*$");
    Pattern number = Pattern.compile("^.*[0-9].*$");
    Pattern specialCharacter = Pattern.compile("^.*[^a-zA-Z0-9].*$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        edname = findViewById(R.id.edUsername);
        edPass = findViewById(R.id.edPassword);
        btnSignup = findViewById(R.id.btnSignup);
        btnSignup.setOnClickListener(view -> {
            String name=edname.getText().toString();
            String password=edPass.getText().toString();
            if (name.isEmpty() || password.isEmpty())
            {
                Toast.makeText(signup.this, "Please Enter the details!!",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            Boolean x= isValidPassword(password);
            if(!x)
            {
                Toast.makeText(signup.this, "Password does not match the rule!!",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            else
            {
                Intent intent= new Intent(signup.this, login.class);
                Bundle bundle = new Bundle();
                bundle.putString("N", name);
                bundle.putString("P", password);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    private Boolean isValidPassword(String password)
    {
        if (password.length() < 8) {
            return false;
        }
        if (!lowerCase.matcher(password).matches()) {
            return false;
        }
        if (!upperCase.matcher(password).matches()) {
            return false;
        }
        if (!number.matcher(password).matches()) {
            return false;
        }
        if (!specialCharacter.matcher(password).matches())
        {
            return false;
        }
        return true;
    }
}