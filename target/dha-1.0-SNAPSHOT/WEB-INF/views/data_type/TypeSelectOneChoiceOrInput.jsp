<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css"
          integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js"
            integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU"
            crossorigin="anonymous"></script>
</head>

<div class="form-control">

    <c:if test="${attr.editable eq '1'}">
        <c:if test="${attr.visible eq '1'}">
            <%--<label for="radio">${attr.header}</label>--%>
            <input id="radio" type="radio" name="selectOrInputType" value="inputText"/><input
                type="text" name="selectOrInputInputValue" value="${attr.attr.get(0).value}"/>

            <input type="radio" name="selectOrInputType" value="select">
            <select name="selectOrInputSelectValue">
                <c:forEach var="attrType" items="${attr.attr}">
                    <c:if test="${!(attrType.type eq 'String')}">
                        <option value="${attrType.value}">${attrType.value}</option>
                    </c:if>
                </c:forEach>
            </select>
        </c:if>
        <br>
        <c:if test="${attr.visible eq '0'}"></c:if>
    </c:if>


    <c:if test="${attr.editable eq '0'}">
        <c:if test="${attr.visible eq '1'}">
            <%--${attr.header}--%>
            <input type="radio" name="selectOrInputType" value="inputText" disabled/><input
                type="text" name="selectOrInputInputValue" value="${attr.attr.get(0).value}"
                placeholder="${attr.attr.get(0).footer}" disabled/>

            <input type="radio" name="selectOrInputType" value="select" disabled>
            <select name="selectOrInputSelectValue" disabled>
                <c:forEach var="attrType" items="${attr.attr}">
                    <c:if test="${!(attrType.type eq 'String')}">
                        <option value="${attrType.value}">${attrType.value}</option>
                    </c:if>
                </c:forEach>
            </select>
        </c:if>
        <c:if test="${attr.visible eq '0'}"></c:if>
    </c:if>
</div>