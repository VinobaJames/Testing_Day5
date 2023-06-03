package selenium.seleniumapp1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_1 
{
    public static void main( String[] args )throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://j2store.net/free/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Home";
		if(actualTitle1.equalsIgnoreCase(expectedTitle1))
			System.out.println("Title Home Matched");
		else
			System.out.println("Title didn't match");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,850)", "");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		 String actualTitle2 = driver.getTitle();
		 String expectedTitle2 = "Shop";
			if(actualTitle2.equalsIgnoreCase(expectedTitle2))
				System.out.println("Title Shop Matched");
			else
				System.out.println("Title didn't match");
			Thread.sleep(3000);
			driver.quit();
			}
}