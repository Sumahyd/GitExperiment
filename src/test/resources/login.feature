Feature: login scenarios

  @login
  Scenario: login positive ways
    Given enter url
    When enter username and password
    Then login successful
