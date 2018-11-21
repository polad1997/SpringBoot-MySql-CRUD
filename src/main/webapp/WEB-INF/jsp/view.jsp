<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
        <td>${lists.id}</td>
    </tr>
    <tr>
        <th>First Name</th>
        <td>${lists.user_name}</td>
    </tr>
    <tr>
        <th>User eMail
        <td>${lists.user_email}</td>
    </tr>
    <tr>
        <th>User Phone</th>
        <td>${lists.user_phone}</td>
    </tr>
    <tr>
        <th>User Message</th>
        <td>${lists.user_message}</td>
    </tr>
</table>
<a href="/">Back</a>
</body>
</html>