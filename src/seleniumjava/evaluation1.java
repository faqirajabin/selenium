package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
     	driver.manage().window().maximize();
     	driver.findElement(By.linkText("About us")).click();
     	driver.findElement(By.linkText("Close")).click();
     	
     	
//     	driver.findElement(By.id("login2")).click();

	}

}
