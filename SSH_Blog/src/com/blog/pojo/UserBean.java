package com.blog.pojo;

import java.io.Serializable;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��4��
 *
 * @˵�� �û�ʵ����
 */
@SuppressWarnings("serial")
public class UserBean implements Serializable {
	private String username;	//�û�����
	private String password;	//�û�����
	private String nickname;	//�û��ǳ�
	private String question;	//�û�����
	private String answer;		//�û���
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
