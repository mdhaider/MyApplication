package birdofparadise.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<model_class> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        makecards();

    }



    private void makecards() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view1);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);


        cards = new ArrayList<>();
        model_class obj = new model_class("Rs.900", R.drawable.trouser1
        );
        cards.add(obj);
        obj = new model_class("Rs.800", R.drawable.shirt1);
        cards.add(obj);
        obj = new model_class("Rs.550", R.drawable.shoe1);
        cards.add(obj);

        obj = new model_class("Rs.1500", R.drawable.fridge1);
        cards.add(obj);

        obj = new model_class("Rs.900", R.drawable.trouser1);
        cards.add(obj);

        obj = new model_class("Rs.800", R.drawable.shirt1);
        cards.add(obj);

        obj = new model_class("Rs.550", R.drawable.shoe1);
        cards.add(obj);

        RecyclerView.Adapter adapter1 = new MyAdapter1(this, cards);
        recyclerView.setAdapter(adapter1);

    }
}


