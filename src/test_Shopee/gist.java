package test_Shopee;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gist {

public static void main(String[] args) {
		
		//for open the browser
		String userPC = System.getProperty("user.home");
		System.setProperty("webdriver.gecko.driver",  userPC + "/eclipse-workspace/test_Shopee/lib/geckodriver/geckodriver");
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(false);		
		WebDriver driver = new FirefoxDriver(option);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
		String today = df.format(new Date()).toString();
		
		//get url
		driver.get("https://gist.github.com");
		
		//resize the window
		Dimension window = new Dimension(800, 500);
		driver.manage().window().setSize(window);
		
		//klik login
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/a[2]")).click();
		//fill email field
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("username");
		//fill password field
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		//click login
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/form/div[2]/input[3]")).click();

		//Add new gist
		//click new gist 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a")).click();
		//fill gist desc 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/div[1]/input")).sendKeys("New Gist" + today);
		//fill filename 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/div[1]/div[2]/div/div[1]/div[1]/input[2]")).sendKeys("Test 1" + today);
		//click button add
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/button")).click();
		
		
		//see my list of gists
		//click list
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/details/summary")).click();
		//click your list
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/details/details-menu/ul/li[3]/a")).click();
				
		
		//Edit exiting gist
		//click list
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/details/summary")).click();
		//click your list
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/details/details-menu/ul/li[3]/a")).click();
		//select exiting gist
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div[1]/div[1]/div/span[1]/a[2]/strong")).click();
		//click edit button
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();
		//edit gist desc 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/div[1]/input")).sendKeys("Edit Gist" + today);
		//edit filename 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/div[1]/div[2]/div[2]/div[1]/div[1]/input[2]")).sendKeys("Edit Filename" + today);
		//Edit step 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/div[1]/div[2]/div/div[2]/div/div[5]")).sendKeys("Edit Step"+ today);
		//click update public button 
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/form/div/div[2]/button")).click();
		
		//Delete exiting gist
		//click list
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/details/summary")).click();
		//click your list
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/details/details-menu/ul/li[3]/a")).click();
		//select exiting gist
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div[1]/div[1]/div/span[1]/a[2]/strong")).click();
		//click delete button
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-danger']")).click();
		//cannot find element OK in pop up confirmation to delete		
//	//driver.findElement(By.xpath(" ")).click();
		
		//close the window
		driver.quit();
		

	}

}