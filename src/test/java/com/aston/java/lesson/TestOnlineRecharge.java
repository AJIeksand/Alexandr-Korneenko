package com.aston.java.lesson;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


@Epic("Online Recharge")
@Feature("Payment Flow")
public class TestOnlineRecharge extends WebDriverSetting {
    private String currentWindowHandle;

    @Test
    @Story("Verify Recharge Online Block")
    public void testOnlineRechargeBlock() {
        String phoneNumber = "297777777";
        String amount = "20";
        String email = "123456@mail.ru";
        fillAndCheckCommunicationServices(phoneNumber, amount, email);
        verifyPaymentOptions();
        checkAdditionalFields();
    }

    @Step("Check Element Is Displayed")
    private void checkElementIsDisplayed(String xpath, String elementName) {
        WebElement element = driver.findElement(By.xpath(xpath));
        Assertions.assertTrue(element.isDisplayed(), () -> elementName + " не отображается");
    }

    @Step("Check Icon Is Displayed")
    private void checkIconIsDisplayed(String xpath, String iconName) {
        WebElement icon = driver.findElement(By.xpath(xpath));
        Assertions.assertTrue(icon.isDisplayed(), () -> "Иконка " + iconName + " не отображается");
    }

    @Step("Check element text")
    private void checkElementText(String xpath, String expectedText, String elementName) {
        WebElement element = driver.findElement(By.xpath(xpath));
        String actualText = element.getText();
        Assertions.assertEquals(expectedText, actualText, () -> elementName + " не соответствует ожидаемому значению");
    }

    @Step("Fill and check communication services")
    private void fillAndCheckCommunicationServices(String phoneNumber, String amount, String email) {
        WebElement inputNumber = driver.findElement(By.xpath("//input[@class='phone']"));
        inputNumber.sendKeys(phoneNumber);

        WebElement inputSum = driver.findElement(By.xpath("//input[@class='total_rub']"));
        inputSum.sendKeys(amount);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@class='email']"));
        inputEmail.sendKeys(email);

        currentWindowHandle = driver.getWindowHandle();

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();

        if (allWindowHandles.size() > 1) {
            System.out.println("Всплывающее окно открыто.");
        } else {
            System.out.println("Всплывающее окно не найдено.");
        }

        for (String handle : allWindowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app-wrapper']//div[@class='app-wrapper__content']")));
    }

    @Step("Check if additional fields are displayed")
    private void checkAdditionalFields() {
        checkElementIsDisplayed("//span[contains(text(), 'Услуги связи')]", "Поле 'Номер телефона'");
        checkElementIsDisplayed("//input[@placeholder='Номер телефона']", "Поле 'Номер телефона'");
        checkElementIsDisplayed("//div[contains(@class, 'input-wrapper')]//input[@placeholder='Сумма']", "Поле 'Сумма'");
        checkElementIsDisplayed("//input[@placeholder='E-mail для отправки чека']", "Поле 'E-mail для отправки чека'");
        checkElementIsDisplayed("//span[contains(text(), 'Домашний интернет')]", "Вкладка 'Домашний интернет'");
        checkElementIsDisplayed("//input[@placeholder='Номер абонента']", "Поле 'Номер абонента'");
        checkElementIsDisplayed("//form[@id='pay-internet']//input[@placeholder='Сумма']", "Поле 'Сумма'");
        checkElementIsDisplayed("//form[@id='pay-internet']//input[@placeholder='E-mail для отправки чека']", "Поле 'E-mail для отправки чека'");
        checkElementIsDisplayed("//span[contains(text(), 'Рассрочка')]", "Вкладка 'Рассрочка'");
        checkElementIsDisplayed("//input[@placeholder='Номер счета на 44']", "Поле 'Номер счета на 44'");
        checkElementIsDisplayed("//input[@id='instalment-email']", "Поле 'E-mail для отправки чека'");
        checkElementIsDisplayed("//input[@id='instalment-sum']", "Поле 'Сумма'");
        checkElementIsDisplayed("//span[contains(text(), 'Задолженность')]", "Вкладка 'Задолженность'");
        checkElementIsDisplayed("//input[@placeholder='Номер счета на 2073']", "Поле 'Номер счета на 2073'");
        checkElementIsDisplayed("//input[@id='arrears-email']", "Поле 'E-mail для отправки чека'");
        checkElementIsDisplayed("//input[@id='arrears-sum']", "Поле 'Сумма'");

        driver.switchTo().window(currentWindowHandle);
    }

    private void verifyPaymentOptions() {
        checkElementIsDisplayed("//label[contains(text(), 'Срок действия')]", "Поле 'Срок действия'");
        checkElementIsDisplayed("//label[contains(text(), 'CVC')]", "Поле 'CVC'");
        checkElementIsDisplayed("//label[contains(text(), 'Имя держателя (как на карте)')]", "Поле 'Имя держателя'");
        checkIconIsDisplayed("//div[contains(@class, 'icons-container')]//img[contains(@src, 'mastercard-system.svg')]", "Mastercard");
        checkIconIsDisplayed("//div[contains(@class, 'icons-container')]//img[contains(@src, 'visa-system.svg')]", "Visa");
        checkIconIsDisplayed("//div[contains(@class, 'icons-container')]//img[contains(@src, 'belkart-system.svg')]", "Белкарт");
        checkIconIsDisplayed("//img[contains(@src, 'mir-system-ru.svg')]", "МИР");
        checkIconIsDisplayed("//img[contains(@src, 'maestro-system.svg')]", "Maestro");
        checkElementText("//span[contains(text(), '20.00')]", "20.00 BYN", "Отображаемая сумма");
        checkElementText("//span[contains(text(), '375297777777')]", "+375 (29) 777-77-77", "Отображаемый номер телефона");
        checkElementIsDisplayed("//button[contains(.,'20.00 BYN')]", "Кнопка оплаты");
        checkElementIsDisplayed("//label[contains(text(), 'Номер карты')]", "Надпись 'Номер карты'");

        driver.close();
    }
}



