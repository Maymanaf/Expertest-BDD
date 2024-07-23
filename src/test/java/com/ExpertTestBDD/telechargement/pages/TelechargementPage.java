package com.ExpertTestBDD.telechargement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ExpertTestBDD.utils.Setup;

public class TelechargementPage {
	
	WebDriver driver;

	public TelechargementPage() {
		
		driver = Setup.driver;
	}
	
	final static String downloadButton = "menu-item-2994";


	final static String agil_scrum = "ui-id-1";
	final static String IQBBA = "ui-id-2";
	final static String ISTQB = "ui-id-3";
	final static String ISTQB_Test_Manager = "ui-id-4";
	final static String Selenium = "ui-id-5";
	
	final static String agil_scrumLink = "//a[@href='https://www.expertest.tn/wp-content/uploads/2021/04/Agile-Syllabus-FR.pdf\']";
	final static String iqbbaLink = "//a[@href='https://www.expertest.tn/wp-content/uploads/2021/04/IQBBA-CFLBA-Syllabus-v.-3.0_Fr.pdf\']";
	final static String istqbLink = "//a[@href='https://www.expertest.tn/wp-content/uploads/2021/06/Syllabus-niveaau-fondation-2018-FR.pdf\']";
	final static String istqbTMLink = "//a[@href='https://www.expertest.tn/wp-content/uploads/2021/06/Syllabus-Niveau-Avance-test-manager.pdf\']";
	final static String seleniumLink = "//a[@href='https://www.expertest.tn/wp-content/uploads/2021/04/Selenium-syllabus-V-1.0-French-1.pdf\']";

	@FindBy(how = How.ID, using = downloadButton)
	public static WebElement btnDownload;
	
	@FindBy(how = How.ID, using = agil_scrum)
	public static WebElement agilScrum;
	
	@FindBy(how = How.ID, using = IQBBA)
	public static WebElement iqbba;
	
	@FindBy(how = How.ID, using = ISTQB)
	public static WebElement istqb;
	
	@FindBy(how = How.ID, using = ISTQB_Test_Manager)
	public static WebElement istqbTM;
	
	@FindBy(how = How.ID, using = Selenium)
	public static WebElement selenium;
	
	@FindBy(how = How.XPATH, using = agil_scrumLink)
	public static WebElement agilScrumSyllabus;
	
	@FindBy(how = How.XPATH, using = iqbbaLink)
	public static WebElement iqqbaSyllabus;
	
	@FindBy(how = How.XPATH, using = istqbLink)
	public static WebElement istqbSyllabus;
	
	@FindBy(how = How.XPATH, using = istqbTMLink)
	public static WebElement istqbTMSyllabus;
	
	@FindBy(how = How.XPATH, using = seleniumLink)
	public static WebElement seleniumSyllabus;
	
	public void goToDownload() {
		
		btnDownload.click();
		
	}
	
	public void goToAgilScrum() {
		
		
		agilScrum.click();
		agilScrumSyllabus.click();
		
	}
	 public void goToIqbba() {
		 iqbba.click();
		 iqqbaSyllabus.click();
	 }
	 
	 public void goToIstqb() {
		 istqb.click();
		 istqbSyllabus.click();
	 }
	 
	 public void goToIstqbTM() {
		 istqbTM.click();
		 istqbTMSyllabus.click();
	 }
	 
	 public void goToSelenium() {
		 selenium.click();
		 seleniumSyllabus.click();
	 }
}
