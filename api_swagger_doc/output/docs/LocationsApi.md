# LocationsApi

All URIs are relative to *https://ghibliapi.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationsGet**](LocationsApi.md#locationsGet) | **GET** locations | Return all locations
[**locationsIdGet**](LocationsApi.md#locationsIdGet) | **GET** locations/{id} | Location ID


<a name="locationsGet"></a>
# **locationsGet**
> List&lt;Locations&gt; locationsGet(fields, limit)

Return all locations

The Locations endpoint returns information about all of the Studio Ghibli locations. This broadly includes lands, countries, and places. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
Long limit = 789L; // Long | amount of results (default 50) (maximum 250)
try {
    List<Locations> result = apiInstance.locationsGet(fields, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]
 **limit** | **Long**| amount of results (default 50) (maximum 250) | [optional]

### Return type

[**List&lt;Locations&gt;**](Locations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsIdGet"></a>
# **locationsIdGet**
> Object locationsIdGet(id, fields)

Location ID

Returns an individual location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String id = "id_example"; // String | location `id`
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
try {
    Object result = apiInstance.locationsIdGet(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| location &#x60;id&#x60; |
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

