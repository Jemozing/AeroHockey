package com.aerohock.jemozstudio;

import android.os.Bundle;

import com.aerohock.jemozstudio.utils.Konstants;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.aerohock.jemozstudio.Main;


public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		Konstants.WIDTH = getApplicationContext().getResources().getDisplayMetrics().widthPixels;
		Konstants.HEIGHT = getApplicationContext().getResources().getDisplayMetrics().heightPixels;
		initialize(new Main(), config);
	}
}
