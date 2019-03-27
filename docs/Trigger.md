
# Trigger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Trigger identifier. |  [optional]
**name** | **String** | Unique name for this trigger, used to identify this trigger. |  [optional]
**type** | **String** | Class of trigger, e.g. schedule, http, queue |  [optional]
**source** | **String** | URI path for this trigger. e.g. &#x60;sayHello&#x60;, &#x60;say/hello&#x60; |  [optional]
**fnId** | **String** | Opaque, unique Function identifier |  [optional]
**appId** | **String** | Opaque, unique Application identifier |  [optional]
**annotations** | **Map&lt;String, Object&gt;** | Trigger annotations - this is a map of annotations attached to this trigger, keys must not exceed 128 bytes and must consist of non-whitespace printable ascii characters, and the seralized representation of individual values must not exeed 512 bytes. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when trigger was created. Always in UTC. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Most recent time that trigger was updated. Always in UTC. |  [optional]



