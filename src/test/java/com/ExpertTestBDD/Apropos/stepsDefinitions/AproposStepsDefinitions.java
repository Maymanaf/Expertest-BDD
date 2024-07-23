package com.ExpertTestBDD.Apropos.stepsDefinitions;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ExpertTestBDD.Apropos.pages.AproposPage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AproposStepsDefinitions extends CommonMethods {
	
private CommonMethods commonMethods = new CommonMethods();

	 WebDriver driver;
	private AproposPage aproposPage = new AproposPage();
	public  AproposStepsDefinitions() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, AproposPage.class);
        }
	
	@When("^I click on Apropos menu$")
	public void iClickOnAproposMenu() throws Throwable {
	
		 logger.info("^I access to A propos page $");
	     aproposPage.goToApropos();
	
	}

	@Then("^I click on StartupAct link$")
	public void iClickOnStartupActLink() throws Throwable {
		 logger.info("^I access to Startup Act site $");
		 scrollerBottomdown(2400);
		 aproposPage.goToStartupActTunisie();
		 commonMethods.switchHandles(1);	
		 
	}
	@Then("^I check the startupact site\"([^\"]*)\"$")
	public void i_check_the_startupact_site(String url) throws Throwable {
		
		 logger.info("^I Check startup Act site$");
		 String actualUrl= driver.getCurrentUrl();
		 assertEquals(actualUrl,url);
		 commonMethods.switchHandles(0);
	}

	
	@Then("^I click on gasq link$")
	public void i_click_on_gasq_link() throws Throwable {
		
		 logger.info("^I access to GASQ  site $");
	
		 aproposPage.goToGasg();
		commonMethods.switchHandles(2);	
		 
	}

	@Then("^I check gasq site \"([^\"]*)\"$")
	public void i_check_gasq_site(String url2) throws Throwable {
		 logger.info("^I Check GASQ site$");
		 String actualUrl= driver.getCurrentUrl();
		 assertEquals(actualUrl,url2); 
		 commonMethods.switchHandles(0);

	}


	@Then("^I click on pearsonvue link$")
	public void i_click_on_pearsonvue_link() throws Throwable {
		 logger.info("^I access to Pearsonvue  site$");
		 scrollerBottomdown(2400);
	     aproposPage.goToPersonvue();
	     commonMethods.switchHandles(3);	
	
	}

	@Then("^I check pearsonvue site  \"([^\"]*)\"$")
	public void i_check_pearsonvue_site(String url3) throws Throwable {
		 logger.info("^I Check Pearsonvue site$");
		 String actualUrl= driver.getCurrentUrl();
		 assertEquals(actualUrl,url3); 
		 commonMethods.switchHandles(0);
	}
}

