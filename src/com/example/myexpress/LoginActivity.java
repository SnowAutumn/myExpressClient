package com.example.myexpress;

import com.example.myexpress.service.MyThread;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import entity.User;

public class LoginActivity extends Activity{
	private EditText username;
	private EditText password;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_login);
		
		username = (EditText)findViewById(R.id.username);
		password = (EditText)findViewById(R.id.password);		
	
	    Button login = (Button)findViewById(R.id.login);
	    Button register = (Button)findViewById(R.id.register);
	    Button login_error = (Button)findViewById(R.id.login_error);
	    
	    //��¼��Ӧ
		login.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				User user = new User();
				user.setUsername(username.getText().toString());//�û���
				user.setPassword(password.getText().toString());//����
				user.setOperation("login");
				MyThread myThread = new MyThread(user);
				myThread.start();
				while(!myThread.getFlag())
				{
				}
				myThread.setFlag(false);
				boolean b = myThread.getResult();
				if (b)//�����½�ɹ�
				{
					Intent intent = new Intent(LoginActivity.this,LoadingActivity.class);
					startActivity(intent);
				}
				else//��¼ʧ�ܣ�ͨ��Toast���û���ʾ��¼ʧ��
				{
					Toast.makeText(LoginActivity.this, "��¼ʧ�ܣ���������Ϊʲô...", Toast.LENGTH_LONG).show();
				}
			}
		});	
		
		//ע����Ӧ
		register.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
				startActivity(intent);
			}
		});	
		
		//����������Ӧ
		login_error.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(LoginActivity.this,MainExpress.class);
				startActivity(intent);
			}
		});	
	}
}
