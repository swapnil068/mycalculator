package com.example.mycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameHorizontalAdapter extends RecyclerView.Adapter<NameHorizontalAdapter.NameHorizontalViewHolder> {
    public static int selectedItem = -1;
    private final ArrayList<NameHorizontal> dataListVerticalName;
    Context context;


    public NameHorizontalAdapter(Context context, ArrayList<NameHorizontal> dataListVerticalName) {
        this.dataListVerticalName = dataListVerticalName;
        this.context = context;
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
    public NameHorizontalAdapter.NameHorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name_horizontal, parent, false);
        return new NameHorizontalAdapter.NameHorizontalViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull NameHorizontalAdapter.NameHorizontalViewHolder holder, int position) {

        holder.namefield.setText(dataListVerticalName.get(position).getTvName1());

        if (selectedItem == position) {
            holder.cardname.setCardBackgroundColor(ContextCompat.getColor(context, R.color.LightBlue));
//            holder.itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.LightBlue));
            holder.namefield.setTextColor(ContextCompat.getColor(context, R.color.white));
        }
        else {
            holder.cardname.setCardBackgroundColor(ContextCompat.getColor(context, R.color.white));
//            holder.itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.white));
            holder.namefield.setTextColor(ContextCompat.getColor(context, R.color.black));


        }

    }

    @Override
    public int getItemCount() {

        return dataListVerticalName.size();
    }

    class NameHorizontalViewHolder extends RecyclerView.ViewHolder {

        TextView namefield;
        CardView cardname;

        public NameHorizontalViewHolder(@NonNull View itemView) {
            super(itemView);

            namefield = itemView.findViewById(R.id.NameField);
            cardname = itemView.findViewById(R.id.cardname);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, "This is my Toast message!" + selectedItem,
                            Toast.LENGTH_LONG).show();
                    int position = getBindingAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        selectedItem = position;
                        notifyDataSetChanged();

                    }

                }
            });

        }
    }
}
