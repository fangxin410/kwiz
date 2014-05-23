package com.techtrendz.kwiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends Activity {

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin);
		View signin = (View)findViewById(R.id.button1);
		signin.setBackgroundResource(R.drawable.sign_in_btn);
		//Button button = (Button)signin;
		//button.setHeight(25);
		TextView textView = (TextView)signin;
		textView.setText("");
	}
}
