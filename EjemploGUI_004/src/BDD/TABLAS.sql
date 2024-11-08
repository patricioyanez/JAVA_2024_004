CREATE TABLE MARCA(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  int             not null,
    unique(nombre)
);

CREATE TABLE Categoria(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  int             not null,
    unique(nombre)
);



INSERT INTO Marca (nombre, habilitado) values ('CocaCola', 1);
INSERT INTO Marca (nombre, habilitado) values ('Pepsi', 1);
INSERT INTO Marca (nombre, habilitado) values ('Bilz', 1);
INSERT INTO Marca (nombre, habilitado) values ('Pap', 1);
INSERT INTO Marca (nombre, habilitado) values ('RedBull', 1);

INSERT INTO Categoria (nombre, habilitado) values ('Bebestible', 1);
INSERT INTO Categoria (nombre, habilitado) values ('Abarrote', 1);
INSERT INTO Categoria (nombre, habilitado) values ('Frutas y Verduras', 1);
INSERT INTO Categoria (nombre, habilitado) values ('Perfumeria', 1);