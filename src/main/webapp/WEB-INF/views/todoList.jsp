<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ko">
<head>
    <title>todoList</title>
    <script src="https://code.jquery.com/jquery-3.6.1.slim.js" integrity="sha256-tXm+sa1uzsbFnbXt8GJqsgi2Tw+m4BLGDof6eUPjbtk=" crossorigin="anonymous"></script>
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
        <table>
            <thead>
                <tr>
                    <th data-kind="before">시작 전</th>
                    <th data-kind="doing">하는 중</th>
                    <th data-kind="end">완료</th>
                </tr>
            </thead>
            <tbody>
                <tr data-kind="before">
                    <td>
                        <p>퍼블리싱 하기</p>
                        <div>
                            <div class="before">시작 전</div>
                            <div>22.10.15</div>
                        </div>
                    </td>
                    <td>
                        <p>퍼블리싱 하기</p>
                        <div>
                            <div class="before">시작 전</div>
                            <div>22.10.15</div>
                        </div>
                    </td>
                    <td>
                        <p>퍼블리싱 하기</p>
                        <div>
                            <div class="before">시작 전</div>
                            <div>22.10.15</div>
                        </div>
                    </td>
                </tr>
                <tr data-kind="doing"></tr>
                <tr data-kind="end"></tr>
            </tbody>
        </table>
        <div class="background-black"></div>
        <div class="popup">
            <span id="closeBtn">X</span>
            <textarea id="content" placeholder="할 일을 적어주세요"></textarea>
            <div>
                <div class="before">시작 전</div>
                <div>22.10.15</div>
            </div>
        </div>
    </section>
</div>
</body>
</html>
