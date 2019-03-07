@1
Feature: All Tests

  Scenario: Google Search
   Given Environemnt is ready
    When got to the Website "https://www.google.com"
    And search "Lap-top" keyword
    Then Close the browser
    * Test Ended
    But print "Muhtar" on the console.
    Then print "Mahmut" on the console.