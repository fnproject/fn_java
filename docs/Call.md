
# Call

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Call ID. |  [optional]
**status** | **String** | Call execution status. |  [optional]
**error** | **String** | Call execution error, if status is &#39;error&#39;. |  [optional]
**appId** | **String** | App ID of fn that executed this call. |  [optional]
**fnId** | **String** | Fn ID of fn that executed this call. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when call was submitted. Always in UTC. |  [optional]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when call started execution. Always in UTC. |  [optional]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when call completed, whether it was successul or failed. Always in UTC. |  [optional]
**stats** | [**List&lt;Stat&gt;**](Stat.md) | A histogram of stats for a call, each is a snapshot of a calls state at the timestamp. |  [optional]



