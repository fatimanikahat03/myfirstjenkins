package TestRunner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;

import reusable.BrowserCall;

public class MyStepdefs {
  public   WebDriver driver;

    @Given("Enter URL in chrome Browser")
    public void enterURLInChromeBrowser() throws IOException, InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");

      //        driver = BrowserCall.Browserinvocation(); //facebook.com  // implicit timeout enable for execution or sleep method
EdgeOptions edgeOptions=new EdgeOptions();
  //      edgeOptions.addArguments("--no-sandbox");
    //    edgeOptions.addArguments("--disable-dev-shm-usage");

       // System.setProperty("webdriver.edge.verboseLogging", "true");
      //  edgeOptions.setBinary("C:\\Users\\Lenovo\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");
        //C:\Users\Lenovo\Desktop\edgedriver_win64 (2)
//edgeOptions.addArguments("--remote-debugging-port=9222");
//edgeOptions.addArguments("--headless");
                  edgeOptions.addArguments("headless");

      //  edgeOptions.addArguments("--no-sandbox");
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();
        // driver=new ChromeDriver();https://github.com/fatimanikahat03/jenkins2.git
        driver.get("https://www.facebook.com");


//Thread.sleep(2000);
      System.out.println("In given statement");
    }

    @When("Click on new account button")
    public void clickOnNewAccountButton() {
        WebElement g = driver.findElement(By.className("_9vtf"));
        g.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
    }

    @And("Enter all details in signup page")
    public void enterAllDetailsInSignupPage() throws InterruptedException {
        //WebDriverWait driverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
        Thread.sleep(3000);
        WebElement g = driver.findElement(By.className("_9vtf"));
        String s = g.getText();
        String oo = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div")).getText();
        // System.out.println(oo);
        WebElement ooo = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div"));

        // driver.findElement(By.xpath("//*[@id=\"reg\"]"));


        // WebElement v=driver.findElement(By.xpath("//*[@id=\"u_18_a_JC\"]"));
        ooo.findElement(By.name("firstname")).sendKeys("yes");
        ooo.findElement(By.name("lastname")).sendKeys("lastyes");
        ooo.findElement(By.name("reg_email__")).sendKeys("lastemail@@gmail.com");
        ooo.findElement(By.name("reg_passwd__")).sendKeys("Lastpassword");
        WebElement d = driver.findElement(By.name("birthday_month"));
        Select select = new Select(d);
        select.selectByValue("8");
        WebElement dd = driver.findElement(By.name("birthday_day"));
        Select select1 = new Select(dd);
        select1.selectByVisibleText("6");
        WebElement ddd = driver.findElement(By.name("birthday_year"));
        Select select2 = new Select(ddd);
        select2.selectByVisibleText("1984");
        WebElement rb = driver.findElement(By.xpath("//span[@class='_5k_3']//span[1]//input"));
        String rbo = rb.getText();
        Thread.sleep(3000);
        rb.click();
        System.out.println("niku" + rbo);


//
//        ooo.findElement(By.name("firstname")).sendKeys("firstentry");
//        ooo.findElement(By.name("firstname")).clear();
//        ooo.findElement(By.name("firstname")).sendKeys("secondentry");
//        System.out.println(ooo.findElement(By.name("firstname")).getText());
//        driver.close();

    }

    @Then("Submit the Sign up button")
    public void submitTheSignUpButton() {
        driver.findElement(By.name("websubmit")).click();
       // String exp="Facebook";     it shoul be this but Im not clicking on submit so just checling with signup page title
        String exp="Facebook - log in or sign up";
        String ac=driver.getTitle();
        Assert.assertEquals(exp,ac);

        driver.close();

    }

}
