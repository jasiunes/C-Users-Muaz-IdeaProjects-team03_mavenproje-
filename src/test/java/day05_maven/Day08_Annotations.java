package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_Annotations {
    private static WebDriver driver;
    @BeforeClass
    public static void setUo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Before
    public void testtenOnce(){
      driver.get("http://amazon.com");
    }
@Test
    public void test1(){
    WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
     aramaKutusu.sendKeys("drohne");
     aramaKutusu.click();
}
@Test
public void test2(){
    WebElement sonucSayiyi = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
    System.out.println(sonucSayiyi.getText());
}
@Test
public void tets3(){
        WebElement aramaKutusu = driver.findElement(By.id(""));
}
@After
public void testtenSonra(){
        WebElement sonucSayisi = driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
}
@AfterClass
    public static void tearDown(){
//driver.quit();
}
}
