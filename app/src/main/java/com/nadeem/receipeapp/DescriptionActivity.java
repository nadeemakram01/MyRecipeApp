package com.nadeem.receipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.nadeem.receipeapp.MainActivity.FOOD_DESC;
import static com.nadeem.receipeapp.MainActivity.FOOD_IMAGE;
import static com.nadeem.receipeapp.MainActivity.FOOD_NAME;

public class DescriptionActivity extends AppCompatActivity {

    String name = "";
    int image = 0;
    String desc = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Bundle extra = getIntent().getExtras();
         if(extra != null) {
             // Grab the values from the intent

             name = extra.getString(FOOD_NAME);

            image = extra.getInt(FOOD_IMAGE);
            desc = extra.getString(FOOD_DESC);

            }

            //Set the title

        TextView title = (TextView) findViewById(R.id.descriptionTitle);
         title.setText(name);

         //Set the image
        ImageView imageView = (ImageView) findViewById(R.id.descriptionImage);
        imageView.setImageResource(image);


        //Set The description

        TextView description = (TextView) findViewById(R.id.foodDescription);
        description.setText(desc);




    }
}
