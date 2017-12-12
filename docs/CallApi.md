# CallApi

All URIs are relative to *https://127.0.0.1:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsAppCallsCallGet**](CallApi.md#appsAppCallsCallGet) | **GET** /apps/{app}/calls/{call} | Get call information
[**appsAppCallsCallLogGet**](CallApi.md#appsAppCallsCallLogGet) | **GET** /apps/{app}/calls/{call}/log | Get call logs
[**appsAppCallsGet**](CallApi.md#appsAppCallsGet) | **GET** /apps/{app}/calls | Get app-bound calls.


<a name="appsAppCallsCallGet"></a>
# **appsAppCallsCallGet**
> CallWrapper appsAppCallsCallGet(app, call)

Get call information

Get call information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CallApi;


CallApi apiInstance = new CallApi();
String app = "app_example"; // String | app name
String call = "call_example"; // String | Call ID.
try {
    CallWrapper result = apiInstance.appsAppCallsCallGet(app, call);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#appsAppCallsCallGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| app name |
 **call** | **String**| Call ID. |

### Return type

[**CallWrapper**](CallWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppCallsCallLogGet"></a>
# **appsAppCallsCallLogGet**
> LogWrapper appsAppCallsCallLogGet(app, call)

Get call logs

Get call logs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CallApi;


CallApi apiInstance = new CallApi();
String app = "app_example"; // String | App Name
String call = "call_example"; // String | Call ID.
try {
    LogWrapper result = apiInstance.appsAppCallsCallLogGet(app, call);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#appsAppCallsCallLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| App Name |
 **call** | **String**| Call ID. |

### Return type

[**LogWrapper**](LogWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appsAppCallsGet"></a>
# **appsAppCallsGet**
> CallsWrapper appsAppCallsGet(app, path, cursor, perPage, fromTime, toTime)

Get app-bound calls.

Get app-bound calls can filter to route-bound calls, results returned in created_at, descending order (newest first).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CallApi;


CallApi apiInstance = new CallApi();
String app = "app_example"; // String | App name.
String path = "path_example"; // String | Route path to match, exact.
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
Integer fromTime = 56; // Integer | Unix timestamp in seconds, of call.created_at to begin the results at, default 0.
Integer toTime = 56; // Integer | Unix timestamp in seconds, of call.created_at to end the results at, defaults to latest.
try {
    CallsWrapper result = apiInstance.appsAppCallsGet(app, path, cursor, perPage, fromTime, toTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#appsAppCallsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | **String**| App name. |
 **path** | **String**| Route path to match, exact. | [optional]
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]
 **fromTime** | **Integer**| Unix timestamp in seconds, of call.created_at to begin the results at, default 0. | [optional]
 **toTime** | **Integer**| Unix timestamp in seconds, of call.created_at to end the results at, defaults to latest. | [optional]

### Return type

[**CallsWrapper**](CallsWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

