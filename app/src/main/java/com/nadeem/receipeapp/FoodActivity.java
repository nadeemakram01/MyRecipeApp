package com.nadeem.receipeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.nadeem.receipeapp.MainActivity.FOOD_DESC;
import static com.nadeem.receipeapp.MainActivity.FOOD_IMAGE;
import static com.nadeem.receipeapp.MainActivity.FOOD_ING;
import static com.nadeem.receipeapp.MainActivity.FOOD_NAME;

public class FoodActivity extends AppCompatActivity {

    String foodName = "";
    String description = "";
    String ingredient = "";
    int image;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        /**
         * Step1)
         * Grab the button and link them to the code
         * Using findViewById() we can grab any XML element and assign it to
         * a java object so that we may interface with it
         */

        Button descriptionButton = (Button) findViewById(R.id.description);
        Button ingredientButton = (Button) findViewById(R.id.ingredients);

        //Grab the extra information from the intent that launched the
        // activity

        Bundle extra = getIntent().getExtras();
        //If the extra has information in it
        if(extra != null) {
            //Grab the extra/letter with the label FOOD_NAME
            //store its value inside of name

            foodName = extra.getString(FOOD_NAME);
            description = extra.getString(FOOD_DESC);
            ingredient = extra.getString(FOOD_ING);
            image = extra.getInt(FOOD_IMAGE);


        }

        // Set the title and the image for the food

        TextView foodNameTV = (TextView) findViewById(R.id.foodTitle);
        foodNameTV.setText(foodName);
        ImageView imageView = (ImageView) findViewById(R.id.foodImage);
        imageView.setImageResource(image);

        /**
         * We added an onClickListener ( Inner Class)
         */

//        descriptionButton.setOnClickListener(new DescriptionClickEvent());


        /**
         * We added an onClickListener (Anonymous Inner Class)
         */

      ingredientButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(FoodActivity.this, IngredientActivity.class);
              i.putExtra(FOOD_NAME, foodName);

              i.putExtra(FOOD_ING, ingredient);
              i.putExtra(FOOD_IMAGE, image);

              //Start the activity


              startActivity(i);
          }
      });


        descriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FoodActivity.this, DescriptionActivity.class);
                i.putExtra(FOOD_NAME, foodName);

                i.putExtra(FOOD_DESC, description);
                i.putExtra(FOOD_IMAGE, image);

                //Start the activity


                startActivity(i);
            }
        });









    }
}
