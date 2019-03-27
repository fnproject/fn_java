# LogApi

All URIs are relative to *https://127.0.0.1:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCallLogs**](LogApi.md#getCallLogs) | **GET** /fns/{fnID}/calls/{callID}/log | Get logs for a call.


<a name="getCallLogs"></a>
# **getCallLogs**
> Log getCallLogs(fnID, callID)

Get logs for a call.

Get logs for a call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogApi;


LogApi apiInstance = new LogApi();
String fnID = "fnID_example"; // String | Opaque, unique Function ID.
String callID = "callID_example"; // String | Opaque, unique Call ID.
try {
    Log result = apiInstance.getCallLogs(fnID, callID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getCallLogs");
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

