<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

<div class="container" style="padding: 5% 5%">
    <h1 class="text-center">Add New Employee</h1>
    <form action="/employee/save" method="post" modelAttribute="employee">
        <input type="hidden" name="id" value="${employee.id}">
        <div class="mb-3">
            <label for="name" class="form-label">Employee Name</label>
            <input type="text" class="form-control" id="name" name="name" required value="${employee.name}" placeholder="Insert name">
        </div>
        <div class="mb-3">
            <label for="wage" class="form-label">Employee Wage</label>
            <input type="text" class="form-control" id="wage" name="wage" required value="${employee.wage}" placeholder="Insert Wage">
        </div>
        <button class="btn btn-primary" type="submit">Save</button>
    </form>
</div>
</body>
</html>
