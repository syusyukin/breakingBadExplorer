import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBad {

    @Test
    public void jessieIsAlive(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //add capabilities
        AndroidDriver driver = new AndroidDriver(capabilities);
        String appPath = "path/to/your.apks";
        driver.installApp(appPath);
        String bundleId ="breakingBadExplorer bundleid";
        driver.activateApp(bundleId);
        String searchBarId = "searchbar id";
        driver.findElement(By.id(searchBarId)).sendKeys("Jesse Pinkman");
        driver.findElement(By.xpath("//*[@content-desk='Jesse Pinkman']")).click();
        Assert.assertEquals(driver.findElement(By.id("char-status")).getAttribute("value"),"Alive","Jesse Pinkman's status is not alive");
        //this can be done a lot better but I have limited time to spend on it
    }
}
