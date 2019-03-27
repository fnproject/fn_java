# CallApi

All URIs are relative to *https://127.0.0.1:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fnsFnIDCallsCallIDGet**](CallApi.md#fnsFnIDCallsCallIDGet) | **GET** /fns/{fnID}/calls/{callID} | Get call information
[**fnsFnIDCallsGet**](CallApi.md#fnsFnIDCallsGet) | **GET** /fns/{fnID}/calls | Get a fns calls.
[**getCallLogs**](CallApi.md#getCallLogs) | **GET** /fns/{fnID}/calls/{callID}/log | Get logs for a call.


<a name="fnsFnIDCallsCallIDGet"></a>
# **fnsFnIDCallsCallIDGet**
> Call fnsFnIDCallsCallIDGet(fnID, callID)

Get call information

Get call information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CallApi;


CallApi apiInstance = new CallApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
String callID = "callID_example"; // String | Opaque, unique Call ID.
try {
    Call result = apiInstance.fnsFnIDCallsCallIDGet(fnID, callID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#fnsFnIDCallsCallIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnID** | **String**| Opaque, unique Function ID. |
 **callID** | **String**| Opaque, unique Call ID. |

### Return type

[**Call**](Call.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fnsFnIDCallsGet"></a>
# **fnsFnIDCallsGet**
> CallList fnsFnIDCallsGet(fnID, cursor, perPage, fromTime, toTime)

Get a fns calls.

Get a functions calls, results returned in created_at, descending order (newest first).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CallApi;


CallApi apiInstance = new CallApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
Integer fromTime = 56; // Integer | Unix timestamp in seconds, of call.created_at to begin the results at, default 0.
Integer toTime = 56; // Integer | Unix timestamp in seconds, of call.created_at to end the results at, defaults to latest.
try {
    CallList result = apiInstance.fnsFnIDCallsGet(fnID, cursor, perPage, fromTime, toTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#fnsFnIDCallsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnID** | **String**| Opaque, unique Function ID. |
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]
 **fromTime** | **Integer**| Unix timestamp in seconds, of call.created_at to begin the results at, default 0. | [optional]
 **toTime** | **Integer**| Unix timestamp in seconds, of call.created_at to end the results at, defaults to latest. | [optional]

### Return type

[**CallList**](CallList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallLogs"></a>
# **getCallLogs**
> Log getCallLogs(fnID, callID)

Get logs for a call.

Get logs for a call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CallApi;


CallApi apiInstance = new CallApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
String callID = "callID_example"; // String | Opaque, unique Call ID.
try {
    Log result = apiInstance.getCallLogs(fnID, callID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#getCallLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fnID** | **String**| Opaque, unique Function ID. |
 **callID** | **String**| Opaque, unique Call ID. |

### Return type

[**Log**](Log.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

