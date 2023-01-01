import com.beust.ah.A;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.security.auth.kerberos.KerberosKey;

public class SeleniumProje1 extends TestBase {


    @Test
    public void test01() {


        //1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Click on 'Signup / Login' button
        WebElement signupElementi=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        Actions actions=new Actions(driver);
        actions.click(signupElementi).perform();
        //4. Enter name and email address
        //5. Click 'Signup' button
        WebElement nameKutusu= driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(nameKutusu)
                .sendKeys("Abdurrahman")
                .sendKeys(Keys.TAB)
                .sendKeys("blas@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        //6. Fill details: Title, Name, Email, Password, Date of birth
        //7. Select checkbox 'Sign up for our newsletter!'
        //8. Select checkbox 'Receive special offers from our partners!'
        //9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement titleRadiButton= driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        actions.click(titleRadiButton       )
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("March")
                .sendKeys(Keys.TAB)
                .sendKeys("1990").perform();
                WebElement checkbox=driver.findElement(By.id("newsletter"));
                checkbox.click();
                WebElement checkbox2=driver.findElement(By.id("optin"));
                checkbox2.click();

                WebElement firstname=driver.findElement(By.id("first_name"));
                actions.sendKeys("Abdurrahman")

                .sendKeys(Keys.TAB)
                .sendKeys("Alas")
                .sendKeys(Keys.TAB)
                .sendKeys("Ben")
                .sendKeys(Keys.TAB)
                .sendKeys("Firma")
                .sendKeys(Keys.TAB)
                .sendKeys("Zümrüt")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Anadolu")
                .sendKeys(Keys.TAB)
                .sendKeys("kayseri")
                .sendKeys(Keys.TAB)
                .sendKeys("05100")
                .sendKeys(Keys.TAB)
                .sendKeys("5551254568")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //10. Click 'Create Account button'

        //11. Verify that 'ACCOUNT CREATED!' is visible
        String expectedYazi="ACCOUNT CREATED!";
        String actualYazi=driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
        Assert.assertEquals(expectedYazi,actualYazi);


    }
}