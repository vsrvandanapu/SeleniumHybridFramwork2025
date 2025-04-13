//package sample;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//public class SampleTest {
//	@Test
//	public void loginAndLogout() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.id("username")).sendKeys("srinivas@cisolutions.com");
//		driver.findElement(By.name("pw")).sendKeys("Selenium@1");
//		driver.findElement(By.cssSelector("#Login")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		
//	}
//
//	@Test
//	public void loginAndCreateLead() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.id("username")).sendKeys("srinivas@cisolutions.com");
//		driver.findElement(By.name("pw")).sendKeys("Selenium@1");
//		driver.findElement(By.cssSelector("#Login")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@title='New']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='name_firstlea2']")).sendKeys("Kavitha");
//		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("VV");
//		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("CIS");
//		WebElement leadStatus = driver.findElement(By.xpath("//select[@id='lea13']"));
//		Select sel = new Select(leadStatus);
//		sel.selectByIndex(2);
//		driver.findElement(By.xpath("//textarea[@id='lea17']")).sendKeys("This is a new Lead");
//		driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//	}
//}
