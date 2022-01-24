package StepDefinition;

	public class WriteDataToExcelUsingUtilClass
	{
	    public static void main(String args[]) throws Exception
	    {
	    	Excelapitest eat = new Excelapitest("C:\\Users\\ViNoTh\\eclipse-workspace\\ccumberbbd\\Resources/Book1.xlsx");
	        eat.setCellData("Sheet1","Gender",2,"PASS");
	    }
	
	
}
