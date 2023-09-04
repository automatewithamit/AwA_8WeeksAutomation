package com.awa.test;

import com.awa.selenium.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class OrangeHRM {


    public void login() throws Exception {
        DriverManager.driver = new ChromeDriver();
        DriverManager.driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
        DriverManager.driver.manage().window().maximize();
        WebElement usernameTextBox = DriverManager.driver.findElement(By.name("username"));

        usernameTextBox.sendKeys("Admin");
        WebElement passwordTextBox = DriverManager.driver.findElement(By.name("password"));

        passwordTextBox.sendKeys("admin123");

        WebElement loginButton = DriverManager.driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));

        loginButton.click();
        Thread.sleep(3000);
    }


    public void selectEmployee(String empName) {
        String xPath = "//div[normalize-space(text())='" + empName + "']/parent::div/parent::div/div[1]";
        WebElement empCheckBox = DriverManager.driver.findElement(By.xpath(xPath));
        empCheckBox.click();
    }

    public void deleteEmployee(String empName) throws Exception{
        //1. identify the number of duplicate records of any particular empName
        //2. we need  loop to delete (totalNumber-1) duplicate records
        String deleteButtonXPath = "//div[normalize-space(text())='" + empName + "']/following::button[1]";
        List<WebElement> dupEmployeeDeleteButtonsList = DriverManager.driver.findElements(By.xpath(deleteButtonXPath));
        for (int i = 0; i < dupEmployeeDeleteButtonsList.size()-1; i++) {
            dupEmployeeDeleteButtonsList = DriverManager.driver.findElements(By.xpath(deleteButtonXPath));
            dupEmployeeDeleteButtonsList.get(i).click();
            WebElement deleteConfirmationButton = DriverManager.driver.findElement(By.xpath("//button[normalize-space() = 'Yes, Delete']"));
            deleteConfirmationButton.click();
            Thread.sleep(4000);
        }
    }

}
