package projeto.cucumber.correios.config;



import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.cucumber.correios.drivers.Drivers;

public class InicializarTeste extends Drivers{
	
	
	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.correios.com.br/");
	}
	
	
	public static void fecharNavegador() {
		driver.quit();
	}
	}
