package mobileappscompany.w2d3hwrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import mobileappscompany.w2d3hwrecyclerview.adapter.AnimalListAdapter;
import mobileappscompany.w2d3hwrecyclerview.data.DataSource;
import mobileappscompany.w2d3hwrecyclerview.model.Animal;

public class AnimalRecyclerViewActivity extends AppCompatActivity {

    ArrayList<Animal> animalArrayList;
    AnimalListAdapter animalListAdapter;
    final Context context = this;
    RecyclerView rvAnimalRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_recycler_view);

        rvAnimalRecyclerView = findViewById(R.id.rvAnimalRecylcerListView);

        animalListAdapter = new AnimalListAdapter(DataSource.getAnimalList());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvAnimalRecyclerView.setLayoutManager(mLayoutManager);
        rvAnimalRecyclerView.setItemAnimator(new DefaultItemAnimator());
        rvAnimalRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        rvAnimalRecyclerView.setAdapter(animalListAdapter);

    }
}
