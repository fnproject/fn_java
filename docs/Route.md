
# Route

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | URL path that will be matched to this route |  [optional]
**image** | **String** | Name of Docker image to use in this route. You should include the image tag, which should be a version number, to be more accurate. Can be overridden on a per route basis with route.image. |  [optional]
**headers** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Map of http headers that will be sent with the response |  [optional]
**memory** | **Integer** | Max usable memory for this route (MiB). |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Route type |  [optional]
**format** | [**FormatEnum**](#FormatEnum) | Payload format sent into function. |  [optional]
**config** | **Map&lt;String, String&gt;** | Route configuration - overrides application configuration |  [optional]
**timeout** | **Integer** | Timeout for executions of this route. Value in Seconds |  [optional]
**idleTimeout** | **Integer** | Hot functions idle timeout before termination. Value in Seconds |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SYNC | &quot;sync&quot;
ASYNC | &quot;async&quot;


<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
HTTP | &quot;http&quot;
JSON | &quot;json&quot;



