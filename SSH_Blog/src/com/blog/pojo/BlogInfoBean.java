package com.blog.pojo;

import java.io.Serializable;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��6��
 *
 * @˵�� �û��Ĳ��͸��Ի�����
 */
@SuppressWarnings("serial")
public class BlogInfoBean implements Serializable {
	private String username;
	private String blogtitle;
	private String idiograph;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getIdiograph() {
		return idiograph;
	}
	public void setIdiograph(String idiograph) {
		this.idiograph = idiograph;
	}
}
