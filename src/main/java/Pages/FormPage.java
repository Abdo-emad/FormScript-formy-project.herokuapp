package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
    WebDriver driver;
    public FormPage(WebDriver driver){
        this.driver= driver;
    }
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By jobTitle = By.id("job-title");
    By school = By.id("radio-button-1");
    By gender = By.id("checkbox-1");
    By experienceYears= By.id("select-menu");
    By datePicker= By.id("datepicker");
    By submitBtn =  By.linkText("Submit");


    public void setFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void setLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void setJobTitle(String jTitle){
        driver.findElement(jobTitle).sendKeys(jTitle);
    }
    public void setEducation(){
        driver.findElement(school).click();
    }
    public void setGender(){
        driver.findElement(gender).click();
    }
    public void ExYears(int value){
        WebElement element = driver.findElement(experienceYears);
        Select select = new Select(element);
        select.selectByValue(String.valueOf(value));
    }
    public void setDate(String v){
        driver.findElement(datePicker).sendKeys(v);
    }
    public SuccessPage ClickBtn(){
        driver.findElement(submitBtn).click();
        return new SuccessPage(driver);
    }


}
