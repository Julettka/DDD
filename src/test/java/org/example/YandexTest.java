package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Map;

public class YandexTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

     @Test
        public void z1() {
            driver.get("https://plus.yandex.ru/");
            driver.manage().window().setSize(new Dimension(1112, 699));
            driver.findElement(By.cssSelector(".ui-burger__inner")).click();
           // String title = driver.getTitle();
            //Assert.assertEquals("Яндекс Плюс - фильмы, музыка и кешбэк баллами", title);
            driver.findElement(By.cssSelector(".ui-button_blue .ui-typography > span")).click();
            //Assert.assertEquals("Авторизация", driver.getTitle());
            driver.findElement(By.xpath("//span/input")).click();
            driver.findElement(By.xpath("//span/input")).sendKeys("jul.ettka@gmail.com");
            //Assert.assertTrue(true);
            driver.findElement(By.id("passp:sign-in")).click();
            driver.findElement(By.id("passp-field-passwd")).click();
            //Assert.assertEquals("Авторизация", driver.getTitle());
            driver.findElement(By.id("passp-field-passwd")).sendKeys("9141505");
            //String title2 = driver.getTitle();
           // Assert.assertEquals("Авторизация", title2);
            driver.findElement(By.id("passp:sign-in")).click();
        }

    @Test
    public void logo() {
        driver.get("https://plus.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1112, 699));

        String title1 = driver.getTitle();
        Assert.assertEquals("Яндекс Плюс - фильмы, музыка и кешбэк баллами", title1);

        driver.findElement(By.cssSelector(".plogo_yandex")).click();
        String title2 = driver.getTitle();
        Assert.assertEquals("Яндекс", title2);
        driver.findElement(By.cssSelector("#text")).click();
        driver.findElement(By.cssSelector("#text")).sendKeys("яндекс плюс");
        driver.findElement(By.cssSelector(".button")).click();

    }
 /*   @Test
    public void promokod(){
        driver.get("https://plus.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1112, 699));
        driver.findElement(By.cssSelector(".plogo_yandex")).click();
        driver.findElement(By.cssSelector(".desk-notif-card__login-new-item_plus > .desk-notif-card__login-new-item-title")).click();
        driver.findElement(By.cssSelector("#text")).click();
        driver.findElement(By.cssSelector("#text")).sendKeys("погода");
        driver.findElement(By.cssSelector(".button")).click();
    }*/


}

