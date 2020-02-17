package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
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

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }


    public void button_next(View view) {
        startActivity(new Intent(Add_Student.this,Add_fee.class));
    }
}
