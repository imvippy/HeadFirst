package com.aria.test.headfirst.project_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aria.test.headfirst.R;

public class MultipleActivity extends AppCompatActivity {

    EditText mEditText;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_multiple);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mEditText = findViewById(R.id.multiple_text);
        mButton = findViewById(R.id.main_submit);

    }

    public void onClickSubmit(View view) {

        String mMessage = mEditText.getText().toString();
        if (mMessage.equals(null)) {
            Toast.makeText(this, "Please Type Message", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, mMessage);
            startActivity(intent);
        }

    }
}
