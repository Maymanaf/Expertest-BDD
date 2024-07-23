package com.ExpertTestBDD.Apropos.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ExpertTestBDD.utils.Setup;
public class AproposPage {
	
	
	WebDriver driver;

	public AproposPage() {
		driver = Setup.driver;
	}

	final static String TAB_APROPOS = "//a[@href='https://www.expertest.tn/a-propos/']";
	final static String LINK_STARTUPACT= "//a[@title='Startup ACT']//img[@class='scale-with-grid wp-post-image']";
	final static String LINK_GASQ= "//a[@title='gasq']//img[@class='scale-with-grid wp-post-image']";
    final static String LINK_PEARSONVUE= "//img[@src='https://www.expertest.tn/wp-content/uploads/2021/04/pv-150x45.png']";
	final static String SITE_STARTUPACT= "https://www.startupact.tn/accueil.html";
	final static String SITE_GASG= "https://www.gasq.org/fr/accueil.html";
	final static String SITE_PEARSONVUE= "https://home.pearsonvue.com/";
	
	
	
	/* @FindBy */
	
	@FindBy(how= How.XPATH, using =TAB_APROPOS)
	public static WebElement tabApropos;
	
	@FindBy(how= How.XPATH, using =LINK_STARTUPACT)
	public static WebElement startupLink ;
	
	
	@FindBy(how= How.XPATH, using =LINK_GASQ)
	public static WebElement gasqLink ;
	
	@FindBy(how= How.XPATH, using =LINK_PEARSONVUE)
	public static  WebElement personVueLink ;
		

	@FindBy(how= How.LINK_TEXT, using =SITE_STARTUPACT)
	public static WebElement acceuilStartupActTunisie ;
	
	@FindBy(how= How.LINK_TEXT, using =SITE_GASG)
	public static   WebElement AccueilGasq ;
	
	@FindBy(how= How.LINK_TEXT, using =LINK_PEARSONVUE)
	public static WebElement homePearsonVue ;


	
	/* Method */
	
	public void goToApropos() {
		tabApropos.click();
		}

		public void goToStartupActTunisie() {
				startupLink.click();
					}
	public void goToGasg() {
			gasqLink.click();
			}
			public void goToPersonvue() {
				personVueLink.click();
			}
	
	

}

