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
 * @���� YXD
 *
 * @ʱ�� 2017��3��4��
 *
 * @˵�� ����ҳ�����ת���û���¼��ע��
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

	private UserBean user = new UserBean();	//һ��Ҫʵ����
	@Override
	public UserBean getModel() {
		return user;
	}
	
	//��ת��¼ҳ��
	public String loginPage() {
		return "loginPage";
	}
	
	//��תע��ҳ��
	public String registerPage() {
		return "registerPage";
	}
	
	//�û���¼
	public String login() {
		if(userService.getByUsername(user.getUsername(), user.getPassword())) {
			ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
			//ServletActionContext.getRequest().getSession().setAttribute("loginSucc", "��¼�ɹ�");
			ServletActionContext.getRequest().getSession().setAttribute("succUrl", "user_mainPage.action");
			return "loginSuccess";
		} else {
			//ServletActionContext.getRequest().getSession().setAttribute("loginFail", "��¼ʧ��");
			ServletActionContext.getRequest().getSession().setAttribute("failUrl", "user_loginPage.action");
			return "loginFail";
		}
	}
	
	//�û�ע��
	public String register() {
		System.out.println(user);
		if(userService.saveUser(user)) {
			ServletActionContext.getRequest().getSession().setAttribute("username", user.getUsername());
			return "registerSuccess";
		} else {
			return "registerFail";
		}
	}
	
	//�û��˳�
	public String quit() {
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
	
	//��ת����̳��ҳ
	public String mainPage() {
		//��ȡ��ҳ��
		List<ArticleBean> list = userService.getAllArticle();
		int totalPage ;
		if(list.size() % 5 == 0) {
			totalPage = list.size() / 5;
		} else {
			totalPage = list.size() / 5 + 1;
		}
		//��ȡ��ǰҳ��
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
	
	//��ת���͸��Ի�����
	public String editTypePage() {
		return "editTypePage";
	}
	
	//��ת��־�༭ҳ��
	public String addArticlePage() {
		return "addArticlePage";
	}
	
	//��ת���ҳ��
	public String showPhotoPage() {
		UserBean userBean = (UserBean) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		//��ȡ�û����ڵ�ͼƬ
		List<PhotoBean> list = userService.getPhoto(userBean.getUsername());
		ServletActionContext.getRequest().getSession().setAttribute("photoList", list);
		return "showPhotoPage";
	}
	
	//��ת���û���ҳ
	public String showUserAllArticlePage() {
		UserBean userBean = (UserBean) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		//��ȡ��ҳ��
		List<ArticleBean> list = userService.getUserArticle(userBean.getUsername());
		int totalPage ;
		if(list.size() % 5 == 0) {
			totalPage = list.size() / 5;
		} else {
			totalPage = list.size() / 5 + 1;
		}
		//��ȡ��ǰҳ��
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
	
	//��ת�����¾���ҳ��
	public String showArticle() {
		Integer id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		ArticleBean article = userService.getArticle(id);
		ServletActionContext.getRequest().getSession().setAttribute("articleDetail", article);
		return "showArticlePage";
	}
	
}
