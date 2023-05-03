@smoke @add_order
Feature: Add Oder
  As user, we would like to be able to create new order

  Background:
    Given the user is on the login page
    And the user logged in with valid credentials
    And the user is on the products page

  Scenario Outline: The user successfully create an order
  This scenario tests that a user is able to successfully create an order by entering valid inputs.
    When the user add the <ProductOrder> product to cart
    And the user click on cart symbol and go to cart page
    Then the user should verify that <Quantity> product is displayed
    And the user click on checkout button
    When the user enters informations: First Name "<FirstName>", Last Name "<LastName>", Zip Code "<Zip/Postal>"
    Then the user click on continue button
    And the user click on finish button
    And the user verify the complete order message "Thank you for your order!"
    Examples:
      | ProductOrder | Quantity | FirstName | LastName | Zip/Postal |
      | 2            | 1        | Christina | Peroume  | 596223     |
      | 4            | 1        | Julie     | Sullivan | 8624CA     |
