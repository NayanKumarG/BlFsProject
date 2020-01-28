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

import com.bridgelabz.oop.datastructure.*;
import com.bridgelabz.oop.model.StockAccountModel;
import com.bridgelabz.oop.service.StockAccountInf;
import com.bridgelabz.util.Utility;
import com.bridgelabz.oop.datastructure.OrderedLinkedList;

public class StockAccountImpl implements StockAccountInf{
	OrderedLinkedList<String> oll = new OrderedLinkedList<>();
	StackLinkedList<String> sll = new StackLinkedList<>();
	JSONArray array= new JSONArray();
	//@SuppressWarnings("unchecked")

	/*
	 * method to create user account
	 */
	@Override
	public void createAccount(StockAccountModel saModel) {

		JSONObject obj = new JSONObject();
		JSONObject object = new JSONObject();
		obj.put("symbol", null);
		obj.put("balance", saModel.getAmount());
		obj.put("noOfShares",0);
		object.put(saModel.getName(), obj);
		array.add(object);

		try(FileWriter writer = new FileWriter("/home/user/eclipse-workspace/Oop"

					+ "/src/main/java/com/bridgelabz/oop/repository/userAccounts.json"))
		{

			writer.write(array.toJSONString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}


	/*
	 * method to check user already added or not
	 */
	@Override
	public boolean checkUser(String user) {

		JSONParser parser = new JSONParser();
		try(FileReader file = new FileReader("/home/user/eclipse-workspace/Oop"

				+ "/src/main/java/com/bridgelabz/oop/repository/userAccounts.json"))
		{

			array =  (JSONArray) parser.parse(file);
			Iterator<?> iterator = array.iterator();
			JSONObject obj = new JSONObject();
			while(iterator.hasNext())
			{
				obj = (JSONObject) iterator.next();

				if (obj.containsKey(user))
				{
					return true;
				}
			}
			return false;
		} catch (FileNotFoundException e) {
			System.out.println( "Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}
		return false;


	}


	/*
	 * to check the available shares
	 */
	@Override
	public void checkShare() {
		JSONParser parser = new JSONParser();
		try(FileReader file = new FileReader("/home/user/eclipse-workspace/Oop"

				+ "/src/main/java/com/bridgelabz/oop/repository/companyStock.json"))
		{

			JSONArray array =  (JSONArray) parser.parse(file);
			Iterator<?> iterator = array.iterator();
			JSONObject obj = new JSONObject();
			JSONObject jobj = new JSONObject();
			while(iterator.hasNext())
			{
				obj = (JSONObject) iterator.next();

				for(Object keys : obj.keySet())
				{
					String key = (String)keys;
					if (!oll.search(key))
					{
						oll.add(key);
					}
					jobj = (JSONObject) obj.get(key);
					System.out.println("-------"+key+" stock detail"+"-----");
					System.out.println(jobj);
				}

			}
		}catch(IOException | ParseException e)
		{
			System.out.println("Directory or file not found");
		}

	}

	/*
	 * method to buy share
	 */
	@Override
	public void buyShare(String name, String symbol) {
		try
		{
			JSONParser parser = new JSONParser();
			File file = new File("/home/user/eclipse-workspace/Oop"
					+ "/src/main/java/com/bridgelabz/oop/repository/userAccounts.json");
			FileReader reader = new FileReader(file);


			File file1 = new File("/home/user/eclipse-workspace/Oop"
					+ "/src/main/java/com/bridgelabz/oop/repository/companyStock.json");
			FileReader reader1 = new FileReader(file1);

			JSONArray userArray =  (JSONArray) parser.parse(reader);
			Iterator<?> iterator1 = userArray.iterator();
			JSONObject userObj = new JSONObject();
			JSONObject userObj1 = new JSONObject();

			JSONArray stockArray =  (JSONArray) parser.parse(reader1);
			Iterator<?> iterator2 = stockArray.iterator();
			JSONObject stockObj = new JSONObject();
			JSONObject stockObj2 = new JSONObject();

			boolean flag =false;

			while(iterator2.hasNext())
			{
				stockObj = (JSONObject) iterator2.next();
				if(stockObj.containsKey(symbol))
				{

					stockObj2 = (JSONObject) stockObj.get(symbol);
					long stockShareCount = Long.parseLong(stockObj2.get("NumberOfShares").toString());
					System.out.println("Available shares: "+stockShareCount);
					while(iterator1.hasNext())
					{
						userObj = (JSONObject) iterator1.next();
						if(userObj.containsKey(name))
						{
							userObj1 = (JSONObject) userObj.get(name);
							do
							{
								System.out.println("Enter the number of shares you want to buy");
								int n = Utility.inputInteger();

								if(n<=stockShareCount && n>0)
								{
									long userShareCount = Long.parseLong(userObj1.get("noOfShares").toString());
									long userAmount = Long.parseLong(userObj1.get("balance").toString());
									long stockPrice = Long.parseLong(stockObj2.get("SharePrice").toString());
									long newUserAmount = userAmount-(n*stockPrice);
									long newUserShareCount = userShareCount+n;
									//int stockNumberOfShares = Integer.parseInt(stockObj2.get("NumberOfShares").toString());
									long newstockNumberOfShares = stockShareCount-n; 
									if(newUserAmount<0)
									{
										System.out.println("Sorry amount not available");
										flag=false;
									}
									else
									{
										sll.push(symbol);

										userObj1.replace("noOfShares", userShareCount, newUserShareCount);
										userObj1.replace("balance", userAmount, newUserAmount);
										userObj1.replace("symbol", userObj1.get("symbol") , symbol);


										stockObj2.replace("NumberOfShares", stockShareCount , newstockNumberOfShares);

										System.out.println("Success");

										flag=true;
									}

								}
								else
								{
									System.out.println("enter the lesser shares");
								}

							}while(flag==false);
						}
					}
				}

			}

			FileWriter writer = new FileWriter(file); 
			FileWriter writer1 = new FileWriter(file1); 

			writer.write(userArray.toJSONString());
			writer1.write(stockArray.toJSONString());

			writer.close();
			writer1.close();
			reader.close();
			reader1.close();

		} catch (FileNotFoundException e) {
			System.out.println( "Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}


	}


	/*
	 * method to sell the share
	 */
	@Override
	public void sellShare(String name , String symbol) {
		try
		{
			JSONParser parser = new JSONParser();
			File file = new File("/home/user/eclipse-workspace/Oop"
					+ "/src/main/java/com/bridgelabz/oop/repository/userAccounts.json");
			FileReader reader = new FileReader(file);


			File file1 = new File("/home/user/eclipse-workspace/Oop"
					+ "/src/main/java/com/bridgelabz/oop/repository/companyStock.json");
			FileReader reader1 = new FileReader(file1);

			JSONArray userArray =  (JSONArray) parser.parse(reader);
			Iterator<?> iterator1 = userArray.iterator();
			JSONObject userObj = new JSONObject();
			JSONObject userObj1 = new JSONObject();

			JSONArray stockArray =  (JSONArray) parser.parse(reader1);
			Iterator<?> iterator2 = stockArray.iterator();
			JSONObject stockObj = new JSONObject();
			JSONObject stockObj1 = new JSONObject();

			while(iterator1.hasNext())
			{
				userObj = (JSONObject) iterator1.next();
				if(userObj.containsKey(name))
				{
					userObj1 = (JSONObject) userObj.get(name);
					long noOfShares = Integer.parseInt(userObj1.get("noOfShares").toString());
					System.out.println("available shares is "+userObj1.get("noOfShares")+" for the symbol "+symbol);
					System.out.println("Enter the number of shares to sell:");
					int n = Utility.inputInteger();
					if(n<=noOfShares && n>0)
					{
						long newNoOfUserShares = noOfShares-n;
						long userAmount = Long.parseLong(userObj1.get("balance").toString());
						while(iterator2.hasNext())
						{
							stockObj = (JSONObject) iterator2.next();
							if(stockObj.containsKey(symbol))
							{

								stockObj1 = (JSONObject) stockObj.get(symbol);
								long stockPrice = Long.parseLong(stockObj1.get("SharePrice").toString());
								long stockCount = Long.parseLong(stockObj1.get("NumberOfShares").toString());
								long newUserAmount = userAmount+(n*stockPrice);
								long newStockCount = stockCount+n;
								userObj1.replace("noOfShares",noOfShares, newNoOfUserShares);
								userObj1.replace("balance", userAmount, newUserAmount);
								stockObj1.replace("NumberOfShares",stockCount , newStockCount);
								
								
							}
						}
					}
					else
					{

						System.out.println("shares not available");
					}



				}

			}

			FileWriter writer = new FileWriter(file); 
			FileWriter writer1 = new FileWriter(file1); 

			writer.write(userArray.toJSONString());
			writer1.write(stockArray.toJSONString());

			writer.close();
			writer1.close();

			reader.close();
			reader1.close();

		} catch (FileNotFoundException e) {
			System.out.println( "Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}

	}


	@Override
	public void checkReport(String name) {
		try
		{
			JSONParser parser = new JSONParser();
			File file = new File("/home/user/eclipse-workspace/Oop"
					+ "/src/main/java/com/bridgelabz/oop/repository/userAccounts.json");
			FileReader reader = new FileReader(file);

			JSONArray userArray =  (JSONArray) parser.parse(reader);
			Iterator<?> iterator1 = userArray.iterator();
			JSONObject userObj = new JSONObject();
			JSONObject userObj1 = new JSONObject();

			while(iterator1.hasNext())
			{
				userObj = (JSONObject) iterator1.next();
				if(userObj.containsKey(name))
				{

					userObj1 = (JSONObject) userObj.get(name);
					System.out.println("--------Report----------");
					System.out.println("User:"+name);
					System.out.println("Symbol:"+userObj1.get("symbol"));
					System.out.println("Number of shares:"+userObj1.get("noOfShares"));
					System.out.println("Your amount:"+userObj1.get("balance"));
				}
			}

		}catch (FileNotFoundException e) {
			System.out.println( "Given file is not found:");
		} catch (IOException e) {
			System.out.println("wrong directory ");
		} catch (ParseException e) {
			System.out.println("Parsing is not possible");
		}

	}
}
