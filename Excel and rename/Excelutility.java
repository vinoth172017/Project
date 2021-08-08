package Excel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelutility {
	public static List<Map<String, String>> getTestDataInMap(String a) throws IOException {
		List<Map<String, String>> testDataAllRows=null;
	Map<String, String> testData=null;
	try {
		FileInputStream fileinputstrem=new FileInputStream(System.getProperty("user.dir")+"/Resources/Book1.xlsx");
		Workbook workbook= new XSSFWorkbook(fileinputstrem);
		Sheet sheet=workbook.getSheet(a);
		int lastRowNumber=sheet.getLastRowNum();
		//System.out.println(lastRowNumber);
		int lastColNumber=sheet.getRow(0).getLastCellNum();
		//System.out.println(lastRowNumber);
		List list=new ArrayList();
		for(int i=0;i<lastColNumber;i++) {
			Row row=sheet.getRow(0);
			Cell cell=row.getCell(i);
			String rowHeader=cell.getStringCellValue().trim();
			list.add(rowHeader);
		}	
		testDataAllRows= new ArrayList<Map<String,String>>();	
		for(int j=1;j<=lastRowNumber;j++) {
			Row row=sheet.getRow(j);
			testData=new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
			for(int k=0;k<lastColNumber;k++) {
				DataFormatter formatter= new DataFormatter();
				Cell cell=row.getCell(k);	
				String val = formatter.formatCellValue(cell);
				testData.put((String) list.get(k), val);
			}
			testDataAllRows.add(testData);
		}	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	return testDataAllRows;
}
}
