package com.example.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Four extends Activity {

    ImageButton imageButton1,imageButton2,imageButton3,imageButton5,imageButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
        imageButton1=(ImageButton)findViewById(R.id.imageButton1);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton5=(ImageButton)findViewById(R.id.imageButton5);
        imageButton6=(ImageButton)findViewById(R.id.imageButton6);
        imageButton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Four.this,Fpasta.class);
				startActivity(i);
			}
		});
        imageButton2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Four.this,Spasta.class);
				startActivity(i);
			}
		});
        imageButton3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Four.this,Lpasta.class);
				startActivity(i);
			}
		});
        imageButton5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Four.this,Rpasta.class);
				startActivity(i);
			}
		});			
        imageButton6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Four.this,Tpasta.class);
				startActivity(i);
			}
		});

    }
}
