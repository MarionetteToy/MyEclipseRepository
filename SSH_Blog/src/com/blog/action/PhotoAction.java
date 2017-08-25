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
 * @作者 YXD
 *
 * @时间 2017年3月6日
 *
 * @说明 图片上传
 */
@SuppressWarnings("serial")
public class PhotoAction extends ActionSupport {

	@Resource(name="userService")
	private UserService userService;
	
	//文件
	private File userPhoto;
	//上传文件名
	private String userPhotoFileName;
	//文件上传类型
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
			//设置目标文件（根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例）  
            File savefile = new File(realpath,userPhotoFileName);  

            // 判断上传目录是否存在            
            if(!savefile.getParentFile().exists())  
                  savefile.getParentFile().mkdirs();  

            //把文件userPhoto 拷贝到 savefile 里,FileUtils类需要commons-io-x.x.x.jar包支持  
            FileUtils.copyFile(userPhoto,savefile);
            //保存路径到数据库
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
