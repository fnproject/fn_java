/*
 * fn
 * The open source serverless platform.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Error;
import io.swagger.client.model.Fn;
import io.swagger.client.model.FnList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FnsApi {
    private ApiClient apiClient;

    public FnsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FnsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createFn
     * @param body Function data to insert. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFnCall(Fn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFnValidateBeforeCall(Fn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFn(Async)");
        }
        

        com.squareup.okhttp.Call call = createFnCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create A New Function
     * Creates a new Function, returning the complete entity.
     * @param body Function data to insert. (required)
     * @return Fn
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fn createFn(Fn body) throws ApiException {
        ApiResponse<Fn> resp = createFnWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create A New Function
     * Creates a new Function, returning the complete entity.
     * @param body Function data to insert. (required)
     * @return ApiResponse&lt;Fn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fn> createFnWithHttpInfo(Fn body) throws ApiException {
        com.squareup.okhttp.Call call = createFnValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Fn>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create A New Function (asynchronously)
     * Creates a new Function, returning the complete entity.
     * @param body Function data to insert. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFnAsync(Fn body, final ApiCallback<Fn> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createFnValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fn>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteFn
     * @param fnID Opaque, unique Function ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFnCall(String fnID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fns/{fnID}"
            .replaceAll("\\{" + "fnID" + "\\}", apiClient.escapeString(fnID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFnValidateBeforeCall(String fnID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fnID' is set
        if (fnID == null) {
            throw new ApiException("Missing the required parameter 'fnID' when calling deleteFn(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteFnCall(fnID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete A Function
     * Delete the specified Function.
     * @param fnID Opaque, unique Function ID. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFn(String fnID) throws ApiException {
        deleteFnWithHttpInfo(fnID);
    }

    /**
     * Delete A Function
     * Delete the specified Function.
     * @param fnID Opaque, unique Function ID. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFnWithHttpInfo(String fnID) throws ApiException {
        com.squareup.okhttp.Call call = deleteFnValidateBeforeCall(fnID, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete A Function (asynchronously)
     * Delete the specified Function.
     * @param fnID Opaque, unique Function ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFnAsync(String fnID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFnValidateBeforeCall(fnID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getFn
     * @param fnID Opaque, unique Function ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFnCall(String fnID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fns/{fnID}"
            .replaceAll("\\{" + "fnID" + "\\}", apiClient.escapeString(fnID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFnValidateBeforeCall(String fnID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fnID' is set
        if (fnID == null) {
            throw new ApiException("Missing the required parameter 'fnID' when calling getFn(Async)");
        }
        

        com.squareup.okhttp.Call call = getFnCall(fnID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Definition Of A Function
     * Gets the definition for the Function with the specified ID.
     * @param fnID Opaque, unique Function ID. (required)
     * @return Fn
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fn getFn(String fnID) throws ApiException {
        ApiResponse<Fn> resp = getFnWithHttpInfo(fnID);
        return resp.getData();
    }

    /**
     * Get Definition Of A Function
     * Gets the definition for the Function with the specified ID.
     * @param fnID Opaque, unique Function ID. (required)
     * @return ApiResponse&lt;Fn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fn> getFnWithHttpInfo(String fnID) throws ApiException {
        com.squareup.okhttp.Call call = getFnValidateBeforeCall(fnID, null, null);
        Type localVarReturnType = new TypeToken<Fn>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Definition Of A Function (asynchronously)
     * Gets the definition for the Function with the specified ID.
     * @param fnID Opaque, unique Function ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFnAsync(String fnID, final ApiCallback<Fn> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFnValidateBeforeCall(fnID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fn>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listFns
     * @param appId Application ID. (optional)
     * @param cursor Cursor from previous response.next_cursor to begin results after, if any. (optional)
     * @param perPage Number of results to return, defaults to 30. Max of 100. (optional)
     * @param name Function name to filter by (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFnsCall(String appId, String cursor, Integer perPage, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (appId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("app_id", appId));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("per_page", perPage));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listFnsValidateBeforeCall(String appId, String cursor, Integer perPage, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listFnsCall(appId, cursor, perPage, name, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get A list Of Functions Within An Application
     * Get a filtered list of Functions for an Application, in alphabetical order.
     * @param appId Application ID. (optional)
     * @param cursor Cursor from previous response.next_cursor to begin results after, if any. (optional)
     * @param perPage Number of results to return, defaults to 30. Max of 100. (optional)
     * @param name Function name to filter by (optional)
     * @return FnList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FnList listFns(String appId, String cursor, Integer perPage, String name) throws ApiException {
        ApiResponse<FnList> resp = listFnsWithHttpInfo(appId, cursor, perPage, name);
        return resp.getData();
    }

    /**
     * Get A list Of Functions Within An Application
     * Get a filtered list of Functions for an Application, in alphabetical order.
     * @param appId Application ID. (optional)
     * @param cursor Cursor from previous response.next_cursor to begin results after, if any. (optional)
     * @param perPage Number of results to return, defaults to 30. Max of 100. (optional)
     * @param name Function name to filter by (optional)
     * @return ApiResponse&lt;FnList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FnList> listFnsWithHttpInfo(String appId, String cursor, Integer perPage, String name) throws ApiException {
        com.squareup.okhttp.Call call = listFnsValidateBeforeCall(appId, cursor, perPage, name, null, null);
        Type localVarReturnType = new TypeToken<FnList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get A list Of Functions Within An Application (asynchronously)
     * Get a filtered list of Functions for an Application, in alphabetical order.
     * @param appId Application ID. (optional)
     * @param cursor Cursor from previous response.next_cursor to begin results after, if any. (optional)
     * @param perPage Number of results to return, defaults to 30. Max of 100. (optional)
     * @param name Function name to filter by (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFnsAsync(String appId, String cursor, Integer perPage, String name, final ApiCallback<FnList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listFnsValidateBeforeCall(appId, cursor, perPage, name, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FnList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateFn
     * @param fnID Opaque, unique Function ID. (required)
     * @param body Function data to merge with current values. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFnCall(String fnID, Fn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fns/{fnID}"
            .replaceAll("\\{" + "fnID" + "\\}", apiClient.escapeString(fnID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFnValidateBeforeCall(String fnID, Fn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fnID' is set
        if (fnID == null) {
            throw new ApiException("Missing the required parameter 'fnID' when calling updateFn(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFn(Async)");
        }
        

        com.squareup.okhttp.Call call = updateFnCall(fnID, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update A Function
     * Updates a Function via merging the provided values.
     * @param fnID Opaque, unique Function ID. (required)
     * @param body Function data to merge with current values. (required)
     * @return Fn
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fn updateFn(String fnID, Fn body) throws ApiException {
        ApiResponse<Fn> resp = updateFnWithHttpInfo(fnID, body);
        return resp.getData();
    }

    /**
     * Update A Function
     * Updates a Function via merging the provided values.
     * @param fnID Opaque, unique Function ID. (required)
     * @param body Function data to merge with current values. (required)
     * @return ApiResponse&lt;Fn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fn> updateFnWithHttpInfo(String fnID, Fn body) throws ApiException {
        com.squareup.okhttp.Call call = updateFnValidateBeforeCall(fnID, body, null, null);
        Type localVarReturnType = new TypeToken<Fn>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update A Function (asynchronously)
     * Updates a Function via merging the provided values.
     * @param fnID Opaque, unique Function ID. (required)
     * @param body Function data to merge with current values. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFnAsync(String fnID, Fn body, final ApiCallback<Fn> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateFnValidateBeforeCall(fnID, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fn>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
