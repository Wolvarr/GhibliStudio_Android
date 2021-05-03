# FilmsApi

All URIs are relative to *https://ghibliapi.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filmsGet**](FilmsApi.md#filmsGet) | **GET** films | Return all films
[**filmsIdGet**](FilmsApi.md#filmsIdGet) | **GET** films/{id} | Film ID


<a name="filmsGet"></a>
# **filmsGet**
> List&lt;Films&gt; filmsGet(fields, limit)

Return all films

The Films endpoint returns information about all of the Studio Ghibli films. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilmsApi;


FilmsApi apiInstance = new FilmsApi();
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
Long limit = 789L; // Long | amount of results (default 50) (maximum 250)
try {
    List<Films> result = apiInstance.filmsGet(fields, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilmsApi#filmsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]
 **limit** | **Long**| amount of results (default 50) (maximum 250) | [optional]

### Return type

[**List&lt;Films&gt;**](Films.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filmsIdGet"></a>
# **filmsIdGet**
> List&lt;Films&gt; filmsIdGet(id, fields)

Film ID

Returns a film based on a single ID 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FilmsApi;


FilmsApi apiInstance = new FilmsApi();
String id = "id_example"; // String | film `id`
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
try {
    List<Films> result = apiInstance.filmsIdGet(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilmsApi#filmsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| film &#x60;id&#x60; |
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]

### Return type

[**List&lt;Films&gt;**](Films.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

