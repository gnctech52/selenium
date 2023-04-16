package day18_ScreenShot;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_ScreenShotClassWork extends TestBase {
    @Test
    public void classWork() {
        //Techproeducation sayfasýna gidelim
        driver.get("https://techproeducation.com");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamý kapatýyorum
        //sayfanýn resmini alalým
        tumSayfaResmi();
        //Arama bölümünde java aratalým
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java", Keys.ENTER);
        //ve sonuc yazýsýnýn resmini alalým
        WebElement sonucYazisi = driver.findElement(By.xpath("//h1"));
        webElementResmi(sonucYazisi);//Method kullanarak Webelementin resmini aldýk
        //Yeni bir sekmede amazona gidelim
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");
        //sayfanýn resmini alalým
        tumSayfaResmi();
        //arama bölümde iphone aratalým
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //ve sonuc yazýsýnýn resmini alalým
        WebElement sonucYazisi2 = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        webElementResmi(sonucYazisi2);//Method kullanarak Webelementin resmini aldýk
        //tekrar tecpro sayfasýna geçelim ve sayfa resmini alalým
        window(0);
        tumSayfaResmi();
    }

    }
