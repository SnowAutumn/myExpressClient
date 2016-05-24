package entity;

import java.io.Serializable;

public class CMessage implements Serializable {
	public static final String SUCCESS="1";//表明是否成功
	public static final String FAIL="2";//表明失败
	public String type;
	public String getType()//信息类型
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
}
