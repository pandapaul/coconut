package com.jpapps.coconut;

import com.example.coconut.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MediaPlayer coconutMP = new MediaPlayer().create(this, R.raw.coconut);
		MediaPlayer stopMP = new MediaPlayer().create(this, R.raw.stopping);
		
		Button coconutButton = (Button) this.findViewById(R.id.button_coconut);
		coconutButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
	}

}
