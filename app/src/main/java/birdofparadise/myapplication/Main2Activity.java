package birdofparadise.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<model_class> cards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        makecards();


    }


    private void makecards() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);


        cards = new ArrayList<>();
        model_class obj = new model_class("This is WASIDEA.coming soon..", R.drawable.a);
        cards.add(obj);
        obj = new model_class("SHOPPING...very easy ", R.drawable.shop);
        cards.add(obj);
        obj = new model_class("EARN like never before", R.drawable.money);
        cards.add(obj);

        obj = new model_class("ADVERTISEMENT in a new way", R.drawable.advertise);
        cards.add(obj);

        obj = new model_class("JOBS...no tension", R.drawable.jobs);
        cards.add(obj);

        obj = new model_class("This is WASIDEA.coming soon..", R.drawable.a);
        cards.add(obj);

        RecyclerView.Adapter adapter = new MyAdapter(this, cards);
        recyclerView.setAdapter(adapter);

    }
}
