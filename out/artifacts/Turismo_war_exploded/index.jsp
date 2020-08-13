<%--
  Created by IntelliJ IDEA.
  User: alexl
  Date: 8/13/2020
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html class="no-js">

<head>
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <title>HALCÓN VIAJERO</title>
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta name="description" content="Examen CRUD" />
   <meta name="author" content="Halcon" />

   <!-- Facebook and Twitter integration -->
   <meta property="og:title" content="" />
   <meta property="og:image" content="" />
   <meta property="og:url" content="" />
   <meta property="og:site_name" content="" />
   <meta property="og:description" content="" />
   <meta name="twitter:title" content="" />
   <meta name="twitter:image" content="" />
   <meta name="twitter:url" content="" />
   <meta name="twitter:card" content="" />

   <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
   <link rel="shortcut icon" href="assets/favicon.ico">

   <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
   <!-- Animate.css -->
   <link rel="stylesheet" href="assets/css/animate.css">
   <!-- Icomoon Icon Fonts-->
   <link rel="stylesheet" href="assets/css/icomoon.css">
   <!-- Bootstrap  -->
   <link rel="stylesheet" href="assets/css/bootstrap.css">
   <!-- Superfish -->
   <link rel="stylesheet" href="assets/css/superfish.css">
   <link rel="stylesheet" href="assets/css/style.css">

</head>

<body>
<div id="fh5co-wrapper">
   <div id="fh5co-page">
      <div id="fh5co-header">
         <header id="fh5co-header-section">
            <div class="container">
               <div class="nav-header">
                  <a href="assets/#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
                  <h1 id="fh5co-logo"><a href="assets/inicio.html">HALCÓN VIAJERO</a></h1>
                  <!-- START #fh5co-menu-wrap -->
                  <nav id="fh5co-menu-wrap" role="navigation">
                     <ul class="sf-menu" id="fh5co-primary-menu">

                     </ul>
                  </nav>
               </div>
            </div>
         </header>

      </div>


      <div class="fh5co-hero">
         <div class="fh5co-overlay"></div>
         <div class="fh5co-cover text-center" data-stellar-background-ratio="0.5" style="background-image: url(images/cover_bg_1.jpg);">
            <div class="desc animate-box">
               <h2>Descubre tu nuevo lugar favorito</h2>
               <a class="btn btn-primary btn-lg" href="assets/agregar.html">Agregar lugar turistico</a>

            </div>
         </div>

      </div>


      <div class="fh5co-listing">
         <div class="container">
            <div class="row">
               <div class="col-md-4 fh5co-item-wrap">
                  <a class="fh5co-listing-item">
                     <img src="assets/images/catedralflorencia.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive">
                     <div class="fh5co-listing-copy">
                        <h2>Catedral de Florencia</h2>
                        <span class="icon">
										<i class="icon-chevron-right"></i>
									</span>
                     </div>
                  </a>
               </div>
               <div class="col-md-4 fh5co-item-wrap">
                  <a class="fh5co-listing-item">
                     <img src="assets/images/chichen.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive">
                     <div class="fh5co-listing-copy">
                        <h2>Chichén Itza</h2>
                        <span class="icon">
										<i class="icon-chevron-right"></i>
									</span>
                     </div>
                  </a>
               </div>
               <div class="col-md-4 fh5co-item-wrap">
                  <a class="fh5co-listing-item">
                     <img src="assets/images/disney.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive">
                     <div class="fh5co-listing-copy">
                        <h2>Disney</h2>
                        <span class="icon">
										<i class="icon-chevron-right"></i>
									</span>
                     </div>
                  </a>
               </div>
               <!-- END 3 row -->

               <div class="col-md-4 fh5co-item-wrap">
                  <a class="fh5co-listing-item">
                     <img src="assets/images/louvre.jpg" alt="louvre.html" class="img-responsive">
                     <div class="fh5co-listing-copy">
                        <h2>Museo de Louvre</h2>
                        <span class="icon">
										<i class="icon-chevron-right"> </i>
									</span>
                     </div>
                  </a>
               </div>
               <div class="col-md-4 fh5co-item-wrap">
                  <a class="fh5co-listing-item">
                     <img src="assets/images/sixflag.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive">
                     <div class="fh5co-listing-copy">
                        <h2>Sixflags CDMX</h2>
                        <span class="icon">
										<i class="icon-chevron-right"></i>
									</span>
                     </div>
                  </a>
               </div>
               <div class="col-md-4 fh5co-item-wrap">
                  <a class="fh5co-listing-item" href="assets/louvre.html">
                     <img src="assets/images/ta.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive">

                     <div class="fh5co-listing-copy">
                        <h2 href="assets/louvre.html">Lucha Libre Mexicana</h2>
                        <span class="icon">
										<i class="icon-chevron-right"> </i>
									</span>
                     </div>
                  </a>
               </div>
               <!-- END 3 row -->
            </div>
         </div>
      </div>
      <footer>
         <div id="footer">
            <div class="container">
               <div class="row">
                  <div class="col-md-6 col-md-offset-3 text-center">
                     <p class="fh5co-social-icons">
                        <a href="assets/#"><i class="icon-twitter2"></i></a>
                        <a href="assets/#"><i class="icon-facebook2"></i></a>
                        <a href="assets/#"><i class="icon-instagram"></i></a>
                     </p>
                     <p>Copyright 2020 Exámen de Alexis y Sebastián</p>
                  </div>
               </div>
            </div>
         </div>
      </footer>
   </div>
   <!-- END fh5co-page -->

</div>
<!-- END fh5co-wrapper -->

<!-- jQuery -->
<script src="assets/js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="assets/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="assets/js/jquery.waypoints.min.js"></script>
<!-- Stellar -->
<script src="assets/js/jquery.stellar.min.js"></script>
<!-- Superfish -->
<script src="assets/js/hoverIntent.js"></script>
<script src="assets/js/superfish.js"></script>
<!-- Main JS -->
<script src="assets/js/main.js"></script>
<!-- Modernizr JS -->
<script src="assets/js/modernizr-2.6.2.min.js"></script>
</body>

</html>