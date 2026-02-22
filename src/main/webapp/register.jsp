<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #11998e, #38ef7d);
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .container {
        background: white;
        padding: 35px 40px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 350px;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    label {
        font-weight: bold;
        font-size: 14px;
        color: #555;
        display: block;
        margin-bottom: 5px;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 8px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background: #11998e;
        border: none;
        color: white;
        font-weight: bold;
        border-radius: 5px;
        cursor: pointer;
        transition: 0.3s;
        margin-top: 10px;
    }

    input[type="submit"]:hover {
        background: #0f7f75;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Register</h2>

    <form action="register">
        <label>Name</label>
        <input type="text" name="employeeName">

        <label>Email</label>
        <input type="text" name="email">

        <label>Password</label>
        <input type="password" name="password">

        <label>Phone Number</label>
        <input type="text" name="phoneNumber">

        <label>Salary</label>
        <input type="text" name="salary">

        <label>House Number</label>
        <input type="text" name="houseNumber">

        <label>Area</label>
        <input type="text" name="area">

        <label>City</label>
        <input type="text" name="city">

        <label>State</label>
        <input type="text" name="state">

        <label>Country</label>
        <input type="text" name="country">

        <label>Pincode</label>
        <input type="text" name="pincode">

        <input type="submit" value="REGISTER">
    </form>
</div>

</body>
</html>