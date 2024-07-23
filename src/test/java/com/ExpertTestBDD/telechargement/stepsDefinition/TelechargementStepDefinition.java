package com.ExpertTestBDD.telechargement.stepsDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ExpertTestBDD.telechargement.pages.TelechargementPage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelechargementStepDefinition extends CommonMethods {
	
	public WebDriver driver;
	private TelechargementPage telechargementPage = new TelechargementPage();

public  TelechargementStepDefinition() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, TelechargementPage.class);
		
        }
			
		@Then("^I check the download page$")
		public void i_check_the_download_page() throws Throwable {
				telechargementPage.goToDownload();
	
			
		}
		
		@When("^I access agil scrum$")
		public void i_access_agil_scrum() throws Throwable {
		 			telechargementPage.goToAgilScrum();
					switchToParent();

		}
		
		
		
		@When("^I access IQBBA$")
		public void i_access_IQBBA() throws Throwable {
			telechargementPage.goToIqbba();
			switchToParent();
		    
		}
		
		
		@When("^I access ISTQB$")
		public void i_access_ISTQB() throws Throwable {
			telechargementPage.goToIstqb();
			switchToParent();

		}
		
		
		
		@When("^I access ISTQB Test Manager$")
		public void i_access_ISTQB_Test_Manager() throws Throwable {
			
			telechargementPage.goToIstqbTM();
			switchToParent();

		}
		
		
		
		@When("^I access selenium$")
		public void i_access_selenium() throws Throwable {
		  
			telechargementPage.goToSelenium();
			switchToParent();
		}
		


}
