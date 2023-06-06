/**
 * Author:  Vazgen Smbatyan
 * Created: 4 jun 2023
 */

SELECT 'CREATE DATABASE ejemplo_token
    WITH
    OWNER = postgres
    ENCODING = "UTF8"
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'ejemplo_token');

CREATE SEQUENCE IF NOT EXISTS user_id_seq;

CREATE TABLE IF NOT EXISTS public."user"
(
    id bigint NOT NULL DEFAULT nextval('user_id_seq'),
    "user" character varying COLLATE pg_catalog."default",
    password character varying COLLATE pg_catalog."default",
    token character varying COLLATE pg_catalog."default",
    creation_date timestamp with time zone
);