<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
        }
        main {
        padding: 232px 200px;
        text-align: center;
        background: white;
        color: #00242f;
        }
        h1 {
            font-size: 60px;
        }
        .navbar {
        overflow: hidden;
        background-color: #004C64;
        position: sticky;
        position: -webkit-sticky;
        top: 0;
        }
        .navbar a {
        float: right;
        display: block;
        color: white;
        text-align: center;
        padding: 14px 20px;
        text-decoration: none;
        }
        .navbar a.logo {
        color: white;
        float: left;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: bolder;
        }
        .navbar a:hover {
        background-color: #ddd;
        color: #00242f;
        }
    </style>
    
</head>

<body>
    <div class="navbar">
        <s:url var="indexPage" value="/" />
        <s:a href="%{indexPage}" class="logo">AltaSofia</s:a>
        <s:url var="newloginPage" action="example/NewLogin" />
        <s:a href="%{newloginPage}">New Login</s:a>
        <s:url var="contactPage" action="example/Contact" />
        <s:a href="%{contactPage}">Contact</s:a>
        <s:url var="servicePage" action="example/Services" />
        <s:a href="%{servicePage}">Services</s:a>
        <s:url var="aboutPage" action="example/About" />
        <s:a href="%{aboutPage}">About</s:a>
        <s:url var="indexPage" value="/" />
        <s:a href="%{indexPage}">Home</s:a>
    </div>
 

        <main>
            
                <h1>SET YOURSELF APART</h1>
                <p>Our highly systematic and well-organized review program has proven to be a very effective tool in helping students achieve their international career</p>
        </main>

        <footer>

        </footer>


</body>
</html>