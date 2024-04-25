package TestQa.FirsTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;


public class Base {
	
	@Test

	public void configurationAppium() throws MalformedURLException {
		
		//creer capabilities
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Demo1");
		options.setApp(System.getProperty("user.dir")+"\\src\\main\\java\\ressources\\SaytuPatient.apk");
		// creer objet pour AdroidDriver/IOSDriver
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

}
