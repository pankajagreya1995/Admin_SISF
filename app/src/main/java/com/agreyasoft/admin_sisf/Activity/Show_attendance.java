package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.agreyasoft.admin_sisf.Adapter.Adapter_show_attendance;
import com.agreyasoft.admin_sisf.Adapter.Adpter_Home_Admin;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.util.ArrayList;
import java.util.List;

public class Show_attendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_attendance);
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        recyclerView.setHasFixedSize(true);
        List<Cons_Batch> batch_list=new ArrayList<>();
        Adapter_show_attendance adapter=new Adapter_show_attendance(batch_list,this);
        recyclerView.setAdapter(adapter);

    }
}
