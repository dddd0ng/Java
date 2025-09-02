<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Request Parameter</h1>
<h3>Get 방식의 요청</h3>
<form action="querystring" method="get">
    <%--  label+input  --%>
    <label for="name1">이름 : </label>
    <input id="name1" type="text" name="name">
    <br>
    <label for="">나이 : </label><input type="text" name="age">
    <br>
    <label for="">생일 : </label><input type="date" name="birthday">
    <br>
    <label for="">성별 : </label>
    <input type="radio" name="gender" id="male" value="M">
    <label for="">남자</label>
    <input type="radio" name="gender" id="female" value="F">
    <label for="">여자</label>
    <br>
    <label for="">국적 : </label>
    <select name="national" id="">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label for="">취미 : </label>
    <input type="checkbox" name="hobbies" id="movie" value="movie">
    <label for="movie">영화보기</label>
    <input type="checkbox" name="hobbies" id="music" value="music">
    <label for="music">음악감상</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep">
    <label for="sleep">잠자기</label>
    <br>
    <%--   label+input name="" -> group --%>
    <button>GET 요청</button>
    <%--    value값 form으로 값 넘어감--%>
</form>
<%--http://localhost:8080/chap03/querystring? <= 서블릿
name=%E3%85%87%E3%84%B9%E3%85%87&age=%E3%85%87%E3%84%
B9%E3%85%87%E3%84%B9%E3%85%87&birthday=&national=ko&
hobbies=movie&hobbies=music--%>

<h4>a태그의 href 속성에 직접 파라미터를 쿼리스트링 형태로 작성하고 get요청을 할 수도 있다.</h4>
<a href="http://localhost:8080/chap03/querystring? <= 서블릿
name=%E3%85%87%E3%84%B9%E3%85%87&age=%E3%85%87%E3%84%
B9%E3%85%87%E3%84%B9%E3%85%87&birthday=&national=ko&
hobbies=movie&hobbies=music">a태그 활용</a>

<h3>POST 방식의 요청</h3>
<h4>form태그를 이용한 Post 방식 요청</h4>
<form action="/payload" method="post">
    <%--  label+input  --%>
    <label for="name1">이름 : </label>
    <input id="name1" type="text" name="name">
    <br>
    <label for="">나이 : </label><input type="text" name="age">
    <br>
    <label for="">생일 : </label><input type="date" name="birthday">
    <br>
    <label for="">성별 : </label>
    <input type="radio" name="gender" id="male" value="M">
    <label for="">남자</label>
    <input type="radio" name="gender" id="female" value="F">
    <label for="">여자</label>
    <br>
    <label for="">국적 : </label>
    <select name="national" id="">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label for="">취미 : </label>
    <input type="checkbox" name="hobbies" id="movie" value="movie">
    <label for="movie">영화보기</label>
    <input type="checkbox" name="hobbies" id="music" value="music">
    <label for="music">음악감상</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep">
    <label for="sleep">잠자기</label>
    <br>
    <%--   label+input name="" -> group --%>
    <button>POST 요청</button>
    <%--    value값 form으로 값 넘어감--%>
</form>


</body>
</html>