package com.blog.pojo;

import java.io.Serializable;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月6日
 *
 * @说明 用户的博客个性化设置
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
