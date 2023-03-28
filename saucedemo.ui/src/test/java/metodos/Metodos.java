package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void acessarSite() {
		String exemplo = "https://www.google.com/";
		String teste = "https://www.saucedemo.com/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(exemplo);
		System.out.println("************* Iniciando Teste ************");
	}
	
	public void clicar(By element) {
		driver.findElement(element).click();
	}
	
	public void escrever(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public void submit(By element) {
		driver.findElement(element).submit();
	}
	
	public void clear(By element) {
		driver.findElement(element).clear();
	}
	
	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
