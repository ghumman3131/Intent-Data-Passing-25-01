package com.inception.intentdatapassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String username = getIntent().getStringExtra("user");

        String password = getIntent().getStringExtra("pass");

        TextView user_txt = findViewById(R.id.username);

        TextView password_txt = findViewById(R.id.password);

        user_txt.setText(username);

        password_txt.setText(password);


    }
}
