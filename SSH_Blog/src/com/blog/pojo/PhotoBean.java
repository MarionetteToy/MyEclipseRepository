package com.blog.pojo;

import java.io.Serializable;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月6日
 *
 * @说明 用户图片
 */
@SuppressWarnings("serial")
public class PhotoBean implements Serializable {

	private Integer id;
	private String username;
	private String picUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
}
