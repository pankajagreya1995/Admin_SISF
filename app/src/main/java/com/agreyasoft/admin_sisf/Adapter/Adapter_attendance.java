package com.agreyasoft.admin_sisf.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agreyasoft.admin_sisf.POJO.Cons_Batch;
import com.agreyasoft.admin_sisf.R;

import java.util.List;

public class Adapter_attendance  extends RecyclerView.Adapter<Adapter_attendance.ViewHolder> {
    List<Cons_Batch> list;
    Context con;

    public Adapter_attendance(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }

    @NonNull
    @Override
    public Adapter_attendance.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_attendance, parent, false);
        Adapter_attendance.ViewHolder viewHolder = new Adapter_attendance.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_attendance.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

