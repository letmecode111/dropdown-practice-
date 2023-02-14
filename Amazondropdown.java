package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class Amazondropdown extends Apputils{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		utils.Apputils.launchapp("https://amazon.com");
	    Select amaz = new Select(driver.findElement(By.id("searchDropdownBox")));
	     List<WebElement>  catlist=amaz.getOptions();
	   catlist.size();
	   System.out.println(catlist.size());
	   
	  //program for count the no of items in dropdown list.
	   
	}
}

