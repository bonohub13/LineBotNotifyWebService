CONNECT system/<password>;

-- Create user linebot_user for this project
-- Grant user linebot_user all privileges (master user for this project)

CREATE USER linebot_user_testing IDENTIFIED BY testing;
GRANT linebot_user ALL PRIVILEGES;