package com.example.santandercodersselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoticarioCarrinho extends Page {

    public BoticarioCarrinho(WebDriver driver) {
        super(driver);
        driver.get("https://www.boticario.com.br/protetor-solar-facial-antioleosidade-fps70-botisun-acqua-fluido-40ml/");
    }

    public WebElement getAcceptCookiesButton(){
        return driver.findElement(By.id("onetrust-accept-btn-handler"));
    }

    public WebElement getCompreButton(){
        return driver.findElement(By.className("product-buy"));
    }

    public WebElement getCarrinhoTag(){
        return driver.findElement(By.className("bag-countContainer"));
    }

    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
