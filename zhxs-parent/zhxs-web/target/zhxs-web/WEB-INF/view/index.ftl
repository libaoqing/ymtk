<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="" action="${request.contextPath}/user/dologin" method="post">  
        <label>User Name</label> <input tyep="text" name="userName"  
            maxLength="40" /> <label>Password</label><input type="password"  
            name="password" /> <input type="submit" value="login" />  
    </form>  
    <%--用于输入后台返回的验证错误信息 --%>  
    <P>${message } !
</body>
</html>