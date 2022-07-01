package packrepeat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitletest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "google";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
        }

    }
}
