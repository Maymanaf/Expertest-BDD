 @connexion
Feature: Mon compte Access 
  I want to navigate to mon compte page 
Background:
   Given I navigates to ExpertTest
   Then I check the home page 

  
# @success
# Scenario: Login to my account 
 #   When i click on Mon compte menu 
#    Then I enter username "mar.maaroufi@gmail.com" 
#    And I enter a password "soft.2021"
#    And  I click on identification button
  #  Then I check the dashbord "https://www.expertest.tn/mon-compte/"
    
# @Fail
#  Scenario Outline: Login to my account
    #Given I navigate to ExpertTest
   # When I click on Mon compte menu for wrong credentiials
   # And I enter username as "<username>" and password as "<password>"
   # And  I click on identification button for wrong credentials
   # Then   I check message as "<message>"
 #  Examples: 
 #     | username               | password  | message                                                                                                     |
#      | mar.maaroufi@gmail     | soft.2021 | Identifiant inconnu. Vérifiez l’orthographe ou essayez avec votre adresse e-mail.                           |
 #     | mar.maaroufi@gmail.com |  soft     | Erreur : le mot de passe que vous avez saisi pour l’adresse e-mail mar.maaroufi@gmail.com est incorrect.    |
  #    |                        |           | Erreur : Identifiant obligatoire.                                                                           |
 
 @registration 
  Scenario Outline: Register to a new account 
    #Given I navigate to ExpertTest
    When I click on Mon compte menu for new registration 
    And I enter email as "<email>"
    And i click on recaptcha checkbox
    And  I click on register button 
    Then I check "<message>" 
    
       Examples: 
     | email                     | message                                                               |
     | mar.maaroufi@gmail.com    | Erreur : Un compte est déjà enregistré avec votre adresse e-mail.     |
     | marwa@yopmail.com         | Erreur : Spam verification failed. Please try again.    |
     |                           | Erreur : Veuillez saisir une adresse de messagerie valide.            |
 