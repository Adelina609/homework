package com.example.proj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView t2;
    TextView tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button edit = findViewById(R.id.act1_button);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(i, 1);
            }
        });
        tv1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.act1_textView);

    }

        protected void onActivityResult(int req, int res, Intent data ){
            if (data == null) {return;}
            String name = data.getStringExtra("name");
            String email = data.getStringExtra("email");
            String phone = data.getStringExtra("phone");
            tv1.setText(name);
            t2.setText(email);
            tv3.setText(phone);


        }


    }









