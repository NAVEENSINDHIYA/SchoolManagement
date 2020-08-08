<%-- 
    Document   : LoginAs
    Created on : Aug 8, 2020, 11:51:30 AM
    Author     : SCINDIA
--%>


<html>
<body>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
.collapsible {
  background-color: #888;
  color: white;
  cursor: pointer;
  padding: 18px;
  width: 100%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
}

.active, .collapsible:hover {
  background-color: #333;
}

.content {
  padding: 0 18px;
  display: none;
  overflow: hidden;
  background-color: #f1f1f1;
}
</style>
</head>


<p>LOGIN AS:</p>
<button type="button" class="collapsible">ADMIN</button>
<div class="content">
 
<form action="./RegisterAll" method="post">
  
    <div class="form-group">
    <label for="fullname">User Name:</label>
    <input type="text" class="form-control" name="username">
  </div>
    
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password">
  </div>
    
 <button type="submit" class="btn btn-default">Submit</button>
  </form>
    </div>

<button type="button" class="collapsible">PRINCIPLE</button>
<div class="content">
 
<form action="./Login" method="post">
  
    <div class="form-group">
    <label for="fullname">User Name:</label>
    <input type="text" class="form-control" name="username">
  </div>
    
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password">
  </div>
    
 <button type="submit" class="btn btn-default">Submit</button>
  </form>
    </div>
  
 <button type="button" class="collapsible">TEACHER</button>
<div class="content">
 
<form action="./Login" method="post">
  
    <div class="form-group">
    <label for="fullname">User Name:</label>
    <input type="text" class="form-control" name="username">
  </div>
    
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password">
  </div>
    
 <button type="submit" class="btn btn-default">Submit</button>
  </form>
    </div>
 
 <button type="button" class="collapsible">ACCOUNTANT</button>
<div class="content">
 
<form action="./Login" method="post">
  
    <div class="form-group">
    <label for="fullname">User Name:</label>
    <input type="text" class="form-control" name="username">
  </div>
    
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password">
  </div>
    
 <button type="submit" class="btn btn-default">Submit</button>
  </form>
    </div>
 
 <button type="button" class="collapsible">LIBRARIAN</button>
<div class="content">
 
<form action="./Login" method="post">
  
    <div class="form-group">
    <label for="fullname">User Name:</label>
    <input type="text" class="form-control" name="username">
  </div>
    
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password">
  </div>
    
 <button type="submit" class="btn btn-default">Submit</button>
  </form>
    </div>
 
 <button type="button" class="collapsible">STUDENT</button>
<div class="content">
 
<form action="./Login" method="post">
  
    <div class="form-group">
    <label for="fullname">User Name:</label>
    <input type="text" class="form-control" name="username">
  </div>
    
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password">
  </div>
    
 <button type="submit" class="btn btn-default">Submit</button>
  </form>
    </div>
       

<script>
var coll = document.getElementsByClassName("collapsible");
var i;

for (i = 0; i < coll.length; i++) {
  coll[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var content = this.nextElementSibling;
    if (content.style.display === "block") {
      content.style.display = "none";
    } else {
      content.style.display = "block";
    }
  });
}
</script>
</body>
</html>
