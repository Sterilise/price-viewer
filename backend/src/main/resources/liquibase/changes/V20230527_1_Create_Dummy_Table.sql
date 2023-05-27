--liquibase formatted sql

--changeset dummy_table:1

-----
--DDL
-----

create table person (
    id int primary key,
    name varchar(255)
);