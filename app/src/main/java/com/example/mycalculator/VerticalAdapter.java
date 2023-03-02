package com.example.mycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {

    private final ArrayList<Vertical> dataList2;
    Context context;

    public VerticalAdapter(Context context, ArrayList<Vertical> dataList2) {
        this.dataList2 = dataList2;
        this.context = context;
    }



    @NonNull
    @Override
    public VerticalAdapter.VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_vertical, parent, false);
        return new VerticalAdapter.VerticalViewHolder(view);

    }

    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalAdapter.VerticalViewHolder holder, int position) {
        holder.foodName1.setText(dataList2.get(position).getTv1());
        holder.foodType.setText(dataList2.get(position).getTv2());
        holder.foodLocation1.setText(dataList2.get(position).getTv3());
        holder.foodrating.setText(dataList2.get(position).getTv4());
        holder.foodRate1.setText(dataList2.get(position).getTv5());
        holder.imageFood.setImageResource(dataList2.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return dataList2.size();
    }

    public class VerticalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageFood;
        TextView foodName1, foodLocation1, foodRate1, foodrating, foodType;


        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName1 = itemView.findViewById(R.id.foodNameVertical);
            foodrating = itemView.findViewById(R.id.foodRating);
            foodLocation1 = itemView.findViewById(R.id.foodLocationVertical);
            foodRate1 = itemView.findViewById(R.id.foodRateVertical);
            foodType = itemView.findViewById(R.id.foodType);
            imageFood = itemView.findViewById(R.id.imageVerical);

        }
    }
}
