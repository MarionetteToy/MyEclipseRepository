<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<html>
<head>
<title>≤‚ ‘fckeditor</title>
<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
<script type="text/javascript">
	window.onload = function()
	{
		var oFCKeditor = new FCKeditor('content') ;
		oFCKeditor.BasePath	= "fckeditor/" ;
		oFCKeditor.ReplaceTextarea() ;
	}
</script>
</head>
<body>
	<textarea rows="40" cols="10" name="content"></textarea>
</body>
</html>