//package com.example.mycalculator;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//public class BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
//
//
//    BottomNavigationView bottomNavigationView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bottom_navigation);
//
//        bottomNavigationView=findViewById(R.id.bottomNavigationView);
//       bottomNavigationView.setOnNavigationItemSelectedListener(this);
//        bottomNavigationView.setSelectedItemId(R.id.home);
//
//
//
//    }
//    BlankFragment blankFragment=new BlankFragment();
//    BlankFragment2 blankFragment2=new BlankFragment2();
//    BlankFragment3 blankFragment3=new BlankFragment3();
//    BlankFragment4 blankFragment4=new BlankFragment4();
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//         switch (item.getItemId()) {
////            case R.id.persom:
////                getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment3).commit();
////                return true;
////
////            case R.id.home:
////                getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment).commit();
////                return true;
////
////            case R.id.Settings:
////                getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment4).commit();
////                return true;
////            case R.id.search:
////                getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment2).commit();
////                return true;
//        }
//        return false;
//    }
//
//
//    }
