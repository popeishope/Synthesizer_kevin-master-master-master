package com.linburgtech.synthesizer_linburg;

import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private Button button3;
    private Button button1;
    private Button button2;
    int[] scaleArray = {R.raw.scalee, R.raw.scalefs, R.raw.scalegs, R.raw.scalea, R.raw.scaleb, R.raw.scalec, R.raw.scaleds, R.raw.scalee};
    int[] timings = {750, 650, 550, 450, 350, 250, 150, 50};
    int[] scaleArraytwinkle = {R.raw.scalehighe, R.raw.scalehighe, R.raw.scaled, R.raw.scaled, R.raw.scalecs, R.raw.scalecs, R.raw.scaleb,R.raw.scalehighe, R.raw.scalehighe, R.raw.scaled, R.raw.scaled, R.raw.scalecs, R.raw.scalecs, R.raw.scaleb};
    int[] timingstwinkle = {1000, 1000, 550, 550, 850, 550,1000,1000, 1000, 550, 550, 850, 550,1000};
    private MediaPlayerThread mpt = new MediaPlayerThread(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3 = (Button) findViewById(R.id.button3);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "Button 1 Clicked");
                for (int i = 0; i < scaleArray.length; i++) {
                    mpt.playNote(scaleArray[i], timings[i]);
                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "Button 2 Clicked");
                final int WHOLE_NOTE = 650;
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalee, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalea, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalec, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaled, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scalef, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
                mpt.playNote(R.raw.scaleg, WHOLE_NOTE / 2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "Button 3 Clicked");
                for (int i = 0; i < scaleArraytwinkle.length; i++) {
                    mpt.playNote(scaleArraytwinkle[i], timingstwinkle[i]);

                }
            }

        });

    }
}