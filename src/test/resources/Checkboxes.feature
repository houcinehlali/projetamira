Feature: CheckBoxes Page
  Tests for the 'https://the-internet.herokuapp.com/' dropDown page

 
   Background: Open CheckBoxes page
    Given I have navigated to the 'the-internet' "checkboxes" page
    
    Scenario: Verify DropDown page contents are correct
   
    Then the page title is "Checkboxes"