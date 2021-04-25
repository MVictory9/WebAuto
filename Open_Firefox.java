import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String firefoxPath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		
		WebDriver driver = new FirefoxDriver();
		
		// Open Browser (FireFox)
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		driver.quit();

	}

}
