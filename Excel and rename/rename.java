package StepDefinition;
import java.io.File;
public class rename {
	public static void main(String []args) {
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
