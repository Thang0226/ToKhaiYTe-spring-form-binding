package com.service;

import com.model.ToKhaiYTe;

public interface IFormService {
	ToKhaiYTe getForm();

	void setForm(ToKhaiYTe form);

	int[] getYears();
	int[] getMonths();
	int[] getDates();
	String[] getSexes();
	String[] getNationalities();
	String[] getTransports();
	String[] getCities();
	String[] getTowns();
	String[] getStreets();
}
