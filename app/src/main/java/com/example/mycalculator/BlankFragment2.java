package com.example.mycalculator;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragment2 extends Fragment {

    Context context;
    private RecyclerView recyclerViewName;
    private NameAdapter nameAdapter;
    private ArrayList<Name> nameArrayList = new ArrayList<>();
    private View customSearchView;
    private EditText searchEditText;
    private ImageView clearIcon;



    public BlankFragment2() {
        // require a empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_blank2, container, false);

//        customSearchView = LayoutInflater.from(customSearchView.getContext()).inflate(R.layout.search_view, null);
//        searchEditText = customSearchView.findViewById(R.id.search_field);
//        clearIcon = customSearchView.findViewById(R.id.clear_icon);

        nameArrayList = new ArrayList<>();
        String[] nameArray = {"John", "Jane", "Jim", "Joe", "Jessica", "Jason", "Jordan", "Julie", "Jack", "Jill",
                "Brad", "Bridget", "Bill", "Beth", "Ben", "Bob", "Brandon", "Bryan", "Brian", "Brooke",
                "Chris", "Cindy", "Carla", "Carlos", "Cameron", "Carrie", "Casey", "Craig", "Cathy", "Charlie"};
        for (String name : nameArray) {
            nameArrayList.add(new Name(name));
        }

//        nameArrayList.add(new Name("Khushii"));
//        nameArrayList.add(new Name("Mihir"));
//        nameArrayList.add(new Name("Aniket"));
//        nameArrayList.add(new Name("Riti"));
//        nameArrayList.add(new Name("Swapnil"));
//        nameArrayList.add(new Name("Aitad"));
//        nameArrayList.add(new Name("Janhvi"));
//        nameArrayList.add(new Name("Priya"));
//        nameArrayList.add(new Name("Vishal"));
//        nameArrayList.add(new Name("Rishi"));
//        nameArrayList.add(new Name("Tanuj"));
//        nameArrayList.add(new Name("Aman"));
//        nameArrayList.add(new Name("Prashnat"));
//        nameArrayList.add(new Name("Jessica"));
//        nameArrayList.add(new Name("Siddham"));
//        nameArrayList.add(new Name("Jessica"));


        recyclerViewName = rootview.findViewById(R.id.recyclerviewName);
        nameAdapter = new NameAdapter(context, nameArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        recyclerViewName.setAdapter(nameAdapter);
        recyclerViewName.setLayoutManager(layoutManager);


        return rootview;
    }


}