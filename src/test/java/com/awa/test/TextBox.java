package com.awa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {


    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement usernameTextBox = driver.findElement(By.name("username"));

        usernameTextBox.sendKeys("Admin");
        WebElement passwordTextBox = driver.findElement(By.name("password"));

        passwordTextBox.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));

        loginButton.click();
        Thread.sleep(3000);

        WebElement pimMenuItem = driver.findElement(By.xpath("//a[contains(@href, 'viewPimModule')]"));

        pimMenuItem.click();

        Thread.sleep(3000);

        WebElement employeeNameTextBox = driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input"));
        String innerText = employeeNameTextBox.getAttribute("placeholder");
        System.out.println("Inner Text of Employee Name Text Box : " + innerText);

        boolean isEnabled =employeeNameTextBox.isEnabled();
        System.out.println("Is Enabled Employee Name Text Box : " + isEnabled);


        WebElement checkbox = driver.findElement(By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
        System.out.println("Before CLicking : " + checkbox.isSelected());
        checkbox.click();
        Thread.sleep(1000);
        System.out.println("After CLicking : " + checkbox.isSelected());




    }
}
