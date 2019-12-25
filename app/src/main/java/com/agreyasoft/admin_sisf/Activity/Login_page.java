package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.agreyasoft.admin_sisf.R;

import co.ceryle.segmentedbutton.SegmentedButton;
import co.ceryle.segmentedbutton.SegmentedButtonGroup;

public class Login_page extends AppCompatActivity {
    private SegmentedButtonGroup group;
    int page_position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        group = (SegmentedButtonGroup) findViewById(R.id.segmentedButtonGroup);
        group.setOnClickedButtonListener(new SegmentedButtonGroup.OnClickedButtonListener() {
            @Override
            public void onClickedButton(int position) {
                page_position = position;
            }
        });
    }

    public void login_button(View view) {
        if (page_position == 0) {
            Toast.makeText(this, "Admin", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login_page.this, Home_Admin.class));
        } else {
            Toast.makeText(this, "Tutor", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login_page.this, Home_Tutor.class));
        }
        //
    }
}
