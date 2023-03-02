package com.example.mycalculator;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonVolleyAPI extends AppCompatActivity {

    public static String api = "https://jsonplaceholder.typicode.com/photos";
    ArrayList<userVolleyModel> allUsersVolleyList;
    RecyclerView recyclerViewVolley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_volley_api);

        recyclerViewVolley = findViewById(R.id.recyclerviewVolley);
        recyclerViewVolley.setLayoutManager(new LinearLayoutManager(this));

        getData();
        allUsersVolleyList = new ArrayList<>();


    }

    private void getData() {

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, api,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("api", "onErrorResponse" + response);
                        try {
                            JSONArray array = new JSONArray(response);
                            for (int i = 0; i < array.length(); i++) {

                                JSONObject singleobject = array.getJSONObject(i);
                                userVolleyModel singleModel = new userVolleyModel(
                                        singleobject.getInt("albumId"),
                                        singleobject.getInt("id"),
                                        singleobject.getString("title"),
                                        singleobject.getString("url"),
                                        singleobject.getString("thumbnailUrl")
                                );
                                allUsersVolleyList.add(singleModel);
                            }
                            for(int j =0;j<allUsersVolleyList.size();j++) {
                                Log.d("CheckResponseInfo", "onResponse: " + allUsersVolleyList.get(j).albumId);
                            }
                            recyclerViewVolley.setAdapter(new userVolleyAdapter(JsonVolleyAPI.this, allUsersVolleyList));

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.e("api", "onResponse" + e.getMessage());

                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.e("api", "onErrorResponse" + error.getLocalizedMessage());
            }
        });

        queue.add(stringRequest);

    }
}