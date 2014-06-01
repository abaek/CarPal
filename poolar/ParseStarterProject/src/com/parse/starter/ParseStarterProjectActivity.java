package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ParseObject lolcat = new ParseObject("lolcat");
		lolcat.put("loser", "elvin yung");
		lolcat.put("name", "hi");
		lolcat.saveInBackground();
		
		setContentView(R.layout.main);
		

		ParseAnalytics.trackAppOpened(getIntent());
		

	}
}
