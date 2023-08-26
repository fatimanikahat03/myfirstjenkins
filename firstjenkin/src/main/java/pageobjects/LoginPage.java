package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusable.BrowserCall;



public  class LoginPage extends BrowserCall {
    public static WebDriver driver;

    //whaterver objects are getiing used in this page will be get added by @findBy annotaion
    @FindBy(name ="username")
    WebElement username;
    @FindBy(name="password")
    WebElement pass;

    @FindBy(css=".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    WebElement loginbutton;



    //Now time to intilase the objects by using constouctor and its own ,method called intielements(driver is the main and this means all instances of this class
    public LoginPage(WebDriver driver)
    { this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    //now do the necessary operation by just using object name which we declared in the @findby annotaions
    public void Usernamee()
    {
        username.sendKeys(p.getProperty("username"));
    }
    public void getPass()
    {
        pass.sendKeys(p.getProperty("password"));
    }

    public void clickButton()
    {
        loginbutton.click();
    }


}

