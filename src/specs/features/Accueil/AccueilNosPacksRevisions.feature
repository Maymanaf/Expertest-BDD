@Nos-Packs-Revisions
Feature: Accueil Nos Packs de Revision - Expertest
  As a user I want to access the Packs
  Background:
    Given I navigates to ExpertTest
    Then I check the home page
  @accueil-Nos-Packs-Revision-A4Q-Sélénium
  Scenario: check Section Discover our Packs de revision A4Q Sélénium
    When I click on the image Packs de revision  Sélénium
    Then I check Page product Packs de revision  Sélénium is opening "https://www.expertest.tn/product/pack-de-revision-a4q-selenium-niveau-fondation/"
    And I check Page product Packs de revision  Sélénium contains "Pack de révision : A4Q Sélénium Niveau Fondation"
  @accueil-Nos-Packs-Revision-ISTQB®-Business-Analyste
  Scenario: check Section Discover our Packs de revision IQBBA Business Analyste
    When I click on the image Packs de revision IQBBA Business Analyste
    Then I check Page product Packs de revision IQBBA Business Analyste "https://www.expertest.tn/product/pack-de-revision-iqbba_-business-analyste/"
    And I check Page product Packs de revision IQBBA Business Analyste contains "Pack de révision IQBBA_ Business Analyste"
  @accueil-Nos-Packs-Revision-Test-Manager
  Scenario: check Section Discover our Packs de revision ISTQB Test Manager Niveau avancé
    When I click on the image Packs de revision ISTQB Test Manager Niveau avancé
    Then I check Page product Packs de revision ISTQB Test Manager Niveau avancé "https://www.expertest.tn/product/pack-de-revision-test-manager-niveau-avance/"
    And I check Page product Packs de revision ISTQB Test Manager Niveau avancé contains "Pack de révision Test Manager Niveau Avancé"
 @accueil-Nos-Packs-ISTQB-Foundation
  Scenario: check Section Discover our Packs de revision ISTQB Foundation
    When I click on the image Packs de revision ISTQB Foundation
    Then I check Page product Packs de revision ISTQB Foundation is opening "https://www.expertest.tn/product/pack-de-revision-istqb-niveau-fondation/"
    And I check Page product Packs de revision ISTQB Foundation contains "Pack de révision ISTQB Niveau Fondation"