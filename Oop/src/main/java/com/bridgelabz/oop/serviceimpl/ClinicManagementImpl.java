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

import com.bridgelabz.oop.model.PatientModel;
import com.bridgelabz.oop.service.ClinicManagementInf;

public class ClinicManagementImpl implements ClinicManagementInf
{
	JSONArray jsonArray = new JSONArray();
	/*
	 * method to check available specializations
	 */
	@Override
	public void checkSpecialization() {
		try(FileReader reader = new FileReader("/home/user/eclipse-workspace/Oop/src/main/java/com/bridgelabz/oop/repository/specialization.json"))
		{
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(reader);
			Iterator<?> iterator = array.iterator();	
			System.out.println("----Available doctors------");
			while(iterator.hasNext())
			{
				JSONObject obj = new JSONObject();
				obj = (JSONObject) iterator.next();
				for(Object keyStr:obj.keySet())
				{
					JSONObject jsonObj = (JSONObject) obj.get(keyStr);
					System.out.println("Specialization:"+keyStr+"::Doctor:"+jsonObj.get("Name")+"::Availibility:"+jsonObj.get("Availability"));

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/*
	 * method to  add appointment
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void addAppointment(PatientModel pmodel) {


		JSONObject pObject = new JSONObject();
		pObject.put("PatientId", pmodel.getId());
		pObject.put("Name", pmodel.getName());
		pObject.put("Age", pmodel.getAge());
		pObject.put("PhoneNo", pmodel.getPhoneNo());
		pObject.put("Doctor", pmodel.getSpecialization());
		pObject.put("Availibility", pmodel.getAvailibility());
		jsonArray.add(pObject);

		try(FileWriter writer = new FileWriter("/home/user/eclipse-workspace/Oop/src/main/java/com/bridgelabz/oop/repository/patientReport.json"))
		{
			writer.write(jsonArray.toJSONString());
			System.out.println("Appointment successfull");


		} catch (IOException e) {
			e.printStackTrace();


		}
	}

	/*
	 * method to check patient report
	 */
	@Override
	public void checkReport(String userId) {

		try(FileReader reader = new FileReader("/home/user/eclipse-workspace/Oop/src/main/java/com/bridgelabz/oop/repository/patientReport.json"))
		{
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(reader);
			Iterator<?> iterator = array.iterator();
			System.out.println("------Report------");
			while(iterator.hasNext())
			{
				JSONObject object = new JSONObject();
				if(object.get("PatientId").equals(userId))
				{
					
					System.out.println("Name:"+object.get("Name"));
					System.out.println("Age:"+object.get("Age"));
					System.out.println("Specialization:"+object.get("Doctor"));
					System.out.println("Availibility:"+object.get("Availibility"));
				}
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
