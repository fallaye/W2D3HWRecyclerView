package mobileappscompany.w2d3hwrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mobileappscompany.w2d3hwrecyclerview.adapter.AnimalCategoryListAdapter;
import mobileappscompany.w2d3hwrecyclerview.adapter.AnimalCategoryListAdapter;
import mobileappscompany.w2d3hwrecyclerview.data.DataSource;
import mobileappscompany.w2d3hwrecyclerview.model.Animal;
import mobileappscompany.w2d3hwrecyclerview.model.AnimalCategory;

public class AnimalCategoryListViewActivity extends AppCompatActivity {
    ListView lvAnimalCategoryListView;
    //ArrayList<AnimalCategory> animalCategoryArrayList = new ArrayList<AnimalCategory>();
    //ArrayList<Animal> animalArrayList = new ArrayList<Animal>();

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_category_list_view);

        lvAnimalCategoryListView = findViewById(R.id.lvListView);

        AnimalCategoryListAdapter animalCategoryListAdapter =
                new AnimalCategoryListAdapter(this, R.layout.activity_animal_category_list_view, DataSource.getAnimalCategroyList());
        lvAnimalCategoryListView.setAdapter(animalCategoryListAdapter);

        lvAnimalCategoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AnimalCategoryListViewActivity.this, AnimalRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
