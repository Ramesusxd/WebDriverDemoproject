package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxTest {

    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/jason.jointer/IdeaProjects/WebDriverDemoproject/src/main/webapp/CheckboxTest.html");

        WebElement checkBox = driver.findElement(By.id("snickersCheckbox"));
        checkBox.click();
        checkBox.click();
    }
}