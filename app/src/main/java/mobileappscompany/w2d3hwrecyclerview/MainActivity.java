package mobileappscompany.w2d3hwrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String category[] = {"Mammal", "Bird", "Fish", "Reptile", "Invertebrate"}
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
