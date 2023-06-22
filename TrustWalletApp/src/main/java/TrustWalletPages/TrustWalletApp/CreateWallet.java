package TrustWalletPages.TrustWalletApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateWallet {

	
	public CreateWallet(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/new_account_action")
	private WebElement createwalletbutton;
	
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/acceptCheckBox")
	private WebElement acceptlegalcheckbox;
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/next")
	private WebElement continuelegalbutton;
	
	
	public WebElement getCreateWalletButton()
	{
		return createwalletbutton;
	}
	
	public WebElement getAccepLegalCheckBox()
	{
		return acceptlegalcheckbox;
	}
	
	public WebElement getContinueLegalButton()
	{
		return continuelegalbutton;
	}


}