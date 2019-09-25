<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@page import="vo.CafeVO"%>
<%@page import="java.net.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
   content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>서울 테마카페 맵</title>
<link href="css/bootstrap12.min.css" rel="stylesheet">
<link href="css/micon12.min.css" rel="stylesheet">
<link href="css/fluent12.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Poor+Story&amp;subset=korean" rel="stylesheet">
<style type="text/css">

@font-face {
  font-family:"Poor Story" ;
  font-style:normal;
  font-weight:narmal;
}

@media (min-width: 800px) and (max-width: 850px) {
      .navbar:not(.top-nav-collapse) {
        background: #1C2331 !important;
      }
    }

body {
  font-family: Poor Story !important;
  }
  
table {
   border: 1px solid black;
   margin: auto;
   text-align: center;
}

 
</style>

<script language = "javaScript" type="text/javascript">

function popup(){
	window.open("/cafeproject/popup.jsp", "Title", "width=400px, height=500px, top=700, left=0");
	
	
}
<%String zone = (String)request.getParameter("zone");
String theme = (String)request.getParameter("theme");
String search = (String)request.getParameter("search");
String pagenum = (String)request.getParameter("pagenum");
String zoneforview = zone;
String themeforview = theme;
%>
</script>


</head>
<body onload="popup()">
 <!-- Navbar -->
  <nav class="navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar">
    <div class="container">

      <!-- Brand -->
      <a class="nav-link border border-light rounded bg-dark text-white" href="http://70.12.111.114:8081/cafeproject/CafeServlet">
        <strong>Theme Cafe</strong>
      </a>

            <a class="nav-link border border-light rounded bg-dark text-white" href="#">Top
         
            </a>
      <!-- Collapse -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Links -->
      <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <!-- Left -->

<br>
<br>
<br>
           <!-- Right -->
      </div>

    </div>
  </nav>
  
<h2></h2>
   <%
      CafeVO cafeinfo = (CafeVO) session.getAttribute("cafeinfo");
   %>



   <!-- for(int i = 1 ; i <= 3 ; i++){
String urlStr = "img/real_cafeimage/=cafeinfo.getNo()_00" + i +".jpg";
URL url = new URL(urlStr);
HttpURLConnection huc = (HttpURLConnection) url.openConnection();
int responseCode = huc.getResponseCode();
            
if (responseCode == 200){
 -->


   <!--Card-->
   <div class="card">

      <!--Card image-->
      <div class="view">
         <%
            File f1 = new File("C:/project/cafeproject/WebContent/img/real_cafeimage/" + cafeinfo.getNo() + "_001.jpg");
            File f2 = new File("C:/project/cafeproject/WebContent/img/real_cafeimage/" + cafeinfo.getNo() + "_002.jpg");
            File f3 = new File("C:/project/cafeproject/WebContent/img/real_cafeimage/" + cafeinfo.getNo() + "_003.jpg");

            if (f1.isFile() && f2.isFile() && f3.isFile()) {
               System.out.println("333333");
         %>
         <!-- Grid row -->
         <div class="row mb-5">

            <!-- Grid column -->
            <div class="col-md-2"></div>
            <div class="col-md-8">


               <div id="carouselExampleIndicators" class="carousel slide"
                  data-ride="carousel">
                  <ol class="carousel-indicators">
                     <li data-target="#carouselExampleIndicators" data-slide-to="0"
                        class="active"></li>
                     <li data-target="#carouselExampleIndicators" data-slide-to="1"
                        class=""></li>
                     <li data-target="#carouselExampleIndicators" data-slide-to="2"
                        class=""></li>
                  </ol>
                  <div class="carousel-inner">

                     <div class="carousel-item active">
                        <img class="d-block w-100"
                           src="img/real_cafeimage/<%=cafeinfo.getNo()%>_001.jpg"
                           alt="First slide" style="width: auto; height: 500px;">
                     </div>
                     <div class="carousel-item">
                        <img class="d-block w-100"
                           src="img/real_cafeimage/<%=cafeinfo.getNo()%>_002.jpg"
                           alt="Second slide" style="width: auto; height: 500px;">
                     </div>
                     <div class="carousel-item">
                        <img class="d-block w-100"
                           src="img/real_cafeimage/<%=cafeinfo.getNo()%>_003.jpg"
                           alt="Third slide" style="width: auto; height: 500px;">
                     </div>

                  </div>
                  <!-- carousel-inner 닫는 태그 -->
                  <a class="carousel-control-prev" href="#carouselExampleIndicators"
                     role="button" data-slide="prev"> <span
                     class="carousel-control-prev-icon" aria-hidden="true"></span> <span
                     class="sr-only">Previous</span>
                  </a> <a class="carousel-control-next"
                     href="#carouselExampleIndicators" role="button" data-slide="next">
                     <span class="carousel-control-next-icon" aria-hidden="true"></span>
                     <span class="sr-only">Next</span>
                  </a>
               </div>


            </div>
            <div class="col-md-2"></div>
            <!-- Grid column -->
         </div>
         <!-- Grid row -->

         <%
            } else if (f1.isFile() && f2.isFile()) {
               System.out.println("222222222");
         %>

         <!-- Grid row -->
         <div class="row mb-5">

            <!-- Grid column -->
            <div class="col-md-2"></div>
            <div class="col-md-8">


               <div id="carouselExampleIndicators" class="carousel slide"
                  data-ride="carousel">
                  <ol class="carousel-indicators">
                     <li data-target="#carouselExampleIndicators" data-slide-to="0"
                        class="active"></li>
                     <li data-target="#carouselExampleIndicators" data-slide-to="1"
                        class=""></li>
                  </ol>
                  <div class="carousel-inner">

                     <div class="carousel-item active">
                        <img class="d-block w-100"
                           src="img/real_cafeimage/<%=cafeinfo.getNo()%>_001.jpg"
                           alt="First slide" style="width: auto; height: 500px;">
                     </div>
                     <div class="carousel-item">
                        <img class="d-block w-100"
                           src="img/real_cafeimage/<%=cafeinfo.getNo()%>_002.jpg"
                           alt="Second slide" style="width: auto; height: 500px;">
                     </div>


                  </div>
                  <!-- carousel-inner 닫는 태그 -->

                  <a class="carousel-control-prev" href="#carouselExampleIndicators"
                     role="button" data-slide="prev"> <span
                     class="carousel-control-prev-icon" aria-hidden="true"></span> <span
                     class="sr-only">Previous</span>
                  </a> <a class="carousel-control-next"
                     href="#carouselExampleIndicators" role="button" data-slide="next">
                     <span class="carousel-control-next-icon" aria-hidden="true"></span>
                     <span class="sr-only">Next</span>
                  </a>
               </div>


            </div>
            <div class="col-md-2"></div>
            <!-- Grid column -->
         </div>
         <!-- Grid row -->

         <%
            } else if (f1.isFile()) {
               System.out.println("11111111111");
         %>
         <!-- Grid row -->
         <div class="row mb-5">

            <!-- Grid column -->
            <div class="col-md-2"></div>
            <div class="col-md-8">


               <div id="carouselExampleIndicators" class="carousel slide"
                  data-ride="carousel">
                  <ol class="carousel-indicators">
                     <li data-target="#carouselExampleIndicators" data-slide-to="0"
                        class="active"></li>
                  </ol>
                  <div class="carousel-inner">

                     <div class="carousel-item active">
                        <img class="d-block w-100"
                           src="img/real_cafeimage/<%=cafeinfo.getNo()%>_001.jpg"
                           alt="First slide" style="width: auto; height: 500px;">
                     </div>

                  </div>
                  <!-- carousel-inner 닫는 태그 -->

                  <a class="carousel-control-prev" href="#carouselExampleIndicators"
                     role="button" data-slide="prev"> <span
                     class="carousel-control-prev-icon" aria-hidden="true"></span> <span
                     class="sr-only">Previous</span>
                  </a> <a class="carousel-control-next"
                     href="#carouselExampleIndicators" role="button" data-slide="next">
                     <span class="carousel-control-next-icon" aria-hidden="true"></span>
                     <span class="sr-only">Next</span>
                  </a>
               </div>


            </div>
            <div class="col-md-2"></div>
            <!-- Grid column -->
         </div>
         <!-- Grid row -->
         <%
            } else {
            }
         %>
      </div>


<!--Card content-->
      <div class="card-body text-center elegant-color">
         <h2 class="card-title pt-2 pb-0 font-weight-bold mb-2"><%=cafeinfo.getName()%></h2>
         <p class="card-subtitle"><%=cafeinfo.getTheme()%></p>
         <!-- Text -->
         <p class="card-text">
            <%
               if (!cafeinfo.getMenu().equals("N")) {
            %>
         
         <ul>
            <li class="text-monospace">-Menu-</li>
            <%
               String[] menu = cafeinfo.getMenu().split("-");
                  System.out.println(menu);
                  for (int i = 0; i < menu.length; i++) {
            %>
            <li><%=menu[i]%></li>
            <%
               }
            %>
         </ul>
         <%
            }
         %>
         </p>
         <p class="text-monospace">
         <ul class="clear">

            <li class="d-flex justify-content-between"><i></i> <span><%=cafeinfo.getAddr()%></span></li>
            <%
               if (!cafeinfo.getTel().equals("N")) {
            %>
            <li class="d-flex justify-content-between"><i></i> <span><%=cafeinfo.getTel()%></span></li>
            <%
               }
               if (!cafeinfo.getLink_insta().equals("N")) {
            %>
            <li class="d-flex justify-content-between"><i></i> <span><a class="text-monospace"
                  href="<%=cafeinfo.getLink_insta()%>">instagram</a></span></li>
            <%
               }
               if (!cafeinfo.getLink_page().equals("N")) {
            %>
            <li class="d-flex justify-content-between"><i></i> <span><a class="text-monospace"
                  href="<%=cafeinfo.getLink_page()%>">webpage</a></span></li>
            <%
               }
               if (!cafeinfo.getOpentime().equals("N")) {
            %>
            <li class="d-flex justify-content-between"><i></i> <span><%=cafeinfo.getOpentime()%></span></li>
            <%
               }
               if (!cafeinfo.getOptions().equals("N")) {
            %>
            <li class="d-flex justify-content-between"> <i></i><span><%=cafeinfo.getOptions()%></span></li>
            <%
               }
               if (!cafeinfo.getStyle().equals("N")) {
            %>
            <li class="d-flex justify-content-between"><i></i><span><%=cafeinfo.getStyle()%></span></li>
            <%
               }
               if (!cafeinfo.getTopic().equals("N")) {
            %>
            <li class="d-flex justify-content-between"> <i></i><span><%=cafeinfo.getTopic()%></span></li>
            <%
               }
               if (!cafeinfo.getPurpose().equals("N")) {
            %>
            <li class="d-flex justify-content-between"> <i></i><span><%=cafeinfo.getPurpose()%></span></li>
            <%
               }
               if (!cafeinfo.getTv().equals("N")) {
            %>
            <li class="d-flex justify-content-between"><i></i> <span><%=cafeinfo.getTv()%></span></li>
        
            <%
               }
            %>
         </ul>
         </p>
      </div>


      <div class="card-footer bg-transparent d-flex justify-content-around">
         <span class="text-muted"> 예약자가 남긴 리뷰 수 : <%=cafeinfo.getRview()%>
         </span> <span class="text-muted"> 블로그 리뷰 수 : <%=cafeinfo.getBview()%>
         </span>
      </div>
   </div>
   <!--/.Card-->
   

   <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
   <!-- Bootstrap tooltips -->
   <script type="text/javascript" src="js/popper.min.js"></script>
   <!-- Bootstrap core JavaScript -->
   <script type="text/javascript" src="js/bootstrap.min.js"></script>
   <!-- MDB core JavaScript -->
   <script type="text/javascript" src="js/mdb.min.js"></script>








</body>