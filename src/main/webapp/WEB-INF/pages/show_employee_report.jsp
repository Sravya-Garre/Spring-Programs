<%@ page language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${!empty empList}">
<h1 style="color:red;text-align:center"> Employees Report</h1>
<table border="1" align="center" bgcolor="cyan">
<tr style="color:red">
<th>empno</th><th>ename</th><th>job</th><th>salary</th><th>deptno</th>
</tr>
<c:forEach var="emp" items="${empList}">
<tr style="color:red">
<td>${emp.EMPNO}</td>
<td>${emp.ENAME}</td>
<td>${emp.JOB}</td>
<td>${emp.SAL}</td>
<td>${emp.DEPTNO}</td>
<td><a href="emp_edit?no=${emp.EMPNO}"><img src="pictures/edit.jpeg" height="50px" width="50px"></a>
    <a href="emp_delete?no=${emp.EMPNO}"
    onclick="return confirm('Do you want to delete the employee')">
    <img src="pictures/delete.jpeg" height="50px" width="50px"></a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Employees Not Found</h1>
</c:otherwise>
</c:choose>
<h2 style="color:green;text-align:center">${resultmsg}</h2>
<center>
<a href="emp_add"><img src="pictures/add.jpeg" width="60px" height="60px">Add Employee</a>
<a href="./"><img src="pictures/home.jpeg" width="60px" height="60px">Home</a>
</center>