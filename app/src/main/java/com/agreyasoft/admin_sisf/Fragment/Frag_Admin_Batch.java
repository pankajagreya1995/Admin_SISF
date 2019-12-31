package com.agreyasoft.admin_sisf.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.agreyasoft.admin_sisf.Activity.Add_Batch;
import com.agreyasoft.admin_sisf.Activity.Attendance_page;
import com.agreyasoft.admin_sisf.Activity.Home_Admin;
import com.agreyasoft.admin_sisf.Adapter.Adpter_Home_Admin;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Admin_Batch extends Fragment{

    Context con;
    public Frag_Admin_Batch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_frag__admin__batch, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(con,2);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        recyclerView.setHasFixedSize(true);
        List<Cons_Batch>batch_list=new ArrayList<>();
        Adpter_Home_Admin adapter=new Adpter_Home_Admin(batch_list,con);
        recyclerView.setAdapter(adapter);

        ImageView btn_batch_add=view.findViewById(R.id.add_batch_button);
        btn_batch_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Admin.home_admin_Activity, Add_Batch.class));
            }
        });
        return view;
    }
}
