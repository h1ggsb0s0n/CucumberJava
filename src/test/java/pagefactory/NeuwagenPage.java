package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NeuwagenPage {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[1]/div[1]/div/a")
	WebElement limousine;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/div")
	WebElement zusatzKriterien;
	
	
	
	public NeuwagenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hasLimousine() {
		this.limousine.isDisplayed();
	}
	
	public void clickOnLimousine() {
		this.limousine.click();
	}
	
	public void isZusatzKriterienDisplayed() {
		this.zusatzKriterien.isDisplayed();
	}
	
}
