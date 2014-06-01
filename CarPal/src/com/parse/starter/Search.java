package com.parse.starter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.parse.FindCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.os.Build;

public class Search extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_search,
					container, false);
			return rootView;
		}
	}

	
	
	//list of input
	//public static List<CarPosting> results = new ArrayList<CarPosting>();
	
	public void search(View view){
/*		String pickUpLocation = null;
		if(((EditText) findViewById(R.id.pickuplocation)).getText() != null){
			pickUpLocation = ((EditText) findViewById(R.id.pickuplocation)).getText().toString();
		}
		
		String arrivalLocation = null;
		if(((EditText) findViewById(R.id.dropofflocation)).getText() != null){
			 arrivalLocation = ((EditText) findViewById(R.id.dropofflocation)).getText().toString();
		}*/

/*		Date ridedate = null;
		if(((EditText) findViewById(R.id.ridedate)).getText() != null){
			 arrivalLocation = ((EditText) findViewById(R.id.ridedate)).getText().toString();
		}*/
		
	    
/*		ParseQuery<ParseObject> query = ParseQuery.getQuery("rides");
		query.whereEqualTo("pickuplocation", pickUpLocation);
		query.whereEqualTo("dropofflocation",arrivalLocation);*/
/*		query.whereEqualTo("drivedate",ridedate);*/
		
		/*results = (List<CarPosting>) query;
		for(Object item : (Iterable) query){
			results.add((CarPosting)item);
		}*/
		
		
		Intent intent = new Intent(this, Displayresults.class);
		startActivity(intent);
/*		for(CarPosting item : results){
			
		}*/
	}
	
	
	
	
	
	
}
