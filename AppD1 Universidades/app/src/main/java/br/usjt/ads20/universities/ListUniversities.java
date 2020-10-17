package br.usjt.ads20.universities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.usjt.ads20.universities.model.Data;
import br.usjt.ads20.universities.model.University;

import static br.usjt.ads20.universities.model.Data.searchUniversities;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class ListUniversities extends AppCompatActivity {
    public static final String UNIVERSITY = "br.usjt.ads20.universities.description";

    University[] universityList;

    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_universities);
        activity = this;

        final Intent intent = getIntent();

        String key = intent.getStringExtra(MainActivity.NAME);

        ArrayList<University> characters = (ArrayList<University>) intent.getSerializableExtra(MainActivity.UNIVERSITY);
        Data.setUniversities(characters);

        universityList = searchUniversities(key);

        BaseAdapter adapter = new UniversityAdapter(this, universityList);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Uri uri = Uri.parse(universityList[position].getWebPage());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                startActivity(intent);
            }
        });
    }
}