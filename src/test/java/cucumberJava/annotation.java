package cucumberJava;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class annotation {
    WebDriver driver = null;

    @Dado("^que eu abri o navegador$")
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @Quando("^abro o site do Facebook$")
    public void goToFacebook() {
        driver.navigate().to("https://www.facebook.com/");
    }

    @Então("^O botão Login deve sair$")
    public void loginButton() {
        if (driver.findElement(By.id("u_0_v")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}