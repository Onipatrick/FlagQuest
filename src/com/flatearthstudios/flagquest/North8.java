package com.flatearthstudios.flagquest;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class North8 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.northamerica8);
        
            //Accesses Text View by the ID    
            final TextView setTextView = ((TextView) findViewById (R.id.txtNorth));
            Resources res = getResources();
            //Retrieves string array from strings.xml and stores it in the variable 'country'
            final String[] country = res.getStringArray(R.array.north_country_names);
            //The country variable can now declare any item in the array by indicating its position
            setTextView.setText(country[7]);
            
            
            final MediaPlayer mpCorrect;
			final MediaPlayer mpIncorrect;
            mpCorrect = MediaPlayer.create(this, R.raw.correct);
            mpIncorrect = MediaPlayer.create(this, R.raw.incorrect);
            
            //If flag 1
        	ImageView imgBtnNorth = (ImageView) findViewById(R.id.flag1_1);
    		imgBtnNorth.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View v) {
    				
    				mpIncorrect.start();
    				Toast.makeText(North8.this, "Incorrect, please try again.", Toast.LENGTH_SHORT).show();
    			}

            	
            });

    		//If flag 2
    		ImageView imgBtnSouth = (ImageView) findViewById(R.id.flag1_2);
    		imgBtnSouth.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View v) {
    				mpCorrect.start();    				
    				startActivity(new Intent(North8.this, North9.class));
    			}

            	
            });

    		//If flag 3
    		ImageView imgBtnEurope = (ImageView) findViewById(R.id.flag1_3);
    		imgBtnEurope.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View v) {
    				mpIncorrect.start();
    				Toast.makeText(North8.this, "Incorrect, please try again.", Toast.LENGTH_SHORT).show();
    			}

            	
            });

  

	};

}//End North Activity
