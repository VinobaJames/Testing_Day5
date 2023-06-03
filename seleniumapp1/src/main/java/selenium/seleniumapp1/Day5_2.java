package selenium.seleniumapp1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_2 {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String URL = driver.getCurrentUrl();
		String expectedurl1="https://j2store.net/free/";
		if(URL.equals(expectedurl1))
			System.out.print("url1 matched");
		else
			System.out.print("url1 is not matched");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,850)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String URL2 = driver.getCurrentUrl();
		String expectedurl2="https://j2store.net/free/index.php/shop?filter_catid=11";
		  if(URL2.equals(expectedurl2))
			System.out.print("url2 matched");
		  else
			System.out.print("url2 is not matched");
		Thread.sleep(2000);
		
		}
}