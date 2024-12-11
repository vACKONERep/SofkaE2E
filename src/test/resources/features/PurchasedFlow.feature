Feature: End-to-End Purchase Flow
  As a user of Demoblaze
  I want to automate a purchase flow
  So that I can verify the application's functionality
  @happyPath
  Scenario Outline: Purchase two items from Demoblaze
    Given the user is on the homepage
    When the user adds the "<firstProduct>" to the cart
    When the user handles the pop-up message
    When the user returns to the homepage
    When the user adds the "<secondProduct>" to the cart
    When the user handles the second pop-up message
    When the user views the cart
    When the user clicks the Place Order button
    When the user completes the purchase form with "<name>", "<country>", "<city>", "<card>", "<month>", "<year>"
    When the user clicks the Purchase button
    Then the purchase should be completed successfully

    Examples:
      | firstProduct          | secondProduct       | name       | country | city      | card        | month | year |
      | Samsung galaxy s6     | Nokia lumia 1520   | John Doe   | USA     | New York  | 1234567890  | 12    | 2023 |

