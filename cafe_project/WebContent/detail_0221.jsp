<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ page import = "vo.CafeVO" %>
 
<!DOCTYPE html>
<html>



<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Detail</title>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css">
  <!-- Bootstrap core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- Material Design Bootstrap -->
  <link href="css/mdb.min.css" rel="stylesheet">
  <!-- Your custom styles (optional) -->
  <link href="css/style.min.css" rel="stylesheet">
  <style type="text/css">
    html,
    body,
    header,
    .carousel {
      height: 100%;
    }

    @media (min-width: 800px) and (max-width: 850px) {
      .navbar:not(.top-nav-collapse) {
        background: #1C2331 !important;
      }
    }

  </style>
<style type="text/css">/* Chart.js */
@-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}</style></head>
</head>
<body>

<nav class="navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar top-nav-collapse">
      <div class="container">

         <!-- Brand -->
         <a class="navbar-brand" href="http://localhost:8081/cafeproject/CafeServlet"> <strong>Theme Cafe</strong>
         </a>

         <!-- Collapse -->
         <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
         </button>

         <!-- Links -->
         <div class="collapse navbar-collapse" id="navbarSupportedContent">

            <!-- Left -->
            <ul class="navbar-nav mr-auto">
               <li class="nav-item active"><a class="nav-link waves-effect waves-light" href="http://localhost:8081/cafeproject/CafeServlet">Home
                     <span class="sr-only">(current)</span>
               </a></li>
               <li class="nav-item"><a class="nav-link waves-effect waves-light" href="https://mdbootstrap.com/docs/jquery/" target="_blank">Map&amp;List</a></li>
               <li class="nav-item"><a class="nav-link waves-effect waves-light" href="https://mdbootstrap.com/docs/jquery/getting-started/download/" target="_blank">Detail</a></li>
            </ul>

            <!-- Right -->
            <ul class="navbar-nav nav-flex-icons">
               <li class="nav-item"><a href="https://www.facebook.com/" class="nav-link waves-effect waves-light" target="_blank"> <i class="fab fa-facebook-f"></i>
               </a></li>
               <li class="nav-item"><a href="https://www.instagram.com/explore/tags/%ED%85%8C%EB%A7%88%EC%B9%B4%ED%8E%98/?hl=ko" class="nav-link waves-effect waves-light" target="_blank"> <i class="fab fa-instagram"></i>
               </a></li>
               <li class="nav-item"><a href="http://www.multicampus.com/" class="nav-link  waves-effect waves-light" target="_blank">
                     <i class="fab fa-maxcdn"></i>
               </a></li>
            </ul>

         </div>

      </div>
   </nav>


  
 

<section>
<% 
CafeVO cafeinfo = (CafeVO)request.getAttribute("cafeinfo");
%>
   

<hr class="my-5">




<div class="col-md-6 mb-4 flex-center">
    <img src="https://mdbootstrap.com/img/Marketing/mdb-press-pack/mdb-main.jpg" class="img-fluid z-depth-1-half" alt="">
  </div>


        <h2 class="my-5 h3 text-center">Detail</h2>

        <!--First row-->
        <div class="row features-small mt-5 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fab fa-firefox fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2 pl-3">
                <h5 class="feature-title font-bold mb-1">Name</h5>
                <p class="grey-text mt-2"> <%=cafeinfo.getName()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-level-up-alt fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Address</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getAddr()%> 
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-comments fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Theme</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getTheme()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-code fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Telephone</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getTel()%> 
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

        </div>
        <!--/First row-->

        <!--Second row-->
        <div class="row features-small mt-4 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-cubes fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">OpenTime</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getOpentime()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-question fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Menu</h5>
                <p class="grey-text mt-2"> <%=cafeinfo.getMenu()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-th fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Homepage&Blog</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getLink_page()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="far fa-file-code fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Instagram</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getLink_insta()%> 
            </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

        </div>
        <!--/Second row-->
        
                <!--Third row-->
        <div class="row features-small mt-5 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fab fa-firefox fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2 pl-3">
                <h5 class="feature-title font-bold mb-1">Style</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getStyle()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-level-up-alt fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Popular Topics</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getTopic()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-comments fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">The purpose of your visit</h5>
                <p class="grey-text mt-2"> <%=cafeinfo.getPurpose()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-code fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Booking&Parking</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getOptions()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

        </div>
        <!--/Third row-->

        <!--Fourth row-->
        <div class="row features-small mt-4 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-cubes fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Introduce</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getIntro()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-question fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Reservation Review Count</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getRview()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="fas fa-th fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">Blog Review Count</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getBview()%> 
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

          <!--Grid column-->
          <div class="col-xl-3 col-lg-6">
            <!--Grid row-->
            <div class="row">
              <div class="col-2">
                <i class="far fa-file-code fa-2x mb-1 indigo-text" aria-hidden="true"></i>
              </div>
              <div class="col-10 mb-2">
                <h5 class="feature-title font-bold mb-1">TV appearance information</h5>
                <p class="grey-text mt-2"><%=cafeinfo.getTv()%>
                </p>
              </div>
            </div>
            <!--/Grid row-->
          </div>
          <!--/Grid column-->

        </div>
        <!--/Fourth row-->
        
        

      </section>

<footer class="page-footer text-center font-small mt-4 wow fadeIn" style="visibility: visible; animation-name: fadeIn;">

      <!--Call to action-->
      
      <!--/.Call to action-->

      <hr class="my-4">

      <!-- Social icons -->
      <div class="pb-4">
         <a href="https://www.facebook.com/mdbootstrap" target="_blank"> <i class="fab fa-facebook-f mr-3"></i>
         </a> <a href="https://twitter.com/MDBootstrap" target="_blank"> <i class="fab fa-twitter mr-3"></i>
         </a> <a href="https://www.youtube.com/watch?v=7MUISDJ5ZZ4" target="_blank"> <i class="fab fa-youtube mr-3"></i>
         </a> <a href="https://plus.google.com/u/0/b/107863090883699620484" target="_blank"> <i class="fab fa-google-plus-g mr-3"></i>
         </a> <a href="https://dribbble.com/mdbootstrap" target="_blank"> <i class="fab fa-dribbble mr-3"></i>
         </a> <a href="https://pinterest.com/mdbootstrap" target="_blank"> <i class="fab fa-pinterest mr-3"></i>
         </a> <a href="https://github.com/mdbootstrap/bootstrap-material-design" target="_blank"> <i class="fab fa-github mr-3"></i>
         </a> <a href="http://codepen.io/mdbootstrap/" target="_blank"> <i class="fab fa-codepen mr-3"></i>
         </a>
      </div>
      <!-- Social icons -->

      <!--Copyright-->
      <div class="footer-copyright py-3">
         © 2019 Copyright: <a href="https://mdbootstrap.com/education/bootstrap/" target="_blank">
            청년취업아카데미 5조 </a>
      </div>
      <!--/.Copyright-->

   </footer>





</body>
</html>