<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
    <h1>로그인 페이지</h1>
<%--    로그인 실패시 실패 문구 표출--%>
    ${errMsg}
    <form action="/login.ado" method="post">
        <label for="name">이름: </label>
        <input type="text" id="name" name="name">
        <button type="submit">로그인</button>
    </form>
</body>
</html>