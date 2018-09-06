<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>


<c:if test="${!(attr.header eq '')}">
    <c:if test="${attr.visible eq '1'}">
        <c:if test="${attr.editable eq '1'}">
            <c:if test="${attr.required eq '1'}">
                ${attr.prefix}
                <input id="text" value="${attr.value}" type="text" placeholder="${attr.footer}"
                       minlength="${attr.minLength}" maxlength="${attr.maxLength}"
                       style="margin: 0.3%; width: ${attr.inputWidth}px; text-align: ${attr.alignment}" required/>
                <label>${attr.postfix}</label>
            </c:if>
            <c:if test="${attr.required eq '0'}">
                ${attr.prefix}
                <input id="text" value="${attr.value}" type="text" placeholder="${attr.footer}"
                       minlength="${attr.minLength}" maxlength="${attr.maxLength}"
                       style="margin: 0.3%; width: ${attr.inputWidth}px; text-align: ${attr.alignment}"/>
                <label>${attr.postfix}</label>
            </c:if>
        </c:if>
        <c:if test="${attr.editable eq '0'}">
            ${attr.prefix}
            <input id="text" value="${attr.value}" type="text" placeholder="${attr.footer}" prefix="${attr.prefix}"
                   postfix="${attr.postfix}"
                   minlength="${attr.minLength}" maxlength="${attr.maxLength}"
                   disabled style="margin: 0.3%; width: ${attr.inputWidth}px; text-align: ${attr.alignment}"/>
            <label>${attr.postfix}</label>
        </c:if>
    </c:if>
    <c:if test="${attrType.visible eq '0'}">
    </c:if>
</c:if>


<c:if test="${attrType.visible eq '1'}">
    <c:if test="${attrType.editable eq '1'}">
        ${attrType.header}
        ${attrType.prefix}
        <input value="${attrType.value}" type="text" placeholder="${attrType.footer}" prefix="${attrType.prefix}"

               minlength="${attrType.minLength}" maxlength="${attrType.maxLength}"
               style="margin: 0.3%; width: ${attrType.inputWidth}px; text-align: ${attrType.alignment}"/>
        <label>${attrType.postfix}</label>

    </c:if>
    <c:if test="${attrType.editable eq '0'}">
        ${attrType.header}
        ${attrType.prefix}
        <input value="${attrType.value}" type="text" placeholder="${attrType.footer}" prefix="${attrType.prefix}"
               postfix="${attrType.postfix}"
               minlength="${attrType.minLength}" maxlength="${attrType.maxLength}"
               disabled style="margin: 0.3%; width: ${attrType.inputWidth}px; text-align: ${attrType.alignment}"/>
        <label>${attrType.postfix}</label>
    </c:if>
</c:if>
<c:if test="${attrType.visible eq '0'}">
</c:if>
