package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SomePage1 {

    private final WebDriver driver;
    private final By popupCloseButton = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");
    private final By var1 = By.xpath("");
    private final By var2 = By.xpath("");
    private final By var3 = By.xpath("");
    private final By var4 = By.xpath("");
    private final By var5 = By.xpath("");
    private final By var6 = By.xpath("");
    private final By var7 = By.xpath("");
    private final By var8 = By.xpath("");

    public SomePage1(WebDriver driver) {
        this.driver = driver;
    }

    public void popupKiller() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popupCloseButton));
        driver.findElement(popupCloseButton).click();
    }
    public void method1() {

    }
    public void method2() {

    }
    public void method3() {

    }
    public void method4() {

    }
    public void method5() {

    }
    public void method6() {

    }
    public void method7() {

    }
    public void method8() {

    }

}