package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluationhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/prod.html?idp_=1");
     	driver.manage().window().maximize();
     	WebElement button=driver.findElement(By.linkText("Add to cart"));
     	button.click();
     	

//     	driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
     	driver.close();
	}

}
