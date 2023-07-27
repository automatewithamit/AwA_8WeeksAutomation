package com.awa.test;

import com.awa.selenium.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    static OrangeHRM orangeHRM = new OrangeHRM();
    public static void main(String[] args) throws Exception {


        orangeHRM.login();



        WebElement myInfoMenuItem = DriverManager.driver.findElement(By.xpath("//a[contains(@href, 'viewMyDetails')]"));

        myInfoMenuItem.click();

        Thread.sleep(3000);

        WebElement maleRadioButton = DriverManager.driver.findElement(By.xpath("//label[text()='Male']/input"));
        boolean isMaleSelected = maleRadioButton.isSelected();
        System.out.println("is Male Radio Button Selected?  : " + isMaleSelected);

        WebElement femaleRadioButton = DriverManager.driver.findElement(By.xpath("//label[text()='Female']/input"));
        boolean isFemaleSelected = femaleRadioButton.isSelected();
        System.out.println("is Female Radio Button Selected?  : " + isFemaleSelected);
        Thread.sleep(5000);
        WebElement femaleRadio = DriverManager.driver.findElement(By.xpath("//label[text()='Female']/span"));
        //select female radio button
        femaleRadio.click();

        isFemaleSelected = femaleRadioButton.isSelected();
        System.out.println("is Female Radio Button Selected after click?  : " + isFemaleSelected);

    }
}
