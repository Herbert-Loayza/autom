package tester1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class NewTest {
	private WebDriver driver;
	


	@BeforeClass
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sodimac.com.pe/sodimac-pe/");
	}
	
//	
//	String searchBoxPath = "//input[@type='text']";
//	String textXPath = "//p[@class='text-uppercase fontLatoBold']";
//	String txtSearchItem_01 = "DALE PERSONALIDAD A TU HOGAR Y RENUEVA TUS ESPACIOS CON NUESTROS PRODUCTOS.";
//	
//	@Test
//	public void Test01() {
//		System.out.println("TEST_01");
//		driver.findElement(By.xpath("//div[@class='d-none d-lg-inline MiniAccount-module_account-name__2JmeG']"))
//				.click();
//		driver.findElement(By.xpath("(//input[@id='inputEmail'])[1]")).sendKeys("testprueba@gmail.com");
//		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("123456");
//		driver.findElement(By.xpath("(//input[@id='loginSubmit'])[2]")).click();
//
//		String txtResult1 = driver.findElement(By.xpath("(//p[@class='t-error'])[2]")).getText();
//		System.out.println(txtResult1);
//
//		Assert.assertEquals("Tus datos son incorrectos para ingresar.", txtResult1);
//		System.out.println("TEST_01: PASS");
//	}
//
//	@Test
//	public void Test02() throws InterruptedException {
//		System.out.println("TEST_02");
//		driver.findElement(By.xpath("(//a[@class='ListLinks-module_link__NWR5j'])[16]")).click();
//		Thread.sleep(3000);
//		String txtResult2 = driver.findElement(By.xpath("//div[@class='titulo-politicas']")).getText();
//		System.out.println(txtResult2);
//
//		Assert.assertEquals("POLITICA DE PRIVACIDAD", txtResult2);
//		System.out.println("TEST_02: PASS");
//	}
//
//	@Test
//	public void Test03() throws InterruptedException {
//		System.out.println("TEST_03");
//		driver.findElement(By.xpath("(//div[@class='IconFooter-module_text__3iViD'])[3]")).click();
//		Thread.sleep(3000);
//		String txtResult3 = driver.findElement(By.xpath("//h2[@class='jsx-1130062056 seek-order-heading-text']"))
//				.getText();
//		System.out.println(txtResult3);
//
//		Assert.assertEquals("Estado de mis compras", txtResult3);
//		System.out.println("TEST_03: PASS");
//	}
//
//	@Test
//	public void Test04() throws InterruptedException {
//		System.out.println("TEST_04");
//		driver.findElement(By.xpath("(//div[@class='IconFooter-module_text__3iViD'])[7]")).click();
//		Thread.sleep(3000);
//		String txtResult4 = driver.findElement(By.xpath("//h3[@class='bold20']")).getText();
//		System.out.println(txtResult4);
//
//		Assert.assertEquals("VENTA TELEFÓNICA", txtResult4);
//		System.out.println("TEST_04: PASS");
//	}
//
//	@Test
//	public void Test05() throws InterruptedException {
//		System.out.println("TEST_05");
//		driver.findElement(
//				By.xpath("(//div[@class='IconAndInformationItem-module_item-icon-title__2pR_Y text-center'])[1]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult5 = driver
//				.findElement(By.xpath("//h1[@class='elementor-heading-title elementor-size-default']")).getText();
//		System.out.println(txtResult5);
//
//		Assert.assertEquals("LA APP INDISPENSABLE PARA PAGAR Y COBRAR", txtResult5);
//		System.out.println("TEST_05: PASS");
//	}
//
//	@Test
//	public void Test06() throws InterruptedException {
//		System.out.println("TEST_06");
//		driver.findElement(
//				By.xpath("(//div[@class='IconAndInformationItem-module_item-icon-title__2pR_Y text-center'])[2]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult6 = driver.findElement(By.xpath("//h1[@class='section-title']")).getText();
//		System.out.println(txtResult6);
//
//		Assert.assertEquals("SODIMAC PERÚ", txtResult6);
//		System.out.println("TEST_06: PASS");
//	}
//
//	@Test
//	public void Test07() throws InterruptedException {
//		System.out.println("TEST_07");
//		driver.findElement(By.xpath("(//img[@class='d-none d-md-block Banner-module_desktop-img__MjAa6'])[23]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult7 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult7);
//
//		Assert.assertEquals("Productos Outlet", txtResult7);
//		System.out.println("TEST_07: PASS");
//	}
//
//	@Test
//	public void Test08() throws InterruptedException {
//		System.out.println("TEST_08");
//		driver.findElement(By.xpath("(//img[@class='d-none d-md-block Banner-module_desktop-img__MjAa6'])[24]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult8 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult8);
//
//		Assert.assertEquals("Adelanta tu Regalo Navideño", txtResult8);
//		System.out.println("TEST_08: PASS");
//	}
//
//	@Test
//	public void Test09() throws InterruptedException {
//		System.out.println("TEST_09");
//		driver.findElement(By.xpath("(//img[@class='d-none d-md-block Banner-module_desktop-img__MjAa6'])[25]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult9 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult9);
//
//		Assert.assertEquals("Lo mas Vendido", txtResult9);
//		System.out.println("TEST_09: PASS");
//	}
//
//	@Test
//	public void Test10() throws InterruptedException {
//		System.out.println("TEST_10");
//		driver.findElement(By.xpath("(//a[@class='PillButton-module_pill-button__1_Hak'])[2]")).click();
//		Thread.sleep(3000);
//
//		String txtResult10 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult10);
//
//		Assert.assertEquals("Trapos y trapeadores", txtResult10);
//		System.out.println("TEST_10: PASS");
//	}

	@Test
	public void Test11() throws InterruptedException {
		System.out.println("TEST_11");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("TELEVISORES", Keys.ENTER);
		Thread.sleep(3000);
		String txtResult11 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();

		System.out.println(txtResult11);

		Assert.assertEquals("Televisores", txtResult11);
		System.out.println("TEST_11: PASS");
	}

//	@Test
//	public void Test12() throws InterruptedException {
//		System.out.println("TEST_12");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Llantas", Keys.ENTER);
//		Thread.sleep(3000);
//
//		String txtResult12 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult12);
//
//		Assert.assertEquals("Llantas", txtResult12);
//		System.out.println("TEST_12: PASS");
//	}

	@Test
	public void Test13() throws InterruptedException {
		System.out.println("TEST_13");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Taladros", Keys.ENTER);
		Thread.sleep(3000);

		String txtResult13 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
		System.out.println(txtResult13);

		Assert.assertEquals("Taladros", txtResult13);
		System.out.println("TEST_13: PASS");
	}
//
//	@Test
//	public void Test14() throws InterruptedException {
//		System.out.println("TEST_14");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("muebles", Keys.ENTER);
//		Thread.sleep(3000);
//
//		String txtResult14 = driver.findElement(By.xpath("//p[@class='text-uppercase fontLatoBold']")).getText();
//		System.out.println(txtResult14);
//
//		Assert.assertEquals("DALE PERSONALIDAD A TU HOGAR Y RENUEVA TUS ESPACIOS CON NUESTROS PRODUCTOS.", txtResult14);
//		System.out.println("TEST_14: PASS");
//	}
//
//	@Test
//	public void Test15() throws InterruptedException {
//		System.out.println("TEST_15");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("piscinas", Keys.ENTER);
//		Thread.sleep(3000);
//
//		String txtResult15 = driver.findElement(By.xpath("//div[@class='banner__menu__cabecera']")).getText();
//		System.out.println(txtResult15);
//
//		Assert.assertEquals("VERANO", txtResult15);
//		System.out.println("TEST_15: PASS");
//	}
//
//	@Test
//	public void Test16() throws InterruptedException {
//		System.out.println("TEST_16");
//		driver.findElement(By.xpath("(//li[@class='list-inline-item'])[13]")).click();
//		Thread.sleep(3000);
//
//		String txtResult16 = driver.findElement(By.xpath("//span[@class='fbra_text']")).getText();
//		System.out.println(txtResult16);
//
//		Assert.assertEquals("Carro de compras vacío", txtResult16);
//		System.out.println("TEST_16: PASS");
//	}
//
//	@Test
//	public void Test17() throws InterruptedException {
//		System.out.println("TEST_17");
//		driver.findElement(By.xpath("(//img[@class='d-none d-md-block Banner-module_desktop-img__MjAa6'])[23]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult17 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult17);
//
//		Assert.assertEquals("Productos Outlet", txtResult17);
//		System.out.println("TEST_17: PASS");
//	}
//
//	@Test
//	public void Test18() throws InterruptedException {
//		System.out.println("TEST_18");
//		driver.findElement(By.xpath("(//img[@class='d-none d-md-block Banner-module_desktop-img__MjAa6'])[24]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResul18 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResul18);
//
//		Assert.assertEquals("Adelanta tu Regalo Navideño", txtResul18);
//		System.out.println("TEST_18: PASS");
//	}
//
//	@Test
//	public void Test19() throws InterruptedException {
//		System.out.println("TEST_19");
//		driver.findElement(By.xpath("(//img[@class='d-none d-md-block Banner-module_desktop-img__MjAa6'])[25]"))
//				.click();
//		Thread.sleep(3000);
//
//		String txtResult19 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult19);
//
//		Assert.assertEquals("Lo mas Vendido", txtResult19);
//		System.out.println("TEST_19: PASS");
//	}
//
//	@Test
//	public void Test20() throws InterruptedException {
//		System.out.println("TEST_20");
//		driver.findElement(By.xpath("(//a[@class='PillButton-module_pill-button__1_Hak'])[2]")).click();
//		Thread.sleep(3000);
//
//		String txtResult20 = driver.findElement(By.xpath("//h1[@class='jsx-245626150 category-title']")).getText();
//		System.out.println(txtResult20);
//
//		Assert.assertEquals("Trapos y trapeadores", txtResult20);
//		System.out.println("TEST_20: PASS");
//	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
