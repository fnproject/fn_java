# AppsApi

All URIs are relative to *https://127.0.0.1:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApp**](AppsApi.md#createApp) | **POST** /apps | Create A New Application
[**deleteApp**](AppsApi.md#deleteApp) | **DELETE** /apps/{appID} | Delete An Application
[**getApp**](AppsApi.md#getApp) | **GET** /apps/{appID} | Get Information For An Application
[**listApps**](AppsApi.md#listApps) | **GET** /apps | Get A List Of Applications
[**updateApp**](AppsApi.md#updateApp) | **PUT** /apps/{appID} | Update an Application


<a name="createApp"></a>
# **createApp**
> App createApp(body)

Create A New Application

Creates a new Application, returning the complete entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
App body = new App(); // App | Application data to insert.
try {
    App result = apiInstance.createApp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#createApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**App**](App.md)| Application data to insert. |

### Return type

[**App**](App.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApp"></a>
# **deleteApp**
> deleteApp(appID)

Delete An Application

Delete the specified Application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String appID = "appID_example"; // String | Opaque, unique Application ID.
try {
    apiInstance.deleteApp(appID);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#deleteApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appID** | **String**| Opaque, unique Application ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApp"></a>
# **getApp**
> App getApp(appID)

Get Information For An Application

Returns more details about an Application, such as statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String appID = "appID_example"; // String | Opaque, unique Application ID.
try {
    App result = apiInstance.getApp(appID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appID** | **String**| Opaque, unique Application ID. |

### Return type

[**App**](App.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listApps"></a>
# **listApps**
> AppList listApps(cursor, perPage, name)

Get A List Of Applications

Get a filtered list of Applications in alphabetical order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
String name = "name_example"; // String | The Application name to filter by.
try {
    AppList result = apiInstance.listApps(cursor, perPage, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]
 **name** | **String**| The Application name to filter by. | [optional]

### Return type

[**AppList**](AppList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApp"></a>
# **updateApp**
> App updateApp(appID, body)

Update an Application

Updates an Application via merging the provided values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppsApi;


AppsApi apiInstance = new AppsApi();
String appID = "appID_example"; // String | Opaque, unique Application ID.
App body = new App(); // App | Application data to merge with current values.
try {
    App result = apiInstance.updateApp(appID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appID** | **String**| Opaque, unique Application ID. |
 **body** | [**App**](App.md)| Application data to merge with current values. |

### Return type

[**App**](App.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

