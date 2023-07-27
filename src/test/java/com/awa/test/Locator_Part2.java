package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Part2 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/link.html");

        //WebElement clickHereLink = driver.findElement(By.linkText("click here"));
        //WebElement clickHereLink = driver.findElement(By.partialLinkText("here"));
        WebElement seleniumLink = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Selenium']"));
        Thread.sleep(3000);
        seleniumLink.click();
        Thread.sleep(5000);
        driver.close();
    }
}
