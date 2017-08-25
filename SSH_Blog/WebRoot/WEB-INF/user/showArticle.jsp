<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
<title>我的文章</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css//main.css" media="all" />
<!--[if IE 6]><link type="text/css" rel="stylesheet" href="css/ie6.css" media="all" /><![endif]-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js//mootools.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js//site.js"></script>
</head>
<body>
<div id="wrapper">
  <div id="container">
    <%@ include file="/public/top.jsp" %>
    <div id="content">
      <div id="col_left">
        <div class="post">
          <div class="meta">
          	<h2>${sessionScope.articleDetail.title }</h2>
            <div class="clear"></div>
          </div>
          <div class="comments">
            <div class="comment">
              <div class="meta">
              <span>${sessionScope.articleDetail.contentA }</span>
                <div class="clear"> </div>
              </div>
            </div>
            </div>
          </div>
        </div>
      </div>
      <%@ include file="/public/right.jsp" %>
      <div class="clear"> </div>
    </div>
    <div id="footer">
      <div class="clear"> </div>
      <hr />
      <p class="credit">博客网站系统</p>
    </div>
  </div>
</body>
</html>
