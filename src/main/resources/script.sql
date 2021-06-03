create table categorie_ressource
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null
);

create table filialite
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null
);

create table hibernate_sequence
(
    next_val bigint null
);

create table role
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null
);

create table type_relation
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null
);

create table type_ressource
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null
);

create table utilisateur
(
    id       int auto_increment
        primary key,
    nom      varchar(255) not null,
    prenom   varchar(255) not null,
    verifie  tinyint(1)   not null,
    mail     varchar(255) not null,
    mdp      varchar(255) not null,
    role     int          not null,
    verifier bit          null,
    id_role  int          not null,
    constraint FKr6x7g9mw0va8oe9drohepvywu
        foreign key (id_role) references role (id),
    constraint role
        foreign key (role) references role (id)
);

create table relation
(
    id          int auto_increment
        primary key,
    utilisateur int not null,
    filialite   int not null,
    constraint filialite_fk
        foreign key (filialite) references type_relation (id),
    constraint utilisateur___fk
        foreign key (utilisateur) references utilisateur (id)
);

create table visibilite
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null
);

create table ressource
(
    id                  int auto_increment
        primary key,
    date_publication    date         not null,
    texte               text         null,
    pathfile            varchar(255) null,
    nb_consultation     int          null,
    utilisateur         int          not null,
    type_ressource      int          null,
    type_relation       int          null,
    categorie_ressource int          null,
    visibilite          int          null,
    titre               varchar(255) null,
    constraint categorie_ressource
        foreign key (categorie_ressource) references categorie_ressource (id),
    constraint type_relation
        foreign key (type_relation) references type_relation (id),
    constraint type_ressource
        foreign key (type_ressource) references type_ressource (id),
    constraint utilisateur
        foreign key (utilisateur) references utilisateur (id),
    constraint visibilite
        foreign key (visibilite) references visibilite (id)
);

create table commentaire
(
    id           int auto_increment
        primary key,
    texte        text         not null,
    date_poste   date         not null,
    chemin_image varchar(255) null,
    ressource    int          not null,
    utilisateur  int          not null,
    constraint ressource
        foreign key (ressource) references ressource (id),
    constraint utilsateur
        foreign key (utilisateur) references utilisateur (id)
);

create table favoris
(
    id          int auto_increment
        primary key,
    utilisateur int not null,
    ressource   int not null,
    constraint ressource_fk
        foreign key (ressource) references ressource (id),
    constraint utilisateur_fk
        foreign key (utilisateur) references utilisateur (id)
);

