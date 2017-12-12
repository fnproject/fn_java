# LogApi

All URIs are relative to *https://127.0.0.1:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsAppCallsCallLogGet**](LogApi.md#appsAppCallsCallLogGet) | **GET** /apps/{app}/calls/{call}/log | Get call logs


<a name="appsAppCallsCallLogGet"></a>
# **appsAppCallsCallLogGet**
> LogWrapper appsAppCallsCallLogGet(app, call)

Get call logs

Get call logs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogApi;


LogApi apiInstance = new LogApi();
String app = "app_example"; // String | App Name
String call = "call_example"; // String | Call ID.
try {
    LogWrapper result = apiInstance.appsAppCallsCallLogGet(app, call);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#appsAppCallsCallLogGet");
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

