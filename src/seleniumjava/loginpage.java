package seleniumjava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
     	driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("inventory_sidebar_link")).click();
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.get("https://www.saucedemo.com/inventory.html");
		//driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div > span > select")).sendKeys("Price (low to high)");
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div > span > select")).sendKeys("Price (high to low)");
		Thread.sleep(4000);
		driver.navigate().refresh();
	    driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div > span > select")).sendKeys("Name (A to Z)");
	    driver.navigate().refresh();
	    driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div > span > select")).sendKeys("Name (Z to A)");
	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"))  .click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("checkout")).click();
	    driver.findElement(By.id("first-name")).sendKeys("aaaaa");
	    driver.findElement(By.id("last-name")).sendKeys("bbbbb");
	    driver.findElement(By.id("postal-code")).sendKeys("679325");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("finish")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("back-to-products")).click();
	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	    driver.findElement(By.id("continue-shopping")).click(); 
	   // driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a")).click();
	    String originalTab = driver.getWindowHandle();

        // Find and click the button that opens the new tab
        WebElement button = driver.findElement(By.id("page_wrapper"));
        button.click();

        // Wait for the new tab to open (you may need to wait for some time or use explicit waits)
        // You can switch to the new tab by iterating through window handles
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(originalTab)) {
                driver.switchTo().window(handle);
                // Now you are in the new tab, you can interact with its content if needed
                // For example, you can get the URL of the new tab
                String newTabUrl = driver.getCurrentUrl();
                System.out.println("URL of the new tab: " + newTabUrl);
                // Close the new tab (optional)
                driver.close();
                break;
            }
        }

        // Switch back to the original tab using the handle obtained earlier
        driver.switchTo().window(originalTab);

        // Now you are back in the original tab and can continue interacting with its content
        // For example, you can print the title of the original tab:
        System.out.println("Title of the original tab: " + driver.getTitle());

//	    driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")).click();
//	    driver.navigate().to("www.saucedemo.com/inventory.html");	 
//	    driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).click();
//	    driver.navigate().to("www.saucedemo.com/inventory.html");
        driver.findElement(By.xpath("//*[@id=\"item_1_img_link\"]/img")).click();
        driver.findElement(By.id("add-to-cart")).click();
        driver.findElement(By.id("remove")).click();
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    	driver.close();
	}
}
