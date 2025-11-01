<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring JPA</title>
<style>
        body {
            font-family: "Poppins", sans-serif;
            background: linear-gradient(135deg, #6a11cb 0%, #2575fc 100%);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }

        .form-container {
            background: white;
            padding: 40px 50px;
            border-radius: 20px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            width: 350px;
            text-align: center;
        }

        .form-container h2 {
            margin-bottom: 25px;
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 15px;
            transition: all 0.3s ease;
        }

        input[type="text"]:focus {
            border-color: #2575fc;
            box-shadow: 0 0 5px #2575fc;
            outline: none;
        }

        input[type="submit"] {
            background: #2575fc;
            color: white;
            border: none;
            padding: 12px 20px;
            border-radius: 8px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
            width: 100%;
        }

        input[type="submit"]:hover {
            background: #6a11cb;
        }

        .footer-text {
            margin-top: 20px;
            font-size: 13px;
            color: #666;
        }
    </style>
</head>
<body>
	<div class="form-container">
        <h2>Add Human</h2>
        <form action="addHuman" method="post">
            <input type="text" name="aid" placeholder="Enter ID" required>
            <input type="text" name="aname" placeholder="Enter Name" required>
            <input type="submit" value="Submit">
        </form>
        <p class="footer-text">Powered by Spring Boot + JSP + H2 Database</p>
        <p style="text-align:center; font-family:Poppins, sans-serif; color:#555;">
    A simple Spring Boot web project using JPA and H2 Database, performing basic CRUD operations.</p>
    </div>

</body>
</html>