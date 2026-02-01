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
import android.widget.Toast;

public class LogActivity extends Activity {
	  SQLiteDatabase db;
	     EditText etUsername, etPassword;
	     Button btnLogin;
      protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logg);
		 etUsername = (EditText)findViewById(R.id.etUsername);
		 etPassword = (EditText)findViewById(R.id.etPassword);
		 btnLogin=(Button)findViewById(R.id.btnLogin);
		db = openOrCreateDatabase("mydatabase.db",MODE_PRIVATE, null);
		
		btnLogin.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		 String username = etUsername.getText().toString();
       String password = etPassword.getText().toString();

       Cursor cursor = db.rawQuery("SELECT * FROM users WHERE name = ? AND password = ?",new String[]{username, password});

       if (cursor.moveToFirst()) {
      	 cursor.close();
      	 Intent i=new Intent(LogActivity.this,AnotherActivity.class);
      	 i.putExtra("username",username);
   		startActivity(i);
       } else {
      	 cursor.close();
           Toast.makeText(LogActivity.this, "Wrong username or password", Toast.LENGTH_SHORT).show();
       }
		
	}
});
		
}
}