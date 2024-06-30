package com.aston.java.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOnlineRecharge extends WebDriverSetting {

    @Test
    public void testOnlineRechargeBlock() {

        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = blockTitle.getText();
        Assertions.assertEquals(expectedTitle, actualTitle, "Название блока не соответствует ожидаемому");

        WebElement logo1 = driver.findElement(By.xpath("//img[@alt='Visa']"));
        assertTrue(logo1.isDisplayed());

        WebElement logo2 = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        assertTrue(logo2.isDisplayed());

        WebElement logo3 = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        assertTrue(logo3.isDisplayed());

        WebElement logo4 = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        assertTrue(logo4.isDisplayed());

        WebElement logo5 = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        assertTrue(logo5.isDisplayed());

        WebElement inputNumber = driver.findElement(By.xpath("//input[@class='phone']"));
        inputNumber.click();
        inputNumber.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//input[@class='total_rub']"));
        inputSum.click();
        inputSum.sendKeys("20");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@class='email']"));
        inputEmail.click();
        inputEmail.sendKeys("123456@mail.ru");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();
    }
}