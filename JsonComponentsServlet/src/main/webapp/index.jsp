<html>
  <head>
    <title>Service test page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="author" content="petercsengodi"/>
    <!--  link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" / -->
    <!-- link href="./css/index.css" rel="stylesheet" type="text/css" / -->
    <script type="text/javascript" src="./js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="./js/lib.js"></script>
  </head>
<body>
<h2>Hello User!</h2>

<form id="service_test_form">
  URL:
  <input name="service_url" value="http://localhost:8080/JsonComponentServlet/connect" />
  <input type="submit" onclick="load_version(); return false;" value="Load Version" />  

</form>

</body>
</html>
