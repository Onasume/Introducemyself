package com.example.onasu.introducemyself;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button previous = (Button) findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent previouspage = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(previouspage);
            }
        });

        final EditText Name = (EditText) findViewById(R.id.Name);
        final EditText Surname = (EditText) findViewById(R.id.Surname);
        final EditText Email = (EditText) findViewById(R.id.Email);
        final EditText Tel = (EditText) findViewById(R.id.Tel);
        final EditText Birthday = (EditText) findViewById(R.id.Birthday);
        final EditText Age = (EditText) findViewById(R.id.Age);

        Intent intent = getIntent();

        Name.setText(intent.getStringExtra("Name"));
        Surname.setText(intent.getStringExtra("Surname"));
        Email.setText(intent.getStringExtra("Email"));
        Tel.setText(intent.getStringExtra("Tel"));
        Birthday.setText(intent.getStringExtra("Birthday"));
        Age.setText(intent.getStringExtra("Age"));
    }

}
