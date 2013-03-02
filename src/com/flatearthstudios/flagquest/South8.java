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

public class South8 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.southamerica8);
        
            //Accesses Text View by the ID    
            final TextView setTextView = ((TextView) findViewById (R.id.txtSouth));
            Resources res = getResources();
            //Retrieves string array from strings.xml and stores it in the variable 'country'
            final String[] country = res.getStringArray(R.array.south_country_names);
            //The country variable can now declare any item in the array by indicating its position
            setTextView.setText(country[7]);
            
            
            final MediaPlayer mpCorrect;
			final MediaPlayer mpIncorrect;
            mpCorrect = MediaPlayer.create(this, R.raw.correct);
            mpIncorrect = MediaPlayer.create(this, R.raw.incorrect);
            
            //If flag 1
        	ImageView imgBtnFlag1 = (ImageView) findViewById(R.id.flag1_1);
    		imgBtnFlag1.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View v) {
    				
    				mpIncorrect.start();
    				Toast.makeText(South8.this, "Incorrect, please try again.", Toast.LENGTH_SHORT).show();
    			}

            	
            });

    		//If flag 2
    		ImageView imgBtnFlag2 = (ImageView) findViewById(R.id.flag1_2);
    		imgBtnFlag2.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View v) {
    				mpCorrect.start();    				
    				startActivity(new Intent(South8.this, South9.class));
    			}

            	
            });

    		//If flag 3
    		ImageView imgBtnFlag3 = (ImageView) findViewById(R.id.flag1_3);
    		imgBtnFlag3.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View v) {
    				mpIncorrect.start();
    				Toast.makeText(South8.this, "Incorrect, please try again.", Toast.LENGTH_SHORT).show();
    			}

            	
            });

  

	};

}//End North Activity
