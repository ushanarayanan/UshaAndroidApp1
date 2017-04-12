package com.apps.ushanarayanan.myhelloworldapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counter ;
    Button plus;
    Button minus;
    int cnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = (TextView) findViewById(R.id.counter);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);

        final int increment_value = 1;
        cnt = 0;
        counter.setText(String.valueOf(cnt));

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt += increment_value;
                counter.setText(String.valueOf(cnt));

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt -= increment_value;
                counter.setText(String.valueOf(cnt));

            }
        });

    }

}
