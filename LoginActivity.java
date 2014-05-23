package com.techtrendz.kwiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class LoginActivity extends Activity{

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		//Email
		LinearLayout l1 = (LinearLayout) findViewById(R.id.linearLayout1);
        l1.setBackgroundColor(Color.GRAY);

		//Google
		LinearLayout l2 = (LinearLayout) findViewById(R.id.linearLayout2);
        l2.setBackgroundColor(Color.RED);
        
        //
		LinearLayout l3 = (LinearLayout) findViewById(R.id.linearLayout3);
        l3.setBackgroundColor(Color.BLUE);
        
        //Twitter
		LinearLayout l4 = (LinearLayout) findViewById(R.id.linearLayout4);
        l4.setBackgroundColor(Color.GREEN);
        
        //Account
		LinearLayout l5 = (LinearLayout) findViewById(R.id.LinearLayout01);
        l5.setClickable(true);
        l5.setOnTouchListener(new OnTouchListener()
        {
        	@Override
        	public boolean onTouch(View arg0, android.view.MotionEvent arg1)
        	{
        		//Intent intent = new Intent().setClass(LoginActivity.this, SignIn.class);
        		Intent intent = new Intent().setClass(LoginActivity.this, SignUp.class);
				startActivity(intent);
				finish();
				return true;
        	}
        });

	}
}
