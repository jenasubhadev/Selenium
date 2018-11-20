package htmlunitdriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlUnitDriverTest {

	public static void main(String[] args) throws Exception {
		
		
		/**
		 * 
		 
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://newlookcosmeticsurgery.com/");
		System.out.println("Title is " +driver.getTitle());

		driver.quit();
		 
		 */
		
		/**
		 * 
		 
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.EDGE);
		driver.get("http://newlookcosmeticsurgery.com/");
		System.out.println("Title is " +driver.getTitle());
		driver.quit();
		*/
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.EDGE);
		driver.get("http://newlookcosmeticsurgery.com/");
		System.out.println("Title is " +driver.getTitle());
		WebClient webClient = (WebClient) get(driver, "webClient");
		System.out.println("Browser Version is :"+webClient.getBrowserVersion());
		
		System.out.println(webClient.getBrowserVersion().isChrome());
		driver.quit();
		
	}
		private static Object get(Object object, String field) throws Exception {
		  Field f = object.getClass().getDeclaredField(field);
		  f.setAccessible(true);
		  return f.get(object);
		 }

	
}
