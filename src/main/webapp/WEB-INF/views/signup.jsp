<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>

</head>
<body>
    <div style="text-align: center;">
        <h2>Sign In</h2>
        <div style="color:red"><h5>${error}</h5></div>
        <form action="/signup-user" method="post">
            <div>
                <label for="username">Username:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input type="text" id="username" name="username" required><br>
            </div>
            <div><br></div>
            <div>
                <label for="password">Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input type="password" id="password" name="password" required><br>
            </div>
            <div><br></div>
            <div>
                <label for="password">Retype-Password:</label>
                <input type="password" id="password1" name="password1" required><br>
            </div>
            <div><br></div>
            <div>
                <button type="submit" value="Signup">Sign Up</button>
                <button type="button" value="goback" onclick="goToHomePage()">Sign Up</button>
            </div>
        </form>
    </div>
    <script type="text/javascript">
        function goToHomePage(){
            window.location.href="/homePage";
        }

    </script>
</body>
</html>
