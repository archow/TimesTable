package com.example.abedurchowdhury.timestables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView myListView = (ListView) findViewById(R.id.myListView);
        final SeekBar mySeekBar = (SeekBar) findViewById(R.id.mySeekBar);

        mySeekBar.setMax(20);
        mySeekBar.setProgress(10);
        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int progress;
                if (i<min) {
                    progress = min;
                    mySeekBar.setProgress(min);
                } else {
                    progress = i;
                }
                ArrayList<Integer> product = new ArrayList<Integer>(asList(progress*1, progress*2,
                        progress*3, progress*4, progress*5, progress*6, progress*7, progress*8,
                        progress*9));

                ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(MainActivity.this,
                        android.R.layout.simple_list_item_1, product);
                myListView.setAdapter(arrayAdapter);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
