# CategoriesApi

All URIs are relative to *http://localhost:8003*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | Get all categories.

<a name="getCategories"></a>
# **getCategories**
> InlineResponse200 getCategories(skip, limit, orderBy, filterBy, deleted, metadata, category)

Get all categories.

Get all categories.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.piece.ApiException;
//import com.ravimoshark.apis.piece.calls.CategoriesApi;


CategoriesApi apiInstance = new CategoriesApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
Categories category = new Categories(); // Categories | category of desired product.
try {
    InlineResponse200 result = apiInstance.getCategories(skip, limit, orderBy, filterBy, deleted, metadata, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| number of item to skip | [optional]
 **limit** | **Integer**| max records to return | [optional]
 **orderBy** | **String**| order by property. | [optional]
 **filterBy** | **String**| filter data. | [optional]
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]
 **metadata** | **Boolean**| If metadata is needed (for pagination controls) | [optional]
 **category** | [**Categories**](.md)| category of desired product. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

