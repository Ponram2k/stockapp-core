# stockapp-core


##### Feature 1: Login
  * I have created single user for login username : Admin and password : Admin@1234
  * User validation done by username should contain minimum of 4 character
  * Password Validation done by password should contain,
  	* minimum of 8 character maximum of 20 characters
	* Small and capital Alphabets
	* Some numerical
	* And some special character like [@#$%]
  * Test case 
  	* Username validation
  	* Password validation
  	* Both username and password is correct
  	* Both username and password is wrong
  	* Username is correct but password wrong
  	* Username is wrong but password correct
  
##### Feature 2: Add Stock
  * Add the product in ArrayList
  * Test case
  	* Check the product add in ArrayList
  
##### Feature 3: Display stock
  * Display all the stock present in the ArrayList
  * Test Case
	* To display all the product's in ArrayList

##### Featur 4: Filter stock by item category
  * Filter stock by item category
  * And return filter List
  * Test case
  	* Check it return the correct item category List

##### Feature 5:Get stock list
  * It will return all the product's add in the ArrayList
  * Test case
  	* To check whether the stock list has been return
  	
##### Feature 6: Registration
  * A preson register by there,
  	* User name
  	* Mobile number
  	* Email
  	* Password
  * Each process has a sepetate validation process
  	* User name should be greate than 4 character
  	* Password has been validated as same as login
  	* Email format should be,
  		* digits [0 to 9]
	 	* lower case and upper letters [a to z and A to Z]
	 	* Some special characters
	 	* After @ symbol use domain name for email address with same alphabet and digit's criteria
	 	* Furthermore, the domain name section of the email address may consist of,
     			* digits [0 to 9]
     			* lower case and upper letters [a to z]
	* And there should no Duplicate user
  * Test case
  	* To check the whether the user is added inthe Arreaylist
  	* And to Verify duplicate user should not added in the List
