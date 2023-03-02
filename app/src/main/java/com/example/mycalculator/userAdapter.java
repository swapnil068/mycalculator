package com.example.mycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userViewHolder> {
    JsonApi jsonApi;
    List<userModel> alluserList;
    String urlImage = "https://bestprofilepictures.com/wp-content/uploads/2021/07/Aesthetic-DP-851x1024.jpg";

    Context context;

    public userAdapter(JsonApi jsonApi, List<userModel> allUsersList) {
        this.jsonApi = jsonApi;
        this.alluserList = allUsersList;
    }


    @NonNull
    @Override
    public userAdapter.userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new userViewHolder(LayoutInflater.from(jsonApi).inflate(R.layout.item_user, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull userAdapter.userViewHolder holder, int position) {

        Glide.with(jsonApi)
                .load(urlImage)
                .centerCrop()
                .error(R.drawable.imagenotfound).into(holder.imageAPI)
        ;
        holder.textalbumID.setText(Integer.toString(alluserList.get(position).getAlbumId()));
        holder.textID.setText(Integer.toString(alluserList.get(position).getId()));
        holder.textTitle.setText(alluserList.get(position).getTitle());
        holder.textURL.setText(alluserList.get(position).getUrl());
        holder.textThumbnailUrl.setText(alluserList.get(position).getThumbnailUrl());
        holder.imageAPI.setImageResource(alluserList.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return alluserList.size();
    }

    class userViewHolder extends RecyclerView.ViewHolder {
        TextView textalbumID, textID, textTitle, textURL, textThumbnailUrl;
        ImageView imageAPI;

        public userViewHolder(@NonNull View itemView) {
            super(itemView);
            textalbumID = itemView.findViewById(R.id.albumID);
            textID = itemView.findViewById(R.id.ID);
            textTitle = itemView.findViewById(R.id.titile);
            textURL = itemView.findViewById(R.id.URL);
            textThumbnailUrl = itemView.findViewById(R.id.thumbnailUrl);
            imageAPI = itemView.findViewById(R.id.imageAPI);

        }

    }
}
