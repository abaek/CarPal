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
import android.widget.TextView;
import android.os.Build;

public class Singleride extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_singleride);
		
		CarPosting specificPosting = new CarPosting(); //suppose to get from other page!!!!
		

			TextView pickUp = (TextView) findViewById(R.id.pickUp);
			pickUp.setText(specificPosting.getPickUpLocation());

			
			
			TextView pickUpDate = (TextView) findViewById(R.id.pickUpDate);
			pickUpDate.setText(specificPosting.getPickUpTime().toString());
			
			TextView pickUpIntersec = (TextView) findViewById(R.id.pickUpIntersec);
			pickUpIntersec.setText(specificPosting.getPickUpIntersec());

/*			TextView rideLength = (TextView) findViewById(R.id.rideLength);
			rideLength.setText(specificPosting.getRideLength());
			
			TextView luggage = (TextView) findViewById(R.id.luggage);
			luggage.setText(specificPosting.getLuggageSpace().toString());
		
			TextView numSeats = (TextView) findViewById(R.id.numSeats);
			numSeats.setText(specificPosting.getNumSeats());*/
			
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.singleride, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_singleride,
					container, false);
			return rootView;
		}
	}

}