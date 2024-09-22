CREATE TABLE estudiante (
  id          INTEGER      auto_increment PRIMARY KEY,
  nombre      VARCHAR(20)  NOT NULL,
  apellido    VARCHAR(20)  NOT NULL,
  email       VARCHAR(20)  NOT NULL,
  creditos    INTEGER      NOT NULL,
  semestre    INTEGER      NOT NULL,
  promedio    INTEGER      NOT NULL
  );


