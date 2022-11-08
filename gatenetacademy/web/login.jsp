<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOG IN</title>
        <link rel="stylesheet" type="text/css" href="css/botstrap.css">
	<script type="js/botstrap.js"></script>
	<script type="js/jquery.js"></script>
    </head>
    <body>
        <form method="post" class="mt-5" action="LoginServlet">
            <fieldset class="border p-5">
                <legend class="w-auto" style="text-align: center">
                    <div class="from-group">
                        <label>Email or Mobile</label>
                        <input type="text" name="user" class="form-control">
                    </div>
                    <div class="from-group">
                        <label>Password</label>
                        <input type="password" name="pwd" class="form-control">
                    </div>
                    <div class="from-group">
                        <label>Submit</label>
                        <input type="submit" name="login" class="btn btn-lg btn-success">
                        <a style="padding-left: 50px;" href="signin.jsp">Sign Up</a>
                        <a href="registermobile.jsp">Forget Password</a>
                    </div>
            </fieldset>
        </form>
    </body>
</html>
