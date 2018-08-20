package com.aria.test.headfirst;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HandlerDemo extends AppCompatActivity implements View.OnClickListener{


    Button button,button2;

    private boolean mStartLoop;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_handler_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        method();
        Log.d("My App","hi");
        button = findViewById(R.id.button_start);
        button2 =findViewById(R.id.button_stop);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    public void method() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    mStartLoop=true;
                    while(mStartLoop) {
                        sleep(1000);
                        Log.d("My App","Hello i am under other thread");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }


    public void startCounter(View view) {
        mStartLoop = true;
    }

    public void stopCounter(View view) {
        mStartLoop = false;
    }

    @Override
    public void onClick(View v) {

switch (v.getId())
{
    case  R.id.button_start :
        Log.d("My App","in startssss");

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    mStartLoop=true;
                    while(mStartLoop) {
                        sleep(1000);
                        Log.d("My App","hi");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();


        break;
    case  R.id.button_stop :
        Log.d("My App","instopppp");

        mStartLoop = false;
        break;

}

    }
}
