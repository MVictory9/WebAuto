import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
		"D:\\Eclipse 2021\\Open_Chrome_Browser\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// Open Browser (Chrome)
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");

		driver.quit();

	}

}
