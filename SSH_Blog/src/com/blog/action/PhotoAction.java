package com.blog.action;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.blog.pojo.PhotoBean;
import com.blog.pojo.UserBean;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��6��
 *
 * @˵�� ͼƬ�ϴ�
 */
@SuppressWarnings("serial")
public class PhotoAction extends ActionSupport {

	@Resource(name="userService")
	private UserService userService;
	
	//�ļ�
	private File userPhoto;
	//�ϴ��ļ���
	private String userPhotoFileName;
	//�ļ��ϴ�����
	private String userPhotoContentType;
	public File getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(File userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getUserPhotoFileName() {
		return userPhotoFileName;
	}
	public void setUserPhotoFileName(String userPhotoFileName) {
		this.userPhotoFileName = userPhotoFileName;
	}
	public String getUserPhotoContentType() {
		return userPhotoContentType;
	}
	public void setUserPhotoContentType(String userPhotoContentType) {
		this.userPhotoContentType = userPhotoContentType;
	}
	
	public String photoUpload() throws IOException {
		String realpath = ServletActionContext.getServletContext().getRealPath("/userImg");
		if(userPhoto != null) {
			//����Ŀ���ļ������� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����  
            File savefile = new File(realpath,userPhotoFileName);  

            // �ж��ϴ�Ŀ¼�Ƿ����            
            if(!savefile.getParentFile().exists())  
                  savefile.getParentFile().mkdirs();  

            //���ļ�userPhoto ������ savefile ��,FileUtils����Ҫcommons-io-x.x.x.jar��֧��  
            FileUtils.copyFile(userPhoto,savefile);
            //����·�������ݿ�
            UserBean user = (UserBean) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
            PhotoBean photo = new PhotoBean();
            photo.setUsername(user.getUsername());
//            ActionContext ac = ActionContext.getContext(); 
//            ServletContext sc = (ServletContext) ac.get(ServletActionContext.SERVLET_CONTEXT); 
//            String path = sc.getRealPath("/");
            photo.setPicUrl("\\" + "SSH_Blog" +"\\userImg\\" + userPhotoFileName);
            userService.savePhoto(photo);
		}
		return "photoUploadSuccess";
	}
}
