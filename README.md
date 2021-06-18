# Barcode_automation
_Automating the barcode extraction process_

## Barcode?
```
A machine-readable code in the form of numbers and a pattern of parallel lines of varying widths, 
printed on a commodity and used especially for stock control.
```
<img src="https://barcode.tec-it.com/barcode.ashx?data=ABC-abc-1234&code=Code128" width="200" height="105" alt="Barcode"/></a>

## Zxing API
```
Free API used for extracting the Barcode 
```
## Packages
```
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
```
## Exceptions
```
throws IOException 
throws NotFoundException
```
## Output
```
![output]("https://github.com/antonysam/Barcode_automation/blob/master/Barcode_Automation/Images/output_barcode.JPG")

