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

public class Adapter_fee_submit extends RecyclerView.Adapter<Adapter_fee_submit.ViewHolder> {
    List<Cons_Batch> list;
    Context con;

    public Adapter_fee_submit(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }


    @NonNull
    @Override
    public Adapter_fee_submit.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_add_fee_submit, parent, false);
        Adapter_fee_submit.ViewHolder viewHolder = new Adapter_fee_submit.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_fee_submit.ViewHolder holder, int position) {

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
