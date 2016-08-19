package com.duan.ratingbarstart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;

public class MainActivity extends Activity {

	private RatingBar ratingBar1;
	private RatingBar ratingBar2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
		ratingBar2 = (RatingBar) findViewById(R.id.ratingBar2);
		
		ratingBar2.setNumStars(5);
		ratingBar2.setRating((float) 2.8);
	}

	
}
