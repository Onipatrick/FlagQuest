package com.flatearthstudios.flagquest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ImageView imgBtnNorth = (ImageView) findViewById(R.id.imgBtnNorth);
		imgBtnNorth.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Main.this, North.class));
			}

        	
        });

		ImageView imgBtnSouth = (ImageView) findViewById(R.id.imgBtnSouth);
		imgBtnSouth.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Main.this, South.class));
			}

        	
        });

		ImageView imgBtnEurope = (ImageView) findViewById(R.id.imgBtnEurope);
		imgBtnEurope.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Main.this, Europe.class));
			}

        	
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
