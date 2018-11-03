package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("father", "әpә"));
        words.add(new Words("mother", "әṭa"));
        words.add(new Words("son", "angsi"));
        words.add(new Words("daughter", "tune"));
        words.add(new Words("older brother", "taachi"));
        words.add(new Words("younger brother", "chalitti"));
        words.add(new Words("older sister", "teṭe"));
        words.add(new Words("younger sister", "kolliti"));
        words.add(new Words("grandmother ", "ama"));
        words.add(new Words("grandfather", "paapa"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

    }
