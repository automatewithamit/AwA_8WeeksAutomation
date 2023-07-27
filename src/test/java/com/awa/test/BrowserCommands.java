package com.awa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) throws  Exception{

//      Browser Commands
        //get(url);
        //getCurrentUrl();
        //getTitle();

        //manage().window().fullscreen();
        //manage().window().minimize();

        //opening the browser
        WebDriver driver = new ChromeDriver();

        //driver.navigate().to("http://www.flipkart.com");
        driver.get("http://www.flipkart.com");
        //manage().window().maximize();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Full Screen
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //used to close the browser
        driver.quit(); // interview question --> difference between quit & close
        //quit closes all the tabs opened in the browser and close closes only current tab in the browser
        //driver.close();


    }
}
