import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/frames-and-windows.php");
		driver.manage().window().maximize();
		int in=1;
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		WebElement cl=driver.findElement(By.xpath("//a[text()='New Browser Tab']"));
		int list_size=list.size();

		for(int i=0;i<list_size;i++)
		{
			//int frameIndex=list.get(1);
			
			if(i==in)
			{
				cl.click();
			}
		}
		
	}
}
