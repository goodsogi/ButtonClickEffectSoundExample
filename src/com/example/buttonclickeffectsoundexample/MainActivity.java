package com.example.buttonclickeffectsoundexample;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	private SoundPool mSoundPool;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mSoundPool =  new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
		
		mSoundPool.setOnLoadCompleteListener (new OnLoadCompleteListener() {
		    @Override
		    public void onLoadComplete(SoundPool soundPool, int soundId, int status) {
		         soundPool.play(soundId, 100, 100, 1, 0, 1.0f); 
		    }
		});
	}

	public void playSound(View v) {
//		SoundPool sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
//
//		int iTmp = sp.load(this, R.raw.sms_iphone_sms, 1); // in 2nd param u have to pass your desire ringtone
//
//		sp.play(iTmp, 1, 1, 0, 0, 1);
		
//		MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sms_iphone_sms); // in 2nd param u have to pass your desire ringtone
//		//mPlayer.prepare();
//		mPlayer.start();
		
		mSoundPool.load(this, R.raw.sms_iphone_sms, 1);
		
	}

}
