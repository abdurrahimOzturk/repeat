package packrepeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIntRep {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement userName = driver.findElement(By.id("session_email"));
        userName.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextbox= driver.findElement(By.id("session_password"));
        passwordTextbox.sendKeys("Test1234!");

        //writing the logator for signing button
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();


    }
}
