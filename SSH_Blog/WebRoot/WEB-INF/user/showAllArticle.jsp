<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
<title>博客系统首页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" media="all" />
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
          <div class="meta"><a class="title" href="">博客系统首页</a>
            <div class="clear"></div>
          </div>
        <!-- 循环输出 -->
		<c:forEach items="${mainArticles }" var="art">
          <div class="comments">
            <div class="comment">
              <div class="meta"> <span><a href="${pageContext.request.contextPath }/user_showArticle.action?username=<c:out value="${art.username }" />&id=<c:out value="${art.id }" />"><c:out value="${art.title }" /></a> <small>:</small></span>
                <div class="clear"> </div>
              </div>
            </div>
            <div class="comment alt">
              <div class="meta"><span class="datetime">
              	<!-- 发表时间 -->
														发表于:
														<c:out value="${art.date }" />
														<!-- 评论与点击数 -->
														|评论()|点击(<c:out value="${art.hasread }" />)|作者:<c:out value="${art.username }" />
              </span>
                <div class="clear"> </div>
              </div>
            </div>
          </div>
		 </c:forEach>
		  <div class="comment" align="center">
		  	当前第${sessionScope.currentMainPage}页，共${sessionScope.totalMainPage}页，每页显示5条记录
			<a href="${pageContext.request.contextPath }/user_mainPage.action?currentMainPage=1">首页</a>
			<a href="${pageContext.request.contextPath }/user_mainPage.action?currentMainPage=${sessionScope.currentMainPage -1 }">上一页</a>
			<a href="${pageContext.request.contextPath }/user_mainPage.action?currentMainPage=${sessionScope.currentMainPage + 1 }">下一页</a>
			<a href="${pageContext.request.contextPath }/user_mainPage.action?currentMainPage=${sessionScope.totalMainPage }">尾页</a>			
	
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
