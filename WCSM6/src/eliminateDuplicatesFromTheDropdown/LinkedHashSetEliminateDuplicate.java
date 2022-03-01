package eliminateDuplicatesFromTheDropdown;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSetEliminateDuplicate {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		WebElement element = driver.findElement(By.id("drop1"));
		element.click();
		Thread.sleep(2500);
		Select sel = new Select(element);

		List<WebElement> ops = sel.getOptions();
		//we use LinkedHashSet to eliminate duplicates and order of insertion is  maintained
		
		 LinkedHashSet<String> s = new LinkedHashSet<String>();

		for(int i=0;i<ops.size();i++)
		{
			String textToInsert = ops.get(i).getText();//read the list one by one
			s.add(textToInsert);//add to set one by one and duplicates won't be added
		}
		Thread.sleep(2500);
		//read the set

		for(String text:s)
		{
			System.out.println(text);
		}
	}
}