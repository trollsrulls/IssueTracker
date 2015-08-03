<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><spring:message code="app.name"/></title>
    <link href="<spring:url value='/resources/core/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value='/resources/core/css/bootstrap-theme.min.css'/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value='/resources/core/css/styles.css'/>" rel="stylesheet" type="text/css">
</head>

<body>
    <div class="main">
        <tiles:insertAttribute name="header"/>
        <div class="content">
            <tiles:insertAttribute name="content"/>
        </div>
    </div>
    <tiles:insertAttribute name="footer"/>

    <script src="/resources/core/js/jquery-1.11.3.min.js"></script>
    <script src="/resources/core/js/bootstrap.min.js"></script>
</body>
</html>
