package dataProvider;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigDataProvider {Properties pro;
{
	File src = new File("./Configuration/config.properties");
	try {
		
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
	} 
	catch (Exception e) {
		System.out.println(e.getMessage());
 		}
}

public String getChromePath()
{
	return(pro.getProperty("ChromeDriver"));

}

public String getURL()
{
	return(pro.getProperty("URL"));
}


}


