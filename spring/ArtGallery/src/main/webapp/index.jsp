<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>ArtGallery</title>
    <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script type="text/javascript">
        var homePage=$("#homePage").val();
        console.log(document.getElementsByName("userName"));
        var contextPath="${pageContext.request.contextPath}";

        //This will be called once dom is loaded into the memory
        $(document).ready(function () {
                $("#goLogin").click(function () {
                    $.getJSON(contextPath+"/productGet",{hostname:homePage},function(result){
                        console.log(result);
                    });
                });
        });
    </script>
</head>
<body>
<h2>Hello World! </h2>
</body>

<p>Welcome to my page</p>
<form id="homePage" method="get">

    <input type="text" id="userName" name="userName" />
    <button type="button" class="btn" id="goLogin" >go</button>
</form>
</html>
