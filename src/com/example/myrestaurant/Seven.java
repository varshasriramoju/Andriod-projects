package com.example.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Seven extends Activity {
	EditText name,email,mobile,itemname,cost,address;
	Button button1;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seven);
        button1=(Button)findViewById(R.id.button1);
        name =(EditText)findViewById(R.id.name);
	    email = (EditText)findViewById(R.id.email);
	    mobile = (EditText)findViewById(R.id.mobile);
	    itemname = (EditText)findViewById(R.id.itemname);	
	    cost=(EditText)findViewById(R.id.cost);
	    address=(EditText)findViewById(R.id.address);
	    String itemName = getIntent().getStringExtra("itemName");
        String totalCost = getIntent().getStringExtra("totalCost");

        // Setting data to EditText
        itemname.setText(itemName);
        cost.setText(totalCost);
        
	  final SQLiteDatabase mydatabase = openOrCreateDatabase("mydatabase.db", MODE_PRIVATE, null);
		   Toast.makeText(Seven.this, "database created:"+mydatabase, Toast.LENGTH_LONG).show();
	       mydatabase.execSQL("CREATE TABLE IF NOT EXISTS payment_details (name text,email text,mobile text,address text,itemname text,cost int)");
	    Toast.makeText(Seven.this, "table created", Toast.LENGTH_LONG).show();
	    button1.setOnClickListener(new  OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
						String n = name.getText().toString();
		                String e = email.getText().toString();
		                String m = mobile.getText().toString();
		                String a = address.getText().toString();
		                String i = itemname.getText().toString();
		                int c = Integer.parseInt(cost.getText().toString());
		                mydatabase.execSQL("insert into payment_details(name,email,mobile,address,itemname,cost) values('"+n+"','"+e+"','"+m+"','"+a+"','"+i+"',"+c+")"); 
		                Toast.makeText(Seven.this, "Details Submitted" ,Toast.LENGTH_SHORT).show();
		                Intent intent=new Intent(Seven.this,CaptureActivity.class);
		                startActivity(intent);
		    }
		});
       	}

}
