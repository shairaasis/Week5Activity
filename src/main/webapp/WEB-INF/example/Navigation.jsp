<%@ taglib prefix="s" uri="/struts-tags" %>
<style>
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

<div class="navbar">
            <s:url var="indexPage" value="/" />
            <s:a href="%{indexPage}" class="logo">AltaSofia</s:a>
            <s:url var="newloginPage" action="NewLogin" />
        <s:a href="%{newloginPage}">New Login</s:a>
            <s:url var="contactPage" action="Contact" />
            <s:a href="%{contactPage}">Contact</s:a>
            <s:url var="servicePage" action="Services" />
            <s:a href="%{servicePage}">Services</s:a>
            <s:url var="aboutPage" action="About" />
            <s:a href="%{aboutPage}">About</s:a>
            <s:url var="indexPage" value="/" />
            <s:a href="%{indexPage}">Home</s:a>
</div>