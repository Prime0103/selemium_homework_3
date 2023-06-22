package com_herokuapptesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest
{
    static String browser = "Chrome";

    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Open Browser
        System.out.println(driver.getTitle());
        //Find Current URL
        System.out.println(driver.getCurrentUrl());
        //Print Page Source
        System.out.println(driver.getPageSource());

        //find the username in usernamefield
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("xyz123");

        //find the password field
        driver.findElement(By.name("password")).sendKeys("abc123");

        //close the browser
        driver.close();
    }
}
