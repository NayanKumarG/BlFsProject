package com.bridgelabz.oop.controller;

import com.bridgelabz.oop.model.PatientModel;
import com.bridgelabz.oop.service.ClinicManagementInf;
import com.bridgelabz.oop.serviceimpl.ClinicManagementImpl;
import com.bridgelabz.util.Utility;

/*
 * program for clinic management
 */
public class ClinicManagement {
	static ClinicManagementInf cm = new ClinicManagementImpl();
	private static PatientModel pmodel;
	public static void main(String[] args) {
		char c;
		System.out.println("---------Clinic management system--------");
		do
		{


			System.out.println("enter the choice:");
			System.out.println("1.Doctors available\n"+"2.TakeAppointment\n"+"3.CheckReport\n"+"4.Exit");
			switch(Utility.inputInteger())
			{
			case 1:
				cm.checkSpecialization();
				break;
			case 2:
				patientDetail();
				cm.addAppointment(pmodel);
				break;
			case 3:
				System.out.println("Enter user Id");
				String userId = Utility.inputWord();
				cm.checkReport(userId);
				break;
			case 4:System.exit(0);

			default :System.out.println("Enter a correct choice");
			break;
			}

			System.out.println("Go to service Y/y or N/n");
			c= Utility.inputWord().charAt(0);
		}while(c =='Y' || c == 'y');
	}
	private static void patientDetail() {
		pmodel = new PatientModel();
		System.out.println("Enter specialization:");
		pmodel.setSpecialization(Utility.inputWord());
		System.out.println("Enter user id:");
		pmodel.setId(Utility.inputWord());
		System.out.println("Enter your name");
		pmodel.setName(Utility.inputWord());
		System.out.println("Enter your age:");
		pmodel.setAge(Utility.inputInteger());
		System.out.println("Enter your Phone no:");
		pmodel.setPhoneNo(Utility.inputLong());
		System.out.println("Enter availibilitym AM/PM");
		pmodel.setAvailibility(Utility.inputWord());
		
	}

}
