package com.example.proj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvEmail;
    TextView tvPhone;
    public static final int REQUEST_EDIT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button edit = findViewById(R.id.btn_main);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(i, REQUEST_EDIT);
            }
        });
        tvName = findViewById(R.id.tv_email_main);
        tvEmail = findViewById(R.id.tv_phone_main);
        tvPhone = findViewById(R.id.tv_name_main);
    }

        protected void onActivityResult(int req, int res, Intent data ){
            if (data == null) {return;}
            String name = data.getStringExtra("name");
            String email = data.getStringExtra("email");
            String phone = data.getStringExtra("phone");
            tvName.setText(name);
            tvEmail.setText(email);
            tvPhone.setText(phone);
        }
    }
