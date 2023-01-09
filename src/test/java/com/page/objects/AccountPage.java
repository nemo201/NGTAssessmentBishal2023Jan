package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
    private final WebDriver driver;
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }
        private By Profile = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[2]");
        private By subMenu = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[1]/a/div[1]");
        private By accountName = By.xpath("//*[@id=\"mountRoot\"]/div/div/div[1]/div[2]");

    public WebElement getProfile() {
        return driver.findElement(Profile);
    }

    public WebElement getSubMenu() {
        return driver.findElement(subMenu);
    }

    public WebElement getAccountName() {
        return driver.findElement(accountName);
    }
}