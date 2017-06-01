<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title><bean:message key="title.login"/></title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript" ></script>
    <link href="WEB-INF/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="WEB-INF/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    <script src="WEB-INF/bootstrap/js/bootstrap.min.js"></script>
  </head>
  <body>
    <html:errors property="loginId" />
    <html:form action="/WikiInfoInputAction">
    <table>
    <tr>
      <td><font size="3">投稿者</font></td>
      <td><html:text property="writer" size="20" maxlength="12" /></td>
    </tr>
    <tr>
      <td><font size="3">タイトル</font></td>
      <td><html:text property="title" size="20" maxlength="12" /></td>
    </tr>
    <tr>
      <td><font size="3">プログラミング言語</font></td>
	    <td><html:select property="language" value="0" >
	    	<html:option value="0">選択してください</html:option>
		    <html:option value="1">PHP</html:option>
		    <html:option value="2">Java</html:option>
		    <html:option value="3">C#</html:option>
		    <html:option value="4">JavaScript</html:option>
		    <html:option value="5">jQuery</html:option>
		    <html:option value="6">Swift</html:option>
		    <html:option value="7">VBA</html:option>
    	</html:select></td>
    </tr>
    <tr>
      <td><font size="3">手順1</font></td>
      <td><html:textarea property="tejyun1" cols="22" rows="12" /></td>
    </tr>
    </table><br>
      <html:submit property="submit" value="確認する" />
    </html:form>
    <p><bean:write name="wikiInfoInputForm" property="errorMsg" /></p>

  </body>
</html:html>