package com.example.mycalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.awt.font.TextAttribute;


public class BlankFragment4 extends Fragment {


    public BlankFragment4() {
        // Required empty public constructor
    }
    TextView settingsFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View rootview =inflater.inflate(R.layout.fragment_blank4, container, false);

      settingsFragment=rootview.findViewById(R.id.settingsFragment);
      settingsFragment.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(getActivity(), "This is my Settings Fragrment!",
                      Toast.LENGTH_LONG).show();
          }
      });


      return rootview;
    }
}