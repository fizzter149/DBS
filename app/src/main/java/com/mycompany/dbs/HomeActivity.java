package com.mycompany.dbs;

import android.graphics.Paint;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] toppings = {"Cheese", "Pepperoni", "Black Olives", "Tahu", "Tempe"};
    private List<Person> persons;
    private List<TrainingEvent> trainingEvents;

    private RecyclerView knowledgeRV;
    private RecyclerView.Adapter knowledgeRVA;
    private RecyclerView.LayoutManager knowledgeRVLM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        initializeData();

        // specify an adapter (see also next example)
        mAdapter = new RVAdapter(trainingEvents);
        mRecyclerView.setAdapter(mAdapter);

        knowledgeRV = (RecyclerView) findViewById(R.id.knowledge_list);
        knowledgeRV.setHasFixedSize(true);
        knowledgeRVLM = new GridLayoutManager(this, 3);
        knowledgeRV.setLayoutManager(knowledgeRVLM);
        knowledgeRVA = new KnowledgeAdapter();
        knowledgeRV.setAdapter(knowledgeRVA);
    }


    // This method creates an ArrayList that has three Person objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.
    private void initializeData(){
        /*persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old"));
        persons.add(new Person("Lavery Maiss", "25 years old"));
        persons.add(new Person("Lillie Watts", "35 years old"));*/
        trainingEvents = new ArrayList<>();
        trainingEvents.add(new TrainingEvent("25 Aug", "Leadership Skills I", "Accounting"));
        trainingEvents.add(new TrainingEvent("31 Aug", "Leadership Skills II", "Accounting"));
        trainingEvents.add(new TrainingEvent("01 Sep", "Leadership Skills III", "Accounting"));
        trainingEvents.add(new TrainingEvent("05 Sep", "Leadership Skills IV", "Accounting"));
        trainingEvents.add(new TrainingEvent("09 Sep", "Leadership Skills V", "Accounting"));
        trainingEvents.add(new TrainingEvent("12 Sep", "Leadership Skills VI", "Accounting"));
        trainingEvents.add(new TrainingEvent("18 Sep", "Leadership Skills VII", "Accounting"));
        trainingEvents.add(new TrainingEvent("22 Sep", "Leadership Skills VIII", "Accounting"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
