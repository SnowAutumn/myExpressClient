package com.example.myexpress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.view.View.OnClickListener;

public class RegisterActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_register);
	}
	
	// ������ ���ذ�ť
	public void register_back(View v){ 
		this.finish();
	}
	
	// ��������ɼ��԰�ť
	public void pws_eye(View v){ 
		this.finish();
	}
	
	// ������֤�밴ť
	public void yanzhengma(View v){ 
		this.finish();
	}
	
	// ע�ᰴť
	public void register2(View v){ 
		this.finish();
	}
	
	//���ص�¼����
	public void login2(View v){ 
		Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
		startActivity(intent);
	}
}
