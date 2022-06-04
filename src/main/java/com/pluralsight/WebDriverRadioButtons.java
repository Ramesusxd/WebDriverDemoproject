package com.pluralsight;

import org.checkerframework.checker.nullness.qual.EnsuresKeyForIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main (String[] args) {
        WebDriver driver = new OperaDriver();
        driver.get("file:///C:/Users/JJoin/IdeaProjects/WebDriverDemoproject/src/main/webapp/RadioButtonTest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(0).click();

        for (WebElement radioButton : radioButtons) {
            if(radioButton.isSelected()) {
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}