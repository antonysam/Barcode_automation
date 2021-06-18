import java.awt.image.BufferedImage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeAutomation {

	public static void main(String[] args) throws IOException, NotFoundException {
		
		// Provide the Chrome driver location
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samdany\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		// Provide the URL to be loaded
		
		d.get("https://barcode.tec-it.com/en");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
		
		// getting the barcode URL
		
		String barcodeURL = d.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barcodeURL);
		
		URL url = new URL(barcodeURL);
		
		// Read image using barcode 
		
		BufferedImage bufferedImage = ImageIO.read(url);
		
		// Extracting using the zxing API
		
		LuminanceSource luminancesrc = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesrc));
		
		Result result = new MultiFormatReader().decode(binarybitmap);
		
		System.out.println(result.getText());
		

	}

}
