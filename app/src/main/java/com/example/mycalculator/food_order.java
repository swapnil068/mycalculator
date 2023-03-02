package com.example.mycalculator;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class food_order extends AppCompatActivity {

    Context context;
    LinearLayout home;
    LinearLayout settings;
    LinearLayout search;
    LinearLayout person;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private FoodAdapter foodAdapter;
    private VerticalAdapter verticalAdapter;
    private ArrayList<Food> foodOrderArrayList = new ArrayList<>();
    private ArrayList<Vertical> verticalArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);
        context = this;


        //bottomNavigationView = findViewById(R.id.bottomNavigationView);


        foodOrderArrayList = new ArrayList<>();

        foodOrderArrayList.add(new Food("Cold coffee", "Raipur", "150/-", R.drawable.download));
        foodOrderArrayList.add(new Food("Pizza", "Ahmedabad", "200/-", R.drawable.pizzza));
        foodOrderArrayList.add(new Food("Vadapav", "Mumbai", "30/-", R.drawable.vadapav));
        foodOrderArrayList.add(new Food("Pasta", "Bangalore", "300 /-", R.drawable.pasta));
        foodOrderArrayList.add(new Food("Chowmein", "Raipur", "120 /-", R.drawable.chow));
        foodOrderArrayList.add(new Food("Samosa", "Raipur", "20 /-", R.drawable.samosa));

        verticalArrayList = new ArrayList<>();

        verticalArrayList.add(new Vertical("Pizza", "FastFood", "Ahemdabad", "4.2",
                "200/-", R.drawable.pizzza));
        verticalArrayList.add(new Vertical("Cold Coffee", "Beverage", "Raipur", "4.5",
                "150/-", R.drawable.download));
        verticalArrayList.add(new Vertical("Chowmein", "Fast Food", "Raipur", "4.3",
                "120/-", R.drawable.chow));
        verticalArrayList.add(new Vertical("Vadapav", "Fast Food", "Mumbai", "4.4",
                "30/-", R.drawable.vadapav));
        verticalArrayList.add(new Vertical("Pasta", "Italian", "Banglore", "3.4",
                "300/-", R.drawable.pasta));
        verticalArrayList.add(new Vertical("Samosa", "Fast Food", "Raipur", "4.4",
                "20/-", R.drawable.samosa));

        recyclerView = findViewById(R.id.recyclerviewfood);
        foodAdapter = new FoodAdapter(context, foodOrderArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(food_order.this,
                LinearLayoutManager.HORIZONTAL, false);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(food_order.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);

//
//        recyclerView1=findViewById(R.id.recyclerviewVertical)
        verticalAdapter = new VerticalAdapter(context, verticalArrayList);
//        LinearLayoutManager layoutManager1=new LinearLayoutManager(food_order.this
//                ,LinearLayoutManager.VERTICAL,false);
//        recyclerView1.setLayoutManager(layoutManager1);
//        recyclerView1.setAdapter(verticalAdapter);

        recyclerView1 = findViewById(R.id.recyclerviewVertical);
        recyclerView1.hasFixedSize();
        recyclerView1.setNestedScrollingEnabled(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(context));
        recyclerView1.setAdapter(verticalAdapter);

        BlankFragment blankFragment = new BlankFragment();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        BlankFragment3 blankFragment3 = new BlankFragment3();
        BlankFragment4 blankFragment4 = new BlankFragment4();
        home = findViewById(R.id.home);
        settings = findViewById(R.id.settings);
        search = findViewById(R.id.search);
        person = findViewById(R.id.person);

        getSupportFragmentManager().beginTransaction().add(R.id.frameContainer, blankFragment).commit();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, blankFragment).commit();


            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, blankFragment4).commit();


            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, blankFragment2).commit();


            }
        });

        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, blankFragment3).commit();

            }
        });

    }

    public void onBackPressed() {
        List<Fragment> all_frags = getSupportFragmentManager().getFragments();
        if (all_frags != null) {
            if (all_frags.size() == 0) {
                super.onBackPressed();
            } else {
                for (Fragment frag : all_frags) {
                    getSupportFragmentManager().beginTransaction().remove(frag).commit();
                }
            }
        } else {
            super.onBackPressed();
        }
    }
}