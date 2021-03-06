package com.example.maverick.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        //final CharSequence text ="hi" ;
        final int duration = Toast.LENGTH_SHORT;



        Button button1 = (Button)findViewById(R.id.sportify);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This button will launch Sportify Streamer!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button2 = (Button)findViewById(R.id.scores);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This button will launch Football Scores!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button3 = (Button)findViewById(R.id.library);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This button will launch Library app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button4 = (Button)findViewById(R.id.build_bigger);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text1 = "This button will launch Build it Bigger!";
                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
            }
        });

        Button button5 = (Button)findViewById(R.id.reader);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text1 = "This button will launch XYZ Reader!";
                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
            }
        });

        Button button6 = (Button)findViewById(R.id.capstone);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text1 = "This button will launch my capstone app!";
                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
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
