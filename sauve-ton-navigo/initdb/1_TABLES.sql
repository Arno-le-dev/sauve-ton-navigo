create table users
(
    id SERIAL PRIMARY KEY,
    first_name TEXT not null,
    last_name TEXT not null,
    email TEXT not null,
    mdp TEXT not null,
    admin BOOLEAN not null
);
create table station
(
    id SERIAL PRIMARY KEY,
    numero_ligne int not null,
    nom TEXT not null,
    nbr_controlleurs int not null,
    nbr_sortie int not null
);

create table signalements
(
    id SERIAL PRIMARY KEY,
    date date not null,
    heure time not null,
    nbr_controlleurs int not null,
    station_id int null,
    humeur TEXT not null,
    position_controlleurs TEXT not null,
    commentaire TEXT
);
