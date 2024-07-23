package com.ExpertTestBDD.accueil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ExpertTestBDD.utils.Setup;

public class AccueilPageNosPromotions {
	
	WebDriver driver;
	
	public AccueilPageNosPromotions() {
		driver = Setup.driver;
	}
	
	
	final static String TXT_VOUCHER_ISTQB_FONDATION = "//h1[text()='Voucher de certification ISTQB Foundation']";
	final static String IMG_VOUCHER_ISTQB_FONDATION ="ul.shop_slider_ul a:nth-child(1)";
	final static String IMG_VOUCHER_A4Q_SELENIUM ="//a[@href='https://www.expertest.tn/product/a4q-certification-selenium-testeur_niveau-fondation/']";
	final static String TXT_VOUCHER_A4Q_SELENIUM = "//h1[text() ='Voucher A4Q Sélénium']";
	final static String IMG_VOUCHER_Test_Manager ="//a[@href='https://www.expertest.tn/product/voucher-istqb-niveau-avance-test-manager/']";
	final static String IMG_VOUCHER_IQBBA_Business_Analyste ="//a[@href='https://www.expertest.tn/product/voucher-iqbba-business-analyste-niveau-foundation/']";
	final static String IMG_VOUCHER_TESTEUR_AGILE ="//a[@href='https://www.expertest.tn/product/voucher-istqb-testeur-agile/']";
	final static String TXT_VOUCHER_Test_Manager = "//h1[text() ='Voucher ISTQB Test Manager Niveau avancé']";
	final static String TXT_VOUCHER_IQBBA_Business_Analyste = "//h1[text() ='Voucher IQBBA Business Analyste']";
	final static String TXT_VOUCHER_TESTEUR_AGILE = "//h1[text() ='Voucher ISTQB® – TESTEUR AGILE']";

	/* @FindBy */
	
	
	@FindBy(how = How.XPATH, using = TXT_VOUCHER_ISTQB_FONDATION)
	public static WebElement txtVoucherIstqbFondation;
	@FindBy(how = How.CSS, using = IMG_VOUCHER_ISTQB_FONDATION)
	public static WebElement imgVoucherIstqbFondation;
	@FindBy(how = How.XPATH, using = IMG_VOUCHER_A4Q_SELENIUM)
	public static WebElement imgVoucherA40Selenium;
	@FindBy(how = How.XPATH, using = TXT_VOUCHER_A4Q_SELENIUM)
	public static WebElement txtVoucherA4qSelenium;
	@FindBy(how = How.XPATH, using = IMG_VOUCHER_Test_Manager)
	public static WebElement imgVoucherTestManager;
	@FindBy(how = How.XPATH, using = IMG_VOUCHER_IQBBA_Business_Analyste)
	public static WebElement imgVoucherIqbbaBusinessAnalyste;
	@FindBy(how = How.XPATH, using = IMG_VOUCHER_TESTEUR_AGILE)
	public static WebElement imgVoucherTesteurAgile;
	@FindBy(how = How.XPATH, using = TXT_VOUCHER_Test_Manager)
	public static WebElement txtTestManager;
	@FindBy(how = How.XPATH, using = TXT_VOUCHER_IQBBA_Business_Analyste)
	public static WebElement txtVoucherIqbbaBusinessAnalyste;
	@FindBy(how = How.XPATH, using = TXT_VOUCHER_TESTEUR_AGILE)
	public static WebElement txtVoucherTesteurAgile;
	
	/* Method */
	
	public void goToVoucherIstqb_Fondation() {
		imgVoucherIstqbFondation.click();
	}
	
	public void goToVoucherA40Selenium() {
		imgVoucherA40Selenium.click();
	}
	
	public void goToVoucherTestManager() {
		imgVoucherTestManager.click();
	}
	
	public void goToVoucherBusinessAnalyste() {
		imgVoucherIqbbaBusinessAnalyste.click();
	}
	
	public void goToVoucherTesteurAgile() {
		imgVoucherTesteurAgile.click();
	}


}
