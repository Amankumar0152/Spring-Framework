<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring JPA</title>
<style>
        .form-container {
  max-width: 400px;
  margin: 80px auto;
  padding: 30px 25px;
  background: #1e1e2f;
  border-radius: 12px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
  text-align: center;
  color: #fff;
}

.form-container h2 {
  margin-bottom: 20px;
  font-size: 1.5rem;
  color: #00bcd4;
}

.form-container form {
  display: flex;
  flex-direction: column;
  gap: 15px;
}

.form-container input[type="text"] {
  padding: 12px;
  font-size: 1rem;
  border: none;
  border-radius: 8px;
  outline: none;
  background: #2e2e42;
  color: #fff;
  transition: 0.3s;
}

.form-container input[type="text"]:focus {
  box-shadow: 0 0 8px #00bcd4;
}

.form-container input[type="submit"] {
  padding: 12px;
  font-size: 1rem;
  background: #00bcd4;
  color: white;
  border: none;
  border-radius: 8px;
  cursor: pointer;
  transition: 0.3s;
}

.form-container input[type="submit"]:hover {
  background: #0097a7;
}
    </style>
</head>
<body>

	<div class="form-container">
        <h2>Add Data to H2 Database</h2>
        <form action="addHuman" method="post">
            <input type="text" name="aid" placeholder="Enter ID" required>
            <input type="text" name="aname" placeholder="Enter Name" required>
            <input type="text" name="tech" placeholder="Enter Language">
            <input type="submit" value="Submit">
        </form>
        <p class="footer-text">Powered by Spring Boot + JSP + H2 Database</p>
        <p style="text-align:center; font-family:Poppins, sans-serif; color:#555;">
    A simple Spring Boot web project using JPA and H2 Database, performing basic CRUD operations.</p>
    </div>
    
    <div class="form-container">
        <h2>Search Data</h2>
        <form action="getHuman" method="post">
            <input type="text" name="aid" placeholder="Enter ID" required>
            <input type="submit" value="Submit">
        </form>
    </div>
    
    <div class="form-container">
    <h2>Delete Human by ID</h2>
    <form action="deleteHuman" method="post">
        <input type="text" name="aid" placeholder="Enter ID" required>
        <input type="submit" value="Delete">
    </form>
</div>

</body>
</html>