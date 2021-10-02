# microservices

You can run this microservice applciation in your local if you have docker with you.



Steps 

Go to : https://hub.docker.com ->  

pull the following images:


  jawahars07/naming-server
  
  jawahars07/api-gateway
  
  jawahars07/currency-conversion-service
  
  jawahars07/currency-exchange-service

(:0.0.1-SNAPSHOT for all services)


Run the application :

For Eureka Naming Server = localhost:8761

For Eureka Zipkin Tracing = localhost:9411

Services:

http://localhost:8765/currency-exchange/from/USD/to/INR

http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10

http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10

http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10


--- DS & Algo Added
