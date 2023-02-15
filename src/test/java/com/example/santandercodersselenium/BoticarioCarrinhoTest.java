package com.example.santandercodersselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BoticarioCarrinhoTest {

    private void adicionarAoCarrinho(WebDriver driver){

        BoticarioCarrinho page = new BoticarioCarrinho(driver);
        page.getAcceptCookiesButton().click();
        page.getCompreButton().click();

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[1]/div[3]/a")));
        assertTrue(page.getCarrinhoTag().getText().equals("1"));
    }

    @Test
    public void testAdicionarAoCarrinho_NoChrome_seAdicionarProdutoAoCarrinho_entaoContadorDaSacolaIgualAUm(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aline.mizumukai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        adicionarAoCarrinho(driver);
    }

}