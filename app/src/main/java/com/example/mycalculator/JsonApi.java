package com.example.mycalculator;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JsonApi extends AppCompatActivity {
    public static String api = "https://jsonplaceholder.typicode.com/photos/";
    String urlImage = "https://bestprofilepictures.com/wp-content/uploads/2021/07/Aesthetic-DP-851x1024.jpg";

    Context context;
    List<userModel> allUsersList;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_api);

        RetrofitInstance.getInstance().apiInterface.getUsers().enqueue(new Callback<List<userModel>>() {
            @Override
            public void onResponse(Call<List<userModel>> call, Response<List<userModel>> response) {
                allUsersList = response.body();
                recyclerView.setAdapter(new userAdapter(JsonApi.this, allUsersList));

            }

            @Override
            public void onFailure(Call<List<userModel>> call, Throwable t) {

                Log.e("api", "onFailure: " + t.getLocalizedMessage());

            }
        });

        recyclerView = findViewById(R.id.recyclerviewJson);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}