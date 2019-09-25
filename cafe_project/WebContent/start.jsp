<%@page import="vo.CafeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@page import="dao.CafeDAO"%>
<%@page import="vo.CafeVO"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<script type="text/javascript">
<%String zone = (String)request.getParameter("zone");
String theme = (String)request.getParameter("theme");
String search = (String)request.getParameter("search");
String pagenum = (String)request.getParameter("pagenum");
String zoneforview = zone;
String themeforview = theme;
if(zone==null){
	zone="Seoul";
}	
if(theme==null){
	theme="Whole";
}
if(search==null){
	search="검색";
}
if(pagenum==null){
	pagenum="1";
}
if(zone.equals("Seoul"))
	zoneforview = "서울 전체";
if(theme.equals("Whole"))
	themeforview="전체 테마";
%>
</script>

<head>
<link href="https://fonts.googleapis.com/css?family=Poor+Story&amp;subset=korean" rel="stylesheet">
<style type="text/css"> 

@font-face {
  font-family:"Poor Story" ;
  font-style:normal;
  font-weight:narmal;
}

body {
  font-family: Poor Story !important;
}

tr{
font-family: Poor Story !important;
}

td{
font-family: Poor Story !important;
}
table{
border:1px solid black;
margin : auto;
text-align: center;
width: 100%;
font-family: Poor Story !important;
}

option{
background-color: #FAFAFA;
color : #000000;
font-family: Poor Story !important;
}

} 

</style>

	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
  <meta charset="utf-8">
  
  
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>서울 테마카페 맵</title>
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
</head>

<body>

  <!-- Navbar -->
  <nav class="navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar">
    <div class="container">

      <!-- Brand -->
      <a class="navbar-brand" href="http://70.12.111.114:8081/cafeproject/CafeServlet">
        <strong>Theme Cafe</strong>
      </a>

      <!-- Collapse -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Links -->
      <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <!-- Left -->
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="http://70.12.111.114:8081/cafeproject/CafeServlet?zone=Seoul&theme=Whole&search=%EA%B2%80%EC%83%89#mainstart">Map & List</a>
          </li>
          <li class="nav-item">
           <form action="#mainstart" method="get">
           <input type="hidden" name=zone value=<%=zone %>>
           <input type="hidden" name=theme value=<%=theme %>>
           <input type="text" id="search" name="search" value="검색" class="nav-link border border-light rounded text-dark">
           </li>
           <input type="submit" value="검색" class="nav-link border border-light rounded bg-dark text-white">
           <li>
          </li>
        </ul>
           </form>

           <!-- Right -->
            <ul class="navbar-nav nav-flex-icons">
               <li class="nav-item"><a
                  href="https://www.facebook.com/" class="nav-link"
                  target="_blank"> <i class="fab fa-facebook-f"></i>
               </a></li>
               <li class="nav-item"><a href="https://www.instagram.com/explore/tags/%ED%85%8C%EB%A7%88%EC%B9%B4%ED%8E%98/?hl=ko"
                  class="nav-link" target="_blank"> <i class="fab fa-instagram"></i>
               </a></li>
               <li class="nav-item"><a href="http://www.multicampus.com/"
                  class="nav-link " target="_blank">
                     <i class="fab fa-maxcdn"></i>
               </a></li>
            </ul>

      </div>

    </div>
  </nav>
  <!-- Navbar -->

  <!--Carousel Wrapper-->
  <div id="carousel-example-1z" class="carousel slide carousel-fade" data-ride="carousel">

    <!--Indicators-->
    <ol class="carousel-indicators">
      <li data-target="#carousel-example-1z" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-example-1z" data-slide-to="1"></li>
      <li data-target="#carousel-example-1z" data-slide-to="2"></li>
    </ol>
    <!--/.Indicators-->

    <!--Slides-->
    <div class="carousel-inner" role="listbox">

      <!--First slide-->
      <div class="carousel-item active">
        <div class="view">

          <!--Video source-->
          <video class="video-intro" autoplay loop muted>
            <source src="https://mdbootstrap.com/img/video/city.mp4" type="video/mp4">
          </video>

          <!-- Mask & flexbox options-->
          <div class="mask rgba-black-light d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>당신을 위한 테마카페 맵</strong>
              </h1>

              <p>
                <strong>"오늘 어디갈까?"</strong>
              </p>

              <p class="mb-4 d-none d-md-block">
                <strong>원하는 지역과 테마를 설정해주세요</strong>
              </p>
              <form action="#mainstart" method="get">
              <select name="zone" class="btn btn-outline-white btn-lg text-dark">
				  <option value="Seoul" selected="selected">전체</option>
				  <option value="동대문구">동대문구</option>
				  <option value="성북구">성북구</option>
				  <option value="중랑구">중랑구</option>
				  <option value="은평구">은평구</option>
				  <option value="용산구">용산구</option>
				  <option value="영등포구">영등포구</option>
				  <option value="양천구">양천구</option>
				  <option value="송파구">송파구</option>
				  <option value="성동구">성동구</option>
				  <option value="서초구">서초구</option>
				  <option value="서대문구">서대문구</option>
				  <option value="마포구">마포구</option>
				  <option value="동작구">동작구</option>
				  <option value="도봉구">도봉구</option>
				  <option value="노원구">노원구</option>
				  <option value="금천구">금천구</option>
				  <option value="구로구">구로구</option>
				  <option value="광진구">광진구</option>
				  <option value="관악구">관악구</option>
				  <option value="강서구">강서구</option>
				  <option value="강북구">강북구</option>
				  <option value="강동구">강동구</option>
				  <option value="강남구">강남구</option>
			  </select>
			  <select name="theme" class="btn btn-outline-white btn-lg"> 
				  <option value="Whole" selected="selected">전체</option>
				  <option value="갤러리">갤러리</option>
				  <option value="공방">공방</option>
				  <option value="동물">동물</option>
				  <option value="만화방">만화방</option>
				  <option value="사주">사주</option>
				  <option value="사진">사진</option>
				  <option value="스터디">스터디</option>
				  <option value="슬라임카페">슬라임카페</option>
				  <option value="아케이드">아케이드</option>
				  <option value="음악">음악</option>
				  <option value="이벤트카페">이벤트카페</option>
				  <option value="이색카페">이색카페</option>
				  <option value="책">책</option>
				  <option value="키즈">키즈</option>
				  <option value="테마카페">테마카페</option>
				  <option value="플라워, 가드닝카페">플라워, 가드닝카페</option>
				  <option value="힐링">힐링</option>
			  </select>
			  <input type="hidden" name="search" value="검색">
			  <input type="submit" value="지도 보러가기" class="btn btn-outline-white btn-lg">
			  </form>
            </div>
            <!-- Content -->

          </div>
          <!-- Mask & flexbox options-->

        </div>
      </div>
      <!--/First slide-->

      <!--Second slide-->
      <div class="carousel-item">
        <div class="view">

          <!--Video source-->
          <video class="video-intro" autoplay loop muted>
            <source src="https://mdbootstrap.com/img/video/forest.mp4" type="video/mp4">
          </video>

          <!-- Mask & flexbox options-->
          <div class="mask rgba-black-light d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>당신을 위한 테마카페 맵</strong>
              </h1>

              <p>
                <strong>"오늘 어디갈까?"</strong>
              </p>

              <p class="mb-4 d-none d-md-block">
                <strong>원하는 지역과 테마를 설정해주세요</strong>
              </p>
              <form action="#mainstart" method="get">
               <select name="zone" class="btn btn-outline-white btn-lg">
				  <option value="Seoul" selected="selected">전체</option>
				  <option value="동대문구">동대문구</option>
				  <option value="성북구">성북구</option>
				  <option value="중랑구">중랑구</option>
				  <option value="은평구">은평구</option>
				  <option value="용산구">용산구</option>
				  <option value="영등포구">영등포구</option>
				  <option value="양천구">양천구</option>
				  <option value="송파구">송파구</option>
				  <option value="성동구">성동구</option>
				  <option value="서초구">서초구</option>
				  <option value="서대문구">서대문구</option>
				  <option value="마포구">마포구</option>
				  <option value="동작구">동작구</option>
				  <option value="도봉구">도봉구</option>
				  <option value="노원구">노원구</option>
				  <option value="금천구">금천구</option>
				  <option value="구로구">구로구</option>
				  <option value="광진구">광진구</option>
				  <option value="관악구">관악구</option>
				  <option value="강서구">강서구</option>
				  <option value="강북구">강북구</option>
				  <option value="강동구">강동구</option>
				  <option value="강남구">강남구</option>
			  </select>
			  <select name="theme" class="btn btn-outline-white btn-lg">
				  <option value="Whole" selected="selected">전체</option>
				  <option value="갤러리">갤러리</option>
				  <option value="공방">공방</option>
				  <option value="동물">동물</option>
				  <option value="만화방">만화방</option>
				  <option value="사주">사주</option>
				  <option value="사진">사진</option>
				  <option value="스터디">스터디</option>
				  <option value="슬라임카페">슬라임카페</option>
				  <option value="아케이드">아케이드</option>
				  <option value="음악">음악</option>
				  <option value="이벤트카페">이벤트카페</option>
				  <option value="이색카페">이색카페</option>
				  <option value="책">책</option>
				  <option value="키즈">키즈</option>
				  <option value="테마카페">테마카페</option>
				  <option value="플라워, 가드닝카페">플라워, 가드닝카페</option>
				  <option value="힐링">힐링</option>
			  </select>
			  <input type="hidden" name="search" value="검색">
			  <input type="submit" value="지도 보러가기" class="btn btn-outline-white btn-lg">
			  </form>
            </div>
            <!-- Content -->

          </div>
          <!-- Mask & flexbox options-->

        </div>
      </div>
      <!--/Second slide-->

      <!--Third slide-->
      <div class="carousel-item">
        <div class="view">

          <!--Video source-->
          <video class="video-intro" autoplay loop muted>
            <source src="https://mdbootstrap.com/img/video/Tropical.mp4" type="video/mp4">
          </video>

          <!-- Mask & flexbox options-->
          <div class="mask rgba-black-light d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>당신을 위한 테마카페 맵</strong>
              </h1>

              <p>
                <strong>"오늘 어디갈까?"</strong>
              </p>

              <p class="mb-4 d-none d-md-block">
                <strong>원하는 지역과 테마를 설정해주세요</strong>
              </p>
              <form action="#mainstart" method="get">
               <select name="zone" class="btn btn-outline-white btn-lg">
				  <option value="Seoul" selected="selected">전체</option>
				  <option value="동대문구">동대문구</option>
				  <option value="성북구">성북구</option>
				  <option value="중랑구">중랑구</option>
				  <option value="은평구">은평구</option>
				  <option value="용산구">용산구</option>
				  <option value="영등포구">영등포구</option>
				  <option value="양천구">양천구</option>
				  <option value="송파구">송파구</option>
				  <option value="성동구">성동구</option>
				  <option value="서초구">서초구</option>
				  <option value="서대문구">서대문구</option>
				  <option value="마포구">마포구</option>
				  <option value="동작구">동작구</option>
				  <option value="도봉구">도봉구</option>
				  <option value="노원구">노원구</option>
				  <option value="금천구">금천구</option>
				  <option value="구로구">구로구</option>
				  <option value="광진구">광진구</option>
				  <option value="관악구">관악구</option>
				  <option value="강서구">강서구</option>
				  <option value="강북구">강북구</option>
				  <option value="강동구">강동구</option>
				  <option value="강남구">강남구</option>
			  </select>
			  <select name="theme" class="btn btn-outline-white btn-lg">
				  <option value="Whole" selected="selected">전체</option>
				  <option value="갤러리">갤러리</option>
				  <option value="공방">공방</option>
				  <option value="동물">동물</option>
				  <option value="만화방">만화방</option>
				  <option value="사주">사주</option>
				  <option value="사진">사진</option>
				  <option value="스터디">스터디</option>
				  <option value="슬라임카페">슬라임카페</option>
				  <option value="아케이드">아케이드</option>
				  <option value="음악">음악</option>
				  <option value="이벤트카페">이벤트카페</option>
				  <option value="이색카페">이색카페</option>
				  <option value="책">책</option>
				  <option value="키즈">키즈</option>
				  <option value="테마카페">테마카페</option>
				  <option value="플라워, 가드닝카페">플라워, 가드닝카페</option>
				  <option value="힐링">힐링</option>
			  </select>
			  <input type="hidden" name="search" value="검색">
			  <input type="submit" value="지도 보러가기" class="btn btn-outline-white btn-lg">
			  </form>
            </div>
            <!-- Content -->

          </div>
          <!-- Mask & flexbox options-->

        </div>
      </div>
      <!--/Third slide-->

    </div>
    <!--/.Slides-->

    <!--Controls-->
    <a class="carousel-control-prev" href="#carousel-example-1z" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carousel-example-1z" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
    <!--/.Controls-->

  </div>

 <hr id="mainstart">
 <br>
 <br>
  <!--/.Carousel Wrapper-->

<ul style=" list-style:none;
    margin:0;
    padding:0;">
    </li>
	<li style="margin: 0 0 0 0;
    padding: 0 0 0 0;
    border : 0;
    float: left;">
    &emsp;&emsp;&emsp;&emsp;&emsp;
    </li>
    <li style="margin: 0 0 0 0;
    padding: 0 0 0 0;
    border : 0;
    float: left;
    ">
	<h2 class="nav-link border border-light rounded bg-white text-dark">지역 : <%=zoneforview %> / 테마 : <%=themeforview %> / 검색어 : <%=search %></h2>
	</li>
	<li style="margin: 0 0 0 0;
    padding: 0 0 0 0;
    border : 0;
    float: left;">
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   
    </li>
	<li style="margin: 0 0 0 0;
    padding: 0 0 0 0;
    border : 0;
    float: left;">
           <form action="#mainstart" method="get">
           <input type="hidden" name=zone value="Seoul">
           <input type="hidden" name=theme value="Whole">
           <input type="hidden" name="search" value="검색">
           <input type="submit" value="기본 설정으로 되돌리기"  class="nav-link border border-light rounded bg-dark text-white">
           </form>
</li>
</ul>
  <!--Main layout-->
    <div class="container">

      <!--Section: Main info-->
      <section class="mt-5 wow fadeIn">

        <!--Grid row-->
		   <div class="col-md-15 mb-10">
               <%if (request.getAttribute("content") != null) {%>
               ${content}
               <%}   %>
               <%if (request.getAttribute("thememap") != null) {%>
               <iframe src="${thememap}" width="100%" height="430" seamless></iframe>
               <%}   %>
        </div>
        <!--Grid row-->
	  </section>
      <!--Section: Main info-->

      <hr class="my-5">

      <!--Section: Main features & Quick Start-->
      <section>
        <!--Grid row-->
        <div class="row wow fadeIn">

          <!--Grid column-->
          <!-- <div class="col-lg-6 col-md-12 px-4"> -->

            <!--First row-->
     <div class="limiter">
		<!-- <div class="container-table100"> -->
			<div class="wrap-table100">
				<div class="table100">
            <table>
				<tr class="table100-head"><td>이름</td><td>주소</td><td>테마</td></tr>
				<% ArrayList<CafeVO> list = (ArrayList<CafeVO>)request.getAttribute("cafelist");
				
				System.out.println("2222222222222222222222222222 : "+ list.size());
				int pagenum1 = Integer.parseInt(pagenum);
				int start = (pagenum1 - 1) * 10;
				int end = pagenum1 * 10 - 1;
				if(list.size()<end){
					end = list.size();
				}
				int pagelistnum = 10*((pagenum1-1)/10);
				for(int i=start; i<end; i++){
					CafeVO vo = list.get(i);
					out.println("<tr><td><a href ='http://70.12.111.114:8081/cafeproject/CafeServlet2?no=" + vo.getNo() +"'>" +
					vo.getName() + "</a></td><td>" + vo.getAddr() + "</td><td>"+vo.getTheme()+ "</td></tr>");
					}
					out.println(
						
							"<a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+1+"&search="+search+"#mainstart'>1페이지로</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum-10)+"&search="+search+"#mainstart'>이전 10페이지</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+1) +"&search="+search+"#mainstart'>"+(pagelistnum+1)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+2)+"&search="+search+"#mainstart'>"+(pagelistnum+2)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+3)+"&search="+search+"#mainstart'>"+(pagelistnum+3)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+4)+"&search="+search+"#mainstart'>"+(pagelistnum+4)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+5)+"&search="+search+"#mainstart'>"+(pagelistnum+5)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+6) +"&search="+search+"#mainstart'>"+(pagelistnum+6)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+7)+"&search="+search+"#mainstart'>"+(pagelistnum+7)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+8) +"&search="+search+"#mainstart'>"+(pagelistnum+8)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+9) +"&search="+search+"#mainstart'>"+(pagelistnum+9)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+10) +"&search="+search+"#mainstart'>"+(pagelistnum+10)+"</a>"
							+"&emsp;&emsp; <a href = 'http://70.12.111.114:8081/cafeproject/CafeServlet?zone="+zone+"&theme="+theme+"&pagenum="+(pagelistnum+11) +"&search="+search+"#mainstart'>다음 10페이지</a>"
							);
				%>
			    </table>
				</div>
			</div>
		</div>
	<!-- </div> -->

        <!--   </div> -->
          <!--/Grid column-->

        </div>
        <!--/Grid row-->
		
      </section>
      <!--Section: Main features & Quick Start-->

      <hr class="my-5">

      <!--Section: Not enough-->

  <!--Main layout-->

  <!--Footer-->
  <footer class="page-footer text-center font-small mt-4 wow fadeIn">

    <!--Call to action-->
    <div class="pt-4">
      <a class="btn btn-outline-white" href="#" 
        role="button">맨 위로
      </a>
      <a class="btn btn-outline-white" href="./weareteam.jsp" target="_blank" role="button">제작자들
        <i class="fas fa-graduation-cap ml-2"></i>
      </a>
    </div>
    <!--/.Call to action-->

    <hr class="my-4">

   

    <!--Copyright-->
    <div class="footer-copyright py-3">
      © 2019 Copyright:
      <a href="https://mdbootstrap.com/education/bootstrap/" target="_blank"> 청년취업아카데미 5조 </a>
    </div>
    <!--/.Copyright-->

  </footer>
  <!--/.Footer-->

  <!-- SCRIPTS -->
  <!-- JQuery -->
  <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="js/mdb.min.js"></script>
  <!-- Initializations -->
  <script type="text/javascript">
    // Animations initialization
    new WOW().init();

  </script>
</body>

</html>
