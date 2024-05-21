package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
     	driver.manage().window().maximize();
     	driver.findElement(By.id("signin2")).click();
     	driver.findElement(By.id("sign-username")).sendKeys("faqirajabin");
     	driver.findElement(By.id("sign-password")).sendKeys("jabink@123");
     	driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
     	
     	driver.findElement(By.linkText("Phones")).click();
     	Thread.sleep(4000);
     	driver.findElement(By.linkText("Laptops")).click();
     	Thread.sleep(4000);
     	driver.findElement(By.linkText("Monitors")).click();
     	Thread.sleep(4000);
//     	driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
//     	driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
     	driver.findElement(By.linkText("Contact")).click();
     	driver.findElement(By.id("recipient-email")).sendKeys("123@gmail.com");
     	driver.findElement(By.id("recipient-name")).sendKeys("asdfghj");
     	driver.findElement(By.id("message-text")).sendKeys("zxcvbnmasdfghj");
     	driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
     	driver.navigate().refresh();
     	
     	
//     	driver.findElement(By.linkText("About us")).click();
//     	driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
//     	driver.findElement(By.id("cartur")).click();
//     	driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
//     	driver.findElement(By.id("name")).sendKeys("faqira");
//     	driver.findElement(By.id("country")).sendKeys("india");
//     	driver.findElement(By.id("city")).sendKeys("asdfg");
//     	driver.findElement(By.id("card")).sendKeys("1234567890");
//     	driver.findElement(By.id("month")).sendKeys("june");
//     	driver.findElement(By.id("year")).sendKeys("2024");
//     	driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
//     	driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//     	
     	
     	
     	
     	
     	
     	

     	

	}

}
