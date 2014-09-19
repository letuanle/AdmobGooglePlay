package com.example.admobgoogleplay;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private AdRequest adRequest;
	private AdView adView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupads();
	}
	public void setupads() {
		adRequest = new AdRequest.Builder().build();
		adView = (AdView) findViewById(R.id.adView);
		adView.loadAd(adRequest);

	}
}
