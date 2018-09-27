<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h3>Login Page</h3>
 
      <form id="loginform" method="POST" action="/">
         <table border="0">
            <tr>
               <td>User Name</td>
               <td><input type="text" name="j_username" size="20" required /> </td>
            </tr>
            <tr>
               <td>Password</td>
               <td><input type="password" name="j_password" size="20" required autocomplete="off" /> </td>
            </tr>
          
            <tr>
               <td colspan ="2">
                  <input type="submit" value= "Submit" />
               </td>
            </tr>
         </table>
      </form>

</body>
</html>
