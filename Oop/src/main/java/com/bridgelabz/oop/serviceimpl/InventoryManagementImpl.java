package com.bridgelabz.oop.serviceimpl;
import org.json.simple.parser.*;
import com.bridgelabz.oop.controller.InventoryManagement;
import com.bridgelabz.oop.service.InventoryInf;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.oop.model.*;
/*
 * program implements the inventory data management
 */
public class InventoryManagementImpl implements InventoryInf {

	static Scanner sc = new Scanner(System.in);
	static JSONArray array = new JSONArray();
	static JSONObject writeObject = new JSONObject();
	static InventoryModel imodel = new InventoryModel();
	
	@SuppressWarnings("unchecked")
	
	//method to write into Json file
	@Override
	public void writeJSON(InventoryModel imodel){
		JSONObject obj = new JSONObject();
		obj.put("Name",imodel.getName());
		obj.put("Price",imodel.getPrice());
		obj.put("Weight",imodel.getweight());
		array.add(obj);

		writeObject.put(imodel.getItemName(), array);

		try (FileWriter file = new FileWriter("/home/user/eclipse-workspace/Oop"
				+ "/src/main/java/com/bridgelabz/oop/repository/inventory.json"))
		{
			file.write(writeObject.toJSONString());


		} catch (IOException e) {
			System.out.println("File or given directory not found:");
		}



	}



	//read data from json file
	@Override
	public void readJSON() {
		String items[] = {"Rice" , "Wheats" , "Pulses"};
		InventoryManagement im = new InventoryManagement();
		JSONParser parser = new JSONParser();
		JSONArray jsonArray ;

		try(FileReader file = new FileReader("/home/user/eclipse-workspace/Oop"
				+ "/src/main/java/com/bridgelabz/oop/repository/inventory.json"))
		{
			JSONObject obj = (JSONObject)parser.parse(file);
			for(int i=0 ; i< items.length ;i++)
			{
				//check item is present or not
				if(obj.containsKey(items[i]))
				{
					System.out.println("-----------Details of "+items[i]+"---------");
					jsonArray = (JSONArray)obj.get(items[i]);
					for(int j=0 ;j<jsonArray.size();j++)
					{
						JSONObject object = (JSONObject) jsonArray.get(j);
						System.out.println(object);

						System.out.println("Total amount:"+im.getTotal(object));
					}
				} 
			}

		}catch(IOException | ParseException e){
			System.out.println("File not found:");
		}
	}
}
