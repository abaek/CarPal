package com.example.pebblepace;

import java.util.UUID;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;

import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.util.PebbleDictionary;


public class ExampleSportsActivity extends ActionBarActivity {

	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Get the message from the intent
	    Intent intent = getIntent();

	    // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    
	    
	    UUID PEBBLE_APP_UUID = UUID.fromString("EC7EE5C6-8DDF-4089-AA84-C3396A11CC95");
	    
	    boolean connected = PebbleKit.isDataLoggingSupported(getApplicationContext());
	    textView.setText((connected ? "connected" : "not connected"));
		
		
		
	    PebbleDictionary data = new PebbleDictionary();
	    data.addUint8(0, (byte) 42);
	    data.addString(1, "a string");
	    PebbleKit.sendDataToPebble(getApplicationContext(), PEBBLE_APP_UUID, data);
		
		
		
		//setContentView(R.layout.activity_example_sports);
		
		
	    PebbleKit.registerPebbleConnectedReceiver(getApplicationContext(), new BroadcastReceiver() {
			  @Override
			  public void onReceive(Context context, Intent intent) {
			    Log.i(getLocalClassName(), "Pebble connected!");
			  }
			});
		/*TextView tv = (TextView) findViewById(R.id.textView1);
	    boolean connected = PebbleKit.isWatchConnected(getApplicationContext());
	    tv.setText((connected ? "connected" : "not connected"));
	    PebbleKit.startAppOnPebble(getApplicationContext(), PEBBLE_APP_UUID);*/
		
	    setContentView(textView);

	}
	
	

	
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example_sports, menu);
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
	*/
	
	
	
	
	

	/**
	 * A placeholder fragment containing a simple view.
	 */
	
	
	
	
	/*public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_example_sports,
					container, false);
			return rootView;
		}
	}*/

}
