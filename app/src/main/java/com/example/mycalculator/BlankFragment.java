package com.example.mycalculator;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragment extends Fragment {

    TextView firstFragment;
    Context context;
    ImageView backbut;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private RecyclerView recyclerViewName;
    private FoodAdapter foodAdapter;
    private NameHorizontalAdapter nameHorizontalAdapter;
    private VerticalAdapter verticalAdapter;
    private ArrayList<Food> foodOrderArrayList = new ArrayList<>();
    private ArrayList<Vertical> verticalArrayList = new ArrayList<>();
    private ArrayList<NameHorizontal> nameHorizontalArrayList = new ArrayList<>();

    public BlankFragment() {
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootview = inflater.inflate(R.layout.fragment_blank, container, false);
        context = this.getContext();
//        backbut = backbut.findViewById(R.id.backbuttonbut);
//
//
//        backbut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                getActivity().onBackPressed();
//            }
//        });


        // firstFragment=rootview.findViewById(R.id.firstFragment);

//        firstFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "This is my Home Fragrment!",
//                        Toast.LENGTH_LONG).show();
//            }
//        });
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
        verticalArrayList.add(new Vertical("Pasta", "Italian", "Bangalore", "3.4",
                "300/-", R.drawable.pasta));
        verticalArrayList.add(new Vertical("Samosa", "Fast Food", "Raipur", "4.4",
                "20/-", R.drawable.samosa));


        recyclerView = rootview.findViewById(R.id.recyclerviewfood);
        foodAdapter = new FoodAdapter(context, foodOrderArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(food_order.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);


        recyclerView1 = rootview.findViewById(R.id.recyclerviewVertical);
        recyclerView1.hasFixedSize();
        verticalAdapter = new VerticalAdapter(context, verticalArrayList);
        recyclerView1.setNestedScrollingEnabled(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(context));
        recyclerView1.setAdapter(verticalAdapter);

        nameHorizontalArrayList = new ArrayList<>();
        String[] nameArray = {"John", "Jane", "Jim", "Joe", "Jessica", "Jason", "Jordan", "Julie", "Jack", "Jill",
                "Brad", "Bridget", "Bill", "Beth", "Ben", "Bob", "Brandon", "Bryan", "Brian", "Brooke",
                "Chris", "Cindy", "Carla", "Carlos", "Cameron", "Carrie", "Casey", "Craig", "Cathy", "Charlie"};
        for (String name : nameArray) {
            nameHorizontalArrayList.add(new NameHorizontal(name));
        }


        recyclerViewName = rootview.findViewById(R.id.recylcerViewName2);
        nameHorizontalAdapter = new NameHorizontalAdapter(context, nameHorizontalArrayList);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);
        recyclerViewName.setLayoutManager(layoutManager2);
        recyclerViewName.setAdapter(nameHorizontalAdapter);


        return rootview;

    }
}