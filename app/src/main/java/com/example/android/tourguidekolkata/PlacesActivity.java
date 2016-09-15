package com.example.android.tourguidekolkata;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PlacesFragment())
                .commit();

    }

}
