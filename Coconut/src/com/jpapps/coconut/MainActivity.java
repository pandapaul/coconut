package com.jpapps.coconut;

import com.example.coconut.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	MediaPlayer coconutMP, stopMP;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		coconutMP = new MediaPlayer().create(this, R.raw.coconut);
		stopMP = new MediaPlayer().create(this, R.raw.stopping);
		
		Button coconutButton = (Button) this.findViewById(R.id.button_coconut);
		coconutButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(coconutMP.isPlaying()) {
					coconutMP.seekTo(0);
				} else {
					coconutMP.start();
				}
			}
		});
		coconutButton.setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				if(coconutMP.isPlaying()) {
					coconutMP.pause();
					coconutMP.seekTo(0);
				}
				if(stopMP.isPlaying()) {
					stopMP.seekTo(0);
				} else {
					stopMP.start();
				}
				return true;
			}
		});
	}

}
