package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void locateElements() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		//link text element locator
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//Thread.sleep(2000);
		//we can navigate back but we never use it as we never go back in a test case
		//driver.navigate().back();
		//Thread.sleep(2000);
		//partial lint text not using the whole text just partial
		//driver.findElement(By.partialLinkText("TF-API Product")).click();
		//Thread.sleep(2000);
		
		//upload a file
		//if tage is input use .sendkeys(path)
		//if tag is other than input use Robot
		//driver.findElement(By.id("photo")).sendKeys("c:\\Users\\DEll\\...path");
		
		//css
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-5']")).click();
		
		//xpath
		//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("i hate it");
		
		//xpath
		//relative path
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@name='profession' and @id='profession-0']")).click();
		//driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'API Documentations')]")).click();
		
		
	}

	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
