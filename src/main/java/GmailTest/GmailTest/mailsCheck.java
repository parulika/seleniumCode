package GmailTest.GmailTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mailsCheck {
	
	WebDriver driver;
	
	@Test
	public void CountMail() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("https://mail.google.com/mail/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parulika.singh@gmail.com");;
		driver.findElement(By.id("identifierNext")).click();;
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("parulikaashuk");;
		driver.findElement(By.id("passwordNext")).click();;
		Thread.sleep(7000);
		List<WebElement> list =driver.findElements(By.xpath("//td[@class='yX xY']"));
		int i = list.size();
		System.out.println(i);
		
	}
	
	
	
	

}
