# RoutesApi

All URIs are relative to *https://127.0.0.1:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsAppRoutesGet**](RoutesApi.md#appsAppRoutesGet) | **GET** /apps/{app}/routes | Get route list by app name.
[**appsAppRoutesPost**](RoutesApi.md#appsAppRoutesPost) | **POST** /apps/{app}/routes | Create new Route
[**appsAppRoutesRouteDelete**](RoutesApi.md#appsAppRoutesRouteDelete) | **DELETE** /apps/{app}/routes/{route} | Deletes the route
[**appsAppRoutesRouteGet**](RoutesApi.md#appsAppRoutesRouteGet) | **GET** /apps/{app}/routes/{route} | Gets route by name
[**appsAppRoutesRoutePatch**](RoutesApi.md#appsAppRoutesRoutePatch) | **PATCH** /apps/{app}/routes/{route} | Update a Route, Fails if the route or app does not exist. Accepts partial updates / skips validation of zero values.
[**appsAppRoutesRoutePut**](RoutesApi.md#appsAppRoutesRoutePut) | **PUT** /apps/{app}/routes/{route} | Create a Route if it does not exist. Update if it does. Will also create app if it does not exist. Put does not skip validation of zero values


<a name="appsAppRoutesGet"></a>
# **appsAppRoutesGet**
> RoutesWrapper appsAppRoutesGet(app, image, cursor, perPage)

Get route list by app name.

This will list routes for a particular app, returned in alphabetical order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
String app = "app_example"; // String | Name of app for this set of routes.
String image = "image_example"; // String | Route image to match, exact.
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
try {
    RoutesWrapper result = apiInstance.appsAppRoutesGet(app, image, cursor, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#appsAppRoutesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| Name of app for this set of routes. |
 **image** | **String**| Route image to match, exact. | [optional]
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]

### Return type

[**RoutesWrapper**](RoutesWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppRoutesPost"></a>
# **appsAppRoutesPost**
> RouteWrapper appsAppRoutesPost(app, body)

Create new Route

Create a new route in an app, if app doesn&#39;t exists, it creates the app. Post does not skip validation of zero values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
String app = "app_example"; // String | name of the app.
RouteWrapper body = new RouteWrapper(); // RouteWrapper | One route to post.
try {
    RouteWrapper result = apiInstance.appsAppRoutesPost(app, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#appsAppRoutesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| name of the app. |
 **body** | [**RouteWrapper**](RouteWrapper.md)| One route to post. |

### Return type

[**RouteWrapper**](RouteWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppRoutesRouteDelete"></a>
# **appsAppRoutesRouteDelete**
> appsAppRoutesRouteDelete(app, route)

Deletes the route

Deletes the route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
String app = "app_example"; // String | Name of app for this set of routes.
String route = "route_example"; // String | Route name
try {
    apiInstance.appsAppRoutesRouteDelete(app, route);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#appsAppRoutesRouteDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| Name of app for this set of routes. |
 **route** | **String**| Route name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppRoutesRouteGet"></a>
# **appsAppRoutesRouteGet**
> RouteWrapper appsAppRoutesRouteGet(app, route)

Gets route by name

Gets a route by name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
String app = "app_example"; // String | Name of app for this set of routes.
String route = "route_example"; // String | Route name
try {
    RouteWrapper result = apiInstance.appsAppRoutesRouteGet(app, route);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#appsAppRoutesRouteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| Name of app for this set of routes. |
 **route** | **String**| Route name |

### Return type

[**RouteWrapper**](RouteWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppRoutesRoutePatch"></a>
# **appsAppRoutesRoutePatch**
> RouteWrapper appsAppRoutesRoutePatch(app, route, body)

Update a Route, Fails if the route or app does not exist. Accepts partial updates / skips validation of zero values.

Update a route

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
String app = "app_example"; // String | name of the app.
String route = "route_example"; // String | route path.
RouteWrapper body = new RouteWrapper(); // RouteWrapper | One route to post.
try {
    RouteWrapper result = apiInstance.appsAppRoutesRoutePatch(app, route, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#appsAppRoutesRoutePatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| name of the app. |
 **route** | **String**| route path. |
 **body** | [**RouteWrapper**](RouteWrapper.md)| One route to post. |

### Return type

[**RouteWrapper**](RouteWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppRoutesRoutePut"></a>
# **appsAppRoutesRoutePut**
> RouteWrapper appsAppRoutesRoutePut(app, route, body)

Create a Route if it does not exist. Update if it does. Will also create app if it does not exist. Put does not skip validation of zero values

Update or Create a route

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
String app = "app_example"; // String | name of the app.
String route = "route_example"; // String | route path.
RouteWrapper body = new RouteWrapper(); // RouteWrapper | One route to post.
try {
    RouteWrapper result = apiInstance.appsAppRoutesRoutePut(app, route, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#appsAppRoutesRoutePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| name of the app. |
 **route** | **String**| route path. |
 **body** | [**RouteWrapper**](RouteWrapper.md)| One route to post. |

### Return type

[**RouteWrapper**](RouteWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

