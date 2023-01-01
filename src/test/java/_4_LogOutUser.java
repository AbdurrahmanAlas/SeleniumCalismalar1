import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class _4_LogOutUser  extends TestBase {

   @Test
   public  void test01() {
//  Test Case 4: Logout User
//  1. Launch browser
//  2. Navigate to url 'http://automationexercise.com'

       driver.get("http://automationexercise.com");

//  3. Verify that home page is visible successfully
       WebElement homepagevisible=driver.findElement(By.xpath("//div[@class=\"logo pull-left\"]"));
       Assert.assertTrue(homepagevisible.isDisplayed());

//  4. Click on 'Signup / Login' button

       driver.findElement(By.xpath("//a[text()=\" Signup / Login\"]")).click();

       //  5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın

       WebElement hesapgirisi=driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]"));
       Assert.assertTrue(hesapgirisi.isDisplayed());

//  6. Enter correct email address and password

       WebElement email=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
       email.sendKeys("blas@gmail.com");

       WebElement password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
       password.sendKeys("12345");


//  7. Click 'login' button

       driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();

//  8. Verify that 'Logged in as username' is visible


       WebElement loggedVisible=driver.findElement(By.xpath("//b[text()=\"Abdurrahman\"]"));
       Assert.assertTrue(loggedVisible.isDisplayed());


//  9. Click 'Logout' button
       driver.findElement(By.xpath("//a[text()=\" Logout\"]")).click();
//  10. Verify that user is navigated to login page

       WebElement  loginpage=driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]"));
       Assert.assertTrue(loginpage.isDisplayed());



 }







}
