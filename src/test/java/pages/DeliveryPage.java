package pages;

public class DeliveryPage {

    AppiumDriver<MobileElement> driver;

    public DeliveryPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public boolean isDeliveryPageDisplayed() {
        return true;
    }

    public void selectNearestStore() {
        //select nearest store
    }

    public void inputDeliveryLocation(String location) {
        //input delivery address
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + location + "']")).click();
    }
}
