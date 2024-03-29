import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class vTest {

    @Test // TestNG anotacija.
    public void test1() {//jei atidaro teisingai pakūrėme projektą
        WebDriver driver = new ChromeDriver();
        driver.get("https://vynoteka.lt/");

    }
    @Test //TestNG anotacija
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vynoteka.lt/");
        //maximize browser window
        driver.manage().window().maximize();
        //Age verification
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Cookie click
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
        //waiting explicit
        WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/a/img[1]"));
        WebDriverWait imageWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        imageWait.until(ExpectedConditions.visibilityOf(image));
        //verification
        boolean isDisplayed = image.isDisplayed();
        Assert.assertTrue(isDisplayed);
        //Click off for image
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();
        //Search bar interaction
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("Viskis");
        //Search button click

        try {
            TimeUnit.SECONDS.sleep(5);// wait for 5 seconnd

           } catch (InterruptedException e) {
            e.printStackTrace();
        }
//          wait explicit
//        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button"));
//        WebDriverWait buttonWait = new WebDriverWait(driver, Duration.ofSeconds(40));
//        buttonWait.until(ExpectedConditions.visibilityOf(button)).click();
//        wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
        //Verification for search (wait)
        WebElement message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/h1"));
        WebDriverWait messageWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        messageWait.until(ExpectedConditions.visibilityOf(message));
        //Verification for search (verify)
        boolean viskis = message.isDisplayed();
        Assert.assertTrue(viskis);

    }

    }