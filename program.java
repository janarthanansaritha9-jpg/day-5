package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.proton.com/");

        // Close Chrome and launch Edge
        driver.quit();
        driver = new EdgeDriver();

        // Load URL in Edge
        driver.get("https://www.facebook.com/");

        // Login actions
        driver.findElement(By.id("email")).sendKeys("8925411170");
        driver.findElement(By.id("pass")).sendKeys("Prathap");
        driver.findElement(By.name("login")).click();
    }
}
