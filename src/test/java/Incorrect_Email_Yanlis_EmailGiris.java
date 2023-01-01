import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Incorrect_Email_Yanlis_EmailGiris extends TestBase {
/*
Test Case 3: Login User with incorrect email and password
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter incorrect email address and password
7. Click 'login' button
8. Verify error 'Your email or password is incorrect!' is visible


 */

@Test
    public void test01(){





//
//      Test Örneği 3: Kullanıcıyı yanlış e-posta ve parola ile Oturum Açın
//  1. Tarayıcıyı başlatın
//
//  2. 'http://automationexercise.com' URL'sine gidin

    driver.get("http://automationexercise.com");
 //  3. Ana sayfanın başarıyla göründüğünü doğrulayın

    WebElement homepagevisible=driver.findElement(By.xpath("//div[@class=\"logo pull-left\"]"));
    Assert.assertTrue(homepagevisible.isDisplayed());

//  4. 'Kaydol / Giriş Yap' düğmesine tıklayın

    driver.findElement(By.xpath("//a[text()=\" Signup / Login\"]")).click();

 //  5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın

    WebElement hesapgirisi=driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]"));
    Assert.assertTrue(hesapgirisi.isDisplayed());


//  6. Yanlış e-posta adresi ve şifre girin
    WebElement eposta=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    eposta.sendKeys("yanlis@gmail.com");
    WebElement password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    password.sendKeys("1234");



//  7. 'Giriş' düğmesine tıklayın
    driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();

//  8. 'E-postanız veya şifreniz yanlış!' hatasını doğrulayın. görünür

    WebElement yanlisposta=driver.findElement(By.xpath("//p[text()=\"Your email or password is incorrect!\"]"));
    Assert.assertTrue(yanlisposta.isDisplayed());






}


}
