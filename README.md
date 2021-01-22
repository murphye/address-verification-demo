# Address Verification JSON to XML Demo

Demonstrate how to use Gloo Edge to transform an incoming JSON HTTP request to a SOAP/XML HTTP Request using Gloo Edge.

*Future:* Translate the SOAP/XML HTTP response back to JSON format.

## Prerequisites

* Kubernetes (or OpenShift)
* Gloo Edge deployed to Kubernetes

## WSDL Specification

This demo reuses the WSDL specification for the [Experian Address Validation](https://www.experian.com/small-business/address-validation) service.

* WSDL: https://ws.ondemand.qas.com/ProOnDemand/V3/ProOnDemandService.asmx?WSDL
* List of Operations: https://ws.ondemand.qas.com/ProOnDemand/V3/ProOnDemandService.asmx

## Sample SOAP/XML Service Provider

This demo doesn't use the actual Experian Address Validation service endpoint. Instead, the WSDL was used to generate a dummy service that is implemented in Spring Boot. This service is only implemented for testing/demo purposes and isn't intended to replace the real Experian Address Validation service.

### Spring Boot Guides Used

Dependencies used were Spring Web, Spring Web Services, and Spring Boot Actuator.

* https://spring.io/guides/gs/producing-web-service/
* https://spring.io/guides/gs/spring-boot-kubernetes/












