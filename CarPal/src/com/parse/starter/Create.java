package com.parse.starter;

import com.parse.ParseObject;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.os.Build;

public class Create extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_create,
					container, false);
			return rootView;
		}
	}
	
	public void create(View view){
		Intent intent = new Intent(this, Menuscreen.class);
	    
	    String pickuplocation = ((EditText) findViewById(R.id.pickuplocation)).getText().toString();
	    String pickupintersec = ((EditText) findViewById(R.id.pickupintersec)).getText().toString();
	    String dropofflocation = ((EditText) findViewById(R.id.dropofflocation)).getText().toString();
	    String dropoffintersec= ((EditText) findViewById(R.id.dropoffintersec)).getText().toString();
	    String numseats= ((EditText) findViewById(R.id.numseats)).getText().toString();
	    String pickupdate = ((EditText) findViewById(R.id.pickupdate)).getText().toString();
	    String pickuptime = ((EditText) findViewById(R.id.pickuptime)).getText().toString();
	    String lengthride= ((EditText) findViewById(R.id.lengthride)).getText().toString();
	    String price= ((EditText) findViewById(R.id.price)).getText().toString();
	    //Boolean luggagespace = ((RadioButton) findViewById(R.id.luggagespace)).isChecked();
	    
	    
		ParseObject rides = new ParseObject("rides");
		rides.put("user", Menuscreen.username1);
		rides.put("pickuplocation", pickuplocation);
		rides.put("pickupintersec", pickupintersec);
		rides.put("dropofflocation", dropofflocation);
		rides.put("dropoffintersec", dropoffintersec);
		rides.put("numseats", numseats);
		rides.put("pickupdate", pickupdate);
		rides.put("pickuptime", pickuptime);
		rides.put("lengthride", lengthride);
		rides.put("price", price);
		//rides.put("luggagespace", luggagespace);
		rides.put("cancelled", "false");
		
		//more fields
		rides.saveInBackground();
		
		startActivity(intent);
	}

	

	
}
