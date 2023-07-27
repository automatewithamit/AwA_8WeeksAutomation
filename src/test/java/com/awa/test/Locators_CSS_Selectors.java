package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CSS_Selectors {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.navigate().to("https://www.google.com/gmail/about/");
        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");

//        WebElement signInButton = driver.findElement(By.xpath("//a[text()='Sign in']"));
//        signInButton.click();
//        Thread.sleep(2000);
        //WebElement emailTextBox = driver.findElement(By.cssSelector("#identifierId"));
//        WebElement emailTextBox = driver.findElement(By.cssSelector("input[id='identifierId']"));
        WebElement companyTextBox = driver.findElement(By.cssSelector("span.input-group-addon.icon.icon-company"));

        Thread.sleep(5000);
        companyTextBox.sendKeys("automate@gmail.com");
        Thread.sleep(5000);
//        WebElement passTextBox = driver.findElement(By.xpath("//input[@name='Password']"));
//        passTextBox.sendKeys("Automate");
        driver.close();
    }

}
