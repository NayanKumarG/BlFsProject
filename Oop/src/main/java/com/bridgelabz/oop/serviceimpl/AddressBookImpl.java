package com.bridgelabz.oop.serviceimpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.oop.model.BookModel;
import com.bridgelabz.oop.service.AddressBookInf;
import com.bridgelabz.util.Utility;

public class AddressBookImpl implements AddressBookInf {

	private static File file;
	private static FileReader reader;
	private static JSONObject object;
	private static JSONParser parser;
	private static JSONObject writeObject;
	private static JSONArray array = new JSONArray();
	@SuppressWarnings("unchecked")
	/*
	 * method to add person profile
	 */
	@Override
	public void addProfile(BookModel bmodel) {
		object = new JSONObject();
		writeObject = new JSONObject();
		object.put("FirstName", bmodel.getFirstName());
		object.put("LastName", bmodel.getLastName());
		object.put("Address", bmodel.getAddress());
		object.put("City", bmodel.getCity());
		object.put("State", bmodel.getState());
		object.put("ZipCode", bmodel.getZip());
		object.put("PhoneNo", bmodel.getPhoneNo());
		writeObject.put(bmodel.getUserId(), object);
		array.add(writeObject);

		try(FileWriter file = new FileWriter( "/home/user/eclipse-workspace/Oop/"
				+ "src/main/java/com/bridgelabz/oop/repository/addressBook.json"))

		{

			file.write( array.toJSONString());

			System.out.println("Details added succefully....");

		} catch (IOException e) {
			System.out.println("File not found or wrong directory");
		}


	}

	/*
	 * method to display person detail
	 */
	@Override
	public void dispalyProfile(String user) {
		parser = new JSONParser();

		try(FileReader file = new FileReader( "/home/user/eclipse-workspace/Oop/"
				+ "src/main/java/com/bridgelabz/oop/repository/addressBook.json"))
		{
			System.out.println("-----Your detail----");
			array = (JSONArray) parser.parse(file);
			JSONObject obj = new JSONObject();
			Iterator<?> iterator =  array.iterator();
			while(iterator.hasNext())
			{
				object = (JSONObject) iterator.next();
				if(object.containsKey(user))
				{
					obj = (JSONObject) object.get(user);
					System.out.println("FirstName:"+obj.get("FirstName"));
					System.out.println("LastName:"+obj.get("LastName"));
					System.out.println("Address:"+obj.get("Address"));
					System.out.println("City:"+obj.get("City"));
					System.out.println("State:"+obj.get("State"));
					System.out.println("ZipCode:"+obj.get("ZipCode"));
					System.out.println("PhoneNo:"+obj.get("PhoneNo"));

					return;
				}
			}
			System.out.println("UserId not found");

		} catch (FileNotFoundException e) {
			System.out.println( "Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}

	}

	@Override
	public boolean checkUser(BookModel bmodel) {
		try
		{

			file = new File("/home/user/eclipse-workspace/Oop"
					+ "/src/main/java/com/bridgelabz/oop/repository/addressBook.json");
			if(file.exists())
			{
				parser = new JSONParser();
				reader = new FileReader(file);
				array = (JSONArray) parser.parse(reader);
				Iterator<?> iterator =  array.iterator();
				while(iterator.hasNext())
				{
					JSONObject object = (JSONObject) iterator.next();
					if(object.containsKey(bmodel.getUserId()))
					{

						return true;
					}

				}
				return false;
			}
			else
			{
				System.out.println("file not found");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	/*
	 * method to remove a profile
	 */
	@Override
	public void removeProfile(String userId) {
		parser = new JSONParser();
		try(FileReader file = new FileReader("/home/user/eclipse-workspace/Oop"
				+ "/src/main/java/com/bridgelabz/oop/repository/addressBook.json"))
		{
			array = (JSONArray) parser.parse(file);
			Iterator<?> iterator =  array.iterator();
			while(iterator.hasNext())
			{
				object = (JSONObject) iterator.next();
				if(object.containsKey(userId))
				{

					array.remove(object);
					System.out.println("Removed successfully");
					break;
				}
			}

			FileWriter writer = new FileWriter("/home/user/eclipse-workspace/Oop"
				
					+ "/src/main/java/com/bridgelabz/oop/repository/addressBook.json");
			
			writer.write(array.toJSONString());
			writer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}
	}


	/*
	 * method to edit the profile
	 */
	@Override
	public void editProfile(String userId) {
		BookModel bmodel = new BookModel();
		parser = new JSONParser();

		int choice;
		char c;
		String newValue;
		try(FileReader file = new FileReader("/home/user/eclipse-workspace/Oop"
				+ "/src/main/java/com/bridgelabz/oop/repository/addressBook.json"))
		{
			array = (JSONArray) parser.parse(file);
			Iterator<?> iterator =  array.iterator();
			while(iterator.hasNext())
			{
				object = (JSONObject) iterator.next();
				if(object.containsKey(userId))
				{
					JSONObject obj = new JSONObject();
					obj = (JSONObject) object.get(userId);
					System.out.println(obj);
					do
					{


						System.out.println("Enter the choice to edit:");
						System.out.println("1.FirstName  2.LastName  3.Address  4.City  5.State  6.ZipCode  7.PhoneNo");
						choice = Utility.inputInteger();
						switch(choice)
						{
						case 1:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setFirstName(newValue);
							obj.replace("FirstName", obj.get("FirstName"), bmodel.getFirstName());
							break;
						case 2:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setLastName(newValue);
							obj.replace("LastName" , obj.get("LastName" ), bmodel.getLastName());
							break;
						case 3:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setAddress(newValue);
							obj.replace("Address", obj.get("Address"), bmodel.getAddress());
							break;
						case 4:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setCity(newValue);
							obj.replace("City", obj.get("City"), bmodel.getCity());
							break;
						case 5:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setState(newValue);
							obj.replace("State", obj.get("State"), bmodel.getState());
							break;
						case 6:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setZip(newValue);
							obj.replace("ZipCode", obj.get("ZipCode"), bmodel.getZip());
							break;
						case 7:
							System.out.println("Enter the new value:");
							newValue = Utility.inputWord();
							bmodel.setPhoneNo(newValue);
							obj.replace("PhoneNo", obj.get("PhoneNo"), bmodel.getPhoneNo());
							break;
						default :
							System.out.println("Enter correct choice");


						}

						System.out.println("Do you want to edit other fields Y/y or N/n");
						c= Utility.inputWord().charAt(0);
					}while(c =='Y' || c == 'y');

					FileWriter writer = new FileWriter( "/home/user/eclipse-workspace/Oop/src/main/java/com/bridgelabz/oop/repository/addressBook.json");
					writer.write(array.toJSONString());
					writer.close();
				}
			}


		}catch (FileNotFoundException e) {
			System.out.println("Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}

	}
}
