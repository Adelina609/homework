package com.example.proj2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText edName;
    EditText edEmail;
    EditText edPhone;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edName = findViewById(R.id.et_name_second_activity);
        edEmail = findViewById(R.id.et_email_second_activity);
        edPhone = findViewById(R.id.et_phone_second_activity);
        okBtn = findViewById(R.id.btn_ok_second_activity);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name", edName.getText().toString());
                intent.putExtra("email", edEmail.getText().toString());
                intent.putExtra("phone", edPhone.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
