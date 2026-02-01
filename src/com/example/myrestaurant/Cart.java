package com.example.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Cart extends Activity {
	 TextView cartTotalTextView;
	 ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
        cartTotalTextView = (TextView)findViewById(R.id.cartTotalTextView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);

        int totalCost = getIntent().getIntExtra("totalCost", 0);
        cartTotalTextView.setText("Total Cost: " + totalCost);
    }
}


