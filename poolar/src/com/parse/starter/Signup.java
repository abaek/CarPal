package com.parse.starter;



import java.util.Date;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.Intent;
import android.widget.EditText;


public class Signup extends ActionBarActivity {
	
	TextView fname;
	TextView lname;
	TextView password;
	TextView email;
	
	
	private String name;
	private String _password;
	private String _email;
	private Integer numPosts;
	private Date dateCreated;
	private Integer numThumbsUp;
	private Integer numThumbsDown;
	private Boolean verified;
	
	public static final String MyPREFERENCES = "MyPrefs" ;
	public static final String Name = "namekey";
	public static final String Password = "passwordkey";
	public static final String Email = "emailkey";

	
    SharedPreferences sharedpreferences;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	   

		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		

		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signup, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_signup,
					container, false);
			return rootView;
		}
	}
	
	public void loadmenupage(View view){
		Intent intent = new Intent(this, Login.class);
	    startActivity(intent);
	    
	    String username = ((EditText) findViewById(R.id.username)).getText().toString();
		String password = ((EditText) findViewById(R.id.password1)).getText().toString();
		String email = ((EditText) findViewById(R.id.email)).getText().toString();
		
		ParseObject users = new ParseObject("users");
		users.put("username", username);
		users.put("password", password);
		users.put("email", email);
		users.saveInBackground();
		
		startActivity(intent);
	}

}
