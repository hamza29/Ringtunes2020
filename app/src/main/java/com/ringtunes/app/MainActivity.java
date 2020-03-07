package com.ringtunes.app;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);
        textView = findViewById(R.id.ringname);
        List<NewModel> dummyModelPackages = new ArrayList<>();
        dummyModelPackages.add(new NewModel("a1", "", R.raw.a1));
        dummyModelPackages.add(new NewModel("a11", "", R.raw.a11));
        dummyModelPackages.add(new NewModel("a12", "", R.raw.a12));
        dummyModelPackages.add(new NewModel("a13", "", R.raw.a13));
        dummyModelPackages.add(new NewModel("a2", "", R.raw.a2));
        dummyModelPackages.add(new NewModel("a3", "", R.raw.a3));
        dummyModelPackages.add(new NewModel("a5", "", R.raw.a5));
        dummyModelPackages.add(new NewModel("a6", "", R.raw.a6));
        dummyModelPackages.add(new NewModel("a7", "", R.raw.a7));
        dummyModelPackages.add(new NewModel("a8", "", R.raw.a8));
        dummyModelPackages.add(new NewModel("a9", "", R.raw.a9));
        dummyModelPackages.add(new NewModel("n1", "", R.raw.n1));
        dummyModelPackages.add(new NewModel("n2", "", R.raw.n2));
        dummyModelPackages.add(new NewModel("n3", "", R.raw.n3));
        dummyModelPackages.add(new NewModel("ring1", "", R.raw.ring1));
        dummyModelPackages.add(new NewModel("ring10", "", R.raw.ring10));
        dummyModelPackages.add(new NewModel("ring11", "", R.raw.ring11));
        dummyModelPackages.add(new NewModel("ring12", "", R.raw.ring12));
        dummyModelPackages.add(new NewModel("ring13", "", R.raw.ring13));
        dummyModelPackages.add(new NewModel("ring14", "", R.raw.ring14));
        dummyModelPackages.add(new NewModel("ring15", "", R.raw.ring15));
        dummyModelPackages.add(new NewModel("ring19", "", R.raw.ring19));
        dummyModelPackages.add(new NewModel("ring2", "", R.raw.ring2));
        dummyModelPackages.add(new NewModel("ring20", "", R.raw.ring20));
        dummyModelPackages.add(new NewModel("ring21", "", R.raw.ring21));
        dummyModelPackages.add(new NewModel("ring22", "", R.raw.ring22));
        dummyModelPackages.add(new NewModel("ring23", "", R.raw.ring23));
        dummyModelPackages.add(new NewModel("ring24", "", R.raw.ring24));
        dummyModelPackages.add(new NewModel("ring25", "", R.raw.ring25));
        dummyModelPackages.add(new NewModel("ring26", "", R.raw.ring26));
        dummyModelPackages.add(new NewModel("ring27", "", R.raw.ring27));
        dummyModelPackages.add(new NewModel("ring28", "", R.raw.ring28));
        dummyModelPackages.add(new NewModel("ring29", "", R.raw.ring29));
        dummyModelPackages.add(new NewModel("ring3", "", R.raw.ring3));
        dummyModelPackages.add(new NewModel("ring31", "", R.raw.ring31));
        dummyModelPackages.add(new NewModel("ring32", "", R.raw.ring32));
        dummyModelPackages.add(new NewModel("ring33", "", R.raw.ring33));
        dummyModelPackages.add(new NewModel("ring34", "", R.raw.ring34));
        dummyModelPackages.add(new NewModel("ring35", "", R.raw.ring35));
        dummyModelPackages.add(new NewModel("ring36", "", R.raw.ring36));
        dummyModelPackages.add(new NewModel("ring35", "", R.raw.ring35));
        dummyModelPackages.add(new NewModel("ring36", "", R.raw.ring36));
        dummyModelPackages.add(new NewModel("ring37", "", R.raw.ring37));
        dummyModelPackages.add(new NewModel("ring38", "", R.raw.ring38));
        dummyModelPackages.add(new NewModel("ring39", "", R.raw.ring39));
        dummyModelPackages.add(new NewModel("ring41", "", R.raw.ring41));
        dummyModelPackages.add(new NewModel("ring42", "", R.raw.ring42));
        dummyModelPackages.add(new NewModel("ring43", "", R.raw.ring43));
        dummyModelPackages.add(new NewModel("ring47", "", R.raw.ring47));
        dummyModelPackages.add(new NewModel("ring48", "", R.raw.ring48));
        dummyModelPackages.add(new NewModel("ring49", "", R.raw.ring49));
        dummyModelPackages.add(new NewModel("ring5", "", R.raw.ring5));
        dummyModelPackages.add(new NewModel("ring50", "", R.raw.ring50));
        dummyModelPackages.add(new NewModel("ring51", "", R.raw.ring51));
        dummyModelPackages.add(new NewModel("ring52", "", R.raw.ring52));
        dummyModelPackages.add(new NewModel("ring53", "", R.raw.ring53));
        dummyModelPackages.add(new NewModel("ring54", "", R.raw.ring54));
        dummyModelPackages.add(new NewModel("ring56", "", R.raw.ring56));
        dummyModelPackages.add(new NewModel("ring57", "", R.raw.ring57));
        dummyModelPackages.add(new NewModel("ring59", "", R.raw.ring59));
        dummyModelPackages.add(new NewModel("ring60", "", R.raw.ring60));
        dummyModelPackages.add(new NewModel("ring61", "", R.raw.ring61));
        dummyModelPackages.add(new NewModel("ring62", "", R.raw.ring62));
        dummyModelPackages.add(new NewModel("ring7", "", R.raw.ring7));
        dummyModelPackages.add(new NewModel("ring8", "", R.raw.ring8));
        dummyModelPackages.add(new NewModel("ring9", "", R.raw.ring9));
        dummyModelPackages.add(new NewModel("sonn1", "", R.raw.sonn1));
        dummyModelPackages.add(new NewModel("sonn10", "", R.raw.sonn10));
        dummyModelPackages.add(new NewModel("sonn11", "", R.raw.sonn11));
        dummyModelPackages.add(new NewModel("sonn12", "", R.raw.sonn12));
        dummyModelPackages.add(new NewModel("sonn13", "", R.raw.sonn13));
        dummyModelPackages.add(new NewModel("sonn14", "", R.raw.sonn14));
        dummyModelPackages.add(new NewModel("sonn15", "", R.raw.sonn15));
        dummyModelPackages.add(new NewModel("sonn16", "", R.raw.sonn16));
        dummyModelPackages.add(new NewModel("sonn17", "", R.raw.sonn17));
        dummyModelPackages.add(new NewModel("sonn18", "", R.raw.sonn18));
        dummyModelPackages.add(new NewModel("sonn19", "", R.raw.sonn19));
        dummyModelPackages.add(new NewModel("sonn20", "", R.raw.sonn20));
        dummyModelPackages.add(new NewModel("sonn2", "", R.raw.sonn2));
        dummyModelPackages.add(new NewModel("sonn21", "", R.raw.sonn21));
        dummyModelPackages.add(new NewModel("sonn22", "", R.raw.sonn22));
        dummyModelPackages.add(new NewModel("sonn23", "", R.raw.sonn23));
        dummyModelPackages.add(new NewModel("sonn24", "", R.raw.sonn24));
        dummyModelPackages.add(new NewModel("sonn25", "", R.raw.sonn25));
        dummyModelPackages.add(new NewModel("sonn26", "", R.raw.sonn26));
        dummyModelPackages.add(new NewModel("sonn27", "", R.raw.sonn27));
        dummyModelPackages.add(new NewModel("sonn28", "", R.raw.sonn28));
        dummyModelPackages.add(new NewModel("sonn29", "", R.raw.sonn29));
        dummyModelPackages.add(new NewModel("sonn3", "", R.raw.sonn3));
        dummyModelPackages.add(new NewModel("sonn30", "", R.raw.sonn30));
        dummyModelPackages.add(new NewModel("sonn4", "", R.raw.sonn4));
        dummyModelPackages.add(new NewModel("sonn5", "", R.raw.sonn5));
        dummyModelPackages.add(new NewModel("sonn6", "", R.raw.sonn6));
        dummyModelPackages.add(new NewModel("sonn7", "", R.raw.sonn7));
        dummyModelPackages.add(new NewModel("sonn8", "", R.raw.sonn8));
        dummyModelPackages.add(new NewModel("sonn9", "", R.raw.sonn9));
        dummyModelPackages.add(new NewModel("t1", "", R.raw.t1));
        dummyModelPackages.add(new NewModel("t2", "", R.raw.t2));
        dummyModelPackages.add(new NewModel("t3", "", R.raw.t3));
        dummyModelPackages.add(new NewModel("t4", "", R.raw.t4));
        dummyModelPackages.add(new NewModel("t5", "", R.raw.t5));
        dummyModelPackages.add(new NewModel("t7", "", R.raw.t7));
        LinearLayoutManager lLayout = new LinearLayoutManager(MainActivity.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lLayout);
        recyclerView.setAdapter(new AdapterCvManager(recyclerView, this, dummyModelPackages, textView));
    }
}