Feature: This feature is to test about login functionality of OrangeHRMS Application

  Scenario: To verify login validation with incorrect credentials.
    Given I login as "Admin" role on OrangeHRMS App
      | Admin | muthu |
    Then Login must be Failure and return the error message "Invalid credentials"


  Scenario: To Verify login validation on OrangeHRMS App
    Given I login as "Admin" role on OrangeHRMS App
      | Admin | admin123 |
    Then Login must be Success
