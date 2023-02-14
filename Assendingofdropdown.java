package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class Assendingofdropdown extends Apputils {

	public static void main(String[] args) {
		utils.Apputils.launchapp("https://amazon.com");
        Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
       List<WebElement> catlist= cat.getOptions();
      // String str1=catlist.get(0).getText();
     //  String str2 =catlist.get(1).getText();
       String item1;
       String item2;
       boolean ordered= true;
       for(int i=1;i<catlist.size();i++)
       {
        item1 = catlist.get(i-1).getText();
        item2= catlist.get(i).getText();
        if(item2.compareToIgnoreCase(item1)<0)
        
        ordered=false;
        	break;
	}
        if (ordered)
	{System.out.println("all items  displayin assending order: test pass");
	}else {System.out.println("all items are not display in order : test fail");
	}
       }
}
