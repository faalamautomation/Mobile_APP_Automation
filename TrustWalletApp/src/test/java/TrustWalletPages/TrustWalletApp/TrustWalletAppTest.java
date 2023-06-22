package TrustWalletPages.TrustWalletApp;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TrustWalletAppTest extends Base {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter(
			System.getProperty("user.dir") + "\\resources\\Reports\\TestReport.html");

	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException {
		extent.attachReporter(spark);
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);

	}

	@Test
	public void trustWalletTest()
			throws IOException, HeadlessException, UnsupportedFlavorException, InterruptedException {

		ExtentTest test = extent.createTest("Trust Wallet Creation on Android App Test Flow");
		test.log(Status.PASS, "User Wallet Created Successfully");

		service = startServer();

		AndroidDriver<AndroidElement> driver = capabilities("TrustWalletApp");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		CreateWallet wallet = new CreateWallet(driver);
		CreatePassCode create_passcode = new CreatePassCode(driver);
		ConfirmPassCode confirm_passcode = new ConfirmPassCode(driver);
		SecretPhrase secret_phrase = new SecretPhrase(driver);

		wallet.getCreateWalletButton().click();
		wallet.getAccepLegalCheckBox().click();
		wallet.getContinueLegalButton().click();

		create_passcode.getfour().click();
		create_passcode.getfive().click();
		create_passcode.geteight().click();
		create_passcode.getnine().click();
		create_passcode.getsix().click();
		create_passcode.gettwo().click();

		confirm_passcode.getfour().click();
		confirm_passcode.getfive().click();
		confirm_passcode.geteight().click();
		confirm_passcode.getnine().click();
		confirm_passcode.getsix().click();
		confirm_passcode.gettwo().click();

		secret_phrase.getmanualbackup().click();
		secret_phrase.getmanualbackupcheck1().click();
		secret_phrase.getmanualbackupcheck2().click();
		secret_phrase.getmanualbackupcheck3().click();
		secret_phrase.getmanualbackupcontinuebutton().click();
		secret_phrase.getcopysecretphrase().click();
		secret_phrase.getsecretphrasecontinuebutton().click();

		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(myText);
		String[] strsplit = myText.split(" ");
		System.out.println(strsplit.getClass().getName());
		
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strsplit));
		
		for (int i = 0; i < strList.size(); i++)
		{	
			String f1 = strList.get(i);
			System.out.println(f1);
		}
		for (int i = 0; i < strList.size(); i++) {
			driver.findElementByXPath("//*[@text='" + strList.get(i) + "']").click();
		}

		secret_phrase.getDone().click();

		service.stop();
	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}
}
