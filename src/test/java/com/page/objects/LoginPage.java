package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    private By username = By.id("mobileNumberPass");
    private By password = By.xpath("//*[@id=\"reactPageContent\"]/div/div/form/div/div[2]/input");
    private By logInButton = By.xpath("//*[@id=\"reactPageContent\"]/div/div/form/div/div[3]/button");

    private By CartButton = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[3]");
    private By CartStatus = By.xpath("//*[@id=\"appContent\"]/div/div/div/div/div/div[4]/div");
    public LoginPage(WebDriver webDriver){
        this.driver = webDriver;
    }
    public WebElement getUserName(){
        return driver.findElement(username);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement getLogInButton(){
        return driver.findElement(logInButton);
    }
    public WebElement getCartButton() { return driver.findElement(CartButton);}
    public WebElement getCartStatus(){ return driver.findElement(CartStatus); }
}
