package com.awa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args){

        //1. Launch the Browser
        //System.setProperty("webdriver.chrome.driver", "C://Users//DragonWarrior-PC//Downloads//chromedriver_win32 (1)//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //2. Navigate to the Website
        driver.navigate().to("https://facebook.com");



    }


}
