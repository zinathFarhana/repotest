import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:/selenium files/geckodriver-v0.17.0-win64/geckodriver.exe");
   WebDriver frdriver = new FirefoxDriver();
  // WebDriver chdriver = new ChromeDriver();
   //WebDriver iedriver = new InternetExplorerDriver();
   frdriver.get("http://newtours.demoaut.com/");
  frdriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
}
}
