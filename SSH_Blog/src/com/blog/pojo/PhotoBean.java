package com.blog.pojo;

import java.io.Serializable;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��6��
 *
 * @˵�� �û�ͼƬ
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
