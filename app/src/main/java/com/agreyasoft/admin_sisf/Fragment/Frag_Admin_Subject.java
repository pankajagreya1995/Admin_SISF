package com.agreyasoft.admin_sisf.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.agreyasoft.admin_sisf.Activity.Admin_Subject_Details;
import com.agreyasoft.admin_sisf.Activity.Home_Admin;
import com.agreyasoft.admin_sisf.Adapter.Adapter_Course;
import com.agreyasoft.admin_sisf.Adapter.Adapter_subject_admin;
import com.agreyasoft.admin_sisf.Adapter.Adpter_Home_Admin;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.POJO.Course_Info;
import com.agreyasoft.admin_sisf.POJO.Subject_Info;
import com.agreyasoft.admin_sisf.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import static com.agreyasoft.admin_sisf.Activity.Home_Admin.home_admin_Activity;

/**
 * A simple {@link Fragment} subclass.
 */

public class Frag_Admin_Subject extends Fragment {
    Context con;

    public Frag_Admin_Subject() {
        // Required empty public constructor
    }

    boolean chack_subject = true;
    ListView listView;
    String[] course_list, course_acca, course_acca_pro, course_igrad_finance, course_ecba, course_ncfm;
    ArrayAdapter<String> adapter;
    TextView back_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag__admin__subject, container, false);
        back_btn = view.findViewById(R.id.backButton);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter = new ArrayAdapter<String>(home_admin_Activity, android.R.layout.simple_list_item_1, course_list);
                listView.setAdapter(adapter);
                back_btn.setVisibility(View.GONE);
                chack_subject = true;
            }
        });

        listView = view.findViewById(R.id.subject_list);

        course_list = new String[]{"ACCA", "ACCA Pro", "IGrad Finance", "Entry Certificate in business Analysis(ECBA)", "NCFM"};

        course_acca = new String[]{"Recording Financial Tranactions",
                "Managemant Information", "Maintaining Financial Records", "Managing Coasts and Finance",
                "Account in Business", "Managemant Accounting", "Financial Accounting", "Corporate Law", "Performnace Management", "Taxation", "Financial Reporting",
                "Audit and Assurance", "Financial Management", "Strategic Business Leader(essentials)", "Strategic Business Reporting(essentials)", "Advance Financial Management(optional)",
                "Advance Perform Management(optional)", "Advanced Taxation(optional)", "Advanced Audit and Assurance(optional)"};

        course_acca_pro = new String[]{"Recording Financial Tranactions",
                "Managemant Information", "Maintaining Financial Records", "Managing Coasts and Finance",
                "Account in Business", "Managemant Accounting", "Financial Accounting", "Corporate Law", "Performnace Management", "Taxation", "Financial Reporting",
                "Audit and Assurance", "Financial Management", "Strategic Business Leader(essentials)", "Strategic Business Reporting(essentials)", "Advance Financial Management(optional)",
                "Advance Perform Management(optional)", "Advanced Taxation(optional)", "Advanced Audit and Assurance(optional)", "Entry Certificate in business Analysis(ECBA)",
                "Interpersonal skills & Communication proficiency", "Analytical & Research Skills", "Computer Proficiency", "Problem solving & decision-making abilities", "Ethics & integrity", "Professional Competence"};

        course_igrad_finance = new String[]{"NSE Academy Certification in Financial in Financial Markets",
                "Oxford Brooks University(OBU)", "Recording Financial Tranactions",
                "Managemant Information", "Maintaining Financial Records", "Managing Coasts and Finance",
                "Account in Business", "Managemant Accounting", "Financial Accounting", "Corporate Law", "Performnace Management", "Taxation", "Financial Reporting",
                "Audit and Assurance", "Financial Management", "Strategic Business Leader(essentials)", "Strategic Business Reporting(essentials)", "Advance Financial Management(optional)",
                "Advance Perform Management(optional)", "Advanced Taxation(optional)", "Advanced Audit and Assurance(optional)",
                "Recording Financial Tranactions",
                "Managemant Information", "Maintaining Financial Records", "Managing Coasts and Finance",
                "Account in Business", "Managemant Accounting", "Financial Accounting", "Corporate Law", "Performnace Management", "Taxation", "Financial Reporting",
                "Audit and Assurance", "Financial Management", "Strategic Business Leader(essentials)", "Strategic Business Reporting(essentials)", "Advance Financial Management(optional)",
                "Advance Perform Management(optional)", "Advanced Taxation(optional)", "Advanced Audit and Assurance(optional)", "Entry Certificate in business Analysis(ECBA)",
                "Interpersonal skills & Communication proficiency", "Analytical & Research Skills", "Computer Proficiency", "Problem solving & decision-making abilities", "Ethics & integrity", "Professional Competence"};


        course_ncfm = new String[]{"Certifiication by NSC (NCFM)-Beginners Module", "Certifiication by NSC (NCFM)-Intermediate Module", "Certifiication by NSC (NCFM)-Advance Module"};

        adapter = new ArrayAdapter<String>(home_admin_Activity, android.R.layout.simple_list_item_1, course_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    if (chack_subject) {
                        chack_subject = false;
                        adapter = new ArrayAdapter<String>(home_admin_Activity, android.R.layout.simple_list_item_1, course_acca);
                        listView.setAdapter(adapter);
                        back_btn.setVisibility(View.VISIBLE);
                    } else {

                        Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_Subject_Details.class));
                    }

                } else if (position == 1) {
                    if (chack_subject) {
                        chack_subject = false;
                        adapter = new ArrayAdapter<String>(home_admin_Activity, android.R.layout.simple_list_item_1, course_acca_pro);
                        listView.setAdapter(adapter);
                        back_btn.setVisibility(View.VISIBLE);
                    } else {

                        Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_Subject_Details.class));
                    }

                } else if (position == 2) {
                    if (chack_subject) {
                        chack_subject = false;
                        adapter = new ArrayAdapter<String>(home_admin_Activity, android.R.layout.simple_list_item_1, course_igrad_finance);
                        listView.setAdapter(adapter);
                        back_btn.setVisibility(View.VISIBLE);
                    } else {

                        Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_Subject_Details.class));
                    }

                } else if (position == 3) {

                    chack_subject = true;
                    Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_Subject_Details.class));

                } else if (position == 4) {
                    if (chack_subject) {
                        chack_subject = false;
                        adapter = new ArrayAdapter<String>(home_admin_Activity, android.R.layout.simple_list_item_1, course_ncfm);
                        listView.setAdapter(adapter);
                        back_btn.setVisibility(View.VISIBLE);
                    } else {
                        chack_subject = true;
                        Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_Subject_Details.class));
                    }

                }

            }
        });
        return view;
    }
}
