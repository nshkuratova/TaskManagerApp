package com.example.nika_shkuratava.taskmanagerapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] task = {"Задача 1", "Задача 2", "Задача 3", "Задача 4", "Задача 5", "Задача 6", "Задача 1", "Задача 2", "Задача 3", "Задача 4", "Задача 5", "Задача 6","Задача 1", "Задача 2", "Задача 3", "Задача 4", "Задача 5", "Задача 6","Задача 1", "Задача 2", "Задача 3", "Задача 4", "Задача 5", "Задача 6"};

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        LayoutInflater inflater = getLayoutInflater();

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);

        for (int i = 0; i <task.length; i++){
            View view = inflater.inflate(R.layout.item_list_view, linearLayout, false);
            TextView taskName = (TextView) view.findViewById(R.id.name);
            taskName.setText(task[i]);
            linearLayout.addView(view);
        }

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
