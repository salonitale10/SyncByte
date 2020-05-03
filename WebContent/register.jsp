<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<style type="text/css">
table{background-image: url("images/register1.jpg");}
h3{font-family: Calibri; font-size: 32pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline color:blue}
table{font-family: Calibri; color:black; font-size: 11pt; font-style: italic;width: 60%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}
</style>
</head>
<body>
<h3>Employee Registration Form</h3>
<form action="RegistrationServlet" method="POST">
<table align="center" cellpadding = "10">

<tr>
<td>User ID</td>
<td><input type="text" name="empId" maxlength="100" required/></td>
</tr>



<tr>
<td>Name</td>
<td><input type="text" name="name" maxlength="30" required/>
(max 30 characters a-z and A-Z)
</td>
</tr>

<tr>
<td>DOB</td>
<td><input type="date" name="dob" maxlength="100" required/>
(Format:dd-mm-yyyy)
</td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" maxlength="100" required/></td>
</tr>

<tr>
<td>Finger Print</td>
<td><input type="file" name="myimage"/></td>
</tr>




<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
</form>
</body>
</html>
