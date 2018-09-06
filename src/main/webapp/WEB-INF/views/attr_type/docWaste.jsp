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
        .demotable {
            border-collapse: collapse;
            counter-reset: schetchik; /* счётчик с названием "schetchik" работает в рамках класса .demotable */
        }

        .demotable tr {
            counter-increment: schetchik; /* при встрече тега tr счётчик с названием "schetchik" увеличивается на единицу */
        }

        .demotable td,
        .demotable tr:before {
            padding: .1em .5em;
            border: 1px solid #E7D5C0;
        }

        .demotable tr:before {
            content: counter(schetchik); /* значение счётчика с названием "schetchik" записывается в первую клетку строки */
            display: table-cell;
            vertical-align: middle;
            color: #978777;
        }

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


    <c:if test="${docWaste.tableHeader.visible eq '1'}">
        <h5 style="font-weight: bold">${docWaste.tableHeader.header}</h5>
        <div class="form-control">


        <table border="1">
            <tr>
                <c:forEach var="attr" items="${docWaste.tableHeader.column}">
                    <c:choose>
                        <c:when test="${attr.column.size()>1}">
                            <th colspan="2" width="${attr.columnWidth}px">${attr.header}</th>
                        </c:when>
                        <c:otherwise>
                            <th rowspan="2"  width="${attr.columnWidth}px">${attr.header}</th>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </tr>
            <tr>
                <c:forEach var="inAttr" items="${docWaste.tableHeader.column}">
                    <c:forEach var="inAttrValue" items="${inAttr.column}">
                        <td>${inAttrValue.header}</td>
                    </c:forEach>
                </c:forEach>
            </tr>

            <c:forEach var="docWasteListElement" items="${docWasteList}">
                <tr>
                    <c:forEach var="attr" items="${docWaste.tableHeader.column}">
                        <c:choose>
                            <c:when test="${attr.column.size()>1}">
                                <c:forEach var="val" items="${attr.column}">
                                    <c:if test="${attr.editable eq '1'}">
                                        <td><input type="text" value="${docWasteListElement.get(val.num)}"
                                                   style="text-align: ${docWaste.tableHeader.alignment}"/></td>
                                    </c:if>
                                    <c:if test="${attr.editable eq '0'}">
                                        <td><input type="text" value="${docWasteListElement.get(val.num)}"
                                                   style="text-align: ${docWaste.tableHeader.alignment}" disabled>
                                        </td>
                                    </c:if>
                                </c:forEach>
                            </c:when>
                            <c:otherwise>
                                <c:if test="${attr.editable eq '1'}">
                                    <td><input type="text" value="${docWasteListElement.get(attr.num)}"
                                               style="text-align: ${docWaste.tableHeader.alignment};
                                                       width: ${attr.columnWidth}px"></td>
                                </c:if>
                                <c:if test="${attr.editable eq '0'}">
                                    <td><input type="text" value="${docWasteListElement.get(attr.num)}"
                                               style="text-align: ${docWaste.tableHeader.alignment};
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