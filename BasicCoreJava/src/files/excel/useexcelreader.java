package files.excel;

import java.io.IOException;

import utility.Xls_Reader;

public class useexcelreader {

	public static void main(String[] args) throws IOException {
		Xls_Reader x1= new Xls_Reader(System.getProperty("user.dir")+"\\TestData.xls");
		String str=x1.getCellData("Sheet1", 1, 1);
		System.out.println(str);
		
		String str2=x1.getCellData("Sheet1",3, "Username");
		System.out.println(str2);
		
		int rows=x1.getrowcount("Sheet1");
		System.out.println(rows);
		int cols=x1.getColumncount("Sheet1");
		System.out.println(cols);
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				System.out.println(x1.getCellData("Sheet1", r, c));
			}
				
			
		}
	
		

	}

}
