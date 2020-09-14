package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class
MavenTest01 {
    public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();//System.setProperty()
            WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.thetrainline.com/");
/*
1.” https://www.thetrainline.com” Adresine gidin
2. Return Radio Button’unu secin
3. Return Radio Button’unu secildigini kontrol edin
4. ReturnDate input kutusunun erisilebilir oldugunu control edin
5. The One Way radio butonunun secili olmadigini control edin
 */
        WebElement returnButton=driver.findElement(By.id("//input[@id='return']"));
        returnButton.click();
        if(returnButton.isSelected()){
            System.out.println("Return Radio Button’u secili");
        }else {
            System.out.println("Return Radio Button’u secili degil");


        }

    }
}
