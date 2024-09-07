package covidPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class covidPageObjects {
	@FindBy(xpath="//h1[normalize-space()='COVID-19 Tracker - India']")
	public WebElement ismainpage;
	
	@FindBy(xpath="//select[@class='data-filter-input']")
	public WebElement selectdropdown;
	
	@FindBy(xpath="//div[@class=\"display-data\"]//p[1]")
	public WebElement totalcases;
	
	@FindBy(xpath="//div[@class=\"display-data\"]//p[2]")
	public WebElement activecases;
	
	@FindBy(xpath="//div[@class=\"display-data\"]//p[3]")
	public WebElement recovered;
	
	@FindBy(xpath="//div[@class=\"display-data\"]//p[4]")
	public WebElement deaths;
	
	@FindBy(xpath="//div[@class=\"resultCard\"]//h2")
	public WebElement resultcardtitle;
	
	//........................PIE CHART...................................
	@FindBy(xpath="(//div[@class=\"user-select-none svg-container\"])[1]")
	public WebElement piechart;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[2]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][1]/*[name()='rect'][1]")
	public WebElement totalcheckboxpie;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[2]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][2]/*[name()='rect'][1]")
	public WebElement recoveredcheckboxpie;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[2]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][3]/*[name()='rect'][1]")
	public WebElement actvecasescheckboxpie;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[2]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][4]/*[name()='rect'][1]")
	public WebElement deathcheckboxpie;
	
	@FindBy(xpath="//div[@id='modebar-110c62']//a[@class='modebar-btn']//*[name()='svg']//*[name()='path' and contains(@d,'m500 450c-')]")
	public WebElement downloadpie;
	
	//.....................Graph..........................................
	
	@FindBy(xpath="(//div[@class=\"user-select-none svg-container\"])[2]")
	public WebElement graph;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[3]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][1]/*[name()='rect'][1]")
	public WebElement totalcheckboxgraph;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[3]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][2]/*[name()='rect'][1]")
	public WebElement recoveredcheckboxgraph;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[3]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][3]/*[name()='rect'][1]")
	public WebElement actvecasescheckboxgraph;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='container']/div[3]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@class,'infolayer')]//*[name()='g' and contains(@class,'legend')]//*[name()='g' and contains(@class,'scrollbox')]//*[name()='g' and contains(@class,'groups')]//*[name()='g'][4]/*[name()='rect'][1]")
	public WebElement deathcheckboxgraph;
	
	@FindBy(xpath="//div[@id='modebar-edeb1e']//div[1]//a[1]//*[name()='svg']")
	public WebElement downloadchart;
}
