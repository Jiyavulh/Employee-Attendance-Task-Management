<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Developer</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #2c3e50, #4ca1af);
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

    input[type="text"] {
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
        background: #2c3e50;
        border: none;
        color: white;
        font-weight: bold;
        border-radius: 5px;
        cursor: pointer;
        transition: 0.3s;
        margin-top: 10px;
    }

    input[type="submit"]:hover {
        background: #1a242f;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Add Developer</h2>

    <form action="addDeveloper">

        <label>Enter Name</label>
        <input type="text" name="employeeName">

        <label>Enter Email</label>
        <input type="text" name="email">

        <label>Enter Password</label>
        <input type="text" name="password">

        <label>Enter Phone Number</label>
        <input type="text" name="phoneNumber">

        <label>Enter Salary</label>
        <input type="text" name="salary">

        <label>Enter House Number</label>
        <input type="text" name="houseNumber">

        <label>Enter Area</label>
        <input type="text" name="area">

        <label>Enter City</label>
        <input type="text" name="city">

        <label>Enter State</label>
        <input type="text" name="state">

        <label>Enter Country</label>
        <input type="text" name="country">

        <label>Enter Pincode</label>
        <input type="text" name="pincode">

        <input type="submit" value="ADD DEVELOPER">
    </form>
</div>

</body>
</html>