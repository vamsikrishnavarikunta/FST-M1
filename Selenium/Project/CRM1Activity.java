import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

    public class CRM1Activity {
        public static void main(String[] args) {

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            driver.get("http://alchemy.hguy.co/crm");
            String expectedTitle = driver.getTitle();
            System.out.println(expectedTitle);
            String actualTitle = "SuiteCRM";
            if(expectedTitle.equals(actualTitle))
                System.out.println("Title of the website is: " + expectedTitle);
            else
                System.out.println("Title of the website didn't match");
            driver.close();
        }
}
