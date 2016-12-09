This is a first pass at TrackMyStuff, an application to track one's stuff.

This was build using Spring STS with the following defaults:

Spring Web
Thymeleaf
Gradle
Java 8
War File


in build.gradle added mavenLocal()

Also:
	// Added webjars for fron-end dependencies
	compile 'org.webjars:bootstrap:3.3.1'

-------------------------------------------------
GitHub
-------------------------------------------------
	
Use GitHub account:
dbirtwellSandbox

1) Create .gitignore file

…or create a new repository on the command line

2)
echo "# trackmystuff_spring_boot_1" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/dbirtwellSandbox/trackmystuff_spring_boot_1.git
git push -u origin master

Bootstrap:

Take from:

http://getbootstrap.com/examples/carousel/


create database:
CREATE DATABASE trackmystuff_1;