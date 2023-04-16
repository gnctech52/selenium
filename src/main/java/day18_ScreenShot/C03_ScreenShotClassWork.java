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
        //Techproeducation sayfas�na gidelim
        driver.get("https://techproeducation.com");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklam� kapat�yorum
        //sayfan�n resmini alal�m
        tumSayfaResmi();
        //Arama b�l�m�nde java aratal�m
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java", Keys.ENTER);
        //ve sonuc yaz�s�n�n resmini alal�m
        WebElement sonucYazisi = driver.findElement(By.xpath("//h1"));
        webElementResmi(sonucYazisi);//Method kullanarak Webelementin resmini ald�k
        //Yeni bir sekmede amazona gidelim
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");
        //sayfan�n resmini alal�m
        tumSayfaResmi();
        //arama b�l�mde iphone aratal�m
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //ve sonuc yaz�s�n�n resmini alal�m
        WebElement sonucYazisi2 = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        webElementResmi(sonucYazisi2);//Method kullanarak Webelementin resmini ald�k
        //tekrar tecpro sayfas�na ge�elim ve sayfa resmini alal�m
        window(0);
        tumSayfaResmi();
    }

    }
