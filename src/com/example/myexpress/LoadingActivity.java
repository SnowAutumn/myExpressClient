package com.example.myexpress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Toast;

public class LoadingActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){ 
		super.onCreate(savedInstanceState);	
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.loading);
		
		//�ӳ�2����ת
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent intent = new Intent(LoadingActivity.this,MainExpress.class);
				startActivity(intent);
				LoadingActivity.this.finish();
				Toast.makeText(getApplicationContext(), "��½�ɹ�", Toast.LENGTH_SHORT).show();				
			}
		},2000);
	}
}
