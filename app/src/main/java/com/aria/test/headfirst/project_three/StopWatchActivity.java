package com.aria.test.headfirst.project_three;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.aria.test.headfirst.R;

public class StopWatchActivity extends AppCompatActivity {


    private int seconds = 0;
    private boolean running;
    private boolean wasRunning = true ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("SECONDS");
            running = savedInstanceState.getBoolean("RUNNING");
            wasRunning = savedInstanceState.getBoolean("WASRUNNING");
        }
        runTimer();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("SECONDS", seconds);
        outState.putBoolean("RUNNING", running);
        outState.putBoolean("WASRUNNING", wasRunning);

    }

    public void onStart(View view) {
        if(wasRunning)
        {
            running = true;
        }
    }

    public void onStop(View view) {
        wasRunning = running;
        running = false;

    }

    public void onReset(View view) {
        running = false;
        seconds = 0;
    }

    private void runTimer() {
        final TextView timeView = findViewById(R.id.text_time);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int h = seconds / 3600;
                int m = (seconds % 3600) / 60;
                int s = seconds % 60;
                String time = String.format("%d:%02d:%02d", h, m, s);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });

    }
}
