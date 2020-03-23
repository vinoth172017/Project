$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Productstores.feature");
formatter.feature({
  "line": 1,
  "name": "Product_Store",
  "description": "",
  "id": "product-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "To delete a product",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Tc01_DeleteCart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user opens Product store homepages",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks cart",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "delete the product in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteCartStep.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 7517232500,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCartStep.user_opens_Product_store_homepages()"
});
formatter.result({
  "duration": 5091660800,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCartStep.user_clicks_cart()"
});
formatter.result({
  "duration": 4529648600,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCartStep.delete_the_product_in_cart()"
});
formatter.result({
  "duration": 6291160500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "To get price of a specific laptop",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Tc02_SelectLaptop"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User opens Product store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User clicks laptop tab",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User selects a laptop and gets price of specific laptop",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectLaptopStep.user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 1889010800,
  "status": "passed"
});
formatter.match({
  "location": "SelectLaptopStep.user_opens_Product_store_homepage()"
});
formatter.result({
  "duration": 3138891700,
  "status": "passed"
});
formatter.match({
  "location": "SelectLaptopStep.user_clicks_laptop_tab()"
});
formatter.result({
  "duration": 1914191300,
  "status": "passed"
});
formatter.match({
  "location": "SelectLaptopStep.user_selects_a_laptop_and_gets_price_of_specific_laptop()"
});
formatter.result({
  "duration": 7171108600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "To check phone no",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Tc03_To_check_phone_number"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "the user launch chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User opens product Store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User checks if the number is valid",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckForPhoneNumberStep.user_launch_chrome_application()"
});
formatter.result({
  "duration": 1946215200,
  "status": "passed"
});
formatter.match({
  "location": "CheckForPhoneNumberStep.user_opens_product_Store_homepage()"
});
formatter.result({
  "duration": 3386921200,
  "status": "passed"
});
formatter.match({
  "location": "CheckForPhoneNumberStep.user_checks_if_the_number_is_valid()"
});
formatter.result({
  "duration": 3225956600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "To get the product description",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Tc04_To_get_description"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user launch chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "The User opens product Store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User gets the description of the specific product",
  "keyword": "Then "
});
formatter.match({
  "location": "DescriptionStep.user_launch_chrome_application()"
});
formatter.result({
  "duration": 2076906400,
  "status": "passed"
});
formatter.match({
  "location": "DescriptionStep.the_User_opens_product_Store_homepage()"
});
formatter.result({
  "duration": 4900919300,
  "status": "passed"
});
formatter.match({
  "location": "DescriptionStep.user_gets_the_description_of_the_specific_product()"
});
formatter.result({
  "duration": 5358949000,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "",
  "description": "To add more than one product to cart",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@Tc05_To_add_two_product"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "The User open product Store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user need to check whether the added product is available in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckForTwoProductStep.launch_the_chrome_application()"
});
formatter.result({
  "duration": 1931796300,
  "status": "passed"
});
formatter.match({
  "location": "CheckForTwoProductStep.the_User_open_product_Store_homepage()"
});
formatter.result({
  "duration": 5013517100,
  "status": "passed"
});
formatter.match({
  "location": "CheckForTwoProductStep.user_need_to_check_whether_the_added_product_is_available_in_cart()"
});
formatter.result({
  "duration": 30121253100,
  "status": "passed"
});
});