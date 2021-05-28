CONNECT system/<password>;

-- Create user linebot_user for this project
-- Grant user linebot_user all privileges (master user for this project)

CREATE USER linebot_user IDENTIFIED BY <password>;
GRANT linebot_user ALL PRIVILEGES;