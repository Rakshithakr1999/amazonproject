package Project2.Amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends Launch_Quit{
	
	public void onTestStart_method() throws IOException
	{
	TakesScreenshot ss1 = (TakesScreenshot) driver;
	File src =ss1.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\dell\\Downloads\\Amazon_Rakshitha\\Amazon_RHM-master\\Amazon\\Screenshots\\OnTestStart"+Math.random()+".png");
	FileUtils.copyFile(src, dest);
	}
	
	public void onTestSuccess_method() throws IOException
	{
		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File src =ss1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\dell\\Downloads\\Amazon_Rakshitha\\Amazon_RHM-master\\Amazon\\Screenshots\\onTestSuccess"+Math.random()+".png");
		FileUtils.copyFile(src, dest);
	}
	
	public void onTestFailure_method() throws IOException
	{
		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File src =ss1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\dell\\Downloads\\Amazon_Rakshitha\\Amazon_RHM-master\\Amazon\\Screenshots\\onTestFailure"+Math.random()+".png");
		FileUtils.copyFile(src, dest);
	}
	
}
