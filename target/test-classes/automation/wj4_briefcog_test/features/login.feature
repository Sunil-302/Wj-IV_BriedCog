#Feature: verifying the login add examinee and add examiner features


Feature: verifying the Wj4 Brief Cog features



 
  Background: Login to Wj4 BriedCog product
    Given Iam at the login page
    When i give the "WJ4BriefCog05.P5746" and "Test@100" and click on Signin button
    And I will click on the wj4BriefCog tyle
    Then I will be seeing the Wj4 Dashboard page
   
    
   
  Scenario: Login to Wj4 BriedCog product Organization Management
    When i will click on the "Organization Management" and then "Locations" then i will be at "Locations" page
    
  Scenario: Login to Wj4 BriedCog product Block Management
    When i will click on the "Block Management" and then "Block Creation" then i will be at "Block Creation" page
    
   Scenario: Login to Wj4 BriedCog product Examiner Management
    When i will click on the "Examiner Management" and then "Add Examiner" then i will be at "Add Examiner" page
    And lets get the text fields
  @main  
  Scenario: Login to Wj4 BriedCog product Examinee Management
    When i will click on the "Examinee Management" and then "Add Examinee" then i will be at "Add Examinee" page
    And i will select GENDER IDENTITY option as "Male"
    And Demographics/Programs PAge
    
  Scenario: Login to Wj4 BriedCog product Report
    When i will click on the "Reports" and then "Report Center" then i will be at "Report Center" page      


    
    
   
    
    

  
