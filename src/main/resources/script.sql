CREATE TABLE Role(
   id INT PRIMARY KEY,
   libelle VARCHAR(255) NOT NULL
);

CREATE TABLE Type_Ressource(
   id INT PRIMARY KEY,
   libelle VARCHAR(255) NOT NULL
);

CREATE TABLE Visibilite(
   id INT PRIMARY KEY,
   libelle VARCHAR(50) NOT NULL
);

CREATE TABLE Filialite(
   id INT PRIMARY KEY,
   libelle VARCHAR(50) NOT NULL
);

CREATE TABLE Categorie_Ressource(
   id INT PRIMARY KEY,
   libelle VARCHAR(50) NOT NULL
);

CREATE TABLE Type_Relation(
   id INT PRIMARY KEY,
   lib VARCHAR(50)
);

CREATE TABLE Personne(
   id INT PRIMARY KEY,
   nom VARCHAR(50) NOT NULL,
   prenom VARCHAR(50) NOT NULL,
   verifie BOOLEAN NOT NULL,
   mail VARCHAR(50) NOT NULL,
   mdp VARCHAR(50) NOT NULL,
   role_id INT REFERENCES Role(id)
);

CREATE TABLE Ressource(
   pers_id INT REFERENCES Personne(id),
   id INT PRIMARY KEY,
   date DATE NOT NULL,
   texte TEXT,
   titre VARCHAR(50) NOT NULL,
   path_file VARCHAR(50),
   nb_consultations INT,
   type_id INT REFERENCES Type_Relation(id),
   cat_id INT REFERENCES Categorie_Ressource(id),
   vis_id INT REFERENCES Visibilite(id) ,
   type_id_1 INT REFERENCES Type_Ressource(id)
);

CREATE TABLE Commentaire(
   pers_id INT NOT NULL,
   ress_id INT NOT NULL,
   FOREIGN KEY(pers_id, ress_id) REFERENCES Ressource(pers_id, id),
   pers_id_3 INT REFERENCES Personne(id),
   comm_id INT NOT NULL,
   PRIMARY KEY(pers_id, ress_id, pers_id_3, comm_id),
   comm_texte TEXT NOT NULL,
   comm_date DATE NOT NULL,
   comm_path_image VARCHAR(60),
   pers_id_1 INT NOT NULL,
   ress_id_1 INT NOT NULL,
   pers_id_2 INT NOT NULL,
   comm_id_1 INT NOT NULL,
   FOREIGN KEY(pers_id_1, ress_id_1, pers_id_2, comm_id_1) REFERENCES Commentaire(pers_id, ress_id, pers_id, comm_id)
);

CREATE TABLE Relation(
   pers_id INT REFERENCES Personne(id),
   pers_id_1 INT REFERENCES Personne(id),
   fill_id INT REFERENCES Filialite(id),
   PRIMARY KEY(pers_id, pers_id_1, fill_id)
);

CREATE TABLE Favoriser(
   pers_id INT REFERENCES Personne(id),
   pers_id_1 INT NOT NULL,
   ress_id INT NOT NULL,
   FOREIGN KEY(pers_id_1, ress_id) REFERENCES Ressource(pers_id, id),
   PRIMARY KEY(pers_id, pers_id_1, ress_id)
);
