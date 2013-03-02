package com.flatearthstudios.flagquest;

import java.util.Random;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class South extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.southamerica);
        
      //Initialize Random
    	Random rand;
    	//Define minimum and maximum values
    	int min = 0;
    	int max = 9;
    	//Initialize a variable to store random
    	rand = new Random();
    	//Turns random into the next integer within the minimum and maximum values
    	int randomNum = rand.nextInt(max - min + 1) + min;
        //Accesses Text View by the ID    
        final TextView setTextView = ((TextView) findViewById (R.id.txtSouth));
        Resources res = getResources();
        //Retrieves string array from strings.xml and stores it in the variable 'country'
        final String[] country = res.getStringArray(R.array.south_country_names);
        //The country variable can now declare any item in the array by indicating its position
        setTextView.setText(country[randomNum]);
        
	};
	
}//End South Activity
