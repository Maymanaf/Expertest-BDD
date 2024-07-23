
@accueil
Feature: Accueil - Expertest
  As a user I want to access the Home page

  Background: 
    Given I navigates to ExpertTest
    Then I check the home page

  @accueil-slider
  Scenario: check buttons and their pages
    When I click on the button Commencez
    Then I check Page Mon Compte is opening
    And I click on the button J achète
    Then I check Page Boutique is opening "https://www.expertest.tn/boutique/"
    And I click on the button passez le quizz
    Then I check Page Quiz is opening "https://www.expertest.tn/quizz/"

