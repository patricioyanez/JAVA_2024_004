CREATE TABLE MARCA(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  int             not null,
    unique(nombre)
);
