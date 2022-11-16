package project1nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.xml.bind.SchemaOutputResolver;
import java.time.Duration;

public class Edge {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("Webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);

        //Maximise window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the tittle of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        // get current URL
        System.out.println("Current URL " + driver.getPageSource());

        // Get Page source
        System.out.println("page source " + driver.getPageSource());

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("sawan123@gmail.com");

        // Find password field element
        WebElement passwordField = driver.findElement(By.name("Password"));

        //Type password to password field
        passwordField.sendKeys("sawan123");

        // Close the browser
        driver.quit();






    }
}
