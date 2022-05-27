package com.pluralsight;
// do not touch the imports they will adjust on their own when selecting the web driver

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {
// to use specific WebDriver remove the comment marks from the one you wish to use and
// replace them on the ones you dont want to use
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("Pokemon.com");
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();

    }


}
