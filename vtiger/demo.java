package vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DX\\Desktop\\Java Programe\\Roshan yadav\\driver_jar\\chromedriver.exe");
		
		ChromeDriver driver=	new ChromeDriver();
		
		driver.get("http//localhost:8888/");
		
	}

}
