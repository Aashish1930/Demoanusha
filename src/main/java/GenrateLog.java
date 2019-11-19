import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GenrateLog {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome update 78\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/");
	}

	public void TitileTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
