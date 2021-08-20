<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['시간', '식욕'],
          [ 20,      90],
          [ 20.3,      90.3],
          [ 20.5,      90.5],
          [ 21,      91],
          [ 22,      92],
          [ 23,      93],
          [ 23.3,      89],
          [ 23,      85],
          [ 23,      80],
        ]);

        var options = {
          title: '시간 vs. 식욕',
          hAxis: {title: '시간', minValue: 0, maxValue: 24},
          vAxis: {title: '식욕', minValue: 0, maxValue: 100},
          legend: 'none'
        };

        var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>
