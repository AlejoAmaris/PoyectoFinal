CREATE DATABASE Usuarios;

use Usuarios;

CREATE TABLE Registros(
	Nombre varchar(20),
    NoUsuario varchar(2),
    Telefono varchar(10),
    Clave varchar(10),
    
    PRIMARY KEY (NoUsuario)
);