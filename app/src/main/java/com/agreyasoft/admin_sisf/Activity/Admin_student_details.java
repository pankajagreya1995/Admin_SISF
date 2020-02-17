package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.agreyasoft.admin_sisf.Adapter.Adapter_Course;
import com.agreyasoft.admin_sisf.Adapter.Adapter_fee_details;
import com.agreyasoft.admin_sisf.Adapter.Adapter_subject_details;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.POJO.Course_Info;
import com.agreyasoft.admin_sisf.POJO.Subject_Info;
import com.agreyasoft.admin_sisf.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Admin_student_details extends AppCompatActivity {


    ExpandableListView expandableListView;
    Adapter_Course expandableListAdapter;
    List<Course_Info> expandableListTitle;
    ArrayList<Course_Info> course_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_student_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Admin_student_details.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        recyclerView.setHasFixedSize(true);
        List<Cons_Batch> batch_list = new ArrayList<>();
        Adapter_fee_details adapter = new Adapter_fee_details(batch_list, Admin_student_details.this);
        recyclerView.setAdapter(adapter);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        Set_data_list();
        expandableListAdapter = new Adapter_Course(this, course_list);
        expandableListView.setAdapter(expandableListAdapter);

    }

    private void Set_data_list() {


        for (int j = 1; j < 4; j++) {
            ArrayList<Subject_Info> sub_list = new ArrayList<>();
            Course_Info course_info = new Course_Info();
            for (int i = 1; i < 5; i++) {
                Subject_Info subject_info = new Subject_Info();
                subject_info.setName(String.valueOf(i)+" EMI");
                subject_info.setSequence(String.valueOf(i)+" June 2020");
                sub_list.add(subject_info);
            }
            course_info.setList(sub_list);
            course_info.setName(String.valueOf(j)+" Year EMI");
            course_list.add(course_info);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.student_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                startActivity(new Intent(Admin_student_details.this,Show_attendance.class));
                return true;
            case R.id.item2:
                startActivity(new Intent(Admin_student_details.this,Add_Student.class));
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
