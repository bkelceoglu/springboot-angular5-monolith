## FTL

This is the core project for orginal FTL project to make **Spring Boot + NG5 monolithic** application.

Angular5 which is named as frontend is embedded to spring boot application which is named as backend.

###### Before doing anything

You have to go to:

**frontend/src/main/frontend**

this folder and run 
**npm install** 
to make sure you will have all node modules to run the project.

Then,
At the root of the project
you have to run 

**./mvnw clean package**

then you can run the project with

**java -jar backend/target/backend-0.0.1.jar**

i have added sample user entity for backend and simply displaying name and email property of user.

Probably i will this project as a root for someother projects or as a sample for the users who may have interest
on monolithic spring boot + angular2+.



