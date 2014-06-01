package com.parse.starter;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Intent;
import android.widget.TextView;

public class Menuscreen extends ActionBarActivity {

	public static String username1 = "UNIQUE_USER";
	public String password1 = "UNIQUE_PASS";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_menuscreen);
	    Intent intent = getIntent();
	    
/*		final TextView userView = (TextView) findViewById(R.id.Usertext);
		final TextView passView = (TextView) findViewById(R.id.Passtext);*/
	    username1 = intent.getStringExtra(Login.USER);
	    password1 = intent.getStringExtra(Login.PASS);
	    
/*		userView.setText(username1);
	    passView.setText(password1);*/
	    
/*		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
			
		}*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menuscreen, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_menuscreen,
					container, false);
			return rootView;
		}
	}
	
	public void loadsearch(View view){
		Intent intent = new Intent(this, Search.class);
		startActivity(intent);
	}
	
	public void loadcreate(View view){
		Intent intent = new Intent(this, Create.class);
		startActivity(intent);
	}
	
	public void loadmyrides(View view){
		Intent intent = new Intent(this, Myrides.class);
		startActivity(intent);
	}
	

}
