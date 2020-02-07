package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.agreyasoft.admin_sisf.Adapter.Adapter_fee_details;
import com.agreyasoft.admin_sisf.Adapter.Adapter_fee_submit;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;
import com.agreyasoft.admin_sisf.UTILS.MultiSelectionSpinner;

import java.util.ArrayList;
import java.util.List;

import co.ceryle.segmentedbutton.SegmentedButtonGroup;

public class Add_Student extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayout layout_acca,layout_acca_pro;
    List<Cons_Batch> batch_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__student);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        layout_acca=findViewById(R.id.layout_acca);
        layout_acca_pro=findViewById(R.id.layout_acca_pro);

        String[] subject_item={"AB","MA","FA","LW","PM","TX","FR","AA","FM","SBL","SBR","AFM","APM","ATX","AAA"};
        MultiSelectionSpinner sp_subject_list=findViewById(R.id.sp_subject_acca);

        sp_subject_list.setItemsChecked(subject_item);

        recyclerView=findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Add_Student.this,1);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        recyclerView.setHasFixedSize(true);

         batch_list=new ArrayList<>();
         batch_list.add(new Cons_Batch(true,"11","3ew","sd","fwrf","fgvdf"));
         Adapter_fee_submit adapter_fee=new Adapter_fee_submit(batch_list,Add_Student.this);
         recyclerView.setAdapter(adapter_fee);

        SegmentedButtonGroup group = (SegmentedButtonGroup) findViewById(R.id.segmentedButtonGroup);
        group.setOnClickedButtonListener(new SegmentedButtonGroup.OnClickedButtonListener() {
            @Override
            public void onClickedButton(int position) {
                if (position==0)
                {
                    layout_acca.setVisibility(View.VISIBLE);
                    layout_acca_pro.setVisibility(View.GONE);
                }else if (position==1)
                {
                    layout_acca.setVisibility(View.GONE);
                    layout_acca_pro.setVisibility(View.VISIBLE);
                }else if(position==2)
                {
                    layout_acca.setVisibility(View.GONE);
                    layout_acca_pro.setVisibility(View.VISIBLE);
                }
            }
        });

        TextView btn_add_subject=findViewById(R.id.btn_add_subject);
        btn_add_subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                batch_list.add(new Cons_Batch(true,"11","3ew","sd","fwrf","fgvdf"));
                Adapter_fee_submit adapter_fee=new Adapter_fee_submit(batch_list,Add_Student.this);
                recyclerView.setAdapter(adapter_fee);
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }


}
