package com.example.santandercodersselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BoticarioPesquisaTest {

    private void pesquisarPor(final String stringPesquisa, WebDriver driver){

        BoticarioPesquisa page = new BoticarioPesquisa(driver);
        WebElement campoPesquisado = page.getSearchInput();
        campoPesquisado.clear();
        campoPesquisado.sendKeys(stringPesquisa);
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.className("autocomplete-result")));
        campoPesquisado.sendKeys(Keys.ENTER);

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.className("pagination-total")));
        assertTrue(page.getFirstCardTitle().getText().toLowerCase().startsWith(stringPesquisa.toLowerCase()));
    }

    @Test
    public void testPesquisarPor_NoChrome_quandoProtetorSolar_entaoResultadoDePeloMenosUmItemPossuiProtetorSolarNoTitulo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aline.mizumukai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        pesquisarPor("protetor solar", driver);
    }
}