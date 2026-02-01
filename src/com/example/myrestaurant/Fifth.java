package com.example.myrestaurant;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Fifth extends Activity {
	ImageButton imgButton1,imgButton2,imgButton3,imgButton4,imgButton5,imgButton6,imgButton7;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);
        imgButton1=(ImageButton)findViewById(R.id.imgButton1);
        imgButton2=(ImageButton)findViewById(R.id.imgButton2);
        imgButton3=(ImageButton)findViewById(R.id.imgButton3);
        imgButton4=(ImageButton)findViewById(R.id.imgButton4);
        imgButton5=(ImageButton)findViewById(R.id.imgButton5);
        imgButton6=(ImageButton)findViewById(R.id.imgButton6);
        imgButton7=(ImageButton)findViewById(R.id.imgButton7);
        imgButton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Ten.class);
				startActivity(i);
			}
		});
       imgButton2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Eleven.class);
				startActivity(i);
			}
		});
       imgButton3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Twelve.class);
				startActivity(i);
			}
		});       
       imgButton4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Siliconpizza.class);
				startActivity(i);
			}
		});  
       imgButton5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Detoitpizza.class);
				startActivity(i);
			}
		});
       imgButton6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Veggiepizza.class);
				startActivity(i);
			}
		});
       imgButton7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Fifth.this,Meatpizza.class);
				startActivity(i);
			}
		});      
	}

}
