package com.example.mycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {


    private  ArrayList<Name> dataListName;
    Context context;

    public NameAdapter(Context context, ArrayList<Name> dataListName) {
        this.dataListName = dataListName;
        this.context=context;
    }

    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public NameAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false);
        return new NameViewHolder(itemView);}

    @Override
    public void onBindViewHolder(@NonNull NameAdapter.NameViewHolder holder, int position) {

        holder.nameView.setText(dataListName.get(position).getTvName());

    }

    @Override
    public int getItemCount() {
        return dataListName.size();
    }


    class NameViewHolder extends RecyclerView.ViewHolder{

        TextView nameView;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView=itemView.findViewById(R.id.Name);
        }
    }

}
