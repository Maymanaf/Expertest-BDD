Feature: Access to Apropos page
 
  I want to access to A propos page 
@apropos
 Scenario: Access to A propos
 
    Given I navigates to ExpertTest
    When  I click on Apropos menu
    Then  I click on StartupAct link 
    And I check the startupact site"https://startup.gov.tn/fr"
    Then I click on gasq link 
    And I check gasq site "https://www.gasq.org/fr/accueil.html"
    Then I click on pearsonvue link 
    And I check peahrsonvue site  "https://home.pearsonvue.com/"
    
   