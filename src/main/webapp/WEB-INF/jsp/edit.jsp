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
<hr/>
<form method="post" action="/save">
    <input type="hidden" name="id" value="${lists.id}"/><br/>
    User name:<br>
    <input type="text" name="firstname" value="${lists.user_name}"/>
    <br>
    User email:<br>
    <input type="text" name="email" value="${lists.user_email}">
    <br>
    User phone:<br>
    <input type="text" name="phone" value="${lists.user_phone}"/>
    <br>
    User message:<br>
    <input type="text" name="message" value="${lists.user_message}"/>
    <br>


    <input type="submit" value="Submit">
</form>

</body>
</html>