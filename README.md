# library-app

## How to run
1. First start a docker-compose.yml files located in app1 and app2. Both contains required configuration to prepare environment before start applications. To do this run: docker-compose up command from cmd. It starts fetching docker images and runs containers.
2. Then run application from GUI Intelij, by selecting main java class or by running command: mvn spring-boot:run.

Also I placed a postman collections which contains request examples.

Update: Lombok has been deleted from both app due mapstruct issues. 

**Please run applications using main branch**
