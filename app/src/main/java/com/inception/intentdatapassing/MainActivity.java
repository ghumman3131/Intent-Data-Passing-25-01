package com.inception.intentdatapassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveNext(View v)
    {

        EditText username_et = findViewById(R.id.username_et);

        EditText password_et = findViewById(R.id.password_et);


        String username= username_et.getText().toString();

        String password= password_et.getText().toString();


        Intent i = new Intent(MainActivity.this , Main2Activity.class);

        i.putExtra("user" , username);
        i.putExtra("pass" , password);

        startActivity(i);
    }
}
