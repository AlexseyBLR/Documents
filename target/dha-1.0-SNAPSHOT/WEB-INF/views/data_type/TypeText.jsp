<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>


<c:if test="${attr.visible eq '1'}">
    <c:if test="${attr.editable eq '1'}">
        <c:if test="${attr.required eq '1'}">
            ${attr.prefix}
            <textarea placeholder="${attr.footer}"
                      minlength="${attr.minLength}" maxlength="${attr.maxLength}"
                      style="width: ${attr.inputWidth}px; height: 100px; text-align: ${attr.alignment}"
                      required>${attr.value} </textarea>
            ${attr.postfix}
        </c:if>
        <c:if test="${attr.required eq '0'}">
            ${attr.prefix}
            <textarea placeholder="${attr.footer}"
                      minlength="${attr.minLength}" maxlength="${attr.maxLength}"
                      style="width: ${attr.inputWidth}px; height: 100px; text-align: ${attr.alignment}">${attr.value} </textarea>
            ${attr.postfix}
        </c:if>
    </c:if>
    <c:if test="${attr.editable eq '0'}">
        <textarea placeholder="${attr.footer}"
                  minlength="${attr.minLength}" maxlength="${attr.maxLength}" style="text-align: ${attr.alignment}"
                  disabled>${attr.value}</textarea>
    </c:if>
</c:if>


<c:if test="${attrType.visible eq '1'}">
    <c:if test="${attrType.editable eq '1'}">
        <c:if test="${attrType.required eq '1'}">
            ${attrType.header}
            ${attrType.prefix}
            <textarea placeholder="${attrType.footer}"
                      minlength="${attrType.minLength}" maxlength="${attrType.maxLength}"
                      style="text-align: ${attr.alignment}"
                      required>${attrType.value}</textarea>
            ${attrType.postfix}
        </c:if>
        <c:if test="${attrType.required eq '0'}">
            ${attrType.header}
            <textarea placeholder="${attrType.footer}"
                      minlength="${attrType.minLength}" maxlength="${attrType.maxLength}"
                      style="text-align: ${attr.alignment}">${attrType.value}</textarea>
        </c:if>
    </c:if>
    <c:if test="${attrType.editable eq '0'}">
        ${attrType.header}
        ${attrType.prefix}
        <textarea placeholder="${attrType.footer}"
                  minlength="${attrType.minLength}" maxlength="${attrType.maxLength}"
                  style="text-align: ${attr.alignment}"
                  disabled>${attrType.value}</textarea>
        ${attrType.postfix}
    </c:if>
</c:if>
