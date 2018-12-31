package com.datta.naman.assign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ModelFood> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        foodsList = new ArrayList<>();

        foodsList.add(new ModelFood(R.drawable.food1,"Food Item 1","Indirapuram","24.12.2018"));
        foodsList.add(new ModelFood(R.drawable.food2,"Food Item 2","Noida","24.12.2018"));
        foodsList.add(new ModelFood(R.drawable.food3,"Food Item 3","Delhi","24.12.2018"));
        foodsList.add(new ModelFood(R.drawable.food4,"Food Item 4","XYZ","24.12.2018"));



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLiLayoutManager);
        FoodAdapter adapter = new FoodAdapter(this,foodsList);
        recyclerView.setAdapter(adapter);





    }
}
