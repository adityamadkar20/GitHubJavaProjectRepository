package SeleniumHomeWork.SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumOrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.edge.driver", "G:\\\\SeleniumAll\\\\Driver_Notes//msedgedriver.exe");
		
		WebDriver d = new EdgeDriver();

		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		d.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		d.findElement(By.tagName("button")).click();

	}

}
