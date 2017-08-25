<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>木偶博客系统注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" media="all" />
<!--[if IE 6]><link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/ie6.css" media="all" /><![endif]-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/mootools.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/site.js"></script>
</head>
<body>
<div id="wrapper">
  <div id="container">
    <%@ include file="/public/top.jsp" %>
    <div id="content">
      <div id="col_left">
        <div class="post">
          <div class="meta"></div>
          <div class="comments"><div class="comment"></div>
            <h2>新博客注册</h2>
            <form class="h" action="${pageContext.request.contextPath }/user_register.action" method="post">
              <div>
                <label>帐号:</label>
                <input type="text" name="username"/>*
                <s:fielderror><s:param>username</s:param></s:fielderror>
              </div>
              <div>
                <label>密码:</label>
               <input type="password" name="password"/>*
               <s:fielderror><s:param>password</s:param></s:fielderror>
              </div>
			   <div>
                <label>确认密码:</label>
                <input type="password" name="repassword"/>*
                <s:fielderror><s:param>repassword</s:param></s:fielderror>
              </div>
			   <div>
                <label>昵称:</label>
                <input type="text" name="nickname"/>*
                <s:fielderror><s:param>nickname</s:param></s:fielderror>
              </div>
			   <div>
                <label>密码保护问题:</label>
                <input type="text" name="question"/>*
				<s:fielderror><s:param>question</s:param></s:fielderror>
              </div>
			   <div>
                <label>密码保护的答案:</label>
                <input type="text" name="answer"/>*
                <s:fielderror><s:param>answer</s:param></s:fielderror>
              </div>
              <div>
                <label></label>
                <div class="clear"> </div>
              </div>
              <div class="button_wrapper">
                <input name="提交" type="submit" class="button" value="注册" />
              </div>
            </form>
          </div>
        </div>
      </div>
      <%@ include file="/public/right.jsp" %>
      <div class="clear"> </div>
    </div>
    <%@ include file="/public/foot.jsp" %>
  </div>
</div>
</body>
</html>
