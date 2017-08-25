<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="col_right">
        <div id="search_box">
          <form action="" method="post">
            <div>
              <input type="text" name="search" />
            </div>
            <div class="button_wrapper">
              <input type="submit" value="Search" class="button" />
            </div>
            <div class="clear"> </div>
          </form>
        </div>
        <div id="sidebar">
          <h2>页面导航</h2>
          <ul>
          	<s:if test="#session.loginUser == null">
				<li><a href="${pageContext.request.contextPath }/user_mainPage.action">博客首页</a></li>
				<li><a href="${pageContext.request.contextPath }/user_registerPage.action">新博客注册</a></li>
				<li><a href="${pageContext.request.contextPath }/user_loginPage.action">博客登录</a></li>
			</s:if>
			<s:else>
				<li><a href="${pageContext.request.contextPath }/user_mainPage.action">博客首页</a></li>
	        	<li><a href="${pageContext.request.contextPath }/user_showUserAllArticlePage.action">用户首页</a></li>
	        	<li><a href="${pageContext.request.contextPath }/user_editTypePage.action">个性化设置</a></li>
	        	<li><a href="${pageContext.request.contextPath }/user_addArticlePage.action">写日志</a></li>
	       		<li><a href="${pageContext.request.contextPath }/user_showPhotoPage.action">相册</a></li>
			</s:else>
          </ul>
        </div>
      </div>