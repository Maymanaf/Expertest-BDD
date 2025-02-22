package com.ExpertTestBDD.utils;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    public void startService() {
        if (null == chService) {
            try {
                chService = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("src/test/ressources/driver/chromedriver.exe"))
                    .usingAnyFreePort()
                    .build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
       
    }

    @Override
    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    @Override
    public void createDriver() {
    	  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
          ChromeOptions options = new ChromeOptions();
          
         //options.addArguments("test-type");
         
         
          capabilities.setCapability(ChromeOptions.CAPABILITY, options);
          options.addArguments("--allow-running-insecure-content");
        //  options.addArguments("--window-size=1920,1080=''");
          options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
          driver = new ChromeDriver(chService, capabilities);
          driver.manage().window().maximize();
    }

}
