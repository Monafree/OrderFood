package com.example.mona.orderfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;
import android.util.Log;

import java.util.List;
import java.util.Map;

/**
 * Created by mona on 16/4/19.
 */
public class MyBaseAdapter extends BaseAdapter{

    private List<Map<String,Object>> data;
    private Context context;

    public MyBaseAdapter(List<Map<String,Object>> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.listview,null);

        Map<String, Object> b = data.get(position);
        convertView.findViewById(R.id.show).setBackgroundResource(Integer.parseInt(b.get("show").toString()));
        ((TextView)convertView.findViewById(R.id.content)).setText(b.get("content").toString());
        ((TextView)convertView.findViewById(R.id.title)).setText(b.get("title").toString());

//        ((TextView)convertView.findViewById(R.id.content)).setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Log.i("mona", data.get(position).getContent().toString());
//            }
//        });


        return convertView;
    }
}
