<?php

  header('Content-type: application/json');
  header("Cache-Control: no-cache, must-revalidate"); // HTTP/1.1
  header("Expires: Sat, 26 Jul 1997 05:00:00 GMT"); // Date in the past  

  $list = array();
  
  $task->id = "001";
  $task->data = "-- || -- || --";

  $list[] = $task;

  $response->tasks = $list;

  echo json_encode($response);

?>
