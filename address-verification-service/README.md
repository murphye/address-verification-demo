# Address Validation Service

## Build

`./mvnw clean install`

Generated clases will be created under `target/classes/com/qas/ondemand_2011_03` from the `src/main/resources/qas-ondemand.wsdl`.

## Run
`./mvnw clean compile`

`./mvnw spring-boot:run`

## Curl the Service
`curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws`

## Build Docker Image
`./mvnw spring-boot:build-image`

`docker tag address-verification-service:0.0.1-SNAPSHOT murphye/address-verification-service`

`docker push murphye/address-verification-service`

## Deploy to Kubernetes
`kubectl apply -f deployment.yaml`

## Virtual Service and Route
`kubectl apply -f address-virtual-service.yaml`

`kubectl apply -f address-json-route.yaml`

## Test in Kubernetes using XML Request
`curl -X POST -H "Content-Type: application/json" -d @request.json http://localhost:8081/address-json`


