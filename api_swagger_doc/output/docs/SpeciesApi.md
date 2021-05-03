# SpeciesApi

All URIs are relative to *https://ghibliapi.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**speciesGet**](SpeciesApi.md#speciesGet) | **GET** species | Species
[**speciesIdGet**](SpeciesApi.md#speciesIdGet) | **GET** species/{id} | Species ID


<a name="speciesGet"></a>
# **speciesGet**
> List&lt;Species&gt; speciesGet(fields, limit)

Species

The Species endpoint returns information about all of the Studio Ghibli species. This includes humans, animals, and spirits et al. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpeciesApi;


SpeciesApi apiInstance = new SpeciesApi();
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
Long limit = 789L; // Long | amount of results (default 50) (maximum 250)
try {
    List<Species> result = apiInstance.speciesGet(fields, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeciesApi#speciesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]
 **limit** | **Long**| amount of results (default 50) (maximum 250) | [optional]

### Return type

[**List&lt;Species&gt;**](Species.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="speciesIdGet"></a>
# **speciesIdGet**
> List&lt;Species&gt; speciesIdGet(id, fields)

Species ID

Returns an individual species

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpeciesApi;


SpeciesApi apiInstance = new SpeciesApi();
String id = "id_example"; // String | film `id`
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
try {
    List<Species> result = apiInstance.speciesIdGet(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeciesApi#speciesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| film &#x60;id&#x60; |
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]

### Return type

[**List&lt;Species&gt;**](Species.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

