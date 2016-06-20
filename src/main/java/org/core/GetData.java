package main.java.org.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GetData {
	public static ArrayList<Map<String,String>> FromExcel() throws IOException{
		InputStream input=new FileInputStream(Init.path);
			//建立输入流
			HSSFWorkbook hssfwk=new HSSFWorkbook(input);
			//获取casesheet位置
			int sheetindex=hssfwk.getSheetIndex(Init.sheet);
			
			HSSFSheet hssfst=hssfwk.getSheetAt(sheetindex);
			ArrayList<Map<String,String>> list=new ArrayList();
			HSSFRow hssfkeyrow=hssfst.getRow(0);
			HSSFRow hssfrow;
			
			for(int n=1;n<=hssfst.getLastRowNum();n++){
				Map<String,String> map=new HashMap<String,String>();
				hssfrow=hssfst.getRow(n);
				for(int i=0;i<8;i++){
					map.put(String.valueOf(hssfkeyrow.getCell((short) i)),String.valueOf(hssfrow.getCell((short) i)));				
				}
				list.add(n-1, map);
			}
			return list;
	}
}