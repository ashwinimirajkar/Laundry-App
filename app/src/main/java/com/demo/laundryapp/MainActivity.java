package com.demo.laundryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);
        menuAdapter = new MenuAdapter(this);
        gridView.setAdapter(menuAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;
                }
            }
        });
    }
}
