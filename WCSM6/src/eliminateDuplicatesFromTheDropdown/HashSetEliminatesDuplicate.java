package eliminateDuplicatesFromTheDropdown;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetEliminatesDuplicate {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		WebElement element = driver.findElement(By.id("drop1"));
		Select sel = new Select(element);

		List<WebElement> ops = sel.getOptions();
//we use HashSet to eliminate duplicates and order of insertion is NOT maintained
	
		HashSet<String> s = new HashSet<String>();

		for(int i=0;i<ops.size();i++)
		{
			String textToInsert = ops.get(i).getText();//read the list one by one
			s.add(textToInsert);//add to set one by one and duplicates won't be added
		}

		//read the set

		for(String text:s)
		{
			System.out.println(text);
		}
	}
}