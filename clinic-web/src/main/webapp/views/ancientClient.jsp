<%--
  Created by IntelliJ IDEA.
  User: Rihn Kornak
  Date: 12.06.2017
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<HTML>
<HEAD>
    <META content="text/html; charset=utf-8" >
    <META lang = "ru">
    <TITLE>Ветеринарная клиника "Айболит"</TITLE>
    <style type="text/css">
        .header, .sidebar, .content {
            padding: 10px; /* Поля */
            border: solid 1px #000; /* Параметры рамки */
            background: #e3e8cc; /* Цвет фона */
        }
        .header { /* Верхняя часть с заголовком */
            background: #e3e8cc; /* Цвет фона */
            font-size: 12px; /* Размер шрифта */
        }
        #loginForm {
            margin: 0px 10px 0px 990px;
            padding: 1px 5px 1px 1px; /* Поля */
            border: solid 1px #000; /* Параметры рамки */
            background: #e3e8cc; /* Цвет фона */
            font-size: 12px;
        }
        .layout {
            margin: 15px 0; /* Отступы сверху и снизу */
            overflow: hidden; /* Отменяем действие float */
            min-width: 800px; /* Минимальная ширина */
            max-width: 1200px; /* Максимальная ширина */
        }
        .sidebar { /* Навигация по сайту */
            width: 120px; /* Ширина меню */
            float: left; /* Состыковка с другим слоем по горизонтали */
        }
        .sidebar ul {
            list-style: none; /* Убираем маркеры */
            padding: 0; /* Убираем отступы */
        }
        .content { /* Основное содержание страницы */
            margin-left: 155px; /* Отступ слева */
        }
    </style>
</HEAD>
<body>

<div class="header">

    <div id = "loginForm" align = "right" >
        <form action="handler.php">
            <p><strong>Логин:</strong>
                <input maxlength="25" size="30" name="login"></p>
            <p><strong>Пароль:</strong>
                <input type="password" maxlength="25" size="30" name="password"></p>
            <p><input type="submit" value="Вход"></p>
        </form>
    </div>
</div>
<div class="layout">
    <div class="sidebar">
        <h2>Меню</h2>
        <ul>
            <li><a href="${pageContext.servletContext.contextPath}/showClients.jsp">Клиенты</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/showPets.jsp">Питомцы</a></li>
            <li><a href="${pageContext.servletContext.contextPath}/ancientClient.jsp">Поиск клиента</a></li>
            <li><a href="link2.html">Поиск питомца</a></li>
        </ul>
    </div>
    <div class="content">
        <form action='"+req.getContextPath()+"/' method='post'>
            <p><strong>Введите имя клиента:</strong>
                <input maxlength="25" size="30" name="name"></p>
            <p><strong>Введите искомое:</strong>
                <input type="search" maxlength="25" size="30" name="search"></p>
            <p><input type="submit" value="Оке"></p>
        </form>
    </div>
</div>
</body>
</HTML>