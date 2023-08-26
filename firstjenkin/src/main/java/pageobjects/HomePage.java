package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BrowserCall;

public   class HomePage extends BrowserCall {

    public static void getLeavesNo() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/button")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/button")).click();
        WebElement date= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
        //Date fild is fixed with the value and its adding sendkey as append
        String s=date.getText();
        date.clear();
        s=date.getText();
        date.sendKeys("2019-03-06");
        s=date.getText();
        System.out.println(s);
    }

}
