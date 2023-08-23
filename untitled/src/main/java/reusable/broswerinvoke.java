package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class broswerinvoke {
    public static WebDriver driver;
    public static Properties properties;
    public static WebDriver InvokeBrowser() throws IOException {
        String path=System.getProperty("user.dir");
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(path + "/src/main/resources/utility/envrioment.properties"));

            properties=new Properties();
            properties.load(fileInputStream);
        }catch (FileNotFoundException exception)
        {
            System.out.println("Path is not correct");
        }
        catch (NullPointerException exception)
        {
            System.out.println("Im Null"+exception);
        }
        finally {
            System.out.println(" im finally ");
        }
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        return driver;


    }

    public static WebDriver getDriver()
    {
        return  driver;
    }
}
