package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class MenuPage {

    AppiumDriver<MobileElement> driver;

    public MenuPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void selectCoffeeMenu(String coffeeName){
        //input coffee
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + coffeeName + "']")).click();
    }

    public void selectSize(String size){
        //select coffee size
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + size + "']")).click();
    }

    public void selectSugarLevel(String sugarLevel){
        //select sugar level
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + sugarLevel + "']")).click();
    }

    public void selectIce(String iceLevel){
        //select ice
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + iceLevel + "']")).click();
    }

    public void selectEspresso(String espressoShot){
        //select esspreso shot
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + espressoShot + "']")).click();
    }

    public void selectDairy(String dairyType){
        //select dairy type
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + dairyType + "']")).click();
    }

    public void addItemToCart(){
        driver.findElement(By.xpath("//android.widget.Button[@text='Add to Cart']")).click();
    }
}
