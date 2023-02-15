package com.example.santandercodersselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoticarioPesquisa extends Page {

    public BoticarioPesquisa(WebDriver driver) {
        super(driver);
        driver.get("https://www.boticario.com.br/");
    }

    public WebElement getSearchInput(){
        return driver.findElement(By.name("q"));
    }

    public WebElement getFirstCardTitle(){
        return driver.findElements(By.className("showcase-item-title")).stream().findFirst().get();
    }

    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
