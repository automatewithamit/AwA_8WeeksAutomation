package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws  Exception{

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.gmail.com");
        //WebElement emailTextBox = driver.findElement(By.name("identifier"));
        WebElement emailTextBox = driver.findElement(By.id("identifierId"));
        Thread.sleep(5000);
        emailTextBox.sendKeys("automate@gmail.com");
        Thread.sleep(5000);
        //WebElement nextButton = driver.findElement(By.className("VfPpkd-RLmnJb"));
        //nextButton.click();
        //Thread.sleep(5000);

//We wanted to take all the webelements which has g tag
        WebElement googleTagElement = driver.findElement(By.tagName("g"));


        driver.close();

    }

}
