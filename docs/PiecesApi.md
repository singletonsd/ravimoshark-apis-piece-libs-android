# PiecesApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPieceById**](PiecesApi.md#getPieceById) | **GET** /pieces/{refArticle} | Get one piece.
[**getPieces**](PiecesApi.md#getPieces) | **GET** /pieces | Get all pieces.

<a name="getPieceById"></a>
# **getPieceById**
> Pieces getPieceById(refArticle, deleted)

Get one piece.

Get one piece.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.piece.ApiClient;
//import com.ravimoshark.apis.piece.ApiException;
//import com.ravimoshark.apis.piece.Configuration;
//import com.ravimoshark.apis.piece.auth.*;
//import com.ravimoshark.apis.piece.calls.PiecesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


// Configure OAuth2 access token for authorization: main_auth
OAuth main_auth = (OAuth) defaultClient.getAuthentication("main_auth");
main_auth.setAccessToken("YOUR ACCESS TOKEN");

PiecesApi apiInstance = new PiecesApi();
String refArticle = "refArticle_example"; // String | reference of piece to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Pieces result = apiInstance.getPieceById(refArticle, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PiecesApi#getPieceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refArticle** | **String**| reference of piece to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Pieces**](Pieces.md)

### Authorization

[api_key](../README.md#api_key)[bearer_auth](../README.md#bearer_auth)[main_auth](../README.md#main_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPieces"></a>
# **getPieces**
> InlineResponse2001 getPieces(skip, limit, orderBy, filterBy, deleted, metadata, category)

Get all pieces.

Get all pieces.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.piece.ApiClient;
//import com.ravimoshark.apis.piece.ApiException;
//import com.ravimoshark.apis.piece.Configuration;
//import com.ravimoshark.apis.piece.auth.*;
//import com.ravimoshark.apis.piece.calls.PiecesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


// Configure OAuth2 access token for authorization: main_auth
OAuth main_auth = (OAuth) defaultClient.getAuthentication("main_auth");
main_auth.setAccessToken("YOUR ACCESS TOKEN");

PiecesApi apiInstance = new PiecesApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
Categories category = new Categories(); // Categories | category of desired product.
try {
    InlineResponse2001 result = apiInstance.getPieces(skip, limit, orderBy, filterBy, deleted, metadata, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PiecesApi#getPieces");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)[bearer_auth](../README.md#bearer_auth)[main_auth](../README.md#main_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

