package com.ExpertTestBDD.MonCompte.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ExpertTestBDD.utils.Setup;
public class MonComptePage {
    
    WebDriver driver;
    public MonComptePage() {
        driver = Setup.driver;
    }
        
    
        final static String TAB_MONCOMPTE = "//span[normalize-space()='Mon Compte']";
        final static String USERNAME_FIELD= "username";
        final static String PASSWORD_FIELD= "password";
        final static String BUTTON_Identification= "login";
        final static String PAGE_DASHBOARD = "//a[normalize-space()='Tableau de bord']";
        final static String ERROR_MESSAGE= "//strong[normalize-space()='Erreur']";
        final static String EMAIL_FIELD= "reg_email";
        final static String CHECKBOX_FIELD= "//div[@class='recaptcha-checkbox-border']";
        final static String BUTTON_registration= "register";
        
    
        /* @FindBy */
        
        @FindBy(how= How.XPATH, using =TAB_MONCOMPTE)
        public static WebElement tabmonCompte;
        
        @FindBy(how= How.ID, using =USERNAME_FIELD)
        public static WebElement username_field ;
        
        
        @FindBy(how= How.ID, using =PASSWORD_FIELD)
        public static WebElement pwd_field ;
        
        @FindBy(how= How.NAME, using =BUTTON_Identification)
        public static  WebElement btn_login ;
        
        @FindBy(how= How.XPATH, using =PAGE_DASHBOARD )
        public static   WebElement dashboard ;  
        
        @FindBy(how= How.XPATH, using =ERROR_MESSAGE)
        public static WebElement fail_mesg ;
        
        @FindBy(how= How.ID, using =EMAIL_FIELD)
        public static WebElement reg_email;
       
        @FindBy(how= How.XPATH, using =CHECKBOX_FIELD)
        public static WebElement checkbox;
    
        @FindBy(how= How.NAME, using =BUTTON_registration)
        public static WebElement btn_register;
            
        /* Method */
        
        public void goToMonCompte() {
           tabmonCompte.click();
               }
        public void ajoutUsername(String username) {
            username_field.sendKeys(username);
         }
        
        public void ajoutPassword(String password) {
            pwd_field.sendKeys(password);
         }
        
        public void Login() {
            btn_login.click();
         }
        
        
        public void ajoutwrongUsername(String username) {
            username_field.sendKeys(username);
        }
        
        public void ajoutwrongPassword(String password) {
            pwd_field.sendKeys(password);
        
        
        }
        public void checkErrorMessage(String message) {
            fail_mesg.sendKeys(message);
        
        
        }
        
        
        public void ajoutEmail(String email) {
            reg_email.sendKeys(email);
        
         }
        
        
        public void checkBox() {
             checkbox.click();
        
        }
        public void register() {
        	btn_register.click();
       
        }
        
}