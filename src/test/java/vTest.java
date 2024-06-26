import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
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

    @Test //TestNG anotacija
    public void test3() {
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
        //waiting explicit (image)
        WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/a/img[1]"));
        WebDriverWait imageWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        imageWait.until(ExpectedConditions.visibilityOf(image));
        //verification
        boolean isDisplayed = image.isDisplayed();
        Assert.assertTrue(isDisplayed);
        //Click off for image
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div/div[1]/input")).sendKeys("Viskis");
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("Viskutis");
        //dropdown list year
//        Select dropdown = new Select(driver.findElement(By.name("birthYear")));
//        String desiredValue = "1999";
//        dropdown.selectByValue(desiredValue);
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[9]")).click();
        //Dropdown list month
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[6]")).click();
        //Dropdown day
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[27]")).click();
        //Insert email
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[4]/div/div[1]/input")).sendKeys("podcbnj@gmail.com");
        //Insert phone
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[5]/div/div[1]/input")).sendKeys("61478559");

        //Password
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[6]/div/div/input")).sendKeys("ViskisViskutis5");
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[7]/div/div/input")).sendKeys("ViskisViskutis5");
        //Term and conditions
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label")).click();
        //Register
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button")).click();
        //Pass verification
        try {
            Thread.sleep(40 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button"));

    }

    @Test //TestNG anotacija
    public void test4() {
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
        //waiting explicit (image)
        WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/a/img[1]"));
        WebDriverWait imageWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        imageWait.until(ExpectedConditions.visibilityOf(image));
        //verification
        boolean isDisplayed = image.isDisplayed();
        Assert.assertTrue(isDisplayed);
        //Click off for image
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button")).click();
        //insert loging information
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[2]/div/form/div[1]/div/input")).sendKeys("podcbnj@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[2]/div/form/div[2]/div/input")).sendKeys("ViskisViskutis5");
        //Click login
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[2]/div/form/div[4]/button")).click();
        //Wait for web to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Search for product
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("Viskis");
        try {
            TimeUnit.SECONDS.sleep(5);// wait for 5 seconnd

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
        //Wait for results to load
        WebDriverWait messageWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Click on product
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/a/img")).click();
        //Add to cart
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/button")).click();
        //Select delivery
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[1]/div[1]/button")).click();
        //Insert delivery information
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Rygos g. 46");
        //Click search
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();
        //Click on address
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div[1]/button")).click();
        //Click proceed button
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/button")).click();
        //Proceed
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div/button")).click();
        //Choose delivery date
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div[9]/label/span[2]/span")).click();
        //Click reserve
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/button")).click();
        //Go to cart
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[3]/div[1]/button")).click();
        //Name verification
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/a")).click();
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[3]/div/div[1]/div/div[2]/strong"));
        String expectedText = "Viskis";
        Assert.assertEquals(element.getText(), expectedText);
        //Price verification






    }
}
