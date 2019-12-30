package com.agreyasoft.admin_sisf.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agreyasoft.admin_sisf.Activity.Admin_Subject_Details;
import com.agreyasoft.admin_sisf.Activity.Attendance_page;
import com.agreyasoft.admin_sisf.Activity.Home_Admin;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.util.List;

public class Adapter_subject_admin extends RecyclerView.Adapter<Adapter_subject_admin.ViewHolder> {
    List<Cons_Batch> list;
    Context con;

    public Adapter_subject_admin(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }


    @NonNull
    @Override
    public Adapter_subject_admin.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_admin_subject, parent, false);
        Adapter_subject_admin.ViewHolder viewHolder = new Adapter_subject_admin.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_subject_admin.ViewHolder holder, int position) {
        holder.btn_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Admin.home_admin_Activity, "dddd", Toast.LENGTH_SHORT).show();
                Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_Subject_Details.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout btn_layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btn_layout=itemView.findViewById(R.id.layout);
        }
    }
}
