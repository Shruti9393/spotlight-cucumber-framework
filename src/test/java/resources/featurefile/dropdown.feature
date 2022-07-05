Feature: Droppdown  Functionality
  As user i like to check droppdown functionality of Next Up field

  Scenario: Spotlight Test Ticket - Next Up Droppdown  Functionality
    Given I am on home page of pickswise
    When  I click on accpet cookies
    And   I click on All Sports button
    Then I  can see an available list of valid Sports to filter by
  @t1
  Scenario: Spotlight Test Ticket - Varify KBO sport list  Functionality
    Given I am on home page of pickswise
    When  I click on accpet cookies
    And   I click on All Sports button
    And I  can see an available list of valid Sports to filter by
    And I can click KBO sport from droppdown
    Then I should see all KBO sports list

