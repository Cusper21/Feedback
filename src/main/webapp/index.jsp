<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="jstyle.css">
    <title>Web Document</title>

</head>
<body>
<h1> Web Docuz
</h1>

<form action="SaveServlet" method="post" id="form">
    
    <input type="text" id="fname" name="name" placeholder="Name"><br><br>
    
    <input type="text" id="address" name="address" placeholder="Address"><br><br>

    <input type="text" id="email" name="email" placeholder="Email"><br><br>

    <div class="checkbox">

        <p>What do you like about us?</p>
        
        <input type="checkbox" id="students" name="rChecked" value="students">
        <label for="students">students</label><br><br>
      
        <input type="checkbox" id="location" name="rChecked" value="location">
        <label for="location">location</label><br><br>
        
        <input type="checkbox" id="campus" name="rChecked" value="campus">
        <label for="campus">campus</label><br><br>
       
        <input type="checkbox" id="atmosphere" name="rChecked" value="atmosphere">
        <label for="atmosphere">atmosphere</label><br><br>
        
        <input type="checkbox" id="sports" name="rChecked" value="sports">
        <label for="sports">sports</label><br><br>

    </div>

    <div>

        <p>Where did you hear about us?</p>

        <div>
            <input type="radio" id="television" name="Option" value="television">
            <label for="television">Television</label><br><br>
        </div>

        <div>
            <input type="radio" id="friends" name="Option" value="friends">
            <label for="friends">Friends</label><br><br>
        </div>

        <div>
            <input type="radio" id="Internet" name="Option" value="Internet" checked>
            <label for="Internet">Internet</label><br><br>
        </div>

        <div>
            <input type="radio" id="Other" name="Option" value="Other">
            <label for="Other">Other</label><br><br>
        </div>

    </div>

    <div>
        <label for="additionalComments">Additional Comments:</label>

        <textarea id="additionalComments" name="additionalComments" rows="4" cols="50">

        </textarea><br><br>
    </div>

    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>
<a href="hello-servlet"></a>
</body>
</html>