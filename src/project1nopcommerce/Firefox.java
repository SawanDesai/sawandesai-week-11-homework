package project1nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.bind.SchemaOutputResolver;
import java.time.Duration;

public class Firefox {

    public static void main(String[] args) {
       String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
       System.setProperty("webdriver.gheko.driver","drivers/ghekodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // launch URL

         driver.get(baseurl);

         // Maximise window
        driver.manage().window().maximize();

        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the tittle of the page
        String title = driver.getTitle();
        System.out.println("page title is : " + title);

        // Get current URL
        System.out.println("Current URL" + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source:" + driver.getPageSource());

        // Find the email field element

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("sawan123@gmail.com");

        // Find password field element
        WebElement passwordField = driver.findElement(By.name("Password"));

        // Type email to email field
        passwordField.sendKeys("Desai123");

        // Close the browser
        driver.quit();










    }
}
