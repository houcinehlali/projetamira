Feature: DropDown Page
  Tests for the 'https://the-internet.herokuapp.com/' dropDown page

 
   Background: Open DropDown page
    Given I have navigated to the 'the-internet' "dropdown" page
    
    Scenario: Verify DropDown page contents are correct
   
    Then the page title is "Dropdown List"
    
    