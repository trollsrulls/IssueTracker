create user issue_tracker_admin password 'secret';
create database issue_tracker_dev;
grant all privileges on database issue_tracker_dev to issue_tracker_admin;