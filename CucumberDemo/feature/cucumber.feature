Feature: login gmail
 

Background: 
   User navigates to gmail
    Given I am on gmail login page 


Scenario: 
 When I enter username as "xyz" 
   And I enter password as "xyz" 
   Then i am nevigated to the login page