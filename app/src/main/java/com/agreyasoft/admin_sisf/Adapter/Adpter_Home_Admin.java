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

import com.agreyasoft.admin_sisf.Activity.Attendance_page;
import com.agreyasoft.admin_sisf.Activity.Home_Admin;
import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.util.List;

public class Adpter_Home_Admin extends RecyclerView.Adapter<Adpter_Home_Admin.ViewHolder>{
    List<Cons_Batch> list;
    Context con;
    public Adpter_Home_Admin(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View v=layoutInflater.inflate(R.layout.layout_adapter_batch_admin,viewGroup,false);
        Adpter_Home_Admin.ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.btn_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Admin.home_admin_Activity, "dddd", Toast.LENGTH_SHORT).show();
                Home_Admin.home_admin_Activity.startActivity(new Intent(Home_Admin.home_admin_Activity, Attendance_page.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout btn_layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btn_layout=itemView.findViewById(R.id.layout);
        }
    }
}
