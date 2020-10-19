# Product


Steps for Running the application:
MySql needs to be installed.
Create database prductdatabase on MySql.


Below Json used to create product.

Validation-
1- retailer name is not null.
2- product bar code length is of fixed size=12
3- product name length min=2 max=20
4- product description length min=20 and max=200



 Json for creating product.
{
	"retailerName":"Reliance",
	"retailerId":"1",
	"productBarCode":"9991006000",
	"productName":"Refrigerator 280 LTR",
	"productDescription":" LG Double Door Refrigerator with 280 Litre capacity",
	"productManufacturerName":"LG",
    "productCategoryName":"Electronics",
	"productSubCategoryName":"Refrigerator",
	"retailPrice":20000.00,
	"wholeSalePrice":18000.00
}


For checking different apis use
http://localhost:9000/swagger-ui.html
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
