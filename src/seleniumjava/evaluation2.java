package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
     	driver.manage().window().maximize();
     	driver.findElement(By.id("cartur")).click();
     	driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
     	driver.findElement(By.id("name")).sendKeys("faqira");
     	driver.findElement(By.id("country")).sendKeys("india");
     	driver.findElement(By.id("city")).sendKeys("asdfg");
     	driver.findElement(By.id("card")).sendKeys("1234567890");
     	driver.findElement(By.id("month")).sendKeys("june");
     	driver.findElement(By.id("year")).sendKeys("2024");
     	driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
     	driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
     	
     	
     	
	}

}
