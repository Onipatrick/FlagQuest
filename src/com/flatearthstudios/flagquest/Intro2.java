package com.flatearthstudios.flagquest;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Intro2 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro2);
		
		TimerTask task = new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				startActivity(new Intent(Intro2.this, Intro3.class));
			}
		
	};
	
	Timer opening = new Timer();
	opening.schedule(task,4000);

}
	
}