<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ko">
<head>
    <title>todoList</title>
    <script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>
    <script src="/js/todoList.js"></script>
    <link rel="stylesheet" href="/css/css.css"/>
</head>
<body>
<div class="wrap">
    <header>
        <h1>TODOLIST</h1>
        <p><%= session.getAttribute("name") %></p>
    </header>
    <section>
        <input type="checkbox" name="searchKind" id="searchBefore" value="1" checked><label for="searchBefore"> 시작 전</label>
        <input type="checkbox" name="searchKind" id="searchDoing" value="2" checked><label for="searchDoing"> 하는 중</label>
        <input type="checkbox" name="searchKind" id="searchEnd" value="3" checked><label for="searchEnd"> 완료</label>
        <table>
            <thead>
                <tr>
                    <th data-kind="before">시작 전</th>
                    <th data-kind="doing">하는 중</th>
                    <th data-kind="end">완료</th>
                </tr>
            </thead>
            <tbody>
                <tr data-kind="before"></tr>
                <tr data-kind="doing"></tr>
                <tr data-kind="end"></tr>
            </tbody>
        </table>
        <div class="background-black"></div>
        <div class="popup">
            <div class="btn_wrap">
                <span id="saveBtn">저장</span>
                <span id="deleteBtn">삭제</span>
                <span id="closeBtn">취소</span>
            </div>
            <textarea id="content" placeholder="할 일을 적어주세요"></textarea>
            <div>
                <div class="kind">
                    <input type="radio" name="kind" id="before" value="1"><label for="before"> 시작 전</label>
                    <input type="radio" name="kind" id="doing" value="2"><label for="doing"> 하는 중</label>
                    <input type="radio" name="kind" id="end" value="3"><label for="end"> 완료</label>
                </div>
                <div>22.10.15</div>
            </div>
        </div>
    </section>
</div>
</body>
</html>
