package com.ExpertTestBDD.actualite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ExpertTestBDD.utils.Setup;

public class ActualitePage {
	
	WebDriver driver;

	public ActualitePage() {
		
		driver = Setup.driver;
	}
    /* aller et vérifier le titre de la page actualité */
	
	final static String actualiteButton = "menu-item-2716";
	final static String actualiteTitle = "//h1[@class=\"title\"]";
	

	
	/* les liens de la page actualité */
	
	final static String PromoLink = "//a[@href='https://www.expertest.tn/special-promotion/']";
	
	
	/* Bouton charger plus */
	
	final static String chargerPlusButton = "//span[@class='button_label']";
	
	/* Bouton serarch du l'image Spécial promotion  */
	
	final static String promoImg = "//a[@href='https://www.expertest.tn/special-promotion/']";

	final static String searchButton = "//div[@class='post-item isotope-item clearfix author-salah post-10667 post type-post status-publish format-standard has-post-thumbnail hentry category-promotions membership-content access-restricted']//i[@class='icon-search']";
	
	final static String croixImg = "//a[contains(text(),'Close')]";
	
	final static String promoTitle = "//h1[@class=\"title\"]";

	final static String boutiqueTitle = "//h1[@class=\"title\"]";

	final static String promoButton = "//span[@class='button_label']";

	/********************************************************************************************************************/

	/* @FindBy */
	
	@FindBy(how = How.ID, using = actualiteButton)
	public static WebElement btnActualite;
	
	@FindBy(how = How.XPATH, using = actualiteTitle)
	public static WebElement titleActualite;
	
	@FindBy(how = How.XPATH, using = PromoLink)
	public static WebElement specialPromo;
	
	
	@FindBy(how = How.XPATH, using = chargerPlusButton )
	public static WebElement chargerPlus;
	
	@FindBy(how = How.XPATH, using = promoImg )
	public static WebElement imgPromo;
	
	@FindBy(how = How.XPATH, using = searchButton )
	public static WebElement search;
	
	@FindBy(how = How.XPATH, using = croixImg )
	public static WebElement croix;
	
	@FindBy(how = How.XPATH, using = promoTitle )
	public static WebElement titleSP;
	
	@FindBy(how = How.XPATH, using = boutiqueTitle )
	public static WebElement titleBoutique;
	
	@FindBy(how = How.XPATH, using = promoButton )
	public static WebElement promotions;
	/********************************************************************************************************************/
	
	/* Method */
	public void goToActualite() {
		
		
		btnActualite.click();
		
	}
	
	public void goToPicture() throws InterruptedException {

		Actions actions = new Actions(driver);
		actions.moveToElement(imgPromo).perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();
        Thread.sleep(2000);
        
       croix.click();
	}
	
	
	public void specialPromo() {
		
		specialPromo.click();
		
	}
	
   public void goToPromo() {
		
		promotions.click();
		
	}
	
	
	


}
