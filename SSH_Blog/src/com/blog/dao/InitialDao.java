package com.blog.dao;

import java.util.List;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��5��
 *
 * @˵�� Tomcat��������������Ҫ���ص�����
 */
public interface InitialDao<T> {
	
	//��ѯ��������
	public List<T> getAllArticle(int currentPage);
}
