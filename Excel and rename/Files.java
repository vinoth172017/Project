package StepDefinition;

import java.io.File;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Files {
	public static void main(String []args) {
		WebDriver driver;	
		 System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");	
		 ChromeOptions options = new  ChromeOptions();
		 HashMap<String, Object> prefs =new HashMap<String, Object>();
		 prefs.put("download.default_directory", System.getProperty("user.dir")+"\\Xml files");
		 prefs.put("safebrowsing.enabled", "true");
		options.setExperimentalOption("prefs", prefs);
		 
	       driver= new ChromeDriver(options);
	       driver.manage().window().maximize();
	       driver.get("https://drive.google.com/uc?id=1vR_QZLt5KneMfqU07kYt-EkgtejQIG3b&export=download");
	       driver.findElement(By.xpath("//*[@id=\"uc-download-link\"]")).click();
	       File path = new File(System.getProperty("user.dir")+"\\Xml files");
	       File repath = new File(System.getProperty("user.dir")+"\\afterrename");
	       String[] fileList = path.list();
	        for(String name:fileList){
	            System.out.println(name);
	        
	            String input="sanjeev_";
	            if(name.contains("Request"))
	            {
	            	String request="Request";
	            	System.out.println(request);
	            	 File newname= new File(input+request+".xml");
	            	  File rpath=null;
	  	            File[] files =path.listFiles();
	  	            for(File file :files) {
	  	            	rpath= new File(path.getPath()+"\\"+file.getName());
	  	            	rpath.renameTo(new File(repath.getPath()+"\\"+newname.getName()));
	            }
	            }
	            else if(name.contains("Response"))
	            {
	            	String response="Response";
	            	System.out.println(response);
	            	 File newname= new File(input+response+".xml");
	            	  File rpath=null;
	  	            File[] files =path.listFiles();
	  	            for(File file :files) {
	  	            	rpath= new File(path.getPath()+"\\"+file.getName());
	  	            	rpath.renameTo(new File(repath.getPath()+"\\"+newname.getName()));
	            }
	         
	          
	       
	       
	}
	}
}
}

