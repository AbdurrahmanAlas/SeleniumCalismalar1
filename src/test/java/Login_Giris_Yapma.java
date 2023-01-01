import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Login_Giris_Yapma extends TestBase {


    /*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
*/



    //Test Durumu 2: Kullanıcıyı doğru e-posta ve parola ile Oturum Açın

    @Test
    public void test01() {


        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin

        driver.get("http://automationexercise.com");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın

        WebElement homepagevisible =driver.findElement(By.xpath("//div[@class=\"logo pull-left\"]"));
        Assert.assertTrue(homepagevisible.isDisplayed());

        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın

        driver.findElement(By.xpath("//a[text()=\" Signup / Login\"]")).click();


        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın

        //6. Doğru e-posta adresini ve şifreyi girin
        //7. 'Giriş' düğmesine tıklayın
        Actions actions=new Actions(driver);
        WebElement login =driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        actions.click(login)
                .sendKeys("blas@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();





        //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın

        WebElement kullanıcıadı=driver.findElement(By.xpath("//a//b[text()=\"Abdurrahman\"]"));
        Assert.assertTrue(kullanıcıadı.isDisplayed());


        //9. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.xpath("//a[text()=\" Delete Account\"]")).click();





    }
}
