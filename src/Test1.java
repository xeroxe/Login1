import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.junit.Test;

public class Test1 {
    public WebDriver Browser = new SafariDriver();
    @Test
    public void login() throws {
        Browser.get("http://testing-ground.scraping.pro/login");
        WebElement Username = Browser.findElement(By.id("usr"));
        Username.sendKeys("admin");
        WebElement Password = Browser.findElement(By.id("pwd"));
        Password.sendKeys("12345");
        WebElement Loginbtn = Browser.findElement(By.xpath("//*[@id=\"case_login\"]/form/input[3]"));
        Loginbtn.click();
        WebElement CheckSuccess = Browser.findElement(By.className("success"));
        assertTrue((CheckSuccess.isDisplayed()));
        System.out.println(CheckSuccess);
    }
}