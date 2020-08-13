<%--
  Created by IntelliJ IDEA.
  User: alexl
  Date: 8/13/2020
  Time: 1:56 PM
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
   <title>Agregar</title>
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
   <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
   <meta name="author" content="FREEHTML5.CO" />

   <!-- Facebook and Twitter integration -->
   <meta property="og:title" content=""/>
   <meta property="og:image" content=""/>
   <meta property="og:url" content=""/>
   <meta property="og:site_name" content=""/>
   <meta property="og:description" content=""/>
   <meta name="twitter:title" content="" />
   <meta name="twitter:image" content="" />
   <meta name="twitter:url" content="" />
   <meta name="twitter:card" content="" />

   <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
   <link rel="shortcut icon" href="assets/assets/favicon.ico">

   <!-- <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'> -->
   <link rel="stylesheet" href="assets/https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
   <!-- Animate.css -->
   <link rel="stylesheet" href="assets/assets/css/animate.css">
   <!-- Icomoon Icon Fonts-->
   <link rel="stylesheet" href="assets/assets/css/icomoon.css">
   <!-- Bootstrap  -->
   <link rel="stylesheet" href="assets/assets/css/bootstrap.css">
   <!-- Superfish -->
   <link rel="stylesheet" href="assets/assets/css/superfish.css">

   <link rel="stylesheet" href="assets/assets/css/style.css">


</head>
<body>
<div id="fh5co-wrapper">
   <div id="fh5co-page">
      <div id="fh5co-header">
         <header id="fh5co-header-section">
            <div class="container">
               <div class="nav-header">
                  <a href="assets/assets/#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
                  <h1 id="fh5co-logo"><a href="assets/assets/inicio.html">HALCÓN VIAJERO</a></h1>
                  <!-- START #fh5co-menu-wrap -->
                  <nav id="fh5co-menu-wrap" role="navigation">
                     <ul class="sf-menu" id="fh5co-primary-menu">
                        <li>

                        </li>
                     </ul>
                  </nav>
               </div>
            </div>
         </header>
      </div>


      <div id="fh5co-contact" class="fh5co-section animate-box">
         <div class="container mt-4">
            <form class="needs-validation" novalidate enctype="multipart/form-data">
               <div class="form-row">
                  <div class="col-md-6 mb-3">
                     <label for="validationCustom01">Nombre</label>
                     <input type="text" class="form-control mb-2" id="validationCustom01" placeholder="Mark" required>
                     <div class="valid-feedback">
                        Bien hecho!
                     </div>
                     <label for="validationCustom02">Ciudad</label>
                     <select class="custom-select mb-2" id="validationCustom02" required  style="padding: 5px; height:50px">
                        <option selected disabled value="">selecciona una ciudad</option>
                        <option>...</option>
                     </select>
                     <div class="invalid-feedback">
                        Por favor selecciona una ciudad.
                     </div>
                     <label for="validationCustom03">Categoria</label>
                     <select class="custom-select mb-2" id="validationCustom03" required style="padding: 5px; height:50px">
                        <option selected disabled value="">selecciona una categoría</option>
                        <option>...</option>
                     </select>
                     <div class="invalid-feedback">
                        Por favor selecciona una categoría.
                     </div>
                  </div>
                  <div class="col-md-6 mb-3">
                     <label for="validationCustom04">Descripción</label>
                     <textarea class="form-control mb-2" id="validationCustom04" required></textarea>
                     <div class="invalid-feedback">
                        Por favor proporciona una descripción.
                     </div>
                     <label for="invalidCheck">Tipo de Lugar</label>
                     <br>
                     <div class="form-check-inline text-center">
                        <input class="form-check-input" type="radio" value="1" name="costo" id="invalidCheck" required>
                        <label class="form-check-label" class="mr-3" for="invalidCheck">
                           Costo
                        </label>
                        <input class="form-check-input" type="radio" value="0" name="costo" id="invalidCheck2" required>
                        <label class="form-check-label" for="invalidCheck2">
                           Gratuito
                        </label>

                        <div class="invalid-feedback">
                           Debes escoger una opción.
                        </div>
                     </div>
                     <br>
                     <label for="validationCustom05">Imagen del lugar</label>
                     <input type="file" class="form-control-file mt-3" id="validationCustom05">
                     <div class="invalid-feedback">
                        Ingresa una imagen
                     </div>
                  </div>
               </div>
                  <div class="form-row mt-2 content-center">
                     <button class="btn btn-primary" type="submit">Agregar Lugar</button>
                  </div>
            </form>

         </div>
      </div>


      <footer>
         <div id="footer">
            <div class="container">
               <div class="row">
                  <div class="col-md-6 col-md-offset-3 text-center">
                     <p class="fh5co-social-icons">
                        <a href="assets/assets/#"><i class="icon-twitter2"></i></a>
                        <a href="assets/assets/#"><i class="icon-facebook2"></i></a>
                        <a href="assets/assets/#"><i class="icon-instagram"></i></a>
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


<script  src="assets/assets/js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script  src="assets/assets/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script  src="assets/assets/js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script  src="assets/assets/js/jquery.waypoints.min.js"></script>
<!-- Stellar -->
<script  src="assets/assets/js/jquery.stellar.min.js"></script>
<!-- Superfish -->
<script  src="assets/assets/js/hoverIntent.js"></script>
<script  src="assets/assets/js/superfish.js"></script>


<!-- Main JS -->
<script  src="assets/assets/js/main.js"></script>


<!-- Modernizr JS -->
<script  src="assets/assets/js/modernizr-2.6.2.min.js"></script>

<script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function() {
        'use strict';
        window.addEventListener('load', function() {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>
</body>
</html>

