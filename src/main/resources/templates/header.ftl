<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="<@spring.url'/vendor/bootstrap/css/bootstrap.min.css'/>">
    <link href="<@spring.url'/vendor/fonts/circular-std/style.css" rel="stylesheet'/>">
    <link rel="stylesheet" href="<@spring.url'/libs/css/style.css'/>">
    <link rel="stylesheet" href="<@spring.url'/vendor/fonts/fontawesome/css/fontawesome-all.css'/>">
    <link rel="stylesheet" href="<@spring.url'/vendor/charts/chartist-bundle/chartist.css'/>">
    <link rel="stylesheet" href="<@spring.url'/vendor/charts/morris-bundle/morris.css'/>">
    <link rel="stylesheet"
          href="<@spring.url'/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css'/>">
    <link rel="stylesheet" href="<@spring.url'/vendor/charts/c3charts/c3.css'/>">
    <link rel="stylesheet" href="<@spring.url'/vendor/fonts/flag-icon-css/flag-icon.min.css'/>">
    <title>Ressources Relationnelles</title>
</head>

<body>
<div class="dashboard-main-wrapper">
    <div class="dashboard-header">
        <nav class="navbar navbar-expand-lg bg-white fixed-top">
            <a class="navbar-brand" href="index">Ressources Relationnelles</a>

            <div style="margin-left: 100px;">
                <a href="index.html" class="mr-2">
                    <button class="btn">Mes actualités</button>
                </a>
                <a href="index.html" class="mr-2">
                    <button class="btn">Mes ressources</button>
                </a>
                <a href="index.html" class="mr-2">
                    <button class="btn">Mes favoris</button>
                </a>
            </div>

            <div class="collapse navbar-collapse " id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto navbar-right-top">
                    <li class="nav-item">
                        <div id="custom-search" class="top-search-bar">
                            <input class="form-control" type="text" placeholder="Rechercher..">
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="create"><i class="fas fa-fw fa-plus"></i></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="user"><i class="fas fa-fw fa-user"></i></a>
                    </li>
                    <li class="nav-item dropdown connection">
                        <a class="nav-link" href="logout"> <i class="fas fa-fw fa-power-off"></i></a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <div class="force-center">
        <div class="dashboard-wrapper">
            <div class="dashboard-ecommerce">
                <div class="container-fluid dashboard-content ">
                    <div class="ecommerce-widget">
                        <div class="row">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="<@spring.url'/vendor/jquery/jquery-3.3.1.min.js'/>"></script>
<script src="<@spring.url'/vendor/bootstrap/js/bootstrap.bundle.js'/>"></script>
<script src="<@spring.url'/vendor/slimscroll/jquery.slimscroll.js'/>"></script>
<script src="<@spring.url'/libs/js/main-js.js'/>"></script>
<script src="<@spring.url'/vendor/charts/chartist-bundle/chartist.min.js'/>"></script>
<script src="<@spring.url'/vendor/charts/sparkline/jquery.sparkline.js'/>"></script>
<script src="<@spring.url'/vendor/charts/morris-bundle/raphael.min.js'/>"></script>
<script src="<@spring.url'/vendor/charts/morris-bundle/morris.js'/>"></script>
<script src="<@spring.url'/vendor/charts/c3charts/c3.min.js'/>"></script>
<script src="<@spring.url'/vendor/charts/c3charts/d3-5.4.0.min.js'/>"></script>
<script src="<@spring.url'/vendor/charts/c3charts/C3chartjs.js'/>"></script>
<script src="<@spring.url'/libs/js/dashboard-ecommerce.js'/>"></script>

</body>
</html>