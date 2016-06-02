package com.example.beth.ripple_effect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.andexert.library.RippleView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    final RippleView rippleView = (RippleView) findViewById(R.id.rect);
    final TextView textView = (TextView) findViewById(R.id.rect_child);
    final Toolbar toolbar = (Toolbar) findViewById(R.id.actionbar);

    setSupportActionBar(toolbar);

    rippleView.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Log.e("Sample", "Click Rect !");
        }
    });
    rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
        @Override
        public void onComplete(RippleView rippleView) {
            Log.d("Sample", "Ripple completed");
        }
    });
    textView.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Log.e("Sample", "Click rect child !");
        }
    });