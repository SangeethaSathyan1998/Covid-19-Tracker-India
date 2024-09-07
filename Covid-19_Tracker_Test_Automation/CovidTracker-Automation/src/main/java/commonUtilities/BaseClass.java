package commonUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass extends BrowserConfig{
	public static org.apache.log4j.Logger log = Logger.getLogger(Logger.class);
	public static void waitInSeconds(int waitSec) {
		try {
			Thread.sleep(waitSec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDropdownByIndex(WebElement ele, int index)
	{
		ele.click();
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
	}
}
