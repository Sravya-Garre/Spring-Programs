<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="color:red;text-align:center">Register Employee</h1>
<frm:form modelAttribute="emp">
<table align="center" bgcolor="cyan">
<tr>
<td> Employee Name</td>
<td><frm:input path="ENAME"/> </td>
</tr>
<tr>
<td> Employee Desi</td>
<td><frm:input path="JOB"/> </td>
</tr>
<tr>
<td> Employee salary</td>
<td><frm:input path="SAL"/> </td>
</tr>
<tr>
<td> Dept No</td>
<td><frm:input path="DEPTNO"/> </td>
</tr>
<tr>
<td> <input type="submit" value="submit"></td>
<td> <input type="reset" value="cancel"></td>
</tr>
</table>
</frm:form>