# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AppsApi;

import java.io.File;
import java.util.*;

public class AppsApiExample {

    public static void main(String[] args) {
        
        AppsApi apiInstance = new AppsApi();
        String app = "app_example"; // String | Name of the app.
        try {
            apiInstance.appsAppDelete(app);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsAppDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://127.0.0.1:8080/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**appsAppDelete**](docs/AppsApi.md#appsAppDelete) | **DELETE** /apps/{app} | Delete an app.
*AppsApi* | [**appsAppGet**](docs/AppsApi.md#appsAppGet) | **GET** /apps/{app} | Get information for a app.
*AppsApi* | [**appsAppPatch**](docs/AppsApi.md#appsAppPatch) | **PATCH** /apps/{app} | Updates an app.
*AppsApi* | [**appsGet**](docs/AppsApi.md#appsGet) | **GET** /apps | Get all app names.
*AppsApi* | [**appsPost**](docs/AppsApi.md#appsPost) | **POST** /apps | Post new app
*CallApi* | [**appsAppCallsCallGet**](docs/CallApi.md#appsAppCallsCallGet) | **GET** /apps/{app}/calls/{call} | Get call information
*CallApi* | [**appsAppCallsCallLogGet**](docs/CallApi.md#appsAppCallsCallLogGet) | **GET** /apps/{app}/calls/{call}/log | Get call logs
*CallApi* | [**appsAppCallsGet**](docs/CallApi.md#appsAppCallsGet) | **GET** /apps/{app}/calls | Get app-bound calls.
*LogApi* | [**appsAppCallsCallLogGet**](docs/LogApi.md#appsAppCallsCallLogGet) | **GET** /apps/{app}/calls/{call}/log | Get call logs
*RoutesApi* | [**appsAppRoutesGet**](docs/RoutesApi.md#appsAppRoutesGet) | **GET** /apps/{app}/routes | Get route list by app name.
*RoutesApi* | [**appsAppRoutesPost**](docs/RoutesApi.md#appsAppRoutesPost) | **POST** /apps/{app}/routes | Create new Route
*RoutesApi* | [**appsAppRoutesRouteDelete**](docs/RoutesApi.md#appsAppRoutesRouteDelete) | **DELETE** /apps/{app}/routes/{route} | Deletes the route
*RoutesApi* | [**appsAppRoutesRouteGet**](docs/RoutesApi.md#appsAppRoutesRouteGet) | **GET** /apps/{app}/routes/{route} | Gets route by name
*RoutesApi* | [**appsAppRoutesRoutePatch**](docs/RoutesApi.md#appsAppRoutesRoutePatch) | **PATCH** /apps/{app}/routes/{route} | Update a Route, Fails if the route or app does not exist. Accepts partial updates / skips validation of zero values.
*RoutesApi* | [**appsAppRoutesRoutePut**](docs/RoutesApi.md#appsAppRoutesRoutePut) | **PUT** /apps/{app}/routes/{route} | Create a Route if it does not exist. Update if it does. Will also create app if it does not exist. Put does not skip validation of zero values


## Documentation for Models

 - [App](docs/App.md)
 - [AppWrapper](docs/AppWrapper.md)
 - [AppsWrapper](docs/AppsWrapper.md)
 - [Call](docs/Call.md)
 - [CallWrapper](docs/CallWrapper.md)
 - [CallsWrapper](docs/CallsWrapper.md)
 - [Error](docs/Error.md)
 - [ErrorBody](docs/ErrorBody.md)
 - [Log](docs/Log.md)
 - [LogWrapper](docs/LogWrapper.md)
 - [Route](docs/Route.md)
 - [RouteWrapper](docs/RouteWrapper.md)
 - [RoutesWrapper](docs/RoutesWrapper.md)
 - [Stat](docs/Stat.md)
 - [StatMetrics](docs/StatMetrics.md)
 - [Version](docs/Version.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



