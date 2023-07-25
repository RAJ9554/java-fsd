import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAutomation {
    private WebDriver driver;

    public LoginAutomation(WebDriver driver) {
        this.driver = driver;
    }

    public void testLogin() {
        // Navigate to the login page of your application
        driver.get("file:///F:/localwebpages/login.html");
        driver.manage().window().maximize();

        // Find login form elements and enter test data
        String username = "rajyadav";
        String password = "testpassword";

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        // Print the entered values before submitting the login form
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Submit the login form
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Print login successful message
        System.out.println("Login successful! Welcome, " + username + "!");
    }
}
