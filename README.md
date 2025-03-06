### **Selenium Test Automation Project (Page Object Model)**

This project is a test automation framework built using Selenium, TestNG, and Page Object Model (POM) design pattern.

### **Quick Start Guide**

### **Prerequisites**

- Java JDK 8 or later

- Maven

- IDE (like IntelliJ IDEA, Eclipse)

- Google Chrome 

- Ensure browser drivers (like ChromeDriver) are installed and configured.

How to Use
1. Clone the repository:
 ```console 
  git clone https://github.com/Jasmine3014/Web-Automation-Task.git
```
2. Install dependencies:
 ```console 
  mvn clean install
```
3. Run the tests:
 ```console 
 mvn test
```
### **Test Cases**

1️⃣ Login Functionality Test 

### **Scenario: Verify login with valid and invalid credentials.**

### **Steps:**
1. Navigate to saucedemo.com.
2. Enter valid credentials:
3. Username: standard_user
4. Password: secret_sauce
5. Click the Login button.

- Verify successful login by checking for the Products page.

### **Negative Cases:**

- Incorrect username/password (e.g., wrong_user / secret_sauce).


2️⃣ Add to Cart Functionality 

### **Scenario: Verify that products can be added to the cart.**

### **Steps:**

1. Login with valid credentials.
2. Add the first two products to the cart by clicking Add to cart.
3. Click the cart icon to view the cart.

Verify that both products are present in the cart.

### **Edge Cases:**

- Add and remove items two times.
- Verify cart badge count updates correctly.


3️⃣ Checkout Process Validation 

### **Scenario: Automate the full checkout process.**

### **Steps:**

1. Login with valid credentials.
2. Add a product to the cart.
3. Click the cart icon and proceed to checkout.
4. Enter checkout information:
5. First Name: John
6. Last Name: Doe
7. Postal Code: 12345
8. Click Continue and verify the correct item appears in the summary.
9. Complete the order by clicking Finish.

- Verify the success message: “Thank you for your order!”


4️⃣ Sorting Products Validation 🔄

### **Scenario: Verify the sorting functionality for products.**

### **Steps:**

1. Login to the application.
2. Use the “Sort by” dropdown to sort products:
3. Price (low to high)
4. Price (high to low)
5. Name (A to Z)
6. Name (Z to A)

- Verify that the products are displayed in the correct order based on the selected option.

5️⃣ Logout Functionality Test 

### **Scenario: Verify that the logout process works correctly.**

### **Steps:**

1. Login with valid credentials.
2. Click the hamburger menu (☰) in the top-left corner.
3. Click Logout.

- Verify that the user is redirected to the login page.



6️⃣ Locked-Out User Validation 

### **Scenario: Ensure that a locked-out user cannot log in.**

### **Steps:**

1. Go to the login page.
2. Enter the credentials:
3. Username: locked_out_user
4. Password: secret_sauce
5. Click Login.

- Verify the error message: “Sorry, this user has been locked out.”

7️⃣ Cart Badge Count Validation 

### **Scenario: Verify that the cart badge updates correctly.**

### **Steps:**

1. Login to the app.
2. Add multiple products to the cart.

- Verify the cart badge shows the correct item count.
- Remove an item and verify the badge updates accordingly.


