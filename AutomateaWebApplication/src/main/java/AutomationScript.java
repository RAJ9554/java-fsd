
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript {
    public static void main(String[] args) {
        // Set the system property for ChromeDriver (You should have ChromeDriver executable in your project)
        System.setProperty("webdriver.chrome.driver", "F:chromedriverjar\\\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Create an instance of RegistrationAutomation class
            RegistrationAutomation registrationAutomation = new RegistrationAutomation(driver);

            // Test the registration functionality
            registrationAutomation.testRegistration();

            // Create an instance of LoginAutomation class
            LoginAutomation loginAutomation = new LoginAutomation(driver);

            // Test the login functionality
            loginAutomation.testLogin();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}