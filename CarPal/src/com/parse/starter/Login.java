package com.parse.starter;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Intent;
import android.widget.EditText;

public class Login extends ActionBarActivity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_login);
		
			// Add your initialization code here
			Parse.initialize(this, "clGrWmvNJkGe85FwMw00LFCqksn9tpU4FPOgJZ5N", "QgmTkUjf8sa0mLpVb5BULjQsYfpuQEGdCHn6OOit");


			ParseUser.enableAutomaticUser();
			ParseACL defaultACL = new ParseACL();
		    
			// If you would like all objects to be private by default, remove this line.
			defaultACL.setPublicReadAccess(true);
			
			ParseACL.setDefaultACL(defaultACL, true);
		
		
/*		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}*/
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_login,
					container, false);
			return rootView;
		}
	}
	
	public final static String USER = "UNIQUE_USER";
	public final static String PASS = "UNIQUE_PASS";
	//public final static Object OBJ = {};
	
	public void signin(View view){
		String username = ((EditText) findViewById(R.id.username)).getText().toString();
		String password = ((EditText) findViewById(R.id.password)).getText().toString();
		Intent intent = new Intent(this, Menuscreen.class);
		//Some DB code to authenticate user
		//...
		ParseQuery<ParseObject> query = ParseQuery.getQuery("users");
		query.whereEqualTo("username", username);
		query.whereEqualTo("password", password);
		ParseObject t;
		try {
			t = query.getFirst();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			t = null;
		}
		if (t == null) {
			Log.d("user", "The getFirst request failed.");
		} else {
		  intent.putExtra(USER, username);
		  intent.putExtra(PASS, password);
		  startActivity(intent);
		}
		
		
	}
	
	public void signup(View view){
		Intent intent = new Intent(this, Signup.class);
		startActivity(intent);
	}

}






