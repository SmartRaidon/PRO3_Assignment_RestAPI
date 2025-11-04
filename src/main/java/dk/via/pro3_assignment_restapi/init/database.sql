CREATE SCHEMA IF NOT EXISTS pro3_restapi;
SET SCHEMA 'pro3_restapi';

CREATE TABLE IF NOT EXISTS animal (
    reg_num serial,
    weight double precision,
    date date not null,
    origin varchar(50) not null,
    PRIMARY KEY (reg_num)
);
