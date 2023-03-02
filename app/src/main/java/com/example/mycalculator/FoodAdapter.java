package com.example.mycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private final ArrayList<Food> dataList1;
    Context context;

    public FoodAdapter(Context context, ArrayList<Food> dataList1) {
        this.dataList1 = dataList1;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardfood, parent, false);
        return new FoodAdapter.FoodViewHolder(view);
    }

    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.FoodViewHolder holder, int position) {
        holder.foodName.setText(dataList1.get(position).getTv1());
        holder.foodLocation.setText(dataList1.get(position).getTv2());
        holder.foodRate.setText(dataList1.get(position).getTv3());
        holder.imageFood.setImageResource(dataList1.get(position).getIv1());


    }

    @Override
    public int getItemCount() {
        return dataList1.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView imageFood;
        TextView foodName, foodLocation, foodRate;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.foodName);
            foodLocation = itemView.findViewById(R.id.foodLocation);
            foodRate = itemView.findViewById(R.id.foodRate);
            imageFood = itemView.findViewById(R.id.imgfood);
        }
    }
}
