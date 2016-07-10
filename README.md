# Table of content
- [Introduction](#introduction)
- [Pre-Requisites](#prerequisites)
- [Technical Stack Used](#techstack)
- [Practices/Principles included](#principles) 
- [Usage](#usage)

<div id='introduction'/>
## Introduction
Personnel and Inventory Management Systetm(**pims**) is prototyping application to demonstrate various software principles/methodologies in Java and web development. 

<div id='prerequisites'/>
## Pre-Requisites
- Java 1.7+
- PostgreSQL 9+
- Eclipse

<div id='techstack'/>
## Technical Stack
Following skills have been used to show-case various functionality and most of them are java & web related stuff. 
- ExtJS 5(MVC & MVVM)
- Java 1.7
- Spring 4
- Spring Data JPA
- Spring Security
- Hibernate 5
- Jawr
- Git

<div id='principles'/>
## Practices/Principles adopted
pims includes many pratices/principles required for an enterprise level production ready application. It also includes the automation that has been done to make developer's life easy without explicit configuration. Following are some of them.  
- Project modulerization using Maven's pom inheritance
- Processing development and production time tasks like Minification, concatination etc using maven profiles
- Authorization & Authentication(Using Spring security)
- JPA using hibernate
- Logging

##Usage
For development environment
~~~~
mvn package 
~~~~

For production environment
~~~~
mvn package -Dnet.jawr.debug.on=false
~~~~