0. To install project, you need

Jboss 5.1
MySQL 5.5+
ant

1. Installation procedure:

unpack attached archive
modify build.properties to match existing Jboss/Mysql configuration
perform "ant install"
start jboss

application will be available at localhost:8080/bugfix
default login/password is admin/admin

2. Task goals

Main task is to extend application so it allows to store several phone numbers for a user (General/Mobile/Home/Work).

Secondary task is to test application/review sources to find any obvious bugs. 

Bugs must be reported for following categories:

Configuration bugs
Functionality bugs
Security bugs
Code design bugs
Scalability/performance bugs
Code style issues

Task supposed to take less than one day (8 hours)
Please document how long each stage took (installation/development/testing/review)