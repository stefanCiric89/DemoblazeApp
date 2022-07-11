package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{
    private String url;

    public MainPage(WebDriver driver) {
        super(driver);
        this.url = super.url;
    }

    public void openPage(){
        driver.get(this.url);
        driver.manage().window().maximize();
        this.waitPageToBeDisplayed();
       /* WebDriverWait wait = new WebDriverWait(driver, 500);
        //wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("card"), 1));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.id("tbodyid"),1));*/

    }

    public void waitPageToBeDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 500);
        //wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("card"), 1));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.id("tbodyid"),1));

    }

    public  WebElement selectItemNokiaLumia1520(){
        return driver.findElement(By.linkText("Nokia lumia 1520"));
    }

    public void clickOnItemNokiaLumia1520() {
        WebElement clickItem = this.selectItemNokiaLumia1520();
        /*WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(clickItem));*/
        clickItem.click();
    }

    private WebElement getItemByName(String name){
        return driver.findElement(By.xpath("//a[text()= '" + name + "']"));
    }

    public void clickOnItemByName(String name){
        this.getItemByName(name).click();
    }

}

