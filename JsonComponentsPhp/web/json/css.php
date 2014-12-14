<?php

  header("Cache-Control: no-cache, must-revalidate"); // HTTP/1.1
  header("Expires: Sat, 26 Jul 1997 05:00:00 GMT"); // Date in the past
  header("Content-type: text/css");
  header("X-Content-Type-Options: nosniff");
  
  include "../css/" . $_GET["css"];

?>