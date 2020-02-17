package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;
import com.agreyasoft.admin_sisf.UTILS.MultiSelectionSpinner;

import co.ceryle.segmentedbutton.SegmentedButtonGroup;

public class Add_fee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fee);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String[] subject_item=new String[]{"Recording Financial Tranactions",
                "Managemant Information", "Maintaining Financial Records", "Managing Coasts and Finance",
                "Account in Business", "Managemant Accounting", "Financial Accounting", "Corporate Law", "Performnace Management", "Taxation", "Financial Reporting",
                "Audit and Assurance", "Financial Management", "Strategic Business Leader(essentials)", "Strategic Business Reporting(essentials)", "Advance Financial Management(optional)",
                "Advance Perform Management(optional)", "Advanced Taxation(optional)", "Advanced Audit and Assurance(optional)"};

        MultiSelectionSpinner sp_subject_list=findViewById(R.id.sp_subject_acca);
        sp_subject_list.setItemsChecked(subject_item);

        MultiSelectionSpinner sp_subject_list2=findViewById(R.id.sp_subject_acca2);
        sp_subject_list2.setItemsChecked(subject_item);

        MultiSelectionSpinner sp_subject_book_kit=findViewById(R.id.sp_subject_acca3);
        sp_subject_book_kit.setItemsChecked(subject_item);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
