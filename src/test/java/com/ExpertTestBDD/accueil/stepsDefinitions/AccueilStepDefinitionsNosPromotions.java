package com.ExpertTestBDD.accueil.stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ExpertTestBDD.accueil.pages.AccueilPageNosPromotions;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinitionsNosPromotions extends CommonMethods {
	
	public WebDriver driver;
	private AccueilPageNosPromotions accueilPageNosPromotions = new AccueilPageNosPromotions();
	private CommonMethods commonMethods = new CommonMethods();

	
	public  AccueilStepDefinitionsNosPromotions() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, AccueilPageNosPromotions.class);

		
		
	}
		@When("^I click on the image Voucher de certification ISTQB Foundation$")
		public void i_click_on_the_image_Voucher_de_certification_ISTQB_Foundation() throws Throwable {

			logger.info("^I click on the image Voucher de certification ISTQB Foundation$");
			commonMethods.explicitWaitVisibility(20, AccueilPageNosPromotions.imgVoucherIstqbFondation);
			accueilPageNosPromotions.goToVoucherIstqb_Fondation();

		}

		@Then("^I check Page product Voucher de certification ISTQB Foundation is opening \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_de_certification_ISTQB_Foundation_is_opening(String url) throws Throwable {

			logger.info("^I check Page product Voucher de certification ISTQB Foundation is opening \\\"([^\\\"]*)\\\"$");
			String actualUrl = driver.getCurrentUrl();
			Assert.assertTrue(actualUrl.equals(url));
		}

		@Then("^I check Page product Voucher de certification ISTQB Foundation contains \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_de_certification_ISTQB_Foundation_contains(String txt) throws Throwable {

			Assert.assertTrue(AccueilPageNosPromotions.txtVoucherIstqbFondation.getText().contains(txt));
		}

		@When("^I click on the image Voucher  Sélénium$")
		public void i_click_on_the_image_Voucher_Sélénium() throws Throwable {

			logger.info("^I click on the image Voucher  Sélénium$");
			scrollToElement(driver, AccueilPageNosPromotions.imgVoucherA40Selenium);
			accueilPageNosPromotions.goToVoucherA40Selenium();

		}

		@Then("^I check Page product Voucher  Sélénium is opening \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_Sélénium_is_opening(String url1) throws Throwable {

			logger.info("^I check Page product Voucher  Sélénium is opening \\\"([^\\\"]*)\\\"$");
			Thread.sleep(10);
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(url1, actualUrl);

		}

		@Then("^I check Page product Voucher  Sélénium contains \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_Sélénium_contains(String txt) throws Throwable {
			commonMethods.explicitWaitVisibility(10, AccueilPageNosPromotions.txtVoucherA4qSelenium);
			String texta4Selenium = AccueilPageNosPromotions.txtVoucherA4qSelenium.getText();
			Assert.assertEquals(txt, texta4Selenium);

		}

		@When("^I click on the image Voucher ISTQB Test Manager Niveau avancé$")
		public void i_click_on_the_image_Voucher_ISTQB_Test_Manager_Niveau_avancé() throws Throwable {

			logger.info("^I click on the image Voucher ISTQB Test Manager Niveau avancé$");
			scrollToElement(driver, AccueilPageNosPromotions.imgVoucherTestManager);
			accueilPageNosPromotions.goToVoucherTestManager();
		}

		@Then("^I check Page product Voucher ISTQB Test Manager Niveau avancé \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_ISTQB_Test_Manager_Niveau_avancé(String url1) throws Throwable {

			logger.info("^I check Page product Voucher ISTQB Test Manager Niveau avancé \\\"([^\\\"]*)\\\"$");
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(url1, actualUrl);
		}

		@Then("^I check Page product Voucher ISTQB Test Manager Niveau avancé contains \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_ISTQB_Test_Manager_Niveau_avancé_contains(String txtManager)
				throws Throwable {

			logger.info("^I check Page product Voucher ISTQB Test Manager Niveau avancé contains \\\"([^\\\"]*)\\\"$");
			commonMethods.explicitWaitVisibility(10, AccueilPageNosPromotions.txtTestManager);
			String textTestManager = AccueilPageNosPromotions.txtTestManager.getText();
			Assert.assertEquals(txtManager, textTestManager);
		}

		@When("^I click on the image Voucher IQBBA Business Analyste$")
		public void i_click_on_the_image_Voucher_IQBBA_Business_Analyste() throws Throwable {

			logger.info("^I click on the image Voucher IQBBA Business Analyste$");
			scrollToElement(driver, AccueilPageNosPromotions.imgVoucherIqbbaBusinessAnalyste);
			accueilPageNosPromotions.goToVoucherBusinessAnalyste();
		}

		@Then("^I check Page product Voucher IQBBA Business Analyste \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_IQBBA_Business_Analyste(String url1) throws Throwable {

			logger.info("^I check Page product Voucher IQBBA Business Analyste \\\"([^\\\"]*)\\\"$");
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(url1, actualUrl);
		

		}

		@Then("^I check Page product Voucher IQBBA Business Analyste contains \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_IQBBA_Business_Analyste_contains(String txtIqbba) throws Throwable {

			logger.info("^I check Page product Voucher IQBBA Business Analyste contains \\\"([^\\\"]*)\\\"$");
			commonMethods.explicitWaitVisibility(10, AccueilPageNosPromotions.txtVoucherIqbbaBusinessAnalyste);
			String txtVoucherIqbbaBusinessAnalyste = AccueilPageNosPromotions.txtVoucherIqbbaBusinessAnalyste.getText();
			Assert.assertEquals(txtIqbba, txtVoucherIqbbaBusinessAnalyste);

		}

		@When("^I click on the image Voucher ISTQB® – TESTEUR AGILE$")
		public void i_click_on_the_image_Voucher_ISTQB_TESTEUR_AGILE() throws Throwable {

			logger.info("^I click on the image Voucher ISTQB® – TESTEUR AGILE$");
			scrollToElement(driver, AccueilPageNosPromotions.imgVoucherTesteurAgile);
			accueilPageNosPromotions.goToVoucherTesteurAgile();
		}

		@Then("^I check Page product Voucher ISTQB® – TESTEUR AGILE \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_ISTQB_TESTEUR_AGILE(String url1) throws Throwable {

			logger.info("^I check Page product Voucher ISTQB® – TESTEUR AGILE \\\"([^\\\"]*)\\\"$");
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(url1, actualUrl);
			;

		}

		@Then("^I check Page product Voucher ISTQB® – TESTEUR AGILE contains \"([^\"]*)\"$")
		public void i_check_Page_product_Voucher_ISTQB_TESTEUR_AGILE_contains(String txt) throws Throwable {

			logger.info("^I check Page product Voucher ISTQB® – TESTEUR AGILE contains \\\"([^\\\"]*)\\\"$");
			commonMethods.explicitWaitVisibility(10, AccueilPageNosPromotions.txtVoucherTesteurAgile);
			Assert.assertNotNull(txt, AccueilPageNosPromotions.txtVoucherTesteurAgile.getText());
		}

		
		
		
		
		
	
	
	
	
	
	}

	
	
	
	
	
	
	

