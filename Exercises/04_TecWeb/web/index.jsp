<%@ page session="true"%>
<html>
   <head>
      <title>Start Web Application</title>
      	<meta http-equiv="Refresh" content= "0; URL=stillAServlet"/>
		<link type="text/css" href="styles/default.css" rel="stylesheet"></link>
   </head>
   <body>

      <!-- 
       ...so we offer the user something to read, meanwhile.
      
      This is the first page being shown, while the Servlet starts up the environment,
      upon the first request.
      This message avoid letting the user linger without knowing what's going on.
      -->
 
      <p>
      	Please wait for the web application to start... &nbsp;
		<img alt="wait" title="wait" src="images/wait.gif"/>
      </p>

   </body>
</html>