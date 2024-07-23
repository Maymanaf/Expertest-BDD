package com.ExpertTestBDD.MonCompte.stepsDefinitions;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.ExpertTestBDD.MonCompte.pages.MonComptePage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class MonCompteStepsDefinitions extends CommonMethods {
    
       private CommonMethods commonMethods = new CommonMethods();
        WebDriver driver;
        private MonComptePage monComptePage = new MonComptePage();
        public  MonCompteStepsDefinitions() {
            
            driver = Setup.driver;
            PageFactory.initElements(driver, MonComptePage.class);
            }
    
@When("^i click on Mon compte menu$")
public void i_click_on_Mon_compte_menu() throws Throwable {
    monComptePage.goToMonCompte();
}
@Then("^I enter username \"([^\"]*)\"$")
public void i_enter_username(String arg1) throws Throwable {
    monComptePage.ajoutUsername(arg1);
}
@Then("^I enter a password \"([^\"]*)\"$")
public void i_enter_a_password(String arg1) throws Throwable {
    monComptePage.ajoutPassword(arg1);
}
@Then("^I click on identification button$")
public void i_click_on_identification_button() throws Throwable {
    monComptePage.Login();
}
@Then("^I check the dashbord \"([^\"]*)\"$")
public void i_check_the_dashbord(String arg1) throws Throwable {
}
@When("^I click on Mon compte menu for wrong credentiials$")
public void i_click_on_Mon_compte_menu_for_wrong_credentiials() throws Throwable {
     monComptePage.goToMonCompte();
}
@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
     monComptePage.ajoutUsername(arg1);
     monComptePage.ajoutPassword(arg2);
}
@When("^I click on identification button for wrong credentials$")
public void i_click_on_identification_button_for_wrong_credentials() throws Throwable {
	
	 monComptePage.Login();
}

@Then("^I check message as \"([^\"]*)\"$")
public void i_check_message_as(String arg) throws Throwable {
    	
	  
}
//test registration


@When("^I click on Mon compte menu for new registration$")
public void i_click_on_Mon_compte_menu_for_new_registration() throws Throwable {
	
	 monComptePage.goToMonCompte();
}

@When("^I enter email as \"([^\"]*)\"$")
public void i_enter_email_as(String arg1) throws Throwable {
    monComptePage.ajoutEmail(arg1);
}

@When("^i click on recaptcha checkbox$")
public void i_click_on_recaptcha_checkbox() throws Throwable {
	switchtocaptchaframe("//iframe");
	monComptePage.checkBox();
    ReturnTodDefaultFrame() ;
}

@When("^I click on register button$")
public void i_click_on_register_button() throws Throwable {
	
	
	monComptePage.register();

}

@Then("^I check \"([^\"]*)\"$")
public void i_check(String arg1) throws Throwable {
   }















        
}



















