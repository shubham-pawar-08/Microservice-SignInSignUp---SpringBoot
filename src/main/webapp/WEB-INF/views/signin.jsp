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
        <form action="/signin" method="post">
            <div>
                <label for="userName">Username:</label>
                <input type="text" id="userName" name="userName" required><br>
            </div>
            <div><br></div>
            <div>
                <label for="password">Password:&nbsp;</label>
                <input type="password" id="password" name="password" required><br>
            </div>
            <div><br></div>
            <div>
                <button type="submit" value="Signin">Sign In</button>
                <button type="button" value="Signup" onclick="goToSignup()">Sign Up</button>
            </div>
        </form>
    </div>
    <script type="text/javascript">
        function goToSignup(){
            window.location.href="/signup";
        }

    </script>
</body>
</html>
