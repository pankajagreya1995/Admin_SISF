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

public class Adapter_fee_details   extends RecyclerView.Adapter<Adapter_fee_details.ViewHolder> {
    List<Cons_Batch> list;
    Context con;

    public Adapter_fee_details(List<Cons_Batch> list, Context con) {
        this.list = list;
        this.con = con;
    }


    @NonNull
    @Override
    public Adapter_fee_details.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_fee_details, parent, false);
        Adapter_fee_details.ViewHolder viewHolder = new Adapter_fee_details.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_fee_details.ViewHolder holder, int position) {

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

