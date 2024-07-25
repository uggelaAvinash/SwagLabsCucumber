package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
WebDriver driver;
@Given("Open Edge Browser")
public void open_edge_browser() {
   driver =new EdgeDriver();
}

@Given("Open URL www.saucedemo.com")
public void open_url_www_saucedemo_com() {
   driver.get("https://www.saucedemo.com/");
   driver.manage().window().maximize();
}

@When("Login Id Login Password")
public void login_id_login_password() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
}

@When("Click On Submit")
public void click_on_submit() {
	driver.findElement(By.id("login-button")).click();
}

@Then("click on Add to cart")
public void click_on_add_to_cart() {
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
}

@Then("open add to cart")
public void open_add_to_cart() {
    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
}

@Then("click  checkout")
public void click_checkout() {
    driver.findElement(By.id("checkout")).click();
}

@Then("checkout information")
public void checkout_information() {
    driver.findElement(By.id("first-name")).sendKeys("avinash");
    driver.findElement(By.id("last-name")).sendKeys("uggela");
    driver.findElement(By.id("postal-code")).sendKeys("521226");
}

@Then("click on continue")
public void click_on_continue() {
   driver.findElement(By.id("continue")).click();
}

@Then("click on finish")
public void click_on_finish() {
   driver.findElement(By.id("finish")).click();
}

@Then("click on back home")
public void click_on_back_home() {
  driver.findElement(By.id("back-to-products")).click();
}

@Then("logout")
public void logout() throws InterruptedException {
    driver.findElement(By.id("react-burger-menu-btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("logout_sidebar_link")).click();
}


@Then("close edge browser")
public void close_edge_browser() {
   driver.close();
}


}
