package pages;

public class OrderDetailPage {

    public boolean orderDetailPageDisplayed() {
        return true;
    }

    public void cancelOrder(){
        driver.findElement(By.xpath("//android.widget.Button[@text='Cancel']")).click();
    }

    public boolean isOrderCancelled(){
        return true;
    }
}
