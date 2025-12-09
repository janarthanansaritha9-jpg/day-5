package testleaf;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5 {

	public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.github.com/");
	
	driver.manage().window().maximize();
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	
	File destination=new File("./JEEVAN/github.png");
	
	FileUtils.copyFile(source, destination);
			

	}

}
