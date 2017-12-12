# AppsApi

All URIs are relative to *https://127.0.0.1:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsAppDelete**](AppsApi.md#appsAppDelete) | **DELETE** /apps/{app} | Delete an app.
[**appsAppGet**](AppsApi.md#appsAppGet) | **GET** /apps/{app} | Get information for a app.
[**appsAppPatch**](AppsApi.md#appsAppPatch) | **PATCH** /apps/{app} | Updates an app.
[**appsGet**](AppsApi.md#appsGet) | **GET** /apps | Get all app names.
[**appsPost**](AppsApi.md#appsPost) | **POST** /apps | Post new app


<a name="appsAppDelete"></a>
# **appsAppDelete**
> appsAppDelete(app)

Delete an app.

Delete an app.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String app = "app_example"; // String | Name of the app.
try {
    apiInstance.appsAppDelete(app);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#appsAppDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| Name of the app. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppGet"></a>
# **appsAppGet**
> AppWrapper appsAppGet(app)

Get information for a app.

This gives more details about a app, such as statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String app = "app_example"; // String | name of the app.
try {
    AppWrapper result = apiInstance.appsAppGet(app);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#appsAppGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| name of the app. |

### Return type

[**AppWrapper**](AppWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppPatch"></a>
# **appsAppPatch**
> AppWrapper appsAppPatch(app, body)

Updates an app.

You can set app level settings here. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String app = "app_example"; // String | name of the app.
AppWrapper body = new AppWrapper(); // AppWrapper | App to post.
try {
    AppWrapper result = apiInstance.appsAppPatch(app, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#appsAppPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| name of the app. |
 **body** | [**AppWrapper**](AppWrapper.md)| App to post. |

### Return type

[**AppWrapper**](AppWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsGet"></a>
# **appsGet**
> AppsWrapper appsGet(cursor, perPage)

Get all app names.

Get a list of all the apps in the system, returned in alphabetical order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
try {
    AppsWrapper result = apiInstance.appsGet(cursor, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#appsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]

### Return type

[**AppsWrapper**](AppsWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsPost"></a>
# **appsPost**
> AppWrapper appsPost(body)

Post new app

Insert a new app

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
AppWrapper body = new AppWrapper(); // AppWrapper | App to post.
try {
    AppWrapper result = apiInstance.appsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#appsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppWrapper**](AppWrapper.md)| App to post. |

### Return type

[**AppWrapper**](AppWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

