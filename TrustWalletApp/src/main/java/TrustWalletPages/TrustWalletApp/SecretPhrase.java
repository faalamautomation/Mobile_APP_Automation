package TrustWalletPages.TrustWalletApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SecretPhrase {

	public SecretPhrase(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Back up manually']")
	private WebElement manual_backup;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='If I lose my secret phrase, my funds will be lost forever.']")
	private WebElement manual_backup_check1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='If I expose or share my secret phrase to anybody, my funds can get stolen.']")
	private WebElement manual_backup_check2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Trust Wallet support will NEVER reach out to ask for it']")
	private WebElement manual_backup_check3;
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/next")
	private WebElement manual_backup_continue_button;
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/action_copy")
	private WebElement copy_secret_phrase;
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/action_verify")
	private WebElement secret_phrase_continue_button;
	
	@AndroidFindBy(id="com.wallet.crypto.trustapp:id/action_done")
	private WebElement done; 
	
	public WebElement getmanualbackup()
	{
		return manual_backup;
	}
	
	public WebElement getmanualbackupcheck1()
	{
		return manual_backup_check1;
	}
	
	public WebElement getmanualbackupcheck2()
	{
		return manual_backup_check2;
	}
	
	public WebElement getmanualbackupcheck3()
	{
		return manual_backup_check3;
	}
	
	public WebElement getmanualbackupcontinuebutton()
	{
		return manual_backup_continue_button;
	}
	
	public WebElement getcopysecretphrase()
	{
		return copy_secret_phrase;
	}
	
	public WebElement getsecretphrasecontinuebutton()
	{
		return secret_phrase_continue_button;
	}
	
	public WebElement getDone()
	{
		return done;
	}

}
