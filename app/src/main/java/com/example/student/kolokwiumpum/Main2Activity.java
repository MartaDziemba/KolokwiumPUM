package com.example.student.kolokwiumpum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Lekarz> lekarze = new ArrayList<>();
        lekarze.add(new Lekarz("Maria Janik", "onkolog"));
        lekarze.add(new Lekarz("Wojciech Malajkat", "chirurg"));
        lekarze.add(new Lekarz("Anna Bielecka", "endokrynolog"));
        lekarze.add(new Lekarz("Andrzej Milek", "ginekolog"));
        lekarze.add(new Lekarz("Monika Konieczny", "pediatra"));

        LekarzAdapter lekarzAdaper = new LekarzAdapter(lekarze);
        recyclerView.setAdapter(lekarzAdaper);

    }
}
