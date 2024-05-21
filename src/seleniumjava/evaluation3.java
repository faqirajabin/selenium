package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
     	driver.manage().window().maximize();
		
		
		driver.findElement(By.id("login2")).click();
     	driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("faqirajabin");
     	driver.findElement(By.id("loginpassword")).sendKeys("jabink@123");
     	driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();     	
     	driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
     	driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();

	}

}
