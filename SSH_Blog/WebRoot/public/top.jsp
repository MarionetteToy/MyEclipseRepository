<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="scene"> <img src="${pageContext.request.contextPath}/images/scene.jpg" alt="" />
     <h1>博客网站系统</h1>
     <div id="scale_area">
       <div id="scale_knob">&raquo; Font Size &laquo;</div>
     </div>
     <div id="menu">
		<s:if test="#session.loginUser == null">
			<div class="holder"> <a href="${pageContext.request.contextPath }/user_mainPage.action">博客首页</a> </div>
			<div class="holder"> <a href="${pageContext.request.contextPath }/user_registerPage.action">新博客注册</a> </div>
			<div class="holder"> <a href="${pageContext.request.contextPath }/user_loginPage.action">博客登录</a> </div>
		</s:if>
		<s:else>
			<div class="holder"> <a href="${pageContext.request.contextPath }/user_mainPage.action">博客首页</a> </div>
	        <div class="holder"> <a href="${pageContext.request.contextPath }/user_showUserAllArticlePage.action">用户首页</a> </div>
	        <div class="holder"> <a href="${pageContext.request.contextPath }/user_editTypePage.action">个性化设置</a> </div>
	        <div class="holder"> <a href="${pageContext.request.contextPath }/user_addArticlePage.action">写日志</a> </div>
	        <div class="holder"> <a href="${pageContext.request.contextPath }/user_showPhotoPage.action">相册</a> </div>
	        <div class="holder"> <a href="${pageContext.request.contextPath }/user_quit.action">退出</a> </div>
		</s:else>
     </div>
</div>