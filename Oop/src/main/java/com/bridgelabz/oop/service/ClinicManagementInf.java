package com.bridgelabz.oop.service;

import com.bridgelabz.oop.model.PatientModel;

public interface ClinicManagementInf {

	void checkSpecialization();

	void addAppointment(PatientModel pmodel);

	void checkReport(String userId);

}
