# ElytronAuthWebApp
Simple fom based login with Elytron authentication

To test this, first create the two properties files at config dir as follows

## example-users.properties
#$REALM_NAME=examplePropRealm$

user1=password123

user2=password123


## example-roles.properties
user1=Admin

user2=Guest


Then execute the configure_elytron.cli as
<WILDFLY_HOME>/bin/jboss-cli.sh --connect --file=configure-elytron.cli

Go to http://localhost:8080 and you should get the login form. Enter the username and password having Admin role created in the above properties files. If success you should see the home page with message "Welcome to Elytron security "
