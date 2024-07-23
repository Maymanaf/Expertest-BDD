package com.ExpertTestBDD.actualite.stepsDefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.ExpertTestBDD.actualite.pages.ActualitePage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActualiteStepDefinition extends CommonMethods {
	
	public WebDriver driver;
	private ActualitePage actualitePage = new ActualitePage();
	
	public  ActualiteStepDefinition() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, ActualitePage.class);
		
        }
	@When("^I click the news page$")
	public void iClickTheNewsPage() throws Throwable {
	    
		actualitePage.goToActualite();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void iShouldSee(String titre) throws Throwable {
		
		logger.info("Verification of news page Title ");	
		
		assertEquals(titre,ActualitePage.titleActualite.getText());
		
		logger.info("The title is correct");
	   
	}

	@Then("^I shoud see the picture of special promotion$")
	public void iShoudSeeThePictureOfSpecialPromotion() throws Throwable {
	  
		actualitePage.goToPicture();
	}

	@Then("^I click on special promotion link$")
	public void iClickOnSpecialPromotionLink() throws Throwable {
	    
		actualitePage.specialPromo();
	}


	@Then("^I should see \"([^\"]*)\" page$")
	public void iShouldSeePage(String titrePromo) throws Throwable {
	    
       logger.info("Verification of special promotion page Title ");	
		
		assertEquals(titrePromo,ActualitePage.titleSP.getText());
		
		logger.info("The title is correct");
	}

	@When("^I press Promotions$")
	public void iPress() throws Throwable {
	    
		scrollerBottomdown(200);
		actualitePage.goToPromo();
	}
	
	@Then("^I should see Boutique page$")
	public void i_should_see_Boutique_page() throws Throwable {
	  
		logger.info("Verification of Boutique page Title ");	
			
		assertEquals("Boutique",ActualitePage.titleBoutique.getText());
			
		logger.info("The title is correct");
	}

	
}
