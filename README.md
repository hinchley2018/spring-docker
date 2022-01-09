# spring-docker
- this project will be a simple REST api using API_Key auth in a auth header
- Putting spring boot app in docker container
- spring-boot tutorial https://medium.com/geekculture/build-a-spring-boot-rest-api-with-java-maven-and-mysql-92bdb654caa9
- docker tutorial https://medium.com/geekculture/dockerizing-a-spring-boot-application-with-maven-122286e9f582


## getting started
- fork/clone the project
- build and run project `docker compose up --build`

## lessons learned
- jpa abstracts a lot of data stuff away
- java is more verbose than C# with getters
- maven build/restore is slow part of build, can I cache restoring pkgs
- if i'm going to work on java, should probably use JetBrains Idea IDE...
- because they use more abstracted ORM packages some run-time errors pop-up like https://stackoverflow.com/questions/26548505/org-hibernate-hibernateexception-access-to-dialectresolutioninfo-cannot-be-null
fix is to make sure your hibernate dialects are setup correctly https://stackoverflow.com/questions/50322550/hibernate-dialect-for-mysql-8