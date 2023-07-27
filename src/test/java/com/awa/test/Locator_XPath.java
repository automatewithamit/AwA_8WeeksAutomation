package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Locator_XPath {
    public static void main(String[] args)throws Exception{

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@title='Email']"));

        Thread.sleep(5000);
        emailTextBox.sendKeys("automate@gmail.com");
        Thread.sleep(5000);
        WebElement passTextBox = driver.findElement(By.xpath("//input[@name='Password']"));
        passTextBox.sendKeys("Automate");
        driver.close();
    }
}
