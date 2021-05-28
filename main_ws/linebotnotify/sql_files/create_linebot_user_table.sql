CONNECT linebot_user/<password>;

-- create table for users

CREATE TABLE linebot_user (
    user_id         NUMBER(5)           PRIMARY KEY,
    user_name       VARCHAR2(30 CHAR)   NOT NULL,
    user_line_id    VARCHAR2(60 CHAR)   NOT NULL,
    birthdate       DATE                NOT NULL,
    gender_id       NUMBER              NOT NULL REFERENCES gender(gender_id)
);

-- create sequence to automate user_id

CREATE SEQUENCE seq_linebot_user NOCACHE;