<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Task Status</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #ff7e5f, #feb47b);
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
        margin-bottom: 8px;
        text-align: left;
    }

    input[type="text"],
    select {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin-bottom: 20px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background: #ff7e5f;
        border: none;
        color: white;
        font-weight: bold;
        border-radius: 5px;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #e76447;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Change Task Status</h2>

    <form action="changeTaskStatus">
        <label>Task ID</label>
        <input type="text" name="taskId">

        <label>Status</label>
        <select name="status">
            <option value="IN_PROGRESS">IN_PROGRESS</option>
            <option value="COMPLETED">COMPLETED</option>
        </select>

        <input type="submit" value="UPDATE STATUS">
    </form>
</div>

</body>
</html>