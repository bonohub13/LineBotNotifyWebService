CONNECT linebot_user_testing/testing;

-- create table to identify gender

CREATE TABLE gender (
    gender_id   NUMBER              PRIMARY KEY,
    gender_name VARCHAR2(10 CHAR)   NOT NULL
);

-- initialize gender table

INSERT INTO gender VALUES(1, 'male');
INSERT INTO gender VALUES(2, 'female');
INSERT INTO gender VALUES(3, 'LGBTQplus');

COMMIT;