import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("file:///F:/localwebpages/Ex5.html");
            driver.manage().window().maximize();

            Thread.sleep(2000);

            WebElement txtpname = driver.findElement(By.id("txtPerson"));
            txtpname.sendKeys("Akshatha");

            Thread.sleep(2000);

            WebElement button = driver.findElement(By.id("regBtn"));
            button.click();

            Thread.sleep(2000);

            // Handle the alert
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);
            alert.accept();

            System.out.println("Given Value is: " + driver.findElement(By.id("res")).getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
