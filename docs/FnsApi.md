# FnsApi

All URIs are relative to *https://127.0.0.1:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFn**](FnsApi.md#createFn) | **POST** /fns | Create A New Function
[**deleteFn**](FnsApi.md#deleteFn) | **DELETE** /fns/{fnID} | Delete A Function
[**getFn**](FnsApi.md#getFn) | **GET** /fns/{fnID} | Get Definition Of A Function
[**listFns**](FnsApi.md#listFns) | **GET** /fns | Get A list Of Functions Within An Application
[**updateFn**](FnsApi.md#updateFn) | **PUT** /fns/{fnID} | Update A Function


<a name="createFn"></a>
# **createFn**
> Fn createFn(body)

Create A New Function

Creates a new Function, returning the complete entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FnsApi;


FnsApi apiInstance = new FnsApi();
Fn body = new Fn(); // Fn | Function data to insert.
try {
    Fn result = apiInstance.createFn(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FnsApi#createFn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Fn**](Fn.md)| Function data to insert. |

### Return type

[**Fn**](Fn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFn"></a>
# **deleteFn**
> deleteFn(fnID)

Delete A Function

Delete the specified Function.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FnsApi;


FnsApi apiInstance = new FnsApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
try {
    apiInstance.deleteFn(fnID);
} catch (ApiException e) {
    System.err.println("Exception when calling FnsApi#deleteFn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnID** | **String**| Opaque, unique Function ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFn"></a>
# **getFn**
> Fn getFn(fnID)

Get Definition Of A Function

Gets the definition for the Function with the specified ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FnsApi;


FnsApi apiInstance = new FnsApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
try {
    Fn result = apiInstance.getFn(fnID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FnsApi#getFn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnID** | **String**| Opaque, unique Function ID. |

### Return type

[**Fn**](Fn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFns"></a>
# **listFns**
> FnList listFns(appId, cursor, perPage, name)

Get A list Of Functions Within An Application

Get a filtered list of Functions for an Application, in alphabetical order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FnsApi;


FnsApi apiInstance = new FnsApi();
String appId = "appId_example"; // String | Application ID.
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
String name = "name_example"; // String | Function name to filter by
try {
    FnList result = apiInstance.listFns(appId, cursor, perPage, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FnsApi#listFns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application ID. | [optional]
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]
 **name** | **String**| Function name to filter by | [optional]

### Return type

[**FnList**](FnList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFn"></a>
# **updateFn**
> Fn updateFn(fnID, body)

Update A Function

Updates a Function via merging the provided values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FnsApi;


FnsApi apiInstance = new FnsApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
Fn body = new Fn(); // Fn | Function data to merge with current values.
try {
    Fn result = apiInstance.updateFn(fnID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FnsApi#updateFn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnID** | **String**| Opaque, unique Function ID. |
 **body** | [**Fn**](Fn.md)| Function data to merge with current values. |

### Return type

[**Fn**](Fn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

