package com.blog.listener;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.blog.dao.InitialDao;
import com.blog.pojo.ArticleBean;


/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��5��
 *
 * @˵�� �ڷ���������ʱ�ͼ�����ҳ����
 */
public class AllArticlesListener implements ServletContextListener {
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		WebApplicationContext webAC = WebApplicationContextUtils.
				getWebApplicationContext(arg0.getServletContext());
		InitialDao<ArticleBean> initDao = (InitialDao<ArticleBean>) webAC.getBean("initDao");
		List<ArticleBean> list = initDao.getAllArticle(1);
		webAC.getServletContext().setAttribute("mainArticles", list);
	}

}
