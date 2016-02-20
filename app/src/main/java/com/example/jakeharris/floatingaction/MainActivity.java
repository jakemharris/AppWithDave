package com.example.jakeharris.floatingaction;
/**/
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        final TextView textView = (TextView) findViewById(R.id.tvMaintext);

        // initialize buttons: Type declaration; object name; = (cast as type); identify which object;
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab3);

        // code buttons
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi Dave", Toast.LENGTH_LONG).show();
                textView.setVisibility(View.VISIBLE);

                textView.setText("Dave");
            }
        });
// this is a comment
// this is too
// lalalaasdfasfdasdf
        // Help button
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("This is button 1");
                Toast.makeText(MainActivity.this, "You just pushed Button 1", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Help.class);
                startActivity(intent);
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("This is a sentence");
                Intent intent = new Intent(MainActivity.this, menu.class);
                startActivity(intent);
            }
        });
    }


}
