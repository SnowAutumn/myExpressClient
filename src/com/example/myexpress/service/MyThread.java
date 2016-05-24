package com.example.myexpress.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

import com.example.myexpress.LoginActivity;

import entity.CMessage;


public class MyThread extends Thread implements Serializable {
	private Socket s;
	/**
     * ���������������
     */
	private boolean result;
	private Object obj;
	private boolean flag = false;
	
	public MyThread(Object obj)
	{
		this.obj = obj;
	}
	
	public void setFlag(boolean flag)
	{
		this.flag = flag;
	}
	
	public boolean getFlag()
	{
		return flag;
	}
	
	public void run()
	{
		result = sendLoginInfo(obj);
		flag = true;
	}
	
	public boolean getResult()
	{
		return result;
	}
	
	private boolean sendLoginInfo(Object obj)
	{
		boolean b = false;
		try
		{	
			try
			{
				//���÷���˵�dstName��dstPost
				 s = new Socket("10.0.2.2", 9987);
			}
			catch (IOException e){
                e.printStackTrace();
                //���ӷ�������ʱ
            }
			//�������
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(obj);
            oos.flush();
            //���շ���˵���Ӧ
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            CMessage msg = (CMessage)ois.readObject();
            System.out.println(msg.getType());
            //�������˷���SUCCESSʱ
            if(CMessage.SUCCESS.equals(msg.getType()))
            {
            	//����һ�����˺źͷ������������ӵ��߳�
                //����
                b = true;
            }
            else if(CMessage.FAIL.equals(msg.getType()))
            {
            	b = false;
            }
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return b;
	}
}
