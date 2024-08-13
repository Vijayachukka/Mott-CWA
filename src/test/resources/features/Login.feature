Feature:
  @login
  Scenario: Test to Navigate to Mottomac Home page and verify the details
    Given Open the Mottomac website
    And Accept the cookies
    When Click on the Mott Homepage
    Then HomePage is displayed
#
#  Scenario: Test to submit the details in Transformation page and verify the message
#    Given Open the Mottomac website
#    And Accept the cookies
#    When Click on the Mott Homepage
#    Then HomePage is displayed
#    Given Click on the Digital section
#    And Click on the Service link
#    And Scroll to the Transformation section
#    When click on the Transformation section
#    Then Find out More window should be displayed
#    And Enter the first name
#    And Enter the Surname
#    And Enter teh Email address
#    And Select the Service from dropdown list
#    When click on the Send now button
#    Then Form should be submitted successfully

