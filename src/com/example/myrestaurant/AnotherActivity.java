package com.example.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class AnotherActivity extends Activity {
	TextView textView1,textView2;
	ImageButton imageButton1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anotherr);
		textView2=(TextView)findViewById(R.id.textView2);
		textView1=(TextView)findViewById(R.id.textView1);
		imageButton1=(ImageButton)findViewById(R.id.imageButton1);
		String username = getIntent().getStringExtra("username");
		textView2.setText(username);
		imageButton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(AnotherActivity.this,Nine.class);
                startActivity(i);
			}
		});
	}
	
}
