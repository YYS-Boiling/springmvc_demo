package org.yys.springmvc.model;

public class User {
	private String username;
	private String password;
	private String nickname;
	private String  email;
	
	public User() {}//无参构造
	public User(String username, String password, String nickname, String email) {//有参构造
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {//展示User时方便使用
		return "User [username=" + username + ", password=" + password
				+ ", nickname=" + nickname + ", email=" + email + "]";
	}
	
	
}
