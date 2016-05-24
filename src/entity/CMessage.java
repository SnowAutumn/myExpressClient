package entity;

import java.io.Serializable;

public class CMessage implements Serializable {
	private static final long serialVersionUID = 514438943839790151L;
	public static final String SUCCESS="1";//�����Ƿ�ɹ�
	public static final String FAIL="2";//����ʧ��
	public static final String ON_LINE = "ON_LINE";//�ͻ�������
	public static final String OUT_LINE = "OUT_LINE";//�ͻ�������
	public static final String CHATTING="CHATTING";//�ͻ�����������
	
	public String type;	
	private User receiver; //������Ϣ���û�	
	private User sender; //������Ϣ���û�	
	private Object content; //��Ϣ����
	
	public String getType()//��Ϣ����
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
