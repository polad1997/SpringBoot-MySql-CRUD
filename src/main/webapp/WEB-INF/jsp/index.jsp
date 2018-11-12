<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head><title>SpringBoot</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>ID</th>
        <th>User Name</th>
        <th>User Surname</th>
        <th>Action</th>
    </tr>
    <c:forEach var="list" items="${lists}">
        <tr>
            <td>${list.id}</td>
            <td>${list.user_name}</td>
            <td>${list.user_surname}</td>

        </tr>
    </c:forEach>
</table>
>

</body>
</html>
