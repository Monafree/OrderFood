package com.example.mona.orderfood;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import java.util.HashMap;
;
import java.util.List;

import java.util.Map;

public class HomePage extends AppCompatActivity {

    List<Map<String,Object>> data = new ArrayList<Map<String, Object>>();
    private void init()
    {
        Map<String,Object> mp1 = new HashMap<String, Object>();
        Map<String,Object> mp2 = new HashMap<String, Object>();
        Map<String,Object> mp3 = new HashMap<String, Object>();
        Map<String,Object> mp4 = new HashMap<String, Object>();
        Map<String,Object> mp5 = new HashMap<String, Object>();
        Map<String,Object> mp6 = new HashMap<String, Object>();
        Map<String,Object> mp7 = new HashMap<String, Object>();
        Map<String,Object> mp8 = new HashMap<String, Object>();



        mp1.put("show",R.drawable.logo);
        mp1.put("title","思源");
        mp1.put("content","a");

        mp2.put("show",R.drawable.logo);
        mp2.put("title","思源");
        mp2.put("content","b");

        mp3.put("show",R.drawable.logo);
        mp3.put("title","思源");
        mp3.put("content","c");

        mp4.put("show",R.drawable.logo);
        mp4.put("title","思源");
        mp4.put("content","c");

        mp5.put("show",R.drawable.logo);
        mp5.put("title","思源");
        mp5.put("content","c");

        mp6.put("show",R.drawable.logo);
        mp6.put("title","思源");
        mp6.put("content","c");

        mp7.put("show",R.drawable.logo);
        mp7.put("title","思源");
        mp7.put("content","c");

        mp8.put("show",R.drawable.logo);
        mp8.put("title","思源");
        mp8.put("content", "c");



        data.add(mp1);
        data.add(mp2);
        data.add(mp3);
        data.add(mp4);

        data.add(mp5);
        data.add(mp6);
        data.add(mp7);
        data.add(mp8);
    }

    String[] testdata = {"A","B","C","D","E","F","G"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });



        //MyBaseAdapter adapter = new MyBaseAdapter(data,this);
        ListView listView = (ListView)findViewById(R.id.listView);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,testdata);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.test,testdata);
        MyBaseAdapter adapter = new MyBaseAdapter(data, this);
        listView.setAdapter(adapter);
    }

}
