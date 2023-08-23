package parallel;

import io.cucumber.java.en.Given;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.LoginPage;
import reusable.broswerinvoke;

import java.io.IOException;



public class StepDefs {

    WebDriver driver;
    @Given("Step from Scenario 1 in scenarios feat")
    public void step() {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.macys.com");
        System.out.println("Thread ID - %2d - %s from %s feature file");
              //Thread.currentThread().getId(), scenario, file);
    }

    @Given("Step from Scenario 1 in scenarios featur")
    public void stepFromScenarioInScenariosFeatureFile() {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
      //  System.out.println(arg0+arg1);
    }

    @Given("Step from Scenario 2 in scenarios featu")
    public void stepFromScenarioInScenariosFeatureFile_() {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com");
   //   System.out.println(arg0+arg1);

    }

    @Given("Step from Scenario {int} in scenarios featt")
    public void stepFromScenarioInScenariosFeatt(int arg0) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.com");
    }

    @Given("URL with valid crendtails")
    public void urlWithValidCrendtails() throws IOException, InterruptedException {
       driver= broswerinvoke.InvokeBrowser();
        // before adding this I struggled for 2 hours for nosuchelement exception i tried everything but failed.so i debugged it and got result..hehe so its only asking to give some time to load the element and hence i added the three.slepp methos and it worked
        Thread.sleep(2000);
        LoginPage loginPage =new LoginPage(driver);
        // loginPage.invokeSlot();
        loginPage.Usernamee();
        loginPage.getPass();
        loginPage.clickButton();
        String ex="OrangeHRMM";
        String ac=broswerinvoke.driver.getTitle();
        //Assert.assertEquals(ex,ac);
        Thread.sleep(1000);
        SoftAssertions softAssertions=new SoftAssertions();
        softAssertions.assertThat(ac).isEqualTo(ex);
        System.out.println("Soft assertion ");

    }
    }
