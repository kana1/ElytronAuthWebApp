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

# Custom Http Authentication Mechanism
This need ElytronHttpCustomModule as well. First update your web.xml to use "auth-method" as "CUSTOM_MECHANISM".

It is better to start with a fresh copy of stanalone.xml so that previous changes will not overlap with the following configuration changes.

Now build ElytronHttpCustomModule and run the cli file to create the WildFly module
<WILDFLY_HOME>/bin/jboss-cli.sh --connect --file=add-custom-module.cli

Once complete run following cli as well
<WILDFLY_HOME>/bin/jboss-cli.sh --connect --file=configure-elytron.cli

Now when you go the http://localhost:8080 you should see the login form and once submitted the authentication will be done through the new custom module, ElytronHttpCustomModule.


## Application Data source 

Create a data source in the server configuraion
```
<datasource jndi-name="java:jboss/datasources/ServletSecurityDS" pool-name="ServletSecurityDS" use-java-context="true">
                    <connection-url>jdbc:h2:mem:servlet-security;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    ...
                    
                </datasource>


``` 

_resource/META-INF/import.sql_ is automatically picked up on deployment to initialize the db.

