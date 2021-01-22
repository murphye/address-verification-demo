Address Validation Service

# Build

`./mvnw clean install`

Generated clases will be created under `target/classes/com/qas/ondemand_2011_03` from the `src/main/resources/qas-ondemand.wsdl`.

# Run
`./mvnw spring-boot:run`

Curl the Service
`curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws`

