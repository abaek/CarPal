package com.example.pebblepace;

import java.util.UUID;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.Constants;
import com.getpebble.android.kit.util.PebbleDictionary;

import java.util.Random;

public class MainActivity extends ActionBarActivity {
	
	public final static String EXTRA_MESSAGE = "yolo";
	
	//MY FUNCTION IS HERE
	public void sendMessage(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
	
	
	//MY FUNCTION IS HERE
		public void showNum(View view) {
			UUID PEBBLE_APP_UUID = UUID.fromString("EC7EE5C6-8DDF-4089-AA84-C3396A11CC95");
			/*TextView textView = new TextView(this);
		    textView.setTextSize(40);
		    textView.setText("4");
		    setContentView(textView);*/
			TextView tv = (TextView) findViewById(R.id.edit_message);
		    boolean connected = PebbleKit.isWatchConnected(getApplicationContext());
		    //Log.i(getLocalClassName(), "Pebble is " + (connected ? "connected" : "not connected"));
		    tv.setText((connected ? "connected" : "not connected"));
		    PebbleKit.startAppOnPebble(getApplicationContext(), PEBBLE_APP_UUID);
		}
		
		public void activity1(View view) {
			Intent intent= new Intent(this, ExampleSportsActivity.class);
			startActivity(intent);
			
			
		}
		
		
		
	//private final static UUID PEBBLE_APP_UUID = UUID.fromString("EC7EE5C6-8DDF-4089-AA84-C3396A11CC95");
	

	
	
	//boolean connected = PebbleKit.isWatchConnected(getApplicationContext());
	//Log.i(getLocalClassName(), "Pebble is " + (connected ? "connected" : "not connected"));
	//System.out.println("Im connected");
	
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
