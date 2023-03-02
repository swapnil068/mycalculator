package com.example.mycalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

public class fetchData extends AppCompatActivity {
    String input;
    String url = "http://www.omdbapi.com/?t=" + "&apikey=cebd9b53";
    Button searchh;
    TextView name, plot;
    EditText userinput;
    ImageView image;
    private RequestQueue requestQueue;

//    public void fetchData(String input, RequestQueue requestQueue) {
//        this.input = input;
//        this.requestQueue = requestQueue;
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_data);

        requestQueue = Volley.newRequestQueue(this);
//        requestQueue = new RequestQueue(new DiskBasedCache(getCacheDir(), 1024 * 1024), new BasicNetwork(new HurlStack()));


        searchh = findViewById(R.id.searchh);
        userinput = findViewById(R.id.userinput);
        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        plot = findViewById(R.id.plot);

        searchh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = userinput.getText().toString();
                Toast.makeText(getApplicationContext(), "This is my Toast message!" + input,
                        Toast.LENGTH_LONG).show();

                fetchData(input);

            }
        });

    }

    public void fetchData(String input) {
        String url = "http://www.omdbapi.com/?t=" + input + "&apikey=cebd9b53";
        Log.d("Details", "fetchData: " + url);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            if (response.getString("Response").equals("False")) {
                                name.setText("Incorrect detail");
                            } else {
                                Log.d("url", "Url" + url);

                                String movieName = response.getString("Title");
                                String moviePlot = response.getString("Plot");
                                String moviePosterUrl = response.getString("Poster");

                                Glide.with(fetchData.this)
                                        .load(moviePosterUrl)
                                        .centerCrop()
                                        .error(R.drawable.imagenotfound).into(image)
                                ;
                            }
                        } catch (JSONException e) {
                            Log.e("vol", e.getMessage());
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("vol", error.toString());
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);
        requestQueue.start();
    }
}