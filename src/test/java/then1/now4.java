package then1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class now4 {
	WebDriver driver;
	WebDriverWait wait;
@Given("user is on homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.chrome.driver","C:\\users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("SignIn")).click();
    }
@When("user enters username and password and click on login button")
public void user_enters_username_and_password_and_click_on_login_button() {
	driver.findElement(By.name("userName")).sendKeys("Lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
   driver.findElement(By.name("Login")).click();
}

@Then("user should be logged in and verified")
public void user_should_be_logged_in_and_verified() {
	wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("autocomplete")));
WebElement search=driver.findElement(By.name("products"));
search.sendKeys("Headphone");
driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}
@Given("navigate to all categories-electronics and headphone")
public void navigate_to_all_categories_electronics_and_headphone() {
	wait=new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.className("btn")));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")));
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
//driver.findElement(By.className("btn")).click();
}
@And("add product into shopping cart")
public void add_product_into_shooping_cart() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	
}
@When("proceed to checkout")
public void proceed_to_checkout() {
	driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	driver.findElement(By.xpath("/html/body/d/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
}
@When("select bank and add credentials")
public void select_bank_and_add_credentials() {
	driver.findElement(By.cssSelector("#swit > div:nth-child(8) >div > label >i")).click();
	driver.findElement(By.name("username")).sendKeys("Lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
}
@Then("redirected to the thank you page")
public void redirected_to_the_thank_you_page() {
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	driver.close();
}
}
