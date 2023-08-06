import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BotMain {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Arka Brian\\Documents\\Arka\\Project kodingan\\BOT SIAKWAR\\Java\\BotSiak\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        String URL_Login = "https://academic.ui.ac.id";
        String URL_Home = "https://academic.ui.ac.id/main/Welcome";
        String URL_IRS = "https://academic.ui.ac.id/main/CoursePlan/CoursePlanEdit";

        driver.get(URL_Login);
//        WebDriverWait wait = new WebDriverWait(driver, 10);

        String UsernameArka = "arka.brian";
        String PasswordArka = "saitamu1304++";

        String UsernameDevina = "devina.arinda";
        String PasswordDevina = "3076Dev1rez2";
        String[] MatkulDevina = {"702958-2", //Analisis Data & Penulisan Ilmiah 01 DONE
                                 "702967-3", //Fisika Material 3-01 DONE
                                 "702416-2", //K3LL-03 DONE
                                 "702972-3", //Korosi & Proteksi Logam 02 DONE
                                 "702978-2", //Material Energi DONE
                                 "702979-2", //Material Polimer 01
                                 "702984-2", //Pengolahan Mineral 01
                                 "702987-3", //Perlakuan Panas & Rekayasa Permukaan 01
                                 "702989-1"};//Praktikum Karakterisasi Material

        String UsernameAriq = "ahmad.nauval";
        String PasswordAriq = "siakwar1234";
        String[] MatkulAriq = {"703391-3", //Peranc Organisasi dan Psikologi Industri 02
                               "703376-3", //Faktor Manusia dalam Rekayasa & Desain 02
                               "703399-2", //Reliabilitas dan Pemeliharaan 02
                               "703393-3", //Perancangan Produksi & Pengendalian Persediaan 02
                               "703401-3", //Sistem Kualitas 02
                               "703434-2", //Analitika dan Visualisasi Data 03
                               "703387-3", //Pemodelan Sistem 02
                               "703389-3"};//Penelitia Operasi 02

        WebElement UsernameField = driver.findElement(By.name("u"));
        UsernameField.sendKeys(UsernameDevina);
        WebElement PasswordField = driver.findElement(By.name("p"));
        PasswordField.sendKeys(PasswordDevina);
        PasswordField.sendKeys(Keys.RETURN);

        TimeUnit.SECONDS.sleep(5);

        Actions mouse = new Actions(driver);

        WebElement IrsDropdown = driver.findElement(By.xpath("//*[text()='IRS']"));
        mouse.moveToElement(IrsDropdown).perform();
        WebElement IrsMenu = driver.findElement(By.xpath("//*[text()='Isi/Ubah IRS']"));
        mouse.moveToElement(IrsMenu).click().perform();

//        String[] MatkulID = {"r16", "r18", "r19", "r52", "r103", "r108", "r109", "r112"};
//
//        driver.get("C:\\Users\\Arka Brian\\Documents\\Arka\\Project kodingan\\BOT SIAKWAR\\Java\\BotSiak\\Simulasi IRS\\Pengisian IRS.htm");
//
//        for (String id: MatkulID) {
//            WebElement div = driver.findElement(By.id(id));
//            List<WebElement> RadioInput = div.findElements(By.xpath("//*[@id='"+id+"']//input[@type='radio']"));
//
//            for (WebElement radio: RadioInput) {
//                 radio.click();
//            }
//
//        }
//
//        driver.findElement(By.name("submit")).click();


//        driver.get(URL_IRS);
        String[] MatkulValue = {"702754-3",  //Analisis Algoritma 02
                                "702785-3",  //Sistem Siber-Fisik 02
                                "702766-4",  //Matematika Teknik 04
                                "702755-4",  //Desain & Manajemen Jaringan 01
                                "702781-3",  //Sistem Basis Data 02
                                "702752-2",  //Aljabar Linear Lanjut 02
                                "702782-2",  //Sistem Operasi 01
                                "702776-1"}; //Praktikum RE

        TimeUnit.SECONDS.sleep(5);

        for (String value: MatkulDevina) {
            driver.findElement(By.cssSelector("input[value='"+value+"']")).click();
        }

//        driver.findElement(By.cssSelector("input[value='673415-3']")).click(); //ALJUT 2
//        driver.findElement(By.cssSelector("input[value='672866-4']")).click(); //ANALGOR 3

        driver.findElement(By.name("submit")).click();


    }
}