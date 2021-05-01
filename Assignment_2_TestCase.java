import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_2_TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Before Test 
		String edgePath = System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe";
		
		System.setProperty("webdriver.edge.driver", edgePath);
		WebDriver driver = new EdgeDriver();

		// open Browser (edge)
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		// change browser language to English 
		driver.findElement(By.partialLinkText("English")).click();
		
		//Test Case 1: Verify Forget Password link 
		driver.findElement(By.xpath("//*[@class=\"gb_4 gb_5 gb_ae gb_4c\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@jsname=\"Cuz2Ue\"]")).click();
		
		String uRL;
		uRL = driver.getCurrentUrl();
		
		Thread.sleep(3000);

		System.out.println(uRL);
		System.out.println(uRL.contains("/signin/v2/forgotemail"));
		
        // After Test
		driver.quit();
		
	}

}
