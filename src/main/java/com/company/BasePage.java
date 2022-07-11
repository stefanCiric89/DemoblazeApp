package com.company;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected String url;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.url = "https://demoblaze.com/";
    }

    public BasePage() {}

}
