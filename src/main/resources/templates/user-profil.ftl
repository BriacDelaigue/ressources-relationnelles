<#include "header.ftl">
<div style="margin-top: -50px;">
    <div class="col-12">
        <div class="row">
            <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                <div class="card">
                    <h5 class="card-header">Modifier mon profil</h5>
                    <div class="card-body">
                        <form action="#" id="basicform" data-parsley-validate="">
                            <div class="form-group">
                                <label for="inputUserName">Prénom</label>
                                <input id="inputUserName" type="text" name="name" data-parsley-trigger="change"
                                       required="" placeholder="Votre prénom" autocomplete="off" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="inputUserName">Nom</label>
                                <input id="inputUserName" type="text" name="name" data-parsley-trigger="change"
                                       required="" placeholder="Votre nom" autocomplete="off" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="inputEmail">Email</label>
                                <input id="inputEmail" type="email" name="email" data-parsley-trigger="change"
                                       required="" placeholder="Votre email" autocomplete="off" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="inputPassword">Mot de passe</label>
                                <input id="inputPassword" type="password" placeholder="Votre mot de passe" required=""
                                       class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="inputRepeatPassword">Validation mot de passe</label>
                                <input id="inputRepeatPassword" data-parsley-equalto="#inputPassword" type="password"
                                       required="" placeholder="Répéter votre mot de passe" class="form-control">
                            </div>
                            <div class="row">
                                <div class="col-sm-6 pl-0">
                                    <p class="text-right">
                                        <button type="submit" class="btn btn-space btn-primary">Enregistrer</button>
                                    </p>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                <div class="card">
                    <h5 class="card-header">Modifier vos relations</h5>
                    <div class="card-body">
                        <table class="table">
                            <tr>
                                <th scope="col">Identité</th>
                                <th scope="col">Relation</th>
                                <th style="text-align: right;" scope="col">Action</th>
                            </tr>
                            <tbody>
                            <tr>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td style="text-align: right;">
                                    <button type="submit" class="btn btn-space btn-danger">Supprimer</button>
                                </td>
                            </tr>
                            <tr>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td style="text-align: right;">
                                    <button type="submit" class="btn btn-space btn-danger">Supprimer</button>
                                </td>
                            </tr>
                            <tr>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td style="text-align: right;">
                                    <button type="submit" class="btn btn-space btn-danger">Supprimer</button>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>