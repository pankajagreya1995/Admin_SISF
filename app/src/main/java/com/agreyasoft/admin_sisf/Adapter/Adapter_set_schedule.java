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

public class Adapter_set_schedule extends RecyclerView.Adapter<Adapter_set_schedule.ViewHolder> {
    List<Cons_Batch> list;
    Context con;

    public Adapter_set_schedule(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }


    @NonNull
    @Override
    public Adapter_set_schedule.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_set_schedule, parent, false);
        Adapter_set_schedule.ViewHolder viewHolder = new Adapter_set_schedule.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_set_schedule.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
