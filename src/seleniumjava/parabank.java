package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
//		driver.findElement(By.id("customer.firstName")).sendKeys("faqira");
//		driver.findElement(By.id("customer.lastName")).sendKeys("bbbb");
//		driver.findElement(By.id("customer.address.street")).sendKeys("ccccc");
//		driver.findElement(By.id("customer.address.city")).sendKeys("ddddd");
//		driver.findElement(By.id("customer.address.state")).sendKeys("eeee");
//		driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
//		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
//		driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
//		driver.findElement(By.id("customer.username")).sendKeys("faqira");
//		driver.findElement(By.id("customer.password")).sendKeys("jabin@123");
//		driver.findElement(By.id("repeatedPassword")).sendKeys("jabin@123");
//		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("faqira");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("jabin@123");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a"));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a"));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a"));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a"));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[3]/a"));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a"));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
		driver.findElement(By.id("name")).sendKeys("aaaa");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("message")).sendKeys("asdfghjklqwertyuizxcvbnm");
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("qwertyuiooooooooop");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("asdf");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("asdfghj");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("zipcode54567");
		driver.findElement(By.xpath("//*[@id=\"4589a04d-c77a-4e96-ac58-333b6c897637\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("123456989");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("10000");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
