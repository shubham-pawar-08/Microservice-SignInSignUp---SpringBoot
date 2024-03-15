<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>

</head>
<body>
    <div style="text-align: center;">
        <h2>Sign Up</h2>
        <div style="color:red"><h5>${error}</h5></div>
        <form action="/signup-user" method="post">
            <div>
                <label for="userName">Username:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input type="text" id="userName" name="userName" required><br>
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
                <div style="color:red"><h5>${signupError}</h5></div>
            </div>
            <div><br></div>
            <div>
                <button type="submit" value="Signup">Submit</button>
                <button type="button" value="goback" onclick="goToSigninPage()">Sign In</button>
                <div style="color:green"><h5>${signupSuccess}</h5></div>

            </div>
        </form>
    </div>
    <script type="text/javascript">
        function goToSigninPage(){
            window.location.href="/";
        }

    </script>
</body>
</html>
