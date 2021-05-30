import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Optional;


public class Test1 {


    @Test
    public void positiveTestForClickMeButton() {
    ChromeDriver driver = new ChromeDriver();
    driver.get ("https://testpages.herokuapp.com/styled/index.html");
    WebElement JavaScript = driver.findElement ( By.id("clickdisplaytest"));
    JavaScript.click();
    WebElement clickMeButton = driver.findElement(By.id("button"));
    clickMeButton.click();
    if(clickMeButton.isSelected());{
        stampaj("Dugme je kliknuto " );
        }
        }
    public static void stampaj(String s) {
        System.out.println(s);
    }
    }

