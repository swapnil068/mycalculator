package com.example.mycalculator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;


public class BlankFragment3 extends Fragment {

//    Context context;
//    private RecyclerView recyclerViewprofile;
//    private ProfileAdapter profileAdapter;
//    private ArrayList<Profile> profileArrayList = new ArrayList<>();

    private final int GALLERY_REQUEST_CODE = 1000;
    ImageView imgCamera;
    ImageView imgGallery;
    private ActivityResultLauncher<String> pickImageLauncher;

    public BlankFragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_blank3, container, false);

        imgCamera = rootview.findViewById(R.id.imgCameralfhgfhefd);
        imgGallery = rootview.findViewById(R.id.imgGallery);

        pickImageLauncher = registerForActivityResult(new ActivityResultContracts.GetContent(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri uri) {
                        if (uri != null) {
                            imgGallery.setImageURI(uri);
                        }
                    }
                });


        imgCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Image Clicked", Toast.LENGTH_LONG).show();
                Intent igallery = new Intent(Intent.ACTION_PICK);
                igallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                pickImageLauncher.launch("image/*");

                //startActivityForResult(igallery, GALLERY_REQUEST_CODE);
            }
        });
        imgGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


//        profileArrayList = new ArrayList<>();
//
//
//
//        recyclerViewprofile = rootview.findViewById(R.id.recyclerviewprofile);
//        profileAdapter = new ProfileAdapter(context, profileArrayList);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),
//                LinearLayoutManager.VERTICAL, false);
//        recyclerViewprofile.setLayoutManager(layoutManager);
//        recyclerViewprofile.setAdapter(profileAdapter);


        return rootview;

    }

    public void onActivityResult(int requestcode, int resultcode, Intent data) {
        super.onActivityResult(requestcode, requestcode, data);


        if (resultcode == Activity.RESULT_OK) {

            if (requestcode == GALLERY_REQUEST_CODE) {
                imgGallery.setImageURI(data.getData());
            }
        }

    }

}