package com.aston.java.lesson;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebDriverSetting {
    private static final Logger LOGGER = Logger.getLogger(WebDriverSetting.class.getName());
    public static WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        LOGGER.log(Level.INFO, "Начало теста");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.mts.by/?hash-offset=70&hash-dur=1300#pay-section");

        WebElement applyCookies = driver.findElement(By.id("cookie-agree"));
        applyCookies.click();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Конец теста");
        driver.quit();
    }
}
