<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Online Time</title></head>
<body>
    <h2>Thời gian online: <c:out value="${sessionScope.onlineTime}"/> giây</h2>

    <c:if test="${sessionScope.onlineTime > 60}">
        <p style="color:red;">Bạn đã online hơn 60 giây!</p>
    </c:if>
</body>
</html>
