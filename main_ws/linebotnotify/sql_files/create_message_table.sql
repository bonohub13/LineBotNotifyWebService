CONNECT linebot_user_testing/testing;

-- Create table messages to store messages to notify the user with
-- message_id is 34bit integer

CREATE TABLE messages (
    message_id      NUMBER(10)          PRIMARY KEY,
    message_content VARCHAR2(1000 CHAR) NOT NULL,
    user_id         NUMBER(5)           NOT NULL REFERENCES linebot_user(user_id)
);

-- Create sequence to automate the generation of message_id

CREATE SEQUENCE seq_messages NOCACHE;