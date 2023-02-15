package com.example.santandercodersselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoticarioPromocao extends Page {

    public BoticarioPromocao(WebDriver driver) {
        super(driver);
        driver.get("https://www.boticario.com.br");
    }

    public WebElement getFirstItemDiscount(){
        var teste = driver.findElements(By.className("item-discount"));
        return teste.stream().findFirst().get();
    }

    public WebElement getPromocaoButton(){
        return driver.findElement(By.xpath("/html/body/header/nav/ul/li[2]/a"));
    }

    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
