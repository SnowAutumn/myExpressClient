package com.example.myexpress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;


public class TopRightDialog extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.topright_dialog_layout);
	}
	
	public void senddongtai(View v){
		Intent intent = new Intent(TopRightDialog.this, SenddongtaiActivity.class);
		startActivity(intent);
	}
	public void addfriend(View v){
		Intent intent = new Intent(TopRightDialog.this, AddFriendActivity.class);
		startActivity(intent);
	}
	public void maybefriend(View v){
		Intent intent = new Intent(TopRightDialog.this, TopRightDialog.class);
		startActivity(intent);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event){
		finish();
		return true;
	}
	
}

