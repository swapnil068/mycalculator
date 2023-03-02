package com.example.mycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {

    Context context;
    private final ArrayList<History> dataList;

    public HistoryAdapter(Context context, ArrayList<History> dataList) {
        this.dataList = dataList;
        this.context = context;
    }

    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview, parent, false);
        return new HistoryViewHolder(view);
    }

    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {

        holder.tvh1.setText(String.valueOf(dataList.get(position).getTvh1()));
        holder.tvh2.setText(String.valueOf(dataList.get(position).getTvh2()));

    }

    @Override

    public int getItemCount() {
        return dataList.size();

    }

    static class HistoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvh1, tvh2;

        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvh1 = itemView.findViewById(R.id.tvh1);
            tvh2 = itemView.findViewById(R.id.tvh2);

        }
    }
}
