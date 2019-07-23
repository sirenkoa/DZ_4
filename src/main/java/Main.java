import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\MY\\QA ITEA\\QA automation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        By tel_xpath = By.xpath("//a[@class='phone_header']");
        By tel_css = By.cssSelector(".phone_header");
        Thread.sleep(5000);
        for (int i = 0; i < 2; i++)
             if (i < 1) {
                driver.get("http://iteaua-develop.demo.gns-it.com/ru/about-itea/");
                String attribute_xpath = driver.findElement(tel_xpath).getAttribute("href");
                System.out.println(attribute_xpath.substring(7));

             } else {
                driver.get("http://iteaua-develop.demo.gns-it.com/ru/about-itea/");
                String attribute_css = driver.findElement(tel_css).getAttribute("href");
                System.out.println(attribute_css.substring(7));
             }
        driver.quit();

    }

}

       /*
        driver.get("https://www.google.com/");
        String attribute = driver.findElement(By.id("gb_70")).getAttribute("href");//'href' attribute value for 'signin' element
        System.out.println(attribute);
        System.out.println("sadasdas");
        driver.close();
*/
 /*
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\MY\\QA ITEA\\QA automation\\chromedriver_win32\\chromedriver.exe");
        for(int i = 0; i < 2; i++) {
            WebDriver driver = new ChromeDriver();
            driver.get("http://iteaua-develop.demo.gns-it.com/ru/about-itea/");

            By tel_xpath = By.xpath("//a[@class='phone_header']");
            By tel_css = By.cssSelector(".phone_header");
            Thread.sleep(5000);

            String attribute_xpath = driver.findElement(tel_xpath).getAttribute("href");
            String attribute_css = driver.findElement(tel_css).getAttribute("href");
            System.out.println(attribute_xpath.substring(7));
            System.out.println(attribute_css.substring(7));

            driver.quit();
        }

    }
    */
