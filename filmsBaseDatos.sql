create database films;

use films;

create table profiles(
    profile_id int not null primary key,
    name_profile varchar(500) 
);

create table gender(
    gender_id int not null primary key,
    name_gender varchar(500) not null
);

create table movie(
    movie_id int not null primary key auto_increment,
    name_movie varchar(500) not null,
    descriptions longtext,
    image varchar(500) not null,
    create_at datetime not null,
    release_date date,
    actor varchar(500),
    gender_id int not null,
    rating int,
    foreign key (gender_id) references gender(gender_id)
);

create table users(
    user_id int not null primary key auto_increment,
    name_user varchar(500) not null,
    email varchar(100) not null Unique,
    pass varchar(100) not null,
    create_at datetime not null,
    profile_id int not null,
    foreign key(profile_id) references profiles(profile_id) 
);

-- inserts for gender --

insert into gender(gender_id, name_gender) values (1, 'Acción');
insert into gender(gender_id, name_gender) values (2, 'Suspenso');
insert into gender(gender_id, name_gender) values (3, 'Aventura');
insert into gender(gender_id, name_gender) values (4, 'Comedia');
insert into gender(gender_id, name_gender) values (5, 'Terror');
insert into gender(gender_id, name_gender) values (6, 'Anime');

-- inserts for profile --
insert into profiles(profile_id, name_profile) values(1, 'Administrador');
insert into profiles(profile_id, name_profile) values(2, 'Cliente');

-- inserts for users --
insert into users(name_user, email, create_at, pass, profile_id) values('Luis Hurtado', 'luis.hurtado@est.iudigital.edu.co', now(), '123456', 1);
insert into users(name_user, email, create_at, pass, profile_id) values('Juanito Perez', 'juanitoperes@micorreo.com', now(), '987654', 2);

--inserts for movie --

