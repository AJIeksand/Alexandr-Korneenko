package com.aston.java.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestAboutService extends WebDriverSetting {

    @Test
    public void testAboutService() {
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();


        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl, "URL не соответствует");
    }
}