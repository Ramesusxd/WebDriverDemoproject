package com.jasonwebdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {


    public static void main(String[] args) {
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new OperaDriver();
        driver.get("file:///C:/Users/JJoin/IdeaProjects/WebDriverDemoproject/src/main/webapp/SelectItemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");
    }
}
