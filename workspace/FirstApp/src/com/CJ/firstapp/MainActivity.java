package com.CJ.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnadd = (Button)this.findViewById(R.id.btnadd);
		Button btnminus = (Button)this.findViewById(R.id.btnminus);
		Button btnreset = (Button)this.findViewById(R.id.btnreset);
		final EditText txtcounter = (EditText)this.findViewById(R.id.txtcounter);
		
		btnadd.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View view) 
			{
				int ivalue;
				
				ivalue = Integer.parseInt(txtcounter.getText().toString());
				ivalue = ivalue + 1;
				txtcounter.setText(String.valueOf(ivalue));
			}
		});
		
		btnminus.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View view) 
			{
				int ivalue;
				
				ivalue = Integer.parseInt(txtcounter.getText().toString());
				ivalue = ivalue - 1;
				txtcounter.setText(String.valueOf(ivalue));
			}
		});
		
		btnreset.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View view) 
			{
				int ivalue;
				
				ivalue = Integer.parseInt(txtcounter.getText().toString());
				ivalue = 0;
				txtcounter.setText(String.valueOf(ivalue));
			}
		});

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

	

}
