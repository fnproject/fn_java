
# Call

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Call UUID ID. |  [optional]
**status** | **String** | Call execution status. |  [optional]
**error** | **String** | Call execution error, if status is &#39;error&#39;. |  [optional]
**appName** | **String** | App name that is assigned to a route that is being executed. |  [optional]
**path** | **String** | App route that is being executed. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Time when call was submitted. Always in UTC. |  [optional]
**startedAt** | [**DateTime**](DateTime.md) | Time when call started execution. Always in UTC. |  [optional]
**completedAt** | [**DateTime**](DateTime.md) | Time when call completed, whether it was successul or failed. Always in UTC. |  [optional]
**stats** | [**List&lt;Stat&gt;**](Stat.md) | A histogram of stats for a call, each is a snapshot of a calls state at the timestamp. |  [optional]



