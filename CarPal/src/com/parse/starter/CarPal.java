package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;
import android.app.Application;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Intent;
import android.widget.EditText;








public class CarPal extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "clGrWmvNJkGe85FwMw00LFCqksn9tpU4FPOgJZ5N", "QgmTkUjf8sa0mLpVb5BULjQsYfpuQEGdCHn6OOit");


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
		
/*	    Intent intent = new Intent(this, Signup.class);
	    startActivity(intent);*/
	}
	
	

	
	
	
/*	public void loadsignup(View view) {
	    Intent intent = new Intent(this, Signup.class);
	    startActivity(intent);
	}
	
	public final static String USER = "UNIQUE_USER";
	public final static String PASS = "UNIQUE_PASS";*/
	//public final static Object OBJ = {};
	
/*	public void signin(View view){
	    Intent intent = new Intent(this, Login.class);
	    startActivity(intent);
		
		String username = ((EditText) findViewById(R.id.username)).getText().toString();
		String password = ((EditText) findViewById(R.id.password)).getText().toString();
		Intent intent = new Intent(this, Menuscreen.class);
		//Some DB code to authenticate user
		//...
		
		intent.putExtra(USER, username);
		intent.putExtra(PASS, password);
	    startActivity(intent);
	}*/

}
