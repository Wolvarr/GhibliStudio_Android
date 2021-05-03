# PeopleApi

All URIs are relative to *https://ghibliapi.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**peopleGet**](PeopleApi.md#peopleGet) | **GET** people | Return all people
[**peopleIdGet**](PeopleApi.md#peopleIdGet) | **GET** people/{id} | People ID


<a name="peopleGet"></a>
# **peopleGet**
> List&lt;People&gt; peopleGet(fields, limit)

Return all people

The People endpoint returns information about all of the Studio Ghibli people. This broadly includes all Ghibli characters, human and non-. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeopleApi;


PeopleApi apiInstance = new PeopleApi();
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
Long limit = 789L; // Long | amount of results (default 50) (maximum 250)
try {
    List<People> result = apiInstance.peopleGet(fields, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeopleApi#peopleGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]
 **limit** | **Long**| amount of results (default 50) (maximum 250) | [optional]

### Return type

[**List&lt;People&gt;**](People.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="peopleIdGet"></a>
# **peopleIdGet**
> List&lt;People&gt; peopleIdGet(id, fields)

People ID

Returns a person based on a single ID 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeopleApi;


PeopleApi apiInstance = new PeopleApi();
String id = "id_example"; // String | person `id`
String fields = "fields_example"; // String | comma-separated list of fields to include in the response
try {
    List<People> result = apiInstance.peopleIdGet(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeopleApi#peopleIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| person &#x60;id&#x60; |
 **fields** | **String**| comma-separated list of fields to include in the response | [optional]

### Return type

[**List&lt;People&gt;**](People.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

