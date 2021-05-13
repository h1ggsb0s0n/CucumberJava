package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.AutoScoutHomePage;
import pagefactory.AutoScoutSearchResultPage;
import pagefactory.NeuwagenPage;

public class AutoScoutFindCarsSteps {
	
	
	WebDriver driver = null;
	AutoScoutHomePage homePage;
	AutoScoutSearchResultPage searchResultPage;
	NeuwagenPage neuwagenPage;
	
	
	@Given("browser window is open")
	public void browser_window_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		this.homePage = new AutoScoutHomePage(driver);
		this.searchResultPage = new AutoScoutSearchResultPage(driver);
		this.neuwagenPage = new NeuwagenPage(driver);
		
	}
	
	@And("^user is on main page$")
	public void user_is_on_main_page() {
		System.out.println("Inside Step - user is on autoscout main  page");
		driver.navigate().to("https://www.autoscout24.ch/de");
		
	}

	@When("user selects brand (.*)$")
	public void user_selects_brand_ALFA_ROMEO(String brand) throws InterruptedException{
		homePage.selectBrand(brand);
		Thread.sleep(2000);
	}

	@When("^user selects modell (.*)$")
	public void user_selects_modell(String modell) throws InterruptedException{
		homePage.selectModell(modell);
		Thread.sleep(2000);
	}

	@When("^user selects year (.*)$")
	public void user_selects_year(String year)  throws InterruptedException{
		homePage.selectYear(year);
		Thread.sleep(2000);
	}

	@When("^user selects price (.*)$")
	public void user_selects_price(String price)  throws InterruptedException{
	    homePage.selectPrice(price);
	    Thread.sleep(2000);
	}

	@When("clicks on autosSuchen button")
	public void clicks_on_autosSuchen_button()  throws InterruptedException{
	    homePage.clickOnSearchButton();
	    Thread.sleep(2000);
	}

	@Then("user is navigated to result Page")
	public void user_is_navigated_to_result_Page() throws InterruptedException{
		Thread.sleep(2000);
		searchResultPage.isSortierenDisplayed();
	}
	
	@Then("user is navigated to Neuwagen Result Page")
	public void user_is_navigated_to_Neuwagen_Result_Page() throws InterruptedException{
		Thread.sleep(2000);
		this.neuwagenPage.isZusatzKriterienDisplayed();
	}
	
	
	
	
	@Given("user is on Neuwagen page")
	public void user_is_on_Neuwagen_page() throws InterruptedException{
		driver.navigate().to("https://www.autoscout24.ch/de/neuwagen");
	   
	}

	@Given("limousine is visible")
	public void limousine_is_visible() throws InterruptedException{
		Thread.sleep(2000);
		this.neuwagenPage.hasLimousine();
	    
	}

	@When("user clicks on limousine")
	public void clicks_on_limousine() throws InterruptedException{
		Thread.sleep(2000);
		this.neuwagenPage.clickOnLimousine();
	}

}
