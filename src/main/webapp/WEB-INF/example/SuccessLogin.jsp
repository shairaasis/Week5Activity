<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        
        <style>
            body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
            }
            main {
            padding: 5%;
            background: white;
            color: #00242f;
            }
            .item1 { grid-area: greet;}
            .item2 { grid-area: profile; }
            .item3 { grid-area: bio; }
            .item4 { grid-area: revenue; }
       

            .grid-container {
            display: grid;
            grid-template-areas:
                'greet greet greet greet greet greet'
                'profile profile bio bio bio bio'
                'profile profile revenue revenue revenue revenue';
                gap: 5px;
                padding: 0 5px;
                background-color: #c2d9e065;
            }

            .grid-container > div {
            text-align: left;
            padding: 10px 20px;
            background-color: #0086af20;
            }
            .item1{
                text-align: center;
            }
        </style>
            <title>About</title>

        
    </head>
    
    <body>
    <main>
        <div class="grid-container">
            <s:set var="activeAccount" value="activeAccount.type" />
            <div class="item1">
            <h1>PROFILE</h1>
            <p>Hi <s:property value="activeAccount.firstname" />, Welcome to Alta Sofia.</p>
            </div>


            <s:if test='%{#activeAccount == "admin"}'>
                <div class="item2">
                    <img style="width: 150px; height: 150px;" src="https://cdn-icons-png.flaticon.com/512/149/149071.png" alt="profilepic">
                    <h1><s:property value="activeAccount.firstname" /> <s:property value="activeAccount.lastname" /></h1>
                    <p>Admin @<s:property value="activeAccount.username" /></p>
                    <p><s:property value="activeAccount.bday" /></p>
                </div>
                <div class="item3">
                    <h1>Bio</h1>
                    <p><s:property value="activeAccount.bio" /></p>
                </div>

                <div class="item4">
                    <h1>Revenue</h1>
                    <h4>Yearly Revenue</h4>
                    <p>P10,000,000.00</p>

                    <h4>Monthly Revenue</h4>
                    <p>P1,000,000.00</p>

                    <h4>Daily Revenue</h4>
                    <p>P33,000.00</p>
                </div>

            </s:if>
            <s:elseif test='%{#activeAccount == "regular"}'>
                <div class="item2">
                    <img style="width: 150px; height: 150px;" src="https://cdn-icons-png.flaticon.com/512/149/149071.png" alt="profilepic">
                    <h1><s:property value="activeAccount.firstname" /> <s:property value="activeAccount.lastname" /></h1>
                    <p>@<s:property value="activeAccount.username" /></p>
                    <p><s:property value="activeAccount.bday" /></p>
                </div>
                <div class="item3">
                    <h1>Bio</h1>
                    <hp><s:property value="activeAccount.bio" /></p>
                </div>                       
            </s:elseif>

        </div>
    </main>
    
    <footer>

    </footer>    
</body>
</html>