package com.amazon.Amzon;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANBARUVI\\eclipse-workspace\\Amzon\\Drivers\\newchromed.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		
//		String[] url = {"https://www.naukri.com","https://www.facebook.com/","https://www.instagram.com/","https://www.amazon.in/"};
////		url[0] = "https://www.naukri.com";
////		url[1] = "https://www.facebook.com/";
////		url[2] = "https://www.amazon.in/";
////		url[3] = "https://www.instagram.com/";
//		int urls = url.length;
//		System.out.println("Number of Website: "+urls);
//		for (String string : url) {
//			driver.get(string);
//			driver.manage().window().maximize();
//
//	
//		
//		TakesScreenshot t = (TakesScreenshot) driver;
//		File scr = t.getScreenshotAs(OutputType.FILE);
//		File drc = new File("C:\\Users\\ANBARUVI\\eclipse-workspace\\Amzon\\Screenshot\\am.png");
//		
//		try {
//			FileUtils.copyFile(scr, drc);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		}
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='external text']"));
		for (WebElement web : elements) {
			web.getAttribute("href");
			System.out.println(elements.size());
		}
		
		
		
		driver.close();
	
	}
}
