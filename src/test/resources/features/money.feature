Feature: Validation of filling register form
  @money
  Scenario: Check untyped information
    When User goes to Moneygaming home page
    And User clicks on Join Now button
    And User selects a title value from dropdown
    And User enters first_name and last_name
    And User clicks on confirm button
    And User clicks on Join Now button
    Then User checks the validation message "This field is required"
