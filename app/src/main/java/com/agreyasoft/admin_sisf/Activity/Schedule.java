package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.agreyasoft.admin_sisf.Adapter.Adapter_attendance;
import com.agreyasoft.admin_sisf.Adapter.Adapter_set_schedule;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Schedule extends AppCompatActivity implements View.OnClickListener {
    Context con;
    TextView btn_Add2,btn_Add1,btn_date,btn_remove,btn_remove2,btn_remove3,btn_Add3;
    List<Cons_Batch> batch_list3,batch_list,batch_list2;
    Adapter_set_schedule adapter1,adapter2,adapter3;
    RecyclerView recyclerView2,recyclerView,recyclerView3;
    SimpleDateFormat dateFormatter;
    DatePickerDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initi();

        batch_list=new ArrayList<>();
        batch_list.add(new Cons_Batch(true,"vv","ere","fve","fever","evf"));

        batch_list2=new ArrayList<>();
        batch_list2.add(new Cons_Batch(true,"vv","ere","fve","fever","evf"));

        batch_list3=new ArrayList<>();
        batch_list3.add(new Cons_Batch(true,"vv","ere","fve","fever","evf"));

        adapter1=new Adapter_set_schedule(batch_list,con);
        recyclerView.setAdapter(adapter1);

        adapter2=new Adapter_set_schedule(batch_list2,con);
        recyclerView2.setAdapter(adapter2);

        adapter3=new Adapter_set_schedule(batch_list3,con);
        recyclerView3.setAdapter(adapter3);

    }

    private void initi() {

        dateFormatter = new SimpleDateFormat("ddMMMMyyyy", Locale.US);
        btn_Add1=findViewById(R.id.btn_add);
        btn_date=findViewById(R.id.txt_date);
        Calendar newDate = Calendar.getInstance();
        btn_date.setText(dateFormatter.format(newDate.getTime()));

        btn_remove=findViewById(R.id.btn_remove);
        recyclerView=findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(con,1);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        recyclerView.setHasFixedSize(true);


        btn_Add2=findViewById(R.id.btn_add2);
        btn_remove2=findViewById(R.id.btn_remove2);
        recyclerView2=findViewById(R.id.recyclerView2);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(con,1);
        recyclerView2.setLayoutManager(gridLayoutManager2); // set LayoutManager to RecyclerView
        recyclerView2.setHasFixedSize(true);



        btn_Add3=findViewById(R.id.btn_add3);
        btn_remove3=findViewById(R.id.btn_remove3);
        recyclerView3=findViewById(R.id.recyclerView3);
        GridLayoutManager gridLayoutManager3 = new GridLayoutManager(con,1);
        recyclerView3.setLayoutManager(gridLayoutManager3); // set LayoutManager to RecyclerView
        recyclerView3.setHasFixedSize(true);

        dialog=new DatePickerDialog(Schedule.this);
        dialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, month, dayOfMonth);
                btn_date.setText(dateFormatter.format(newDate.getTime()));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v==btn_Add1)
        {
            batch_list.add(new Cons_Batch(true,"vv","ere","fve","fever","evf"));
            adapter1.notifyDataSetChanged();
        }else if (v==btn_date)
        {
            dialog.show();
        }else if (v==btn_remove)
        {
            if (batch_list.size()!=1)
            {
                batch_list.remove(batch_list.size()-1);
                adapter1.notifyDataSetChanged();
            }
        }else if (v==btn_Add2){
            batch_list2.add(new Cons_Batch(true,"vv","ere","fve","fever","evf"));
            adapter2.notifyDataSetChanged();
        }else if (v==btn_remove2)
        {
            if (batch_list2.size()!=1)
            {
                batch_list2.remove(batch_list2.size()-1);
                adapter2.notifyDataSetChanged();
            }
        }else if (v==btn_Add3){
            batch_list3.add(new Cons_Batch(true,"vv","ere","fve","fever","evf"));
            adapter3.notifyDataSetChanged();
        }else if (v==btn_remove3)
        {
            if (batch_list3.size()!=1)
            {
                batch_list3.remove(batch_list3.size()-1);
                adapter3.notifyDataSetChanged();
            }
        }
    }
}
