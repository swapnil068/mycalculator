package com.example.mycalculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static Character op = 'k';
    private static double ans = 0.0;
    private final boolean isFirstStart = true;
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    Context context;
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv0, tvCalculator1, tvAC, dot, multiply, add,
            divide, sub, back, sqRoot, percentage, equalto, tvCalculator2, shopfood, aboutus, myprofile, chat;
    ImageView hist, toolbarImageView;
    ArrayList<History> history = new ArrayList<>();
    NavigationView navigationView;
    private String calc_prev_string;
//
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) //get the id which is an int
//        {
//            case R.id.shop:  // check if its the menu item next selected
//                // Single menu item is selected do something
//                // Ex: launching new activity/screen or show alert message
//                Toast.makeText(MainActivity.this, "Next Selected", Toast.LENGTH_SHORT).show();
//
//                break;
//
//
//        }
//        return super.onOptionsItemSelected(item);
//
//    }
//
//
//
//    public boolean onCreateOptionsMenu (Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.navigation_menu , menu) ;
//        return true;
//    }

//    public boolean onNavigationItemSelected ( @NonNull MenuItem item) {
//
//
//        // Handle navigation view item clicks here.
//        int id = item.getItemId() ;
//        if (id == R.id. shop ) {Toast.makeText(MainActivity.this, "Shop Selected", Toast.LENGTH_SHORT).show();
//
//        } else if (id == R.id.Profile ) {Toast.makeText(MainActivity.this, "Profile Selected", Toast.LENGTH_SHORT).show();
//        } else if (id == R.id. chat ) {
//        } else if (id == R.id.contactus ) {
//        } else if (id == R.id. aboutus ) {
//        } else if (id == R.id. review ) {
//        }else if (id == R.id. share ){
//        }else if(id==R.id.powered){
//
//        }
//
//        return true;
//    }
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        tv0 = findViewById(R.id.tvZero);
        tv1 = findViewById(R.id.one);
        tv2 = findViewById(R.id.two);
        tv3 = findViewById(R.id.three);
        tv4 = findViewById(R.id.four);
        tv5 = findViewById(R.id.five);
        tv6 = findViewById(R.id.six);
        tv7 = findViewById(R.id.seven);
        tv8 = findViewById(R.id.eight);
        tv9 = findViewById(R.id.nine);
        tvAC = findViewById(R.id.AC);
        dot = findViewById(R.id.dot);
        multiply = findViewById(R.id.multiply);
        add = findViewById(R.id.add);
        divide = findViewById(R.id.divide);
        sub = findViewById(R.id.subtract);
        back = findViewById(R.id.backspace);
        sqRoot = findViewById(R.id.sqRoot);
        percentage = findViewById(R.id.percentage);
        tvCalculator1 = findViewById(R.id.tvCalculator1);
        equalto = findViewById(R.id.equalto);
        sqRoot = findViewById(R.id.sqRoot);
        tvCalculator2 = findViewById(R.id.tvCalculator2);

        shopfood = findViewById(R.id.shopfood);
        hist = findViewById(R.id.history);
        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbarImageView = findViewById(R.id.toolbarImageView);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.nav_open, R.string.nav_close);

//        View headerview = navigationView.getHeaderView(0);
//        ImageView circle = (ImageView) headerview.findViewById(R.id.Circle);
//        ImageView right = (ImageView) headerview.findViewById(R.id.right);
//        LinearLayout header = (LinearLayout) headerview.findViewById(R.id.header);


        shopfood = findViewById(R.id.shopfood);
        aboutus = findViewById(R.id.aboutus);
        myprofile = findViewById(R.id.myProfile);
        chat = findViewById(R.id.chatWithUs);

        tv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("0", true);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("1", true);

            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("2", true);

            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("3", true);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("4", true);

            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("5", true);

            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("6", true);

            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("7", true);

            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("8", true);

            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("9", true);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String calc_prev_string = tvCalculator1.getText().toString();
                if (calc_prev_string.length() >= 1) {
                    calc_prev_string = calc_prev_string.substring(0, calc_prev_string.length() - 1);
                    tvCalculator1.setText(calc_prev_string);
                }
                if (calc_prev_string.length() < 1) {
                    tvCalculator1.setText("0");
                }

            }


        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("*", false);
                op = '*';

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("+", false);

                op = '+';
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("-", false);
                op = '-';
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText("/", false);
                op = '/';
            }
        });
        toolbarImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        percentage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DisplayText("%", false);
//                DecimalFormat df = new DecimalFormat();
//
//                double per = 0;
//                try {
//                  //  per = Math. (df.parse(calc_prev_string).doubleValue());
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//                tvCalculator2.setText((String.valueOf(per)));
//
//
//            }
//        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayText(".", false);
                op = '.';
            }
        });

        tvAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculator1.setText("");
                tvCalculator2.setText("");
                ans = 0.0;
            }
        });

        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EqualToWorking();
                history.add(new History(calc_prev_string, ans));
                Log.d("testt", calc_prev_string);
                Log.d("testt", String.valueOf(ans));

            }

        });

        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity2.class);
                i.putParcelableArrayListExtra("history", history);
                startActivity(i);

            }
        });

        sqRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat();

                double sq = 0;
                try {
                    sq = Math.sqrt(df.parse(calc_prev_string).doubleValue());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                tvCalculator2.setText((String.valueOf(sq)));

            }
        });

        shopfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, food_order.class);
                startActivity(intent);


            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, JsonApi.class);
                startActivity(i);

            }
        });

        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, JsonVolleyAPI.class);
                startActivity(i);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, fetchData.class);
                startActivity(i);
            }
        });


//        header.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
//        right.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Arrow", Toast.LENGTH_SHORT).show();
//
//            }
//        }));
//        login.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
//
//            }
//        }));
//        circle.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
//
//            }
//        }));

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //   getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setTitle(null);
        setupToolbar();
//       navigationView.setNavigationItemSelectedListener( this ) ;

//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
//
//        {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()){
//                    case R.id.nav_foodItems:  System.out.println("item 1 selected") ; break;
//                    case R.id.nav_settings: System.out.println("item 2 selected") ; break;
//                }
//                return true;
//            }
//        });
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


    }


    private void DisplayText(String strValue, boolean is_number) {

        calc_prev_string = tvCalculator1.getText().toString();
        Log.d("test", "value: " + calc_prev_string);
        Log.d("Is Number ", "value: " + is_number);


        if (calc_prev_string.length() == 0) {
            Log.d("test", "value: " + "check empty string");

            if (is_number == true) {
                Log.d("test", "value: " + "Valid Number");
                calc_prev_string = calc_prev_string.concat(strValue);
                tvCalculator1.setText(calc_prev_string);
                Log.d("Before opArray", "value : " + strValue);

            } else {

// is operator
            }

        } else {

            //string is not empty
            String last_character = getLastCharacterOfString(calc_prev_string);
            Boolean is_last_char_operator = isLastCharacterOperator(last_character);

            if (!is_number) {//Operator


                if (is_last_char_operator) {
                    Log.d("test", "value" + "Operator Clicked");

                    //Operator


                    if (last_character.equals(strValue)) {
                        Log.d("test", "value" + " Last character and current operator both are same ");
                        //Not allowed to click


                    } else {
                        Log.d("test", "value: " + "Last operator and current operator both are different");

                        String new_string = calc_prev_string.substring(0, calc_prev_string.length() - 1);
                        calc_prev_string = new_string.concat(strValue);
                        tvCalculator1.setText(calc_prev_string);


                    }
                } else {
                    calc_prev_string = calc_prev_string.concat(strValue);
                    tvCalculator1.setText(calc_prev_string);

                    if (ans > 0) {
                        Log.d("test", "value: " + ans);
                        calc_prev_string = "";
                        String newstring = calc_prev_string.concat(String.valueOf(ans) + (op));
                        tvCalculator1.setText(newstring);
                        tvCalculator2.setText("0");


                    }

                }

            } else {
                calc_prev_string = calc_prev_string.concat(strValue);
                tvCalculator1.setText(calc_prev_string);


            }
        }
    }

    private Boolean isLastCharacterOperator(String lastCharacter) {
        return lastCharacter.equalsIgnoreCase("+") || lastCharacter.equalsIgnoreCase("-") || lastCharacter.equalsIgnoreCase("*") || lastCharacter.equalsIgnoreCase("/");
    }

    private String getLastCharacterOfString(String calc_prev_string) {
        String last_character = String.valueOf(calc_prev_string.charAt(calc_prev_string.length() - 1));
        System.out.println("Last Char -> " + last_character);
        return last_character;

    }

    private void EqualToWorking() {

        Calculator calc = new Calculator(tvCalculator1.getText().toString());
        ans = calc.evalExpr();
        tvCalculator2.setText(String.valueOf(ans));


    }


    private void setupToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        //getSupportActionBar().hide();
        ImageView imageView = findViewById(R.id.toolbarImageView);
        TextView toolbaartext = findViewById(R.id.toolbar_text);
        toolbaartext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

}

   /* Double result = Double.parseDouble(firstChar);
    Double result2 = Double.parseDouble(lastChar);
            if (op == '+') {
        tvCalculator2.setText(String.valueOf(result + result2));

    } else if (op == '-') {
        tvCalculator1.setText(String.valueOf(result - result2));

    } else if (op == '*') {
        tvCalculator1.setText(String.valueOf(result *result2));


    } else if (op == '/') {
        tvCalculator1.setText(String.valueOf(result / result2));


    }

            tvCalculator2.setText(tvCalculator1.getText().toString());
}*/


//    /*private void EqualToWorking() {
//
//
//        Log.d("test", "Equal to is working " + calc_prev_string + " OP : " + op);
//        // Log.d("test", "value: String Count >>>> " + strcount);
//
//        char[] tokens = calc_prev_string.toCharArray();
//
//        // Stack for numbers: 'values'
//        Stack<Integer> values = new Stack<Integer>();
//        Log.d("test", "values >>>> " + values);
//
//
//        // Stack for operaters: 'ops'
//        Stack<Character> ops = new Stack<Character>();
//        Log.d("test", "ops >>>> " + ops);
//
//
//        for (int i = 0; i < tokens.length; i++) {
//
//
//            Log.d("test", "\n hey length" + tokens.length + "\n i ki value " + i);
//
//
//            // Current token is a number, push it to stack for numbers
//            if (tokens[i] >= '0' && tokens[i] <= '9') {
//                StringBuffer sbuf = new StringBuffer();
//                // There may be more than one digits in number
//                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
//                    sbuf.append(tokens[i++]);
//                }
//                values.push(Integer.parseInt(sbuf.toString()));
//                Log.d("test", "values >>>> " + values);
//
//            }
//
//            // Current token is an operator.
//            else if (tokens[i] == '+' || tokens[i] == '-' ||
//                    tokens[i] == '*' || tokens[i] == '/') {
//                // While top of 'ops' has same or greater precedence to current
//                // token, which is an operator. Apply operator on top of 'ops'
//                // to top two elements in values stack
//                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
//                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
//
//                // Push current token to 'ops'.
//                ops.push(tokens[i]);
//                Log.d("test", "ops >>>> " + ops);
//
//            }
//        }*/
//
//        // Entire expression has been parsed at this point, apply remaining
//        // ops to remaining values
//        while (!ops.empty())
//            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
//
//
//    }
//
//
//    public Boolean hasPrecedence(char op1, char op2) {
//
//        if (op2 == '(' || op2 == ')')
//            return false;
//        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
//            return false;
//        else
//            return true;
//
//
//    }
//
//    public int applyOp(char op, int a, int b) {
//        switch (op) {
//            case '+':
//                return a + b;
//            case '-':
//                return a - b;
//            case '*':
//                return a * b;
//            case '/':
//                if (b == 0)
//                    throw new
//                            IllegalArgumentException("Cannot divide by zero");
//                return a / b;
//        }
//        return 0;
//
//    }
