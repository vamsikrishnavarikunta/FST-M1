import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class CRM4Activity {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@name ='Login']")).click();
        WebElement homePage = driver.findElement(By.xpath("(//a[contains(text(),'SUITECRM DASHBOARD')])[1]"));
        System.out.println("Homepage has loaded: " + homePage.isDisplayed());
        driver.close();
    }

}
