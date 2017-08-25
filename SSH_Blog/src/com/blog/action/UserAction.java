package com.blog.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.blog.pojo.ArticleBean;
import com.blog.pojo.PhotoBean;
import com.blog.pojo.UserBean;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月4日
 *
 * @说明 进行页面的跳转、用户登录、注册
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<UserBean> {
	@Resource(name="userService")
	private UserService userService;
	
	private String repassword;
	
	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	private UserBean user = new UserBean();	//一定要实例化
	@Override
	public UserBean getModel() {
		return user;
	}
	
	//跳转登录页面
	public String loginPage() {
		return "loginPage";
	}
	
	//跳转注册页面
	public String registerPage() {
		return "registerPage";
	}
	
	//用户登录
	public String login() {
		if(userService.getByUsername(user.getUsername(), user.getPassword())) {
			ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
			//ServletActionContext.getRequest().getSession().setAttribute("loginSucc", "登录成功");
			ServletActionContext.getRequest().getSession().setAttribute("succUrl", "user_mainPage.action");
			return "loginSuccess";
		} else {
			//ServletActionContext.getRequest().getSession().setAttribute("loginFail", "登录失败");
			ServletActionContext.getRequest().getSession().setAttribute("failUrl", "user_loginPage.action");
			return "loginFail";
		}
	}
	
	//用户注册
	public String register() {
		System.out.println(user);
		if(userService.saveUser(user)) {
			ServletActionContext.getRequest().getSession().setAttribute("username", user.getUsername());
			return "registerSuccess";
		} else {
			return "registerFail";
		}
	}
	
	//用户退出
	public String quit() {
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
	
	//跳转到论坛首页
	public String mainPage() {
		//获取总页数
		List<ArticleBean> list = userService.getAllArticle();
		int totalPage ;
		if(list.size() % 5 == 0) {
			totalPage = list.size() / 5;
		} else {
			totalPage = list.size() / 5 + 1;
		}
		//获取当前页数
		String current = (String)ServletActionContext.getRequest().getParameter("currentMainPage");
		int currentPage = 0;
		if(current == null || "".equals(current)) {
			currentPage = 1;
		} else if(Integer.parseInt(current) > totalPage) {
			currentPage = totalPage;
		} else {
			currentPage = Integer.parseInt(current);
		}
		List<ArticleBean> listPage = userService.getAllArticle(currentPage);
		ServletActionContext.getRequest().getSession().setAttribute("mainArticles", listPage);
		ServletActionContext.getRequest().getSession().setAttribute("currentMainPage", currentPage);
		ServletActionContext.getRequest().getSession().setAttribute("totalMainPage", totalPage);
		return "mainPage";
	}
	
	//跳转博客个性化设置
	public String editTypePage() {
		return "editTypePage";
	}
	
	//跳转日志编辑页面
	public String addArticlePage() {
		return "addArticlePage";
	}
	
	//跳转相册页面
	public String showPhotoPage() {
		UserBean userBean = (UserBean) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		//获取用户存在的图片
		List<PhotoBean> list = userService.getPhoto(userBean.getUsername());
		ServletActionContext.getRequest().getSession().setAttribute("photoList", list);
		return "showPhotoPage";
	}
	
	//跳转到用户首页
	public String showUserAllArticlePage() {
		UserBean userBean = (UserBean) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		//获取总页数
		List<ArticleBean> list = userService.getUserArticle(userBean.getUsername());
		int totalPage ;
		if(list.size() % 5 == 0) {
			totalPage = list.size() / 5;
		} else {
			totalPage = list.size() / 5 + 1;
		}
		//获取当前页数
		String current = (String)ServletActionContext.getRequest().getParameter("currentPage");
		int currentPage = 0;
		if(current == null || "".equals(current)) {
			currentPage = 1;
		} else if(Integer.parseInt(current) > totalPage) {
			currentPage = totalPage;
		} else {
			currentPage = Integer.parseInt(current);
		}
		List<ArticleBean> listPage = userService.getUserPageArticle(userBean.getUsername(), currentPage);
		ServletActionContext.getRequest().getSession().setAttribute("userArticles", listPage);
		ServletActionContext.getRequest().getSession().setAttribute("currentPage", currentPage);
		ServletActionContext.getRequest().getSession().setAttribute("totalPage", totalPage);
		return "showUserAllArticlePage";
	}
	
	//跳转到文章具体页面
	public String showArticle() {
		Integer id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		ArticleBean article = userService.getArticle(id);
		ServletActionContext.getRequest().getSession().setAttribute("articleDetail", article);
		return "showArticlePage";
	}
	
}
