<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
            }
        .container {
          border-radius: 5px;
          background-color: #f2f2f2;
          padding: 50px;
          margin: 50px 100px;
        }
    </style>
</head>

<body>
    <s:include value="Navigation.jsp"/>
    <div class="container">
        <h1>Login Page</h1>
        <h3><s:property value="pageDescr" /></h3>
        <s:form action="NewLogin" namespace="/example">
        <s:textfield key="username" />
        <s:password key="password" />
        <s:submit key="submit" />
        </s:form>
    </div>

    
</body>
</html>
