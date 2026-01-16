package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public boolean isUserLoggedIn() {
        return true;
    }

    public boolean isHomePageDisplayed() {
        return true;
    }

    public void tapDeliveryOrderButton(){
        driver.findElement(deliveryOrderBtn).click();
    }
}
