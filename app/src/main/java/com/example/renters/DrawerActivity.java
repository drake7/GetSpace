package com.example.renters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.renters.helper.CategoriesAdapter;
import com.example.renters.helper.CategoriesHelperClass;
import com.example.renters.helper.CategoryViewInterface;
import com.example.renters.helper.FeaturedHelperClass;
import com.example.renters.helper.MostViewedAdpater;
import com.example.renters.helper.MostViewedHelperClass;

import java.util.ArrayList;

public class DrawerActivity extends AppCompatActivity implements CategoryViewInterface {


    RecyclerView featuredRecyclerView,mostViewedRecycler,categoriesRecycler;
    RecyclerView.Adapter adapter;
    private GradientDrawable gradient2,gradient1,gradient3,gradient4;
    ImageView image1,image2,image3,image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_drawer);


        try {
        image1 = findViewById(R.id.image_apartment_card);


            image1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(), SignUp.class);
                    startActivity(i);
                    Toast.makeText(DrawerActivity.this, "This image is clicked", Toast.LENGTH_LONG).show();
                }
            });
        }
        catch(Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
        //
        featuredRecyclerView = findViewById(R.id.featured_recycler);
        mostViewedRecycler = findViewById(R.id.mv_recycler_view);
        categoriesRecycler = findViewById(R.id.category_recycler);
        featuredRecyclerView();
        mostViewedRecycler();
        categoriesRecycler();
    }

    private void featuredRecyclerView() {
        featuredRecyclerView.setHasFixedSize(true);
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<FeaturedHelperClass> featuredLocation=new ArrayList<>();
        featuredLocation.add(new FeaturedHelperClass(R.drawable.image5,"basement","images for the basement "));
        featuredLocation.add(new FeaturedHelperClass(R.drawable.image2,"apartment","images for the basement "));
        featuredLocation.add(new FeaturedHelperClass(R.drawable.image3,"flats","images for the basement"));
        featuredLocation.add(new FeaturedHelperClass(R.drawable.image5,"basement","images for the basement"));
        adapter = new com.example.renters.helper.FeaturedAdapter(featuredLocation);

        featuredRecyclerView.setAdapter(adapter);
    }
    private void mostViewedRecycler() {
        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image1, "West's"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image2, "Surrey"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image3, "J."));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image4, "Vancouver"));
        adapter = new MostViewedAdpater(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);
    }

    private void categoriesRecycler() {
        //All Gradients
        gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});
        ArrayList<CategoriesHelperClass> categoriesHelperClasses = new ArrayList<>();
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient1, R.drawable.home, "Home"));
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient2, R.drawable.apartment, "Apartment"));
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient3, R.drawable.basement, "Basement"));
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient4, R.drawable.flats, "Flats"));
        categoriesRecycler.setHasFixedSize(true);
        adapter = new CategoriesAdapter(categoriesHelperClasses,this);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoriesRecycler.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int postition) {

        Intent intent = new Intent(DrawerActivity.this,PropertyScreen.class);
        startActivity(intent);
    }
}