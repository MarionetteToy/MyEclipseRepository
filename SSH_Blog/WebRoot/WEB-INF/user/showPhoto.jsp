<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>相册</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css//main.css" media="all" />
<!--[if IE 6]><link type="text/css" rel="stylesheet" href="css/ie6.css" media="all" /><![endif]-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/mootools.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/site.js"></script>
<script type="text/javascript">
		    var GB_ROOT_DIR = "./${pageContext.request.contextPath}/user/greybox/";
</script>
<!-- 
	<script type="text/javascript" src="${pageContext.request.contextPath}/user/greybox/AJS.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/user/greybox/AJS_fx.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/user/greybox/gb_scripts.js"></script>
	<link href="${pageContext.request.contextPath}/user/greybox/gb_styles.css" rel="stylesheet" type="text/css" />
 -->
</head>
<body>
<div id="wrapper">
  <div id="container">
    <%@ include file="/public/top.jsp" %>
    <div id="content">
      <div id="col_left">
        <div class="post">
          <div class="meta"></div>
          <div class="comments">
            <h2>上传图片</h2>
            <form action="${pageContext.request.contextPath}/photo_photoUpload.action" method="post" enctype="multipart/form-data">
              <div>
                <label>选择要上传的图片：</label>
                <input type="file" name="userPhoto" />
              </div>
              <div>
                <label></label>
                <div class="clear"> </div>
              </div>
              <div class="button_wrapper">
                <input name="提交" type="submit" class="button" value="上传" />
              </div>
            </form>
          </div>
          
          <div class="comments">
            <h2>显示相册图片(最多五张)</h2>
            <table cellspacing="5" align="center" border="1">
	           	<tr>
		           	<c:forEach items="${sessionScope.photoList }" var="photo">
						<td>
							<a href='photo/<c:out value="${photo.username}" />/<s:property value="photo"/>' title="我的相册" rel="gb_imageset[photos]">
								<img src='<c:out value="${photo.picUrl }" />' width="100" height="120" />
							</a>	
						</td>
					</c:forEach>
				</tr>
			</table>
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
