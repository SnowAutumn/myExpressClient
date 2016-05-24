package entity;

import java.io.Serializable;

public class CMessage implements Serializable {
	private static final long serialVersionUID = 514438943839790151L;
	public static final String SUCCESS="1";//表明是否成功
	public static final String FAIL="2";//表明失败
	public static final String ON_LINE = "ON_LINE";//客户端上线
	public static final String OUT_LINE = "OUT_LINE";//客户端下线
	public static final String CHATTING="CHATTING";//客户端正在聊天
	
	public String type;	
	private User receiver; //接收消息的用户	
	private User sender; //发送消息的用户	
	private Object content; //消息内容
	
	public String getType()//信息类型
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public User getToUser() {
		return receiver;
	}

	public void setToUser(User receiver) {
		this.receiver = receiver;
	}

	public User getFromUser() {
		return sender;
	}

	public void setFromUser(User sender) {
		this.sender = sender;
	}
}
