package com.example.mycalculator;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class activity2 extends AppCompatActivity {
    Context context;
    private RecyclerView recyclerView;
    private HistoryAdapter adapter;
    private ArrayList<History> historyArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        context = this;

        historyArrayList = getIntent().getParcelableArrayListExtra("history");
        //TextView tvh1, tvh2;


        ImageView back;

        back = findViewById(R.id.backbutton);
        back.setOnClickListener(v -> {
            finish();

        });

//        historyArrayList = new ArrayList<History>();
//        historyArrayList.add(new History(2121, 21212));
//        historyArrayList.add(new History(234324, 232441));
//        historyArrayList.add(new History(2123231, 343232));
//        historyArrayList.add(new History(745633, 1313));
//        historyArrayList.add(new History(966745, 11342));
//        historyArrayList.add(new History(854535, 5654));
//        historyArrayList.add(new History(6466, 32331));
//        historyArrayList.add(new History(1313321, 1098));
//        historyArrayList.add(new History(53442, 13131));
//        historyArrayList.add(new History(212131, 24321));
//        historyArrayList.add(new History(2132311, 3324242));
//        historyArrayList.add(new History(11112, 4233212));
//        historyArrayList.add(new History(11112, 43423));
//        historyArrayList.add(new History(54344, 1213243));
//        historyArrayList.add(new History(71921, 21311));
//        historyArrayList.add(new History(31212, 31311));
//        historyArrayList.add(new History(2323121, 54234));


//        for(int i = 0; i < 10; i++){
//
//            historyArrayList.add(new History(2121, 21212));
//        }

//        tvh1 = findViewById(R.id.tvh1);
//        tvh2 = findViewById(R.id.tvh2);


//        Log.d("test", String.valueOf(historyArrayList));
//        tvh1.setText(String.valueOf(historyArrayList));
//        Log.d("t", String.valueOf(historyArrayList));
//
//        tvh2.setText(String.valueOf(historyArrayList));
//        Log.d("t", String.valueOf(historyArrayList));
//        Log.d("t", String.valueOf(historyArrayList));


        // historyArrayList.add(new History(,));


        recyclerView = findViewById(R.id.recyclerview);
        adapter = new HistoryAdapter(context, historyArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(activity2.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }

}
