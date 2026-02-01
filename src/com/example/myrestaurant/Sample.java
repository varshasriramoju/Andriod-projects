package com.example.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class Sample extends Activity{
	TextView quantityTextView;
	TextView totalCost;
	private int quantity=0;
	private int pricePerItem=250;
	Button addButton,subButton,addToCartButton;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample);
		quantityTextView=(TextView)findViewById(R.id.quantityTextView);
		totalCost=(TextView)findViewById(R.id.totalCost);
		addButton=(Button)findViewById(R.id.addButton);
		subButton=(Button)findViewById(R.id.subButton);
		addToCartButton=(Button)findViewById(R.id.addToCartButton);
		addButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				quantity++;
				updateCost();
			}
		});
		subButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(quantity>0){
					quantity--;
					updateCost();
				}
			}
		});
		addToCartButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Sample.this,Cart.class);
				i.putExtra("totalCost",quantity*pricePerItem);
				startActivity(i);
			}
		});
	}
	private void updateCost(){
		quantityTextView.setText(String.valueOf(quantity));
		totalCost.setText("C "+(quantity*pricePerItem));
	}
}

