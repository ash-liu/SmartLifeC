package com.smartlife.smartlifec;

import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Timer timer = new Timer();
		timer.schedule(task, 3000);
	}
	
	private TimerTask task = new TimerTask() {
		@Override
		public void run() {
			startActivity(new Intent(SplashActivity.this, PoolControlImplActivity.class));
			finish();
		}
	};
}