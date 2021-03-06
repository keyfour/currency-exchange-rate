package com.github.keyfour.currencyexchangerate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.keyfour.currencyexchangerate.feature.rates.RatesFragment;

/**
 * Main {@link android.app.Activity} of application
 *
 * @author Alex Karpov
 */

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        RatesFragment ratesFragment = (RatesFragment) getSupportFragmentManager()
                .findFragmentById(R.id.content_frame);

        if (ratesFragment == null) {
            ratesFragment = RatesFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content_frame, ratesFragment).commit();
        }

    }

}
