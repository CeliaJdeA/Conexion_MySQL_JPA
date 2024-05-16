<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- ESTA ETIQUETA DE ABAJO IMPIDE QUE CARGUE ESTA VISTA. HAY QUE ELIMINARLA POR INCOMPATIBILIDAD --%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Ingredientes</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Listado de Ingredientes</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Categoria</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ingrediente" items="${ingredientes}">
                <tr>
                    <td>${ingrediente.id}</td>
                    <td>${ingrediente.nombre}</td>
                    <td>${ingrediente.categoria.nombre}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>