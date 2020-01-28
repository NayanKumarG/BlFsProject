package com.bridgelabz.oop.serviceimpl;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import com.bridgelabz.oop.controller.StockManagement;
import com.bridgelabz.oop.model.StockModel;
import com.bridgelabz.oop.service.StockInf;


/*
 * implementation for stock management
 */
public class StockManagementImpl implements StockInf{
	JSONObject writeObj = new JSONObject();
	//method to write the data into json file
	@SuppressWarnings("unchecked")
	@Override
	public void writeData(StockModel smodel) {
		JSONObject obj = new JSONObject();
			obj.put("Numberofshares",smodel.getNumOfShare());
			obj.put("SharePrice", smodel.getPrice());
			writeObj.put(smodel.getName(),obj);
			
			/*HashMap<String,Object> map = new HashMap<>();
			HashMap<String,Object> map1 = new HashMap<>();
				
				map.put("Numberofshares",smodel.getNumOfShare());
				map.put("SharePrice", smodel.getPrice());
				JSONObject obj = new JSONObject(map);
				map1.put(smodel.getName(), obj);
				writeObj = new JSONObject(map1);*/
		try(FileWriter file = new FileWriter("/home/user/eclipse-workspace/Oop"
				+ "/src/main/java/com/bridgelabz/oop/repository/stock.json"))
		{

			file.write(writeObj.toJSONString());
		}catch(IOException e)
		{
			System.out.println("Directory or file not found");
		}
	}
	/*
	 * method to read json data
	 */
	@Override
	public void readData() {
		JSONParser parser = new JSONParser();
		StockManagement sm = new StockManagement();
		try(FileReader file = new FileReader("/home/user/eclipse-workspace/Oop"
				+ "/src/main/java/com/bridgelabz/oop/repository/stock.json"))
		{

			JSONObject obj = (JSONObject) parser.parse(file);
			for(Object keys : obj.keySet())
			{
				String key = (String)keys;
				JSONObject jobj = (JSONObject) obj.get(key);
				
				System.out.println(key+" stock:"+jobj);
				System.out.println("stock value:"+sm.stockValue(jobj));


			}
			System.out.println("Total stock value:"+sm.getTotal());

		}catch(IOException | ParseException e)
		{
			System.out.println("Directory or file not found");
		}
	}


}
