package com.rocks.wifipositioning;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button button1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.button1);
	    button1.setOnClickListener(new WifiListener());
		
	}
	
	    	class WifiListener implements OnClickListener
	    	{
	    	public void onClick(View v)
	    	{
	    		Intent intent=new Intent(getApplicationContext(), WifiActivity.class);
	    		startActivity(intent);
	    	}
	    	}

	    	}