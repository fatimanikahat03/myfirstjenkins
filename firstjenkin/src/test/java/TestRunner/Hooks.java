package TestRunner;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;


import java.io.IOException;

//import static reusable.BrowserCall.driver;

public class Hooks {

//    public static WebDriver driver;
        @Before()public void Tearup() throws IOException {
            System.out.println("Start of Execution");

        }

        @After(order = 1) public void Teardown(){
            //    BrowserCall.Browsercall();
            System.out.println("order 1");
        }
        @After(order = 1)
        public void taeardown(){
            System.out.println("order zero");
        }




}
