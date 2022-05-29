package com.example.listviewandrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.widget.ArrayAdapter;/
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr = {"this is", "Item1", "Item2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        We can not show data directly in listview, so that we need Adapter to connect data and View
//        Another example is, real adapter for charger, we can not charge our phone from wires directly we need adapter to handle volt
//        String resource do, and view lo type
        listView = findViewById(R.id.listView);
//        Here not that android.R.layout means we are using builtin layouts of android, if there is only R then it means it's our layout'

//        Builtin Adapter
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        We can create custom adapter to show more content like title, description same like gmail
        listView.setAdapter(ad);

//       using New custom Adapter from MyAdapter.java and my_brijal_layout.xml
//        MyAdapter ad = new MyAdapter(this, R.layout.my_brijal_layout,arr);
//        listView.setAdapter(ad);
//        ad.notifyDataSetChanged();
    }
}