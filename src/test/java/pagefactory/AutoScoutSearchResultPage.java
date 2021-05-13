package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoScoutSearchResultPage {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section/div/div/div/div/div[1]/div[3]/div/select")
	WebElement sortierElement;

	public AutoScoutSearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isSortierenDisplayed() {
		sortierElement.isDisplayed();
	}

}
