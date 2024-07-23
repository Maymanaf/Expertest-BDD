 @Actualite 
Feature: access the news page
  I want to access the news page
  
    Background:
     Given I navigates to ExpertTest
	   Then I check the home page
	   When I click the news page
	   
 @SpecialPromotion  
  Scenario: access the special promotion page
      Then I should see "Actualité"
	    And I shoud see the picture of special promotion 
	    And I click on special promotion link
	    Then I should see "Spécial promotion"
	    When I press Promotions
      Then I should see Boutique page
    
