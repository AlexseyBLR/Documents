<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>

<!DOCTYPE html>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <style>
        .parent {
            display: flex;
            height: 30px;
            line-height: 26px;
        }

        .child {
            display: block;
            margin-right: 1%;
        }

        .child.max {
            flex: 1;
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



    <c:if test="${docServices.tableHeader.visible eq '1'}">
        <h5 style="font-weight: bold">${docServices.tableHeader.header}</h5>
    <div class="form-control">
        <table border="1">
            <tr>
                <c:forEach var="attr" items="${docServices.tableHeader.column}">
                    <c:choose>
                        <c:when test="${attr.column.size()>1}">
                            <th colspan="2" width="${attr.columnWidth}px">${attr.header}</th>
                        </c:when>
                        <c:otherwise>
                            <th rowspan="2" width="${attr.columnWidth}px">${attr.header}</th>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </tr>
            <tr>
                <c:forEach var="inAttr" items="${docServices.tableHeader.column}">
                    <c:forEach var="inAttrValue" items="${inAttr.column}">
                        <td>${inAttrValue.header}</td>
                    </c:forEach>
                </c:forEach>
            </tr>

            <c:forEach var="docServicesListElement" items="${docServicesList}">
                <tr>
                    <c:forEach var="attr" items="${docServices.tableHeader.column}">
                        <c:choose>
                            <c:when test="${attr.column.size()>1}">
                                <c:forEach var="val" items="${attr.column}">
                                    <c:if test="${attr.editable eq '1'}">
                                        <td><input type="text" value="${docServicesListElement.get(val.num)}"
                                                   style="text-align: ${docServices.tableHeader.alignment};
                                                           width: ${attr.columnWidth}px"></td>
                                    </c:if>
                                    <c:if test="${attr.editable eq '0'}">
                                        <td><input type="text" value="${docServicesListElement.get(val.num)}"
                                                   style="text-align: ${docServices.tableHeader.alignment};
                                                           width: ${attr.columnWidth}px" disabled>
                                        </td>
                                    </c:if>
                                </c:forEach>
                            </c:when>
                            <c:otherwise>
                                <c:if test="${attr.editable eq '1'}">
                                    <td><input type="text" value="${docServicesListElement.get(attr.num)}"
                                               style="text-align: ${docServices.tableHeader.alignment};
                                                       width: ${attr.columnWidth}px"></td>
                                </c:if>
                                <c:if test="${attr.editable eq '0'}">
                                    <td><input type="text" value="${docServicesListElement.get(attr.num)}"
                                               style="text-align: ${docServices.tableHeader.alignment};
                                                       width: ${attr.columnWidth}px" disabled></td>
                                </c:if>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </tr>
            </c:forEach>


        </table>

    </div>

    </c:if>

</body>
</html>