

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationAutomation {
    private WebDriver driver;

    public RegistrationAutomation(WebDriver driver) {
        this.driver = driver;
    }

    public void testRegistration() {
        // Navigate to the registration page of your application
        driver.get("file:///F:/localwebpages/registration.html");
        driver.manage().window().maximize();

        // Find registration form elements and enter test data
        String username = "rajyadav";
        String email = "testuser@example.com";
        String password = "testpassword";

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);

        // Print the entered values before submitting the registration form
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        // Submit the registration form
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // As there is no confirmation message or success page on a local HTML file,
        // you may add a simple console log or a message to indicate successful registration.
        System.out.println("Registration successful!");

        // Note: In a real web application, there would be server-side processing and a
        // confirmation page/message, and you can use explicit wait to handle that case.
    }
}
