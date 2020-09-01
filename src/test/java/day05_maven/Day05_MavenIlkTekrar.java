package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day05_MavenIlkTekrar {
    public static void main(String[] args) {
// Browserları kullanabilmek için WebDriverManager kütüphanesini kullanıyor.
        WebDriverManager.chromedriver().setup();//System.setProperty()
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.amozon.com");

        WebElement bestSellerLink= driver.findElement(By.xpath("//a[@aria-label='Best Sellers in Kitchen - See more']"));
        bestSellerLink.click();
           /*
           <span class="a-color-state a-text-bold">Best Sellers in Kitchen</span>
            */
        WebElement urunAdedi=driver.findElement(By.id("s-result-info-bar-content"));
        System.out.println(urunAdedi.getText());
        List<WebElement> list= driver.findElements(By.xpath("//h2[@class='a-size-medium s-inline s-access-title a-text-normal']"));
        for (WebElement w:list){
            System.out.println(w.getText());

        }
        System.out.println("sayfadaki urun sayisi"+list.size());
        System.out.println(list.get(6));
    }
}