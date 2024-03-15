<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
</head>

<body>
    <h4>Successfully Signed In ${Username}</h4>
    <div> <button type="button" value="Signin" onclick="goBack()">Back</button>
    </div>
    <script type="text/javascript">
        function goBack() {
            window.location.href = "/";
        }

    </script>
</body>

</html>