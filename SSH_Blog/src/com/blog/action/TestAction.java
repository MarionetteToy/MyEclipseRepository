package com.blog.action;


import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction extends ActionSupport {

	public String testLogin() throws Exception {
		return "login";
	}
	
	public String testRegister() throws Exception {
		return "register";
	}
	
	public String testError() {
		return "error";
	}
	
	public String testSuccess() {
		return "success";
	}
	
	public String testShowAllArticle() {
		return "showAllArticle";
	}
	
	public String testAddArticle() {
		return "addArticle";
	}
	
	public String testEditBlogInfo() {
		return "editBlogInfo";
	}
	
	public String testShowArticle() {
		return "showArticle";
	}
	
	public String testShowPhoto() {
		return "showPhoto";
	}
}
