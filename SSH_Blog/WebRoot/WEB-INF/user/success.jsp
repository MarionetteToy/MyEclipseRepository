<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
<title>登录成功</title>
<link rel="stylesheet" href="image/style.css" />
</head>

<body topmargin="0" leftmargin="0" bgcolor="#f3f3f3">
		<form id="Form1" method="post">
			<table width="100%" cellpadding="0" cellspacing="0" border="0">
				<tr><td height="100"></td></tr>
				<tr>
					<td valign="top" align="center">
						<table width="400" border="1" cellpadding="0" cellspacing="0" style="BORDER-RIGHT:#cccccc 1px solid;BORDER-TOP:#cccccc 1px solid;BORDER-LEFT:#cccccc 1px solid;BORDER-BOTTOM:#cccccc 1px solid;BORDER-COLLAPSE:collapse;BACKGROUND-COLOR:#ffffff">
							<tr height="30">
								<td colspan="2" align="center" background="${pageContext.request.contextPath}/image/l-bg1.jpg"><font color="#ffff66"><b>登录成功</b></font></td>
							</tr>
							<tr height="150">
								<td align="center">登录成功</td>
								<% 
									String url = (String)session.getAttribute("succUrl");
									response.setHeader("Refresh","1;url=" + url);
								%>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
