package com.ExpertTestBDD.accueil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ExpertTestBDD.utils.Setup;

public class AccueilPage {
	WebDriver driver;

	public AccueilPage() {
		driver = Setup.driver;
	}

	final static String BUTTON_COMMENCER = "slide-1-layer-5";
	final static String BUTTON_ACHETER = "slide-10-layer-6";
	final static String BUTTON_PASSER_QUIZ = "slide-12-layer-1";
	final static String TXT_MON_COMPTE = "Subheader";
	
	/* @FindBy */
	
	@FindBy(how = How.ID, using = BUTTON_COMMENCER)
	public static WebElement btnCommencer;
	@FindBy(how = How.ID, using = BUTTON_ACHETER)
	public static WebElement btnAcheter;
	@FindBy(how = How.ID, using = BUTTON_PASSER_QUIZ)
	public static WebElement btnPasserQuiz;
	@FindBy(how = How.ID, using = TXT_MON_COMPTE)
	public static WebElement txtMonCompte;

	/* Method */
	public void goToCommencer() {
		btnCommencer.click();
	}
	
	public void goToBoutique() {
		btnAcheter.click();
	}
	
	public void goToQuiz() {
		btnPasserQuiz.click();
	}
	

}
