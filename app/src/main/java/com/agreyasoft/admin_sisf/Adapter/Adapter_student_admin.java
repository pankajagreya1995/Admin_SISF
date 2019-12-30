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
import com.agreyasoft.admin_sisf.Activity.Admin_student_details;
import com.agreyasoft.admin_sisf.Activity.Home_Admin;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.util.List;

public class Adapter_student_admin extends RecyclerView.Adapter<Adapter_student_admin.ViewHolder> {
    List<Cons_Batch> list;
    Context con;

    public Adapter_student_admin(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }

    @NonNull
    @Override
    public Adapter_student_admin.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_student_admin, parent, false);
        Adapter_student_admin.ViewHolder viewHolder = new Adapter_student_admin.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_student_admin.ViewHolder holder, int position) {
        holder.btn_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Admin_student_details.class));
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
