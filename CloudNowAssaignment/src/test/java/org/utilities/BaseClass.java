package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1 launch chrome

	public static void launchChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();

	}

	// 2 maximize

	public static void maximum() {

		driver.manage().window().maximize();
	}

	// 3 To load URL

	public static void gett(String url) {
		driver.get(url);
	}

	// 4 SendKeys
	public static void sendkey(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	// 5 Click

	public static void clicks(WebElement ele) {

		ele.click();

	}

	// 6 SendKeys
	public static void sendkeyy(WebElement ref, String value) {
		Actions a = new Actions(driver);

		a.sendKeys(ref, value).perform();
	}

	
	// 7 Scrooldown

	public static void javascriptscrolldown(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}
	// 8 Javascript Click

	public static void javascriptclick(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", ref);

	}
	// 9 Javascript sendkeys

	public static void javascriptsendkeys(WebElement ref, String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','" + text + "')", ref);

	}

	//10 Dropdown select by visible text
	public static void dropdownselectbyvisibletext(WebElement ref, String value) {

		Select s = new Select(ref);

		s.selectByVisibleText(value);

	}
	
	//11 Implicit waits

	public static void implicitwaits() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//12 To pass data from xl sheet using data driven framework

	public static String getdataxlsheet(int rownumber, int cellnumber) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\XlSheet\\cloudnow.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheetAt(0);

		Row row = sheet.getRow(rownumber);
		Cell cell = row.getCell(cellnumber);

		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dat = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd mmm yyyy");
			value = sim.format(dat);
		}

		else {
			double num = cell.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);
		}
		return value;
	}
	
	
	//13 screenshot
	
	public static void screenshots(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir")+"\\target\\scrnshot\\"+name+".jpg");
		FileUtils.copyFile(src, f);
	}

}


