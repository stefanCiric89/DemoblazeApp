package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends BasePage {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage(WebDriver driver) {
        super(driver);
        this.url = super.url + "cart.html";
    }

    public void openPage() {
        driver.get(this.url);
        driver.manage().window().maximize();
    }


    public Boolean isYourCartDisplayed() {

        Boolean toReturn = true;

        List<WebElement> listInventoryContainer = driver.findElements(By.id("page-wrapper"));

        if (listInventoryContainer.size() == 1) {
            toReturn = true;
        } else {
            toReturn = false;
        }
        return toReturn;
    }

    private WebElement removeItemBtn() {
        return driver.findElement(By.xpath("//a[text()='Delete']"));
    }

    public void clickRemoveItemBtn(){
        this.removeItemBtn().click();
    }
}