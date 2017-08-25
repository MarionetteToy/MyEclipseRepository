package com.blog.dao;

import java.util.List;

import com.blog.pojo.ArticleBean;
import com.blog.pojo.BlogInfoBean;
import com.blog.pojo.PhotoBean;
import com.blog.pojo.UserBean;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��4��
 *
 * @˵�� �û��־ò�ӿ�
 */
public interface UserDao {
	//ͨ��username��ȡ�û�����
	public UserBean getByUsername(String username);
	//�����û�
	public boolean saveUser(UserBean user);
	//���͸��Ի�����
	public boolean saveBlogInfo(BlogInfoBean blog);
	//д��־
	public boolean saveArticle(ArticleBean article);
	//�����û�ͼƬ
	public boolean savePhoto(PhotoBean photo);
	//��ȡ�û�ͼƬ
	public List<PhotoBean> getPhoto(String username);
	//��ȡ�û���������
	public List<ArticleBean> getUserArticle(String username);
	//��ҳ��ʾ����
	public List<ArticleBean> getUserPageArticle(String username, int currPage);
	//��ȡ��������
	public List<ArticleBean> getAllArticle();
	//��ҳ��ѯ����
	public List<ArticleBean> getAllArticle(int currentPage);
	//��ȡ����ĳһ����¼
	public ArticleBean getArticle(Integer id);
}
