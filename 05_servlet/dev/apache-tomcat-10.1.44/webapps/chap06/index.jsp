<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Exception Handler</h1>

<%--
test
Exception 핸들링 해보기
1.web.xml을 통해 에러 상태 코드 발생 시 어떤 서블릿으로 요청할지 url 경로 설정해보기
2.모든 에러에 대해 페이지를 동적으로 처리 할 수 있게 만들어 응답해보기
(request의 attribute에 담긴 값을 활용할 예정)
--%>
<ul>
    <li><a href="show404error">404에러 확인</a></li>
    <li><a href="show500error">500에러 확인</a></li>
</ul>
<%--서블릿3개필요, 404나 500이나 둘다--%>
</body>
</html>