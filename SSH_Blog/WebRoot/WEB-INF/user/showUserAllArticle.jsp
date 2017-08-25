<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>我的全部文章</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" media="all" />
<!--[if IE 6]><link type="text/css" rel="stylesheet" href="css/ie6.css" media="all" /><![endif]-->
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
          <div class="meta"><a class="title" href="">我的全部文章</a>
            <div class="clear"></div>
          </div>
        <!-- 循环输出 -->
		<c:forEach items="${sessionScope.userArticles }" var="article">
          <div class="comments">
            <div class="comment">
              <div class="meta"> <span><a href="${pageContext.request.contextPath }/user_showArticle.action?username=<c:out value="${article.username }" />&id=<c:out value="${article.id }" />"><c:out value="${article.title }" /></a> <small>:</small></span>
                <div class="clear"> </div>
              </div>
            </div>
            <div class="comment alt">
              <div class="meta"><span class="datetime">
              	<!-- 发表时间 -->
														发表于:
														<c:out value="${article.date }" />
														<!-- 评论与点击数 -->
														|点击(<c:out value="${article.hasread }" />)
              </span>
                <div class="clear"> </div>
              </div>
            </div>
          </div>
		 </c:forEach>
		  <div class="comment" align="center">
		  		当前第${sessionScope.currentPage }页，共${sessionScope.totalPage}页，每页显示5条记录
				<a href="${pageContext.request.contextPath }/user_showUserAllArticlePage.action?currentPage=1">首页</a>
				<a href="${pageContext.request.contextPath }/user_showUserAllArticlePage.action?currentPage=${sessionScope.currentPage -1 }">上一页</a>
				<a href="${pageContext.request.contextPath }/user_showUserAllArticlePage.action?currentPage=${sessionScope.currentPage + 1 }">下一页</a>
				<a href="${pageContext.request.contextPath }/user_showUserAllArticlePage.action?currentPage=${sessionScope.totalPage }">尾页</a>			

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
</div>
</body>
</html>
