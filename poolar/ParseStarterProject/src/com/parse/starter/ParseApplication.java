package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "GCyYI6ZlqXcW8fk62q7wf0MX8vQWw3BONhr9SUvu", "qXeksIE47V2JRiOJSoacw3rBuLH4aQlX9GIQrv70");
		
		
		
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		
		ParseACL.setDefaultACL(defaultACL, true);
		
		
	}

}
