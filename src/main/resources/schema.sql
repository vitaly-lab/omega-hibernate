CREATE TABLE pilots
(
    id          SERIAL PRIMARY KEY,
    name        CHARACTER VARYING(10) NOT NULL,
    age         DECIMAL               NOT NULL,
    isCertified CHARACTER VARYING(30) NOT NULL,
    email       CHARACTER VARYING(50) NOT NULL
);
