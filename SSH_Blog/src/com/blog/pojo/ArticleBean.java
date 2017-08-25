package com.blog.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月5日
 *
 * @说明 用户帖子类
 */
@SuppressWarnings("serial")
public class ArticleBean implements Serializable {
	private Integer id;
	private String title;
	private String contentA;
	private String username;
	private Date date;
	private Integer hasread;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContentA() {
		return contentA;
	}
	public void setContentA(String contentA) {
		this.contentA = contentA;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getHasread() {
		return hasread;
	}
	public void setHasread(Integer hasread) {
		this.hasread = hasread;
	}
}
