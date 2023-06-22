package com_herokuapptesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserTesting
{
    public static void main(String[] args) {

        String baseurl = "http://the-internet.herokuapp.com/login";
        //setup the browser
        WebDriver driver = new ChromeDriver();
        //launch the Chrome browser
        driver.get(baseurl);

        //maximize browser
        driver.manage().window().maximize();

        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //get the page source
        System.out.println("Page source :" + driver.getCurrentUrl());

        //get the page source
        System.out.println("Page source :" + driver.getPageSource());

        //find the usernamefield
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("adggh233");

        //type the password in the password field
        driver.findElement(By.name("password")).sendKeys("ert123");

        //close the browser
        driver.close();
    }
}
