package com.jasonwebdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTables {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new OperaDriver();
        driver.get("file:///C:/Users/JJoin/IdeaProjects/WebDriverDemoproject/src/main/webapp/TableTest.html");
        // remove all 3 WebElement comment slashes to use Webelement outer,inner,row and place comment on the webElement using xpath. vise versa to use xpath for table testing

        WebElement outerTable = driver.findElement(By.tagName("table"));
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        WebElement row = innerTable.findElements(By.tagName("td")).get(1);

        //WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));

        System.out.println(row.getText());
    }
}
