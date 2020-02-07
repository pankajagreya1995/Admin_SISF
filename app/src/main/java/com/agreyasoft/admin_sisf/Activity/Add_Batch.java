package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.agreyasoft.admin_sisf.R;
import com.mcsoft.timerangepickerdialog.RangeTimePickerDialog;

public class Add_Batch extends AppCompatActivity implements RangeTimePickerDialog.ISelectedTime{

    TextView batch_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__batch);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        batch_time=findViewById(R.id.txt_time);

        String[] subject_item={"AB","MA","FA","LW","PM","TX"};
        String[] item={"Dashrath","Pankaj","Anil","Vinit","Dashu"};
        Spinner sp_tutor_list=findViewById(R.id.sp_tutor);
        Spinner sp_subject_list=findViewById(R.id.sp_subject);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, item);
        sp_tutor_list.setAdapter(adapter);

        ArrayAdapter adapter_subject = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, subject_item);
        sp_subject_list.setAdapter(adapter_subject);

        LinearLayout btn_dialog=findViewById(R.id.time_picker);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show_time_picker();
            }
        });

    }

    private void Show_time_picker() {
        // Create an instance of the dialog fragment and show it
        RangeTimePickerDialog dialog = new RangeTimePickerDialog();
        dialog.newInstance();
        dialog.setRadiusDialog(15); // Set radius of dialog (default is 50)
        dialog.setIs24HourView(true); // Indicates if the format should be 24 hours
        dialog.setColorBackgroundHeader(R.color.colorPrimary); // Set Color of Background header dialog
        dialog.setColorTextButton(R.color.colorPrimaryDark); // Set Text color of button
        FragmentManager fragmentManager = getFragmentManager();
        dialog.show(fragmentManager, "");
        dialog.setCancelable(true);
    }


    @Override
    public void onSelectedTime(int hourStart, int minuteStart, int hourEnd, int minuteEnd)
    {
        // Use parameters provided by Dialog
        Toast.makeText(this, "Start: "+hourStart+":"+minuteStart+"\nEnd: "+hourEnd+":"+minuteEnd, Toast.LENGTH_SHORT).show();
        batch_time.setText(hourStart+":"+minuteStart+" - "+hourEnd+":"+minuteEnd);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
