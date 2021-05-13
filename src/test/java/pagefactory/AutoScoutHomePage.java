package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutoScoutHomePage {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div[2]/div/div/div/section[1]/div[2]/div[2]/div[1]/select")
	WebElement brand;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div[2]/div/div/div/section[1]/div[2]/div[2]/div[2]/select")
	WebElement modell;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div[2]/div/div/div/section[1]/div[2]/div[2]/div[3]/select")
	WebElement year;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div[2]/div/div/div/section[1]/div[2]/div[2]/div[4]/select")
	WebElement price;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div[2]/div/div/div/section[1]/div[3]/div/div[3]/span/a")
	WebElement searchButton;
	
	
	
	public AutoScoutHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchButton() {
		this.searchButton.click();
	}
	
	public void selectBrand(String brandText) {
		Select selectBrand = new Select(this.brand);
		selectBrand.selectByVisibleText(brandText);
	}
	
	public void selectModell(String modellText) {
		Select selectModell = new Select(this.modell);
		selectModell.selectByVisibleText(modellText);
	}
	
	public void selectYear(String yearText) {
		Select selectYear = new Select(this.year);
		selectYear.selectByVisibleText(yearText);
	}
	
	public void selectPrice(String priceText) {
		Select selectPrice = new Select(this.price);
		selectPrice.selectByVisibleText(priceText);
	}
}
