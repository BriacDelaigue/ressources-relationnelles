<#include "header.ftl">
<div style="margin-top: -50px;">
    <div class="offset-xl-2 col-12">
        <div class="row">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">
                        <h4 class="mb-0">Création d'une ressource</h4>
                    </div>
                    <div class="card-body">
                        <form class="needs-validation" novalidate="">
                            <div class="mb-3">
                                <label for="username">Titre</label>
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"></span>
                                    </div>
                                    <input type="text" class="form-control" id="username" placeholder="Titre"
                                           required="">
                                    <div class="invalid-feedback" style="width: 100%;">
                                        Le titre est obligatoire
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlTextarea1">Description</label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
                            </div>
                            <div class="custom-file mb-3">
                                <input type="file" class="custom-file-input" id="customFile">
                                <label class="custom-file-label" for="customFile"><i class="fas fa-fw fa-file"></i>
                                    Fichier</label>
                            </div>
                            <div class="row">
                                <div class="col-md-3 mb-3">
                                    <label for="country">Catégorie</label>
                                    <select class="custom-select d-block w-100" id="country" required="">
                                        <option value="">Choisir...</option>
                                        <option>Cat 1</option>
                                        <option>Cat 2</option>
                                        <option>Cat 3</option>
                                        <option>Cat 4</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Merci de saisir une catégorie valide.
                                    </div>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="state">Type</label>
                                    <select class="custom-select d-block w-100" id="state" required="">
                                        <option value="">Choisir...</option>
                                        <option>Photo</option>
                                        <option>Vidéo</option>
                                        <option>Jeux</option>
                                        <option>Quiz</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Merci de saisir un type valide.
                                    </div>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="country">Relation</label>
                                    <select class="custom-select d-block w-100" id="country" required="">
                                        <option value="">Choisir...</option>
                                        <option>Relation 1</option>
                                        <option>Relation 2</option>
                                        <option>Relation 3</option>
                                        <option>Relation 4</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Merci de choisir une relation valide.
                                    </div>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="country">Visibilité</label>
                                    <select class="custom-select d-block w-100" id="country" required="">
                                        <option value="">Choisir...</option>
                                        <option>Public</option>
                                        <option>Privé</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Merci de choisir une relation valide.
                                    </div>
                                </div>
                            </div>
                            <div class="custom-control custom-checkbox">
                                <input type="checkbox" class="custom-control-input" id="save-info">
                                <label class="custom-control-label" for="save-info">En publiant ma ressource je certifie
                                    avoir pris connaissance des conditions de publication.</label>
                            </div>
                            <hr class="mb-4">
                            <button class="btn btn-primary btn-lg btn-block" type="submit">Publier ma ressource</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>