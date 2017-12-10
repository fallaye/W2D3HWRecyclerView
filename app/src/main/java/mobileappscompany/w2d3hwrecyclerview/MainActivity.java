package mobileappscompany.w2d3hwrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String category[] = {"Mammal", "Bird", "Fish", "Reptile", "Invertebrate"};

    Button btnListZooAnimal;
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListZooAnimal = findViewById(R.id.btnListZooAnimal);
    }

    public void displayAnimalList(View view) {
        Intent intent = new Intent(this, AnimalCategoryListViewActivity.class);
        startActivity(intent);

    }
}
