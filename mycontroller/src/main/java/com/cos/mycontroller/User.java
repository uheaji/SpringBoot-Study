package com.cos.mycontroller;

public class User {
	// 1. 필드확인
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	// 2. setter호출
	public void setUsername(String username) {
		System.out.println("setUsername() 실행됨");
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setPassword() 실행됨");
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
