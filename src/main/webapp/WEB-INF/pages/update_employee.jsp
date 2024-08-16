<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
    <h1 style="color:cyan;text-align:center">Update Employee</h1>
    <form:form method="post" modelAttribute="emp">
        <table align="center" bgcolor="red">
            <tr>
                <td>Employee Number:</td>
                <td><form:input path="EMPNO" readonly="true"/></td>
            </tr>
            <tr>
                <td>Employee Name:</td>
                <td><form:input path="ENAME"/></td>
            </tr>
            <tr>
                <td>Job:</td>
                <td><form:input path="JOB"/></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="SAL"/></td>
            </tr>
            <tr>
                <td>Department Number:</td>
                <td><form:input path="DEPTNO"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Update"/></td>
                <td><input type="reset" value="cancel"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
