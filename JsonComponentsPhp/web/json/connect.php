<?php

  header('Content-type: application/json');
  header("Cache-Control: no-cache, must-revalidate"); // HTTP/1.1
  header("Expires: Sat, 26 Jul 1997 05:00:00 GMT"); // Date in the past  

  $version = "";
  $version->version = "JsonComponents v0.0.2";

  echo json_encode($version);

?>