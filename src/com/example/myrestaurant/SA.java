package com.example.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SA extends Activity {
	EditText editText1,editText2,editText3,editText4;
	RadioGroup radioGroup1;
	Button button1,button2;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saa);
		editText1 =(EditText)findViewById(R.id.editText1);
	    editText2 = (EditText)findViewById(R.id.editText2);
	    editText3 = (EditText)findViewById(R.id.editText3);
	    editText4 = (EditText)findViewById(R.id.editText4);	    
	    radioGroup1 =(RadioGroup) findViewById(R.id.radioGroup1);
	    button1 = (Button)findViewById(R.id.button1);
	    button2 = (Button)findViewById(R.id.button2);
	   final SQLiteDatabase mydatabase = openOrCreateDatabase("mydatabase.db", MODE_PRIVATE, null);
	   Toast.makeText(SA.this, "database created:"+mydatabase, Toast.LENGTH_LONG).show();
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS users ("
	    +"name VARCHAR, "
        + "password VARCHAR, "
        + "mobile VARCHAR, "
        + "email VARCHAR, "
        + "gender VARCHAR, "
        + "PRIMARY KEY(email, password))");
        		        Toast.makeText(SA.this, "table created", Toast.LENGTH_LONG).show();

        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name = editText1.getText().toString();
                String password = editText2.getText().toString();
                String mobile = editText3.getText().toString();
                String email = editText4.getText().toString();
                
                int selectedId = radioGroup1.getCheckedRadioButtonId();
                RadioButton selectedRadioButton=(RadioButton)findViewById(selectedId);
                String gender = selectedRadioButton.getText().toString();
                Cursor cursor = mydatabase.rawQuery("SELECT * FROM users WHERE password = ? OR email = ?", new String[]{password, email});
                if (cursor.getCount() > 0) {
                    Toast.makeText(SA.this, "Error: User with this Email and Password already exists!", Toast.LENGTH_LONG).show();
                    cursor.close();
                    return;
                }
                cursor.close();
                
			 mydatabase.execSQL("INSERT INTO users VALUES('" + name + "', '" + password + "', '" + mobile + "', '" + email + "', '" + gender + "');");
                Toast.makeText(SA.this, "User Registered Successfully", Toast.LENGTH_LONG).show();
                Intent i = new Intent(SA.this, MainActivity.class);
                startActivity(i);
                 
			}
			});
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				    editText1.setText("");  
		            editText2.setText("");  
		            editText3.setText("");  
		            editText4.setText("");  
		            radioGroup1.clearCheck();  
				
			}
		});
}
}