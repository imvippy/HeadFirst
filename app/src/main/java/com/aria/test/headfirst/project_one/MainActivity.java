package com.aria.test.headfirst.project_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.aria.test.headfirst.R;
import com.aria.test.headfirst.project_one.BeerExpert;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Button mButton;
    Spinner mSpinner;

    private BeerExpert mBeerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClickFindBeer(View view) {

        mTextView = findViewById(R.id.main_text_view);
        mSpinner = findViewById(R.id.main_spinner);
        mButton = findViewById(R.id.main_submit);

        String beerType = String.valueOf(mSpinner.getSelectedItem());
        List<String> brandList = mBeerExpert.getBrands(beerType);

        StringBuilder brandsFormated = new StringBuilder();

        for (String brand : brandList)
        {
            brandsFormated.append(brand).append('\n');

        }
        mTextView.setText(brandsFormated);
    }
}
