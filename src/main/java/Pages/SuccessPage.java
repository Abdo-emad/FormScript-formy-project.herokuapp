package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SuccessPage {
    WebDriver driver;


    public SuccessPage(WebDriver driver){
        this.driver= driver;
    }
    By successMsg = By.className("alert");




    public String Message()  {
      WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(successMsg));
    return  driver.findElement(successMsg).getText();
}
}
