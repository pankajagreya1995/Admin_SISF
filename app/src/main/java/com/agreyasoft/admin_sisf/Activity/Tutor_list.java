package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.agreyasoft.admin_sisf.R;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Tutor_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_list);
        ListView listView=findViewById(R.id.listview);
        String[] item={"Dashrath","Pankaj","Anil","Vinit","Dashu"};

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.layout_tutor_list, item);
             listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Tutor_list.this,Home_Tutor.class));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
