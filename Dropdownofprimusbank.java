package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class Dropdownofprimusbank extends Apputils {

	public static void main(String[] args) {
		utils.Apputils.launchapp("http://primusbank.qedgetech.com/");
      Select drop = new Select(driver.findElement(By.id("drlist")));
      List<WebElement> droplist= drop.getOptions();
      String item1;
      String item2;
      boolean ordered = false;
      for ( int i=1;i<droplist.size();i++)
      { item1 = droplist.get(i-1).getText();
        item2 = droplist.get(i).getText();
        if(item2.compareToIgnoreCase(item1)<0)
        	{ordered=true;
              break;
	}if(ordered)
	{System.out.println("items displayed in assending order : test pass");
	}else 
	{
		System.out.println("items are not displayed in assending order : test fail");
	}
	}
	}
}
