# TriggersApi

All URIs are relative to *https://127.0.0.1:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrigger**](TriggersApi.md#createTrigger) | **POST** /triggers | Create A New Trigger.
[**deleteTrigger**](TriggersApi.md#deleteTrigger) | **DELETE** /triggers/{triggerID} | Delete A Trigger
[**getTrigger**](TriggersApi.md#getTrigger) | **GET** /triggers/{triggerID} | Get Definition Of A Trigger
[**listTriggers**](TriggersApi.md#listTriggers) | **GET** /triggers | Get A List Of Triggers Within An Application Or Function
[**updateTrigger**](TriggersApi.md#updateTrigger) | **PUT** /triggers/{triggerID} | Update A Trigger


<a name="createTrigger"></a>
# **createTrigger**
> Trigger createTrigger(body)

Create A New Trigger.

Creates a new Trigger, returning the complete entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TriggersApi;


TriggersApi apiInstance = new TriggersApi();
Trigger body = new Trigger(); // Trigger | Trigger data to insert.
try {
    Trigger result = apiInstance.createTrigger(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#createTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Trigger**](Trigger.md)| Trigger data to insert. |

### Return type

[**Trigger**](Trigger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTrigger"></a>
# **deleteTrigger**
> deleteTrigger(triggerID)

Delete A Trigger

Delete the specified Trigger.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TriggersApi;


TriggersApi apiInstance = new TriggersApi();
String triggerID = "triggerID_example"; // String | Opaque, unique Trigger ID.
try {
    apiInstance.deleteTrigger(triggerID);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#deleteTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **triggerID** | **String**| Opaque, unique Trigger ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrigger"></a>
# **getTrigger**
> Trigger getTrigger(triggerID)

Get Definition Of A Trigger

Gets the definition for the Trigger with the specified ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TriggersApi;


TriggersApi apiInstance = new TriggersApi();
String triggerID = "triggerID_example"; // String | Opaque, unique Trigger ID.
try {
    Trigger result = apiInstance.getTrigger(triggerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#getTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **triggerID** | **String**| Opaque, unique Trigger ID. |

### Return type

[**Trigger**](Trigger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTriggers"></a>
# **listTriggers**
> TriggerList listTriggers(appId, fnId, cursor, perPage, name)

Get A List Of Triggers Within An Application Or Function

This will list all Triggers for a particular Application or Function, returned in name alphabetical order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TriggersApi;


TriggersApi apiInstance = new TriggersApi();
String appId = "appId_example"; // String | Application ID.
String fnId = "fnId_example"; // String | Function ID.
String cursor = "cursor_example"; // String | Cursor from previous response.next_cursor to begin results after, if any.
Integer perPage = 56; // Integer | Number of results to return, defaults to 30. Max of 100.
String name = "name_example"; // String | A Trigger name to filter by.
try {
    TriggerList result = apiInstance.listTriggers(appId, fnId, cursor, perPage, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#listTriggers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application ID. | [optional]
 **fnId** | **String**| Function ID. | [optional]
 **cursor** | **String**| Cursor from previous response.next_cursor to begin results after, if any. | [optional]
 **perPage** | **Integer**| Number of results to return, defaults to 30. Max of 100. | [optional]
 **name** | **String**| A Trigger name to filter by. | [optional]

### Return type

[**TriggerList**](TriggerList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTrigger"></a>
# **updateTrigger**
> Trigger updateTrigger(triggerID, body)

Update A Trigger

Updates a Trigger by merging the provided values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TriggersApi;


TriggersApi apiInstance = new TriggersApi();
String triggerID = "triggerID_example"; // String | Opaque, unique Trigger ID.
Trigger body = new Trigger(); // Trigger | Trigger data to merge into current value.
try {
    Trigger result = apiInstance.updateTrigger(triggerID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#updateTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **triggerID** | **String**| Opaque, unique Trigger ID. |
 **body** | [**Trigger**](Trigger.md)| Trigger data to merge into current value. |

### Return type

[**Trigger**](Trigger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

