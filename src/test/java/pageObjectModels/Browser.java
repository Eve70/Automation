package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class Browser {

        private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

        public static WebDriver getBrowser(String browserName) {
            WebDriver driver = null;

            switch (browserName) {
                case "Chrome":
                    driver = drivers.get("Chrome");
                    if (driver == null) {
                        System.setProperty("webdriver.chrome.driver","C://Users//Evi//Desktop//Selenium//chromedriver.exe");
                        driver = new ChromeDriver();
                        drivers.put("Chrome", driver);
                    }
                    break;
            }
            return driver;
        }

        public static void closeAllDriver() {
            for (String key : drivers.keySet()) {
                drivers.get(key).close();
                drivers.get(key).quit();
            }
        }
    }
