<#import "/spring.ftl" as spring/>

<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Connexion</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<@spring.url'/vendor/bootstrap/css/bootstrap.min.css'/>">
    <link href="<@spring.url'/vendor/fonts/circular-std/style.css" rel="stylesheet'/>">
    <link rel="stylesheet" href="<@spring.url'/libs/css/style.css'/>">
    <link rel="stylesheet" href="<@spring.url'/vendor/fonts/fontawesome/css/fontawesome-all.css'/>">
    <style>
        html,
        body {
            height: 100%;
        }

        body {
            display: -ms-flexbox;
            display: flex;
            -ms-flex-align: center;
            align-items: center;
            padding-top: 40px;
            padding-bottom: 40px;
        }
    </style>
</head>

<body>
<!-- ============================================================== -->
<!-- login page  -->
<!-- ============================================================== -->
<div class="splash-container">
    <div class="card ">
        <div class="card-header text-center">
            <a class="login-titre font-25" href="index.html">Ressources Relationnelles</a>
            <span class="splash-description">Veuillez saisir vos informations d'utilisateur.</span></div>
        <div class="card-body">
            <form>
                <div class="form-group">
                    <input class="form-control form-control-lg" id="email" type="text" placeholder="Email"
                           autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" id="password" type="password"
                           placeholder="Mot de passe">
                </div>
                <div class="form-group">
                    <label class="custom-control custom-checkbox">
                        <input class="custom-control-input" type="checkbox"><span class="custom-control-label">Se souvenir de moi</span>
                    </label>
                </div>
                <button type="submit" class="btn btn-primary btn-lg btn-block">S'identifier</button>
            </form>
        </div>
        <div class="card-footer bg-white p-0">
            <div class="card-footer-item card-footer-item-bordered">
                <a href="/signup" class="footer-link">S'inscrire</a></div>
            <div class="card-footer-item card-footer-item-bordered">
                <a href="#" class="footer-link">Mot de passe oublié</a>
            </div>
        </div>
    </div>
</div>
<!-- Optional JavaScript -->
<script src="<@spring.url'/vendor/jquery/jquery-3.3.1.min.js'/>"></script>
<script src="<@spring.url'/vendor/bootstrap/js/bootstrap.bundle.js'/>"></script>
</body>

</html>