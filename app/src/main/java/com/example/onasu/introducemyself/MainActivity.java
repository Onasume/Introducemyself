package com.example.onasu.introducemyself;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        final EditText editName = (EditText) findViewById(R.id.editName);
        final EditText editSurname = (EditText) findViewById(R.id.editSurname);
        final EditText editemail = (EditText) findViewById(R.id.editemail);
        final EditText edittel = (EditText) findViewById(R.id.edittel);
        final EditText editbirthday = (EditText) findViewById(R.id.editbirthday);
        final EditText editage = (EditText) findViewById(R.id.editage);

        final Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editName.setText(editName.getText());
                editSurname.setText(editSurname.getText());
                editemail.setText(editemail.getText());
                edittel.setText(edittel.getText());
                editbirthday.setText(editbirthday.getText());
                editage.setText(editage.getText());


                Intent nextpage = new Intent(MainActivity.this, Main2Activity.class);
                nextpage.putExtra("Name", editName.getText().toString());
                nextpage.putExtra("Surname", editSurname.getText().toString());
                nextpage.putExtra("Email", editemail.getText().toString());
                nextpage.putExtra("Tel", edittel.getText().toString());
                nextpage.putExtra("Birthday", editbirthday.getText().toString());
                nextpage.putExtra("Age", editage.getText().toString());
                startActivity(nextpage);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
