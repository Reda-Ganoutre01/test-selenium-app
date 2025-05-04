package com.app.backend.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class FormControllerTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void testFormSubmission() {
        driver.get("C:\\Users\\reda\\Desktop\\test-selenium-springBoot\\frontend\\index.html");
        // Find the elements and interact with them
        driver.findElement(By.id("username")).sendKeys("Reda");
        driver.findElement(By.id("email")).sendKeys("reda@example.com");
        driver.findElement(By.id("message")).sendKeys("Bonjour !");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("homme")).click();
        driver.findElement(By.id("submit")).click();

        // Assert that the result div has the expected text
        WebElement result = driver.findElement(By.id("result"));
        Assertions.assertTrue(result.isDisplayed());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}