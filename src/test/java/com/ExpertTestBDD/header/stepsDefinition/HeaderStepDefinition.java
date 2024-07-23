package com.ExpertTestBDD.header.stepsDefinition;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ExpertTestBDD.header.pages.HeaderPage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;

import cucumber.api.java.en.When;


public class HeaderStepDefinition extends CommonMethods {
	
	public WebDriver driver;
	private HeaderPage headerPage = new HeaderPage();
	
	public  HeaderStepDefinition() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, HeaderPage.class);
		
        }
	
	@When("^I check the slogan$")
	public void i_check_the_slogan() throws Throwable {

	    logger.info("Verification the slogan ");	
		
		assertEquals(HeaderPage.sloganH,HeaderPage.slogan.getText());
		
		logger.info("The slogan is correct");
	}

	@When("^I check  the mobile number$")
	public void i_check_the_mobile_number() throws Throwable {
		
		 logger.info("Verification the mobile number ");	
			
			assertEquals(HeaderPage.telF,HeaderPage.fix.getText());
			assertEquals(HeaderPage.telP,HeaderPage.portable.getText());

			
			logger.info("The mobile number is correct");
	    
	}

	@When("^I check the mail$")
	public void i_check_the_mail() throws Throwable {

		   logger.info("Verification the email ");	
			
			assertEquals(HeaderPage.mailHeader,HeaderPage.email.getText());
			
			logger.info("The mail is correct");
	}

	@When("^I click on the social media icone$")
	public void i_click_on_the_social_media_icone() throws Throwable {
	  
		headerPage.goTosocialMedia();
	}

}
