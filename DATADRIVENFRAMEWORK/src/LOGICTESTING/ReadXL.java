package LOGICTESTING;

import java.io.IOException;

import CONFIGURATIONS.config;
import LIBRARIES.Xls_Reader;

public class ReadXL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Xls_Reader x1=new Xls_Reader(config.TestData);
		//System.out.println(x1.getrowcount("Sheet1"));
		
		int rows=x1.getrowcount("Sheet1");
		int cols=x1.getColumncount("Sheet1");
		String[][] data= new String[rows-1][cols];//ignore header row
		
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=x1.getCellData("Sheet1", r, c);//data[0][0]
				
			}
		}
		
		for(int r=0; r<data.length; r++)
		{
			for(int c=0; c<data[r].length; c++)
			{
				System.out.println(data[r][c]);
			}
		}
		
		
		
		
	}

}
