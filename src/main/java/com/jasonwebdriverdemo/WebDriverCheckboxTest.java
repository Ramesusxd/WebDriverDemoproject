package com.jasonwebdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCheckboxTest {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new OperaDriver();
        driver.get("file:///C:/Users/JJoin/IdeaProjects/WebDriverDemoproject/src/main/webapp/CheckboxTest.html");

        WebElement checkBox = driver.findElement(By.id("snickersCheckbox"));
        checkBox.click();
        checkBox.click();

    }
}