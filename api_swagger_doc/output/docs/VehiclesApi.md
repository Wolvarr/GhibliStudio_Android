# VehiclesApi

All URIs are relative to *https://ghibliapi.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vehiclesGet**](VehiclesApi.md#vehiclesGet) | **GET** vehicles | Vehicles
[**vehiclesIdGet**](VehiclesApi.md#vehiclesIdGet) | **GET** vehicles/{id} | Vehicle ID


<a name="vehiclesGet"></a>
# **vehiclesGet**
> List&lt;Vehicles&gt; vehiclesGet(fields, limit)

Vehicles

The Vehicles endpoint returns information about all of the Studio Ghibli vechiles. This includes cars, ships, and planes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
Long limit = 789L; // Long | amount of results (default 50) (maximum 250)
try {
    List<Vehicles> result = apiInstance.vehiclesGet(fields, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#vehiclesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]
 **limit** | **Long**| amount of results (default 50) (maximum 250) | [optional]

### Return type

[**List&lt;Vehicles&gt;**](Vehicles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vehiclesIdGet"></a>
# **vehiclesIdGet**
> List&lt;Vehicles&gt; vehiclesIdGet(id, fields)

Vehicle ID

An individual vehicle

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String id = "id_example"; // String | film `id`
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
try {
    List<Vehicles> result = apiInstance.vehiclesIdGet(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#vehiclesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| film &#x60;id&#x60; |
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]

### Return type

[**List&lt;Vehicles&gt;**](Vehicles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

