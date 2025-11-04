<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Data from Database</title>
</head>
<body>

		<div class="form-container">
    <h2>Delete Data</h2>
    <form action="deleteHuman" method="post">
        <input type="text" name="aid" placeholder="Enter ID to Delete" required>
        <input type="submit" value="Delete">
    </form>
</div>
		

</body>
</html>