package vtiger;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automate_Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DX\\Desktop\\Java Programe\\Roshan yadav\\driver_jar\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("http:localhost:8888/");
		String ab=driver.getWindowHandle();
		System.out.println(ab);
		
		driver.manage().window().maximize(); 
		String abc=driver.getWindowHandle();
		System.out.println(abc);
		
		WebElement weUsser=	driver.findElement(By.xpath("//input[@name='user_name']"));
		js.executeScript("arguments[0].value='admin'", weUsser);
		WebElement wePassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		js.executeScript("arguments[0].value='admin'", wePassword);
		WebElement wethim=	driver.findElement(By.xpath("//select[@name='login_theme']"));
		js.executeScript("arguments[0].value='woodspice'", wethim);
//		WebElement welanguage=driver.findElement(By.xpath("//select[@name='login_language']"));
//		js.executeScript("arguments[0].value='US English'", welanguage);
		WebElement welogin=driver.findElement(By.xpath("//input[@name='Login']"));
		js.executeScript("argument[0].click()'", welogin);
		
		driver.close();
	}
}

