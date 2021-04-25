import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Edge_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String edgePath = System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe";
		
		System.setProperty("webdriver.edge.driver", edgePath);
		WebDriver driver = new EdgeDriver();

		
		// open Browser (edge)
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.quit();
		
	}

}
