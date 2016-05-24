package entity;

import java.io.Serializable;
import java.net.Socket;

/**
 * 封装客户端的信息
 * 
 */
public class Client{
	
	private User user;//客户端的所属的用户
	private Socket socket;//客户端套接字
	
	public Client() {
		super();
	}

	public Client(User user, Socket socket) {
		super();
		this.user = user;
		this.socket = socket;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public boolean equals(Object obj) {
		Client client = (Client) obj;
		return this.getUser().equals(client.getUser());
	}
	
	@Override
	public int hashCode() {
		return this.getUser().hashCode();
	}
}

