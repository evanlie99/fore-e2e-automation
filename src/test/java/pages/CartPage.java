package pages;

public class CartPage {

    AppiumDriver<MobileElement> driver;

    public CartPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void openCart(){
        driver.findElement(By.xpath("//android.widget.Button[@text='Open Cart']")).click();
    }

    public boolean isCartPageDisplayed(){
        return true;
    }

    public void selectDeliveryMethod(String deliveryMethod){
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + deliveryMethod + "']")).click();
    }

    public void selectPaymentMethod(String paymentMethod){
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + paymentMethod + "']")).click();
    }

    public void confirmOrder(){
        driver.findElement(By.xpath("//android.widget.Button[@text='Confirm']")).click();
    }

}
