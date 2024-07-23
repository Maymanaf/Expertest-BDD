@Nos-Promotions
Feature: AccueilNosPromos - Expertest
  As a user I want to access the Home page

  Background: 
    Given I navigates to ExpertTest
    Then I check the home page
 
 
 
  @accueil-Nos-Promotions-ISTQB-Foundation
  
  Scenario: check Section Discover our promotions Voucher de certification ISTQB Foundation
    When I click on the image Voucher de certification ISTQB Foundation
    Then I check Page product Voucher de certification ISTQB Foundation is opening "https://www.expertest.tn/product/voucher-de-certification-istqb-foundation/"
    And  I check Page product Voucher de certification ISTQB Foundation contains "Voucher de certification ISTQB Foundation"

  @accueil-Nos-Promotions-Voucher-A4Q-Sélénium
  
   Scenario: check Section Discover our promotions Voucher A4Q Sélénium
    When I click on the image Voucher  Sélénium
  Then I check Page product Voucher  Sélénium is opening "https://www.expertest.tn/product/a4q-certification-selenium-testeur_niveau-fondation/"
    And  I check Page product Voucher  Sélénium contains "Voucher A4Q Sélénium"
    
      @accueil-Nos-Promotions-Voucher-Test-Manager
      
   Scenario: check Section Discover our promotions Voucher ISTQB Test Manager Niveau avancé
    When I click on the image Voucher ISTQB Test Manager Niveau avancé
  Then I check Page product Voucher ISTQB Test Manager Niveau avancé "https://www.expertest.tn/product/voucher-istqb-niveau-avance-test-manager/"
    And  I check Page product Voucher ISTQB Test Manager Niveau avancé contains "Voucher ISTQB Test Manager Niveau avancé"

       @accueil-Nos-Promotions-Voucher-ISTQB®-Business-Analyste
          
   Scenario: check Section Discover our promotions Voucher IQBBA Business Analyste
    When I click on the image Voucher IQBBA Business Analyste
  Then I check Page product Voucher IQBBA Business Analyste "https://www.expertest.tn/product/voucher-iqbba-business-analyste-niveau-foundation/"
    And  I check Page product Voucher IQBBA Business Analyste contains "Voucher IQBBA Business Analyste"
    
     @accueil-Nos-Promotions-Voucher-IQBBA-TESTEUR-AGILE
          
   Scenario: check Section Discover our promotions Voucher ISTQB® – TESTEUR AGILE
    When I click on the image Voucher ISTQB® – TESTEUR AGILE
  Then I check Page product Voucher ISTQB® – TESTEUR AGILE "https://www.expertest.tn/product/voucher-istqb-testeur-agile/"
    And  I check Page product Voucher ISTQB® – TESTEUR AGILE contains "Voucher ISTQB® – TESTEUR AGILE"