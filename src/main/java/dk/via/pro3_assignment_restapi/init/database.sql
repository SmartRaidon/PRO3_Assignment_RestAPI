CREATE SCHEMA IF NOT EXISTS pro3_restapi;
SET SCHEMA 'pro3_restapi';

DROP SCHEMA pro3_restapi CASCADE;

DROP TABLE animal;

CREATE TABLE IF NOT EXISTS animal (
    reg_num serial,
    weight double precision,
    date date not null,
    origin varchar(50) not null,
    PRIMARY KEY (reg_num)
);

INSERT INTO animal (reg_num, weight, date, origin)
VALUES (1, 25.0, '2025-03-22', 'farm Horsens');

DELETE FROM animal WHERE reg_num = 1;