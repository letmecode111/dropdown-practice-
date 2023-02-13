package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class Test1 extends Apputils   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	utils.Apputils.launchapp("https://amazon.com");
	Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement> catlist =cat.getOptions();
	System.out.println(catlist.size());

	for (WebElement e : catlist)
	{
		 String catname=  e.getText();
		 System.out.println(catname);
		
	}
	
	
	
		}
	
}
