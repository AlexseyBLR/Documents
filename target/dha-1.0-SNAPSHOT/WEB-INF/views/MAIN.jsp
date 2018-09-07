<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>

<!DOCTYPE html>
<html>
<head>

    <link rel="shortcut icon" href="http://www.livejournal.com/favicon.png?v=49565" type="image/x-icon">
    <title>${document.docName}</title>
    <style>

        hr {
            border: none;
            background-color: #060606;
            color: #060606;
            height: 5px;
        }
    </style>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css"
          integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js"
            integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">

    <c:set value="${document.docSql}" var="docSql"/>
    <c:set value="${document.docAttr}" var="docAttr"/>
    <c:set value="${document.docDocs}" var="docDocs"/>
    <c:set value="${document.docOrgs}" var="docOrgs"/>
    <c:set value="${document.docSign}" var="docSign"/>
    <c:set value="${document.docWaste}" var="docWaste"/>
    <c:set value="${document.docAssets}" var="docAssets"/>
    <c:set value="${document.docServices}" var="docServices"/>
    <c:set value="${document.docBankDetails}" var="docBankDetails"/>




    <form:form modelAttribute="emptyDocument" action="/testGet" method="get">

        <h3 style="text-align: center">${document.docName}</h3>
        <br>

        <c:if test="${docAttr !=null}">
            <%@include file="attr_type/docAttr.jsp" %>
            <hr>
        </c:if>

        <c:if test="${docOrgs !=null}">
            <%@include file="attr_type/docOrgs.jsp" %>
            <hr>
        </c:if>

        <c:if test="${docDocs !=null}">
            <%@include file="attr_type/docDocs.jsp" %>
            <hr>
        </c:if>

        <c:if test="${docWaste !=null}">
            <%@include file="attr_type/docWaste.jsp" %>
            <hr>
        </c:if>

        <c:if test="${docAssets !=null}">
            <%@include file="attr_type/docAssets.jsp" %>
            <hr>
        </c:if>

        <c:if test="${docServices !=null}">
            <%@include file="attr_type/docServices.jsp" %>
            <hr>
        </c:if>

        <c:if test="${docBankDetails !=null}">
            <%@include file="attr_type/docBankDetails.jsp" %>
        </c:if>

        <c:if test="${docSign !=null}">
            <%@include file="attr_type/docSign.jsp" %>
            <hr>
        </c:if>

        <input type="submit" value="test"/>
    </form:form>

</div>
</body>
</html>