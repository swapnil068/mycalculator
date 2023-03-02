package com.example.mycalculator;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userVolleyAdapter extends RecyclerView.Adapter<userVolleyAdapter.userVolleyViewHolder> {
    JsonVolleyAPI jsonVolleyAPI;
List<userVolleyModel> allUsersVolleyList;

    public userVolleyAdapter(JsonVolleyAPI jsonVolleyAPI, List<userVolleyModel> allUsersVolleyList) {
        this.jsonVolleyAPI = jsonVolleyAPI;
        this.allUsersVolleyList = allUsersVolleyList;


    }

    @NonNull
    @Override
    public userVolleyAdapter.userVolleyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userVolleyViewHolder(LayoutInflater.from(jsonVolleyAPI).inflate(R.layout.item_uservolley, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userVolleyAdapter.userVolleyViewHolder holder, int position) {
        holder.textVolley.setText(Integer.toString(allUsersVolleyList.get(position).getAlbumId()));
        Log.e("position", "onResponse"+  position);




    }

    @Override
    public int getItemCount() {
        return allUsersVolleyList.size();
    }

    class userVolleyViewHolder extends RecyclerView.ViewHolder {
        TextView textVolley;

        public userVolleyViewHolder(@NonNull View itemView) {
            super(itemView);

            textVolley = itemView.findViewById(R.id.txtVolley);
        }
    }
}
