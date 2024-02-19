import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GotoGoogle {

    private WebDriver driver;

    @Step("Open Google homepage")
    public void openGoogle() {
        // Set the path to your GeckoDriver (FirefoxDriver) executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ninura Jayasekara\\Downloads\\chromedriver.exe");

        // Optional: Set Firefox options if needed (e.g., headless mode)
        // FirefoxOptions options = new FirefoxOptions();
        driver = new ChromeDriver();
        // Add any desired options here
        // options.setHeadless(true); // Example: Run in headless mode

        // Initialize FirefoxDriver with options
        // driver = new FirefoxDriver(options);

        // Open Google
        driver.get("https://www.google.com");
    }

    // Other steps or methods as per your test scenario

    @Step("Close browser")
    public void closeBrowser() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
