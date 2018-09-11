package GmailTest.GmailTest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginSearch {
	
	WebDriver driver;
	
	@Test
	public void searchAfterLogin() throws InterruptedException{
		try{
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.name("identifier")).sendKeys("parulika.shopaholic");;
		driver.findElement(By.id("identifierNext")).click();;
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")));
		element1.sendKeys("passChanged123");
		driver.findElement(By.id("passwordNext")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='gb_Fc']")).click();;
		driver.findElement(By.id("gb23")).click();;
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gs_taif50']")).sendKeys("Davin");
		List<WebElement> L = driver.findElements(By.xpath("//*[starts-with(@id,'gs_atqs50')]"));
		int listsize= L.size();
		System.out.println(listsize);
		}
		catch (NoSuchElementException ignored){
			
		}
		finally{
			driver.close();
		}

}
}
