package project1nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.SchemaOutputResolver;
import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // launch URL
        driver.get(baseurl); //driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        // Maximise window
        driver.manage().window().maximize();

        // we give implicit time to driver
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the tittle of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        // get current URL
        System.out.println("Current URL :"+ driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source : " + driver.getPageSource());

        // Navigage to login page URL
        // String loginurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // driver.naviage().to(loginrul);
        // Navigate to login page by clicking to login link

       // find the email field element

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("sawan.123@gmail.com");

        // Find password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Desai123");

        //Close the browser
        driver.quit();

    }

}
