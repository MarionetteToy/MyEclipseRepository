<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
<title>个性化设置</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" media="all" />
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
          <div class="meta"></div>
          <div class="comments"><div class="comment"></div>
            <h2>个性化设置</h2>
            <form class="h" action="${pageContext.request.contextPath }/blog_editBlogInfo.action" method="post">
              <div>
                <label>博客标题:</label>
                <input type="text" name="blogtitle" />
              </div>
              <div>
                <label>个性签名:</label>
                <input type="text" name="idiograph" />
              </div>
              <div>
                <label></label>
                <div class="clear"> </div>
              </div>
              <div class="button_wrapper">
                <input name="提交" type="submit" class="button" value="提交" />
              </div>
            </form>
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
