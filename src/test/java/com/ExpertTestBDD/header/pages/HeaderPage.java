package com.ExpertTestBDD.header.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ExpertTestBDD.utils.Setup;

public class HeaderPage {
	
	WebDriver driver;

	public HeaderPage() {
		
		driver = Setup.driver;
	}
	
	
	public static final String sloganH = "Le meilleure choix pour réussir";
	
	public static final String telP = "+216 29 674 204";
	public static final String telF = "+216 71 757 591";
	public static final String mailHeader = "commercial@expertunisie.com";

    /* ********************* */
	
	final static String sloganHeader = "//li[@class='slogan']";
	final static String telFix = "//a[contains(text(),'+216  71 757 591')]";
	final static String telPortable ="//a[contains(text(),'+216 29 674 204')]";
	final static String mail = "//a[contains(text(),'commercial@expertunisie.com')]";
	final static String facebookIcone = "//a[@title=\"Facebook\"]";
	final static String youTubeIcone = "//a[@title=\"YouTube\"]";
	final static String linkedInIcone = "//a[@title=\"LinkedIn\"]";
	final static String instagramIcone = "//a[@title=\"Instagram\"]";
	
	/********************************************************************************************************************/

	/* @FindBy */
	
	@FindBy(how = How.XPATH, using = sloganHeader)
	public static WebElement slogan;
	
	@FindBy(how = How.XPATH, using = telFix)
	public static WebElement fix;
	
	@FindBy(how = How.XPATH, using = telPortable)
	public static WebElement portable;
	
	
	@FindBy(how = How.XPATH, using = mail)
	public static WebElement email;
	
	@FindBy(how = How.XPATH, using = facebookIcone )
	public static WebElement facebook;
	
	@FindBy(how = How.XPATH, using = youTubeIcone )
	public static WebElement youtube;
	
	@FindBy(how = How.XPATH, using = linkedInIcone )
	public static WebElement linkedIn;
	
	@FindBy(how = How.XPATH, using = instagramIcone )
	public static WebElement instagram;
	

	/********************************************************************************************************************/
	
	/* Method */
	
	
	public void goTosocialMedia() {
		
		
		facebook.click();
		youtube.click();
		linkedIn.click();
		instagram.click();


		
	}


}
