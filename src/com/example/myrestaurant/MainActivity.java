package com.example.myrestaurant;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView; 
//import android.widget.Toast;

public class MainActivity extends Activity {
	//Button button1;
	TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,SA.class);
				startActivity(i);
				
			}
		});
        textView2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,LogActivity.class);
				startActivity(i);
			}
		} );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		if(item.getItemId()==R.id.itm_home)
		{
			Intent i=new Intent(MainActivity.this,Nine.class);
			startActivity(i);
		}
		if(item.getItemId()==R.id.itm_order)
		{
			Intent i=new Intent(MainActivity.this,Seven.class);
			startActivity(i);
		}
		if(item.getItemId()==R.id.itm_rating)
		{
			Intent i=new Intent(MainActivity.this,Eight.class);
			startActivity(i);
		}
		
		return super.onOptionsItemSelected(item);
	}
    
    
}
