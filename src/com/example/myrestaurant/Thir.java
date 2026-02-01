package com.example.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class Thir extends Activity {
	
	    
	    ImageButton imageButton1,imageButton2,imageButton3,imageButton5,imageButton6,imageButton7;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.thir);
	        imageButton1 =(ImageButton)findViewById(R.id.imageButton1);
	        imageButton2 =(ImageButton)findViewById(R.id.imageButton2);
	        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
	        imageButton5=(ImageButton)findViewById(R.id.imageButton5);
	        imageButton6=(ImageButton)findViewById(R.id.imageButton6);
	        imageButton7=(ImageButton)findViewById(R.id.imageButton7);
	        imageButton1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Thir.this,Classicburger.class);
					startActivity(i);
				}
			});
            imageButton2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Thir.this,Baconburger.class);
					startActivity(i);
				}
			});
            imageButton3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Thir.this,Chineeseburger.class);
					startActivity(i);
				}
			});
            imageButton5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Thir.this,Veggieburger.class);
					startActivity(i);
				}
			});	 
           imageButton6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Thir.this,Greekburger.class);
					startActivity(i);
				}
			});
           imageButton7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Thir.this,Cheeseburger.class);
					startActivity(i);
				}
			});
	    }
	}
