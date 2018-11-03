package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("one", "lutti"));
        words.add(new Words("two", "otiiko"));
        words.add(new Words("three", "tolookosu"));
        words.add(new Words("four", "oyyisa"));
        words.add(new Words("five", "massokka"));
        words.add(new Words("six", "temmokka"));
        words.add(new Words("seven", "kenekaku"));
        words.add(new Words("eight", "kawinta"));
        words.add(new Words("nine", "wo’e"));
        words.add(new Words("ten", "na’aacha"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }



    }

