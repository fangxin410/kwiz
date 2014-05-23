package com.techtrendz.kwiz;

import java.util.Timer;
import java.util.TimerTask;



import com.techtrendz.kwiz.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Splash extends Activity{
	
	public static final int TIMEOUT_MILLISEC=5000;
	
	ImageView mLogo;
	public static final int STATE_REPLACE = 6;
    private Thread mThread;
    private Timer mTimer=null;
    private TimerTask mTask=null;
    static public int counter = 1;
    String username = "";
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        
        SharedPreferences settings = getSharedPreferences("wifidirect", 0);
        
        username = settings.getString("username", "");
        
       
        mThread = new MyThread(); 
        mThread.run();
		
    }
    static Intent sharedData = null;
    
    class MyThread extends Thread{
    	private Intent mIntent;
    	private Timer mTimer=null;
    	private TimerTask mTask=null;
    	private TimerTask mTask1=null;
    	public MyThread(){
    		
    		if (username.equals(""))
    			sharedData =  new Intent().setClass(Splash.this, LoginActivity.class);
    		else
    		{
    			sharedData =  new Intent().setClass(Splash.this, MainActivity.class);
    		}
    		mTimer = new Timer();
    		mTask = new TimerTask(){
    			public void run(){
    				startActivity(sharedData);
    				finish();
    			}
    		};
    		
    		
    		
    	}
    		
    	public void run(){
    		mTimer.schedule(mTask, 3000);
    		
    	}
    }
    
   


}



