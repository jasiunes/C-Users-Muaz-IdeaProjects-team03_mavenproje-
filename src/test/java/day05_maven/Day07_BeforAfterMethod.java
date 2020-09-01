package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day07_BeforAfterMethod {

    @BeforeClass
    public static void setup() {
        System.out.println("BsetUp calisti");
    }

    @Before
    public void methoddanOnce() {
        System.out.println("methoddanOnce çalıştı.");
    }

    @After
    public void methoddanSonra() {
        System.out.println("methoddanSonra çalıştı..");
    }

    @Ignore
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }
    @Test
    public void test3(){
        System.out.println("Test3 calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti.");

    }

}
