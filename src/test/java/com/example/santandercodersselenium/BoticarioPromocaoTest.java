package com.example.santandercodersselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BoticarioPromocaoTest {

    private void verificarDescontoProduto(WebDriver driver){

        BoticarioPromocao page = new BoticarioPromocao(driver);
        page.getPromocaoButton().click();

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.className("pagination-total")));
        assertTrue(page.getFirstItemDiscount().getText().contains("%"));
    }

    @Test
    public void testVerificarDescontoProdut_NoChrome_seAbrirMenuDePromocao_entaoProdutoPossuiTagDeDesconto(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aline.mizumukai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        verificarDescontoProduto(driver);
    }
}