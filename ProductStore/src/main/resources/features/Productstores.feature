Feature: Product_Store
	
@Tc01_DeleteCart
Scenario: 
	To delete a product
Given the user launch the chrome application
When user opens Product store homepages 
Then user clicks cart
Then delete the product in cart
	
@Tc02_SelectLaptop
Scenario: 
	To get price of a specific laptop
Given user launch the chrome application
When User opens Product store homepage
Then User clicks laptop tab
Then User selects a laptop and gets price of specific laptop

@Tc03_To_check_phone_number
Scenario: 
	To check phone no
Given the user launch chrome application
When User opens product Store homepage
Then User checks if the number is valid
	
@Tc04_To_get_description
Scenario: 
	To get the product description
Given user launch chrome application
When The User opens product Store homepage
Then User gets the description of the specific product
	
@Tc05_To_add_two_product
Scenario: 
	To add more than one product to cart
Given launch the chrome application
When The User open product Store homepage
Then user need to check whether the added product is available in cart
	
