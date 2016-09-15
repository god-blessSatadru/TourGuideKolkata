package com.example.android.tourguidekolkata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DinningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DinningFragment())
                .commit();

    }
}
