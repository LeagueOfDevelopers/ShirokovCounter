package com.isen131.myfirstproject.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textView;
    private int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void plus1(View view){
        n++;
        textView.setText(Integer.toString(n));
    }
}
