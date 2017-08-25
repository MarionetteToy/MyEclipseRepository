package com.blog.pojo;

import java.io.Serializable;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月4日
 *
 * @说明 用户实体类
 */
@SuppressWarnings("serial")
public class UserBean implements Serializable {
	private String username;	//用户名称
	private String password;	//用户密码
	private String nickname;	//用户昵称
	private String question;	//用户问题
	private String answer;		//用户答案
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
	
}
