<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title><bean:message key="title.mypage"/></title>
  </head>
  <body>
  <h3>完了画面</h3>
     <p><bean:write name="wikiInfoConfirmForm" property="errorMsg" /></p>
  </body>
</html:html>