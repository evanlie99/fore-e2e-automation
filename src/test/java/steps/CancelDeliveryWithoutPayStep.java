package steps;

import pages.*;

public class CancelDeliveryWithoutPayStep {

    HomePage homePage = new HomePage();
    DeliveryPage deliveryPage = new DeliveryPage(driver);
    MenuPage menuPage = new MenuPage(driver);
    CartPage cartPage = new CartPage(driver);
    OrderDetailPage orderDetailPage = new OrderDetailPage();

    @Given("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        homePage.isUserLoggedIn();
    }

    @And("user is on Fore home page")
    public void userIsOnForeHomePage() {
        homePage.isHomePageDisplayed();
    }

    @When("user taps the Delivery order button")
    public void userTapsTheDeliveryOrderButton() {
        homePage.tapDeliveryOrderButton();
    }

    @Then("user should be redirected to the delivery address and menu screen")
    public void userRedirectedToDeliveryAddressAndMenuScreen() {
        deliveryPage.waitUntilDeliveryScreenDisplayed();
    }

    @And("the nearest delivery store is selected")
    public void nearestDeliveryStoreIsSelected() {
        deliveryPage.selectNearestStore();
    }

    @And("user inputs their delivery location")
    public void userInputsTheirDeliveryLocation() {
        deliveryPage.inputDeliveryLocation("Sunrise");
    }

    @And("user selects the coffee menu")
    public void userSelectsTheCoffeeMenu() {
        menuPage.selectCoffeeMenu("Aren Latte");
    }

    @And("user customized coffee")
    public void userCustomizedCoffee() {
        menuPage.selectSize("Large");
        menuPage.selectSugarLevel("Less sweet");
        menuPage.selectIce("Normal Ice");
        menuPage.selectEspresso("Normal Shot");
        menuPage.selectDairy("Milk");
    }

    @And("user adds the item to the cart")
    public void userAddsTheItemToTheCart() {
        menuPage.addItemToCart();
    }

    @And("user view the cart")
    public void userViewTheCart() {
        cartPage.openCart();
        cartPage.isCartPageDisplayed();
    }

    @And("the user selects delivery method")
    public void userSelectsDeliveryMethod() {
        cartPage.selectDeliveryMethod("Grab");
    }

    @And("the user selects payment method")
    public void userSelectsPaymentMethod() {
        cartPage.selectPaymentMethod("QRIS");
    }

    @And("user confirms the order")
    public void userConfirmsTheOrder() {
        cartPage.confirmOrder();
    }

    @And("user should be redirected to detail order page")
    public void userRedirectedToDetailOrderPage() {
        orderDetailPage.orderDetailPageDisplayed();
    }

    @Then("user cancel the order immediately after creation")
    public void userCancelTheOrderImmediatelyAfterCreation() {
        orderDetailPage.cancelOrder();
        orderDetailPage.isOrderCancelled();
    }

}
