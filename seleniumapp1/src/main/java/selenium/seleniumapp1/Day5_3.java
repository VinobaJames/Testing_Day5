package selenium.seleniumapp1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_3 {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		List<WebElement> elementName = driver.findElements(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]"));
		for(int i = 0; i< elementName.size(); i++) {
            //obtain text
            String s = elementName.get(i).getText();
            System.out.println(s);

        driver.quit();
		
	}
	}
}