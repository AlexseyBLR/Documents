<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>

<c:if test="${attr.visible eq '1'}">
    <c:if test="${attr.editable eq '1'}">
        <c:if test="${attr.required eq '1'}">
            ${attr.prefix}
            <input id="date" type="date" min="${attr.minValue}" maxlength="${attr.maxValue}" style="margin: 0.3%"
                   required/>
            ${attr.postfix}
        </c:if>
        <c:if test="${attr.required eq '0'}">
            ${attr.prefix}
            <input id="date" type="date" min="${attr.minValue}" maxlength="${attr.maxValue}" style="margin: 0.3%"/>
            ${attr.postfix}
        </c:if>
    </c:if>
    <c:if test="${attr.editable eq '0'}">
        ${attr.prefix}
        <input id="date" type="date" placeholder="${attr.footer}" prefix="${attr.prefix}" postfix="${attr.postfix}"
               min="${attr.minValue}" maxlength="${attr.maxValue}" disabled style="margin: 0.3%"/>
        ${attr.postfix}
    </c:if>
</c:if>


<c:if test="${attrType.visible eq '1'}">
    <c:if test="${attrType.editable eq '1'}">
        <c:if test="${attrType.required eq '1'}">
            ${attrType.header}
            ${attrType.prefix}
            <input type="date" minlength="${minLength}" maxlength="${maxLength}" align="${attrType.alignment}"
                   style="margin: 0.3%" required/>
            ${attrType.postfix}
        </c:if>
        <c:if test="${attrType.required eq '0'}">
            ${attrType.header}
            ${attrType.prefix}
            <input type="date" minlength="${minLength}" maxlength="${maxLength}" align="${attrType.alignment}"
                   style="margin: 0.3%"/>
            ${attrType.postfix}
        </c:if>
    </c:if>
    <c:if test="${attrType.editable eq '0'}">
        ${attrType.header}
        ${attrType.prefix}
        <input type="date" placeholder="${attrType.footer}" prefix="${attrType.prefix}"
               postfix="${attrType.postfix}"
               minlength="${minLength}" maxlength="${maxLength}" align="${attrType.alignment}" disabled
               style="margin: 0.3%"/>
        ${attrType.postfix}
    </c:if>
</c:if>
