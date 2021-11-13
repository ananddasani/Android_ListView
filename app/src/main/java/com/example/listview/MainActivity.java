package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arr = {"item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8", "item9", "item10"};
        listView = findViewById(R.id.listView);

        //using default layout using android.R.layout....
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, arr);
        listView.setAdapter(ad);

        //setOnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked item " + (position + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}