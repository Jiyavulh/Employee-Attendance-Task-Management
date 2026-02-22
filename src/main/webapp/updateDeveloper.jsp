<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Developer</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #4e54c8, #8f94fb);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .container {
        background: white;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 320px;
        text-align: center;
    }

    h2 {
        margin-bottom: 20px;
        color: #333;
    }

    label {
        font-weight: bold;
        display: block;
        margin-bottom: 6px;
        text-align: left;
    }

    input[type="text"] {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin-bottom: 15px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background: #4e54c8;
        border: none;
        color: white;
        font-weight: bold;
        border-radius: 5px;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #3b40a4;
    }
</style>

</head>
<body>

<div class="container">

<%
    String option = request.getParameter("update-option");

    if(option != null){
        session.setAttribute("option", option);
    } else {
        option = (String) session.getAttribute("option");
    }
%>

<h2>Update <%= option %></h2>

<form action="updateDeveloper">

<label>Employee ID</label>
<input type="text" name="employeeId">

<% if("Name".equals(option)) { %>
    <label>New Name</label>
    <input type="text" name="value">

<% } else if("Email".equals(option)) { %>
    <label>New Email</label>
    <input type="text" name="value">

<% } else if("PhoneNumber".equals(option)) { %>
    <label>New Phone Number</label>
    <input type="text" name="value">
<% } %>

<input type="submit" value="UPDATE">

</form>

</div>

</body>
</html>