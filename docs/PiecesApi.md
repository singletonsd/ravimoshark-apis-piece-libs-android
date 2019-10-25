# PiecesApi

All URIs are relative to *http://localhost:8003*

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
//import com.ravimoshark.apis.piece.ApiException;
//import com.ravimoshark.apis.piece.calls.PiecesApi;


PiecesApi apiInstance = new PiecesApi();
Long refArticle = 789L; // Long | reference of piece to delete or search
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
 **refArticle** | **Long**| reference of piece to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Pieces**](Pieces.md)

### Authorization

No authorization required

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
//import com.ravimoshark.apis.piece.ApiException;
//import com.ravimoshark.apis.piece.calls.PiecesApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

