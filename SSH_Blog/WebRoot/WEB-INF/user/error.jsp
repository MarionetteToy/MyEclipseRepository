<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<HEAD>
		<title>登录失败</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
	</HEAD>
	<body leftMargin="0" topMargin="0"  bgcolor="#f3f3f3">
		<form id="Form1" method="post">
			<table width="100%" cellpadding="0" cellspacing="0" border="0">
				<tr><td height="100"></td></tr>
				<tr>
					<td vAlign="top" align="center">
						<table style="background-color:#FFFFFF;BORDER-RIGHT: #cccccc 1px solid; BORDER-TOP: #cccccc 1px solid; BORDER-LEFT: #cccccc 1px solid; BORDER-BOTTOM: #cccccc 1px solid; BORDER-COLLAPSE: collapse"
							cellSpacing="0" cellPadding="0" width="500" border="1">
							<tr height="30">
								<td align="center" background="${pageContext.request.contextPath}/image/l-bg3.jpg" colSpan="2"><font color="#ffff66"><b>登录失败</b></font></td>
							</tr>
							<tr height="100">
								<td align="center">
									<table width="500" border="0">
										<tr align="center" height="100">
											<td>登录失败</td>
											<% 
												String url = (String)session.getAttribute("failUrl");
												response.setHeader("Refresh","1;url=" + url);
											%>
										</tr>
										<tr height="50" align="center">
											<td></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
