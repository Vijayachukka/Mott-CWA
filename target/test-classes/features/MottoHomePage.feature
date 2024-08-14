@regressionpack
Feature: Test to Navigate to Mottomac Homepage and verify the details
  @smoketest
  Scenario: Test to Navigate to Mottomac Home page and verify the details
    Given Open the Mottomac website
    And Accept the cookies
    When Click on the Mott Homepage
    Then HomePage is displayed

    @loadPage
  Scenario: Test to submit the details in Transformation-Change page and verify the details
    Given Open the Mottomac website
    When Click on the Mott Homepage
    Then HomePage is displayed
    Given Click on the "Digital" section
    And Click on the "Services" link
    And Scroll to the Transformation "Change" section
    When click on the Transformation "Change" section
    And Enter the first name as "Vijay"
    And Enter the Surname as "Chukka"
    And Enter the Email address as "Vijayachukka@gmail.com"
    And Select the Service as "Select all" from dropdown list
    When click on the Send now button
    Then Form should be submitted successfully
