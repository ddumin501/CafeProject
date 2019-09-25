<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>이색카페 추천</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="css/mdb.min.css" rel="stylesheet">
    <!-- Your custom styles (optional) -->
    <link href="css/style.min.css" rel="stylesheet">
</head>

<body class="grey lighten-3">

	<div class="card mb-4 wow fadeIn">

		<div class="card-header">
			<select name="cate">
     			<option value="방탈출">방탈출</option>
     			<option value="동물">동물</option>
     			<option value="DIY">DIY</option>
     			<option value="만화">만화</option>
			</select>
			<input>
			<button class="btn btn-info btn-sm" type="submit">Post</button>
		</div>

		<!--Card content-->
		<div class="card-body">

			<ul class="list-unstyled">
				<li class="media"><img class="d-flex mr-3"
					src="https://mdbootstrap.com/img/Photos/Others/placeholder7.jpg"
					alt="Generic placeholder image">
					<div class="media-body">
						<a href="">
							<h5 class="mt-0 mb-1 font-weight-bold">카페 미엘</h5>
						</a> Cras sit amet nibh libero, in gravida nulla (...)
					</div></li>
				<li class="media my-4"><img class="d-flex mr-3"
					src="https://mdbootstrap.com/img/Photos/Others/placeholder6.jpg"
					alt="An image">
					<div class="media-body">
						<a href="">
							<h5 class="mt-0 mb-1 font-weight-bold">List-based media
								object</h5>
						</a> Cras sit amet nibh libero, in gravida nulla (...)
					</div></li>
				<li class="media"><img class="d-flex mr-3"
					src="https://mdbootstrap.com/img/Photos/Others/placeholder5.jpg"
					alt="Generic placeholder image">
					<div class="media-body">
						<a href="">
							<h5 class="mt-0 mb-1 font-weight-bold">List-based media
								object</h5>
						</a> Cras sit amet nibh libero, in gravida nulla (...)
					</div></li>
			</ul>

		</div>

	</div>


</body>
</html>