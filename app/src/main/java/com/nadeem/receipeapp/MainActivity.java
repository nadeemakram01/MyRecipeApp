package com.nadeem.receipeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * Create constants that can be used by all other activities in
     * this project to represent the data that we are passing
     */


    public static final String FOOD_NAME = "FOOD_NAME";
    public static final String FOOD_DESC = "FOOD_DESC";
    public static final String FOOD_ING = "FOOD_ING";
    public static final String FOOD_IMAGE = "FOOD_IMAGE";


    /**
     * onCreate()
     * This method is the first method that is run in ANY activity
     * we will do 90% of our coding inside of this method
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * setContentView inflat the to the screen for the user
         * to see.
         * R.layout.activity_main is tactivity_main.xml
         */

        setContentView(R.layout.activity_main);

        /**
         * programming always start here
         */

        Button pizzaButton = (Button) findViewById(R.id.pizzaButton);
        Button cookieButton = (Button) findViewById(R.id.cookieButton);
        Button curryButton = (Button) findViewById(R.id.curryButton);
        Button soupButton = (Button) findViewById(R.id.soupButton);

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FoodActivity.class);

                // We want to package the name, image, desc, ing

                i.putExtra(FOOD_NAME, getResources().getString(R.string.food1));
                i.putExtra(FOOD_DESC, getResources().getString(R.string.description1));
                i.putExtra(FOOD_ING, getResources().getString(R.string.ingredient1));
                i.putExtra(FOOD_IMAGE, R.drawable.pizza);

                //Start the activity


                startActivity(i);

            }
        });


        cookieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, FoodActivity.class);
                i.putExtra(FOOD_NAME, getResources().getString(R.string.food2));
                i.putExtra(FOOD_DESC, getResources().getString(R.string.description2));
                i.putExtra(FOOD_ING, getResources().getString(R.string.ingredient2));
                i.putExtra(FOOD_IMAGE, R.drawable.cookies);

                //Start the activity


                startActivity(i);



            }
        });


        curryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, FoodActivity.class);
                i.putExtra(FOOD_NAME, getResources().getString(R.string.food3));
                i.putExtra(FOOD_DESC, getResources().getString(R.string.description3));
                i.putExtra(FOOD_ING, getResources().getString(R.string.ingredient3));
                i.putExtra(FOOD_IMAGE, R.drawable.curry);

                //Start the activity


                startActivity(i);



            }
        });


        soupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, FoodActivity.class);
                i.putExtra(FOOD_NAME, getResources().getString(R.string.food4));
                i.putExtra(FOOD_DESC, getResources().getString(R.string.description4));
                i.putExtra(FOOD_ING, getResources().getString(R.string.ingredient4));
                i.putExtra(FOOD_IMAGE, R.drawable.soup);

                //Start the activity


                startActivity(i);



            }
        });




        }
}
