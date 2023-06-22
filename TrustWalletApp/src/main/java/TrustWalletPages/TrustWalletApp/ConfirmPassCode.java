package TrustWalletPages.TrustWalletApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConfirmPassCode {

	public ConfirmPassCode(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='4']")
	private WebElement four;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='5']")
	private WebElement five;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='8']")
	private WebElement eight;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='9']")
	private WebElement nine;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='6']")
	private WebElement six;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2']")
	private WebElement two;

	public WebElement getfour() {
		return four;
	}

	public WebElement getfive() {
		return five;
	}

	public WebElement geteight() {
		return eight;
	}

	public WebElement getnine() {
		return nine;
	}

	public WebElement getsix() {
		return six;
	}

	public WebElement gettwo() {
		return two;
	}

}
