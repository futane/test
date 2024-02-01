package learning_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://40.80.91.220/SDUU_LIVE_TEST/Login.aspx");

		driver.findElement(By.xpath("//input[@id='Login1_UserName']")).sendKeys("c1439");
		driver.findElement(By.xpath("//input[@id='Login1_Password']")).sendKeys("passwd@1");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@id='Login1_LoginButton']")).click();
		driver.findElement(By.xpath("//*[@id=\"Menu1_RadPanelBar1\"]/ul/li[8]/div/ul/li[2]/a/span/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Menu1_RadPanelBar1\"]/ul/li[8]/div/ul/li[2]/div/ul/li[5]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='txtBasicInformation_PONo']"));

//		WebElement element = driver.findElement(By.xpath("//input[@id='ddlBasicInformation_SupplierName_Input']"));
//		Select dropdown = new Select(element);
//		dropdown.selectByVisibleText("AKRITI BUSINESS CREATIONS");
		driver.findElement(By.xpath("//textarea[@id='txtBasicInformation_Subject']")).sendKeys("vbsxsqvxsqnxvs");
		driver.findElement(By.xpath("//input[@id='txtBasicInformation_ReferenceThrough']")).sendKeys("c1439");
		driver.findElement(By.xpath("//input[@id='txtBasicInformation_IndentNo']")).sendKeys("c1439");
		driver.findElement(By.xpath("//input[@id='txtBasicInformation_QuotationNo']")).sendKeys("c1439");
		driver.close();



























		//				driver.switchTo().newWindow(WindowType.TAB);
		//				driver.get("https://www.olx.com");
		//				driver.switchTo().newWindow(WindowType.TAB);
		//				driver.get("https://www.gmail.com");
		//				driver.switchTo().newWindow(WindowType.TAB);
		//				driver.get("https://www.amazon.com");
		//			    driver.switchTo().newWindow(WindowType.TAB);
		//				driver.get("https://www.flipkart.com");
		//
		//				Set<String> windowhandle = driver.getWindowHandles();
		//				List<String> handle = new ArrayList<String>(windowhandle);
		//				
		//				driver.switchTo().window(handle.get(2));
		//				



	}



}
