package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=(ListView)findViewById(R.id.list1);
        ArrayList<String > arrayList = new ArrayList<>();

      /*  arrayList.add("android");
        arrayList.add("android1");
        arrayList.add("android2");
        arrayList.add("android3");
        arrayList.add("android4");
        arrayList.add("android5");
        arrayList.add("android6");*/

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        list1.setAdapter(arrayAdapter);

    }
}