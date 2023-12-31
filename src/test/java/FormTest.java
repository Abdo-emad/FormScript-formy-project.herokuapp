import Pages.FormPage;
import Pages.SuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class FormTest extends TestBase{
    SoftAssert softAssert = new SoftAssert();



    @Test
    public void FillForm() throws InterruptedException {

        formPage.setFirstName("Ali");
        formPage.setLastName("Mo");
        formPage.setJobTitle("Engineer");
        formPage.setEducation();
        formPage.setGender();
        formPage.ExYears(1);
        formPage.setDate("02/6/1999");
        SuccessPage successPage = formPage.ClickBtn();
        Thread.sleep(3000);
        String Message = "The form was successfully submitted!";
        softAssert.assertTrue(successPage.Message().contains(Message));
        softAssert.assertAll();


    }


}
